package com.squareup.connect.api;

import com.squareup.connect.ApiClient;
import com.squareup.connect.Configuration;
import com.squareup.connect.auth.OAuth;
import com.squareup.connect.models.CatalogModifier;
import com.squareup.connect.models.CatalogObject;
import com.squareup.connect.models.CreateOrderRequest;
import com.squareup.connect.models.CreateOrderRequestDiscount;
import com.squareup.connect.models.CreateOrderRequestLineItem;
import com.squareup.connect.models.CreateOrderRequestModifier;
import com.squareup.connect.models.CreateOrderRequestTax;
import com.squareup.connect.models.CreateOrderResponse;
import com.squareup.connect.models.Money;
import com.squareup.connect.models.Money.CurrencyEnum;
import com.squareup.connect.models.Order;
import com.squareup.connect.models.OrderLineItem;
import com.squareup.connect.models.OrderLineItemDiscount;
import com.squareup.connect.models.OrderLineItemDiscount.ScopeEnum;
import com.squareup.connect.models.OrderLineItemModifier;
import com.squareup.connect.models.OrderLineItemTax;
import com.squareup.connect.models.OrderLineItemTax.TypeEnum;
import com.squareup.connect.utils.APITest;
import com.squareup.connect.utils.Account;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * API tests for OrdersApi.
 */
public class OrdersApiTest extends APITest {
    private final ApiClient defaultClient = Configuration.getDefaultApiClient();
    private final OrdersApi api = new OrdersApi();

    private String locationId;
    private CatalogFixtures catalogFixtures;

    @Before
    public void setup() throws Exception {
        // The Catalog API does not run in the sandbox.
        Account testAccount = accounts.get("US-Prod");
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken(testAccount.accessToken);

        catalogFixtures = CatalogFixtures.populateCatalog(new CatalogApi());

        locationId = new LocationsApi().listLocations().getLocations().get(0).getId();
    }

    @After
    public void tearDown() throws Exception {
        catalogFixtures.close();
    }

    @Test
    public void createOrderWithCustomItems() throws Exception {
        CreateOrderRequest request = new CreateOrderRequest()
            .idempotencyKey(UUID.randomUUID().toString())
            .referenceId("order ref id")
            .addLineItemsItem(new CreateOrderRequestLineItem()
                .name("Espresso")
                .quantity("2")
                .note("some note")
                .basePriceMoney(new Money()
                    .amount(2_00L)
                    .currency(CurrencyEnum.USD)));

        CreateOrderResponse response = api.createOrder(locationId, request);

        Order actual = response.getOrder();
        assertNotNull(actual);

        Order expected = new Order()
            .id(actual.getId())
            .locationId(locationId)
            .referenceId(request.getReferenceId())
            .addLineItemsItem(new OrderLineItem()
                .name(request.getLineItems().get(0).getName())
                .quantity(request.getLineItems().get(0).getQuantity())
                .note(request.getLineItems().get(0).getNote())
                .basePriceMoney(request.getLineItems().get(0).getBasePriceMoney())
                .grossSalesMoney(new Money().amount(4_00L).currency(CurrencyEnum.USD))
                .totalTaxMoney(new Money().amount(0L).currency(CurrencyEnum.USD))
                .totalDiscountMoney(new Money().amount(0L).currency(CurrencyEnum.USD))
                .totalMoney(new Money().amount(4_00L).currency(CurrencyEnum.USD)))
            .totalTaxMoney(new Money().amount(0L).currency(CurrencyEnum.USD))
            .totalDiscountMoney(new Money().amount(0L).currency(CurrencyEnum.USD))
            .totalMoney(new Money().amount(4_00L).currency(CurrencyEnum.USD));

        assertEquals(expected, actual);
    }

    @Test
    public void createOrderWithCatalogItems() throws Exception {
        CreateOrderRequest request = new CreateOrderRequest()
            .idempotencyKey(UUID.randomUUID().toString())
            .referenceId("order ref id with catalog")
            .addLineItemsItem(new CreateOrderRequestLineItem()
                .catalogObjectId(catalogFixtures.getObjectId(CatalogFixtures.LARGE_COFFEE_CLIENT_ID))
                .quantity("2")
                .addModifiersItem(new CreateOrderRequestModifier()
                    .catalogObjectId(catalogFixtures.getObjectId(CatalogFixtures.SOY_MILK_CLIENT_ID)))
                .addDiscountsItem(new CreateOrderRequestDiscount()
                    .catalogObjectId(
                        catalogFixtures.getObjectId(CatalogFixtures.AMOUNT_DISCOUNT_CLIENT_ID)))
                .addTaxesItem(new CreateOrderRequestTax()
                    .catalogObjectId(catalogFixtures.getObjectId(CatalogFixtures.SALES_TAX_CLIENT_ID))));

        CreateOrderResponse response = api.createOrder(locationId, request);

        assertEquals(0, response.getErrors().size());

        Order actual = response.getOrder();
        assertNotNull(actual);

        CatalogModifier soyMilkModifier = CatalogFixtures.MILKS.getModifierListData().getModifiers()
            .stream()
            .filter(m -> CatalogFixtures.SOY_MILK_CLIENT_ID.equals(m.getId()))
            .map(CatalogObject::getModifierData)
            .findFirst()
            .get();

        Order expected = new Order()
            .id(actual.getId())
            .locationId(locationId)
            .referenceId(request.getReferenceId())
            .addLineItemsItem(new OrderLineItem()
                .name(CatalogFixtures.COFFEE_ITEM.getItemData().getName())
                .quantity(request.getLineItems().get(0).getQuantity())
                .catalogObjectId(catalogFixtures.getObjectId(CatalogFixtures.LARGE_COFFEE_CLIENT_ID))
                .variationName(
                    CatalogFixtures.LARGE_COFFEE_ITEM_VARIATION.getItemVariationData().getName())
                .addModifiersItem(new OrderLineItemModifier()
                    .catalogObjectId(catalogFixtures.getObjectId(CatalogFixtures.SOY_MILK_CLIENT_ID))
                    .name(soyMilkModifier.getName())
                    .basePriceMoney(soyMilkModifier.getPriceMoney())
                    .totalPriceMoney(
                        new Money().amount(1_00L).currency(CurrencyEnum.USD))) // $0.50 * 2
                .addDiscountsItem(new OrderLineItemDiscount()
                    .catalogObjectId(catalogFixtures.getObjectId(CatalogFixtures.AMOUNT_DISCOUNT_CLIENT_ID))
                    .name(CatalogFixtures.AMOUNT_DISCOUNT.getDiscountData().getName())
                    .type(OrderLineItemDiscount.TypeEnum.FIXED_AMOUNT)
                    .amountMoney(CatalogFixtures.AMOUNT_DISCOUNT.getDiscountData().getAmountMoney())
                    .appliedMoney(CatalogFixtures.AMOUNT_DISCOUNT.getDiscountData().getAmountMoney())
                    .scope(ScopeEnum.LINE_ITEM))
                .addTaxesItem(new OrderLineItemTax()
                    .catalogObjectId(catalogFixtures.getObjectId(CatalogFixtures.SALES_TAX_CLIENT_ID))
                    .name(CatalogFixtures.SALES_TAX.getTaxData().getName())
                    .type(TypeEnum.ADDITIVE)
                    .percentage(CatalogFixtures.SALES_TAX.getTaxData().getPercentage())
                    .appliedMoney(
                        // ((($2.50 + $0.50) * 2) - $0.50) * 5% = $0.28
                        new Money().amount(28L).currency(CurrencyEnum.USD)))
                .basePriceMoney(
                    CatalogFixtures.LARGE_COFFEE_ITEM_VARIATION.getItemVariationData().getPriceMoney())
                .grossSalesMoney(
                    new Money().amount(6_00L).currency(CurrencyEnum.USD)) // ($2.50 + $0.5) * 2 = $6
                .totalTaxMoney(
                    // ($6 - $0.50) *  5% additive = $0.28
                    new Money().amount(28L).currency(CurrencyEnum.USD))
                .totalDiscountMoney(new Money().amount(50L).currency(CurrencyEnum.USD))
                .totalMoney(new Money().amount(5_78L).currency(CurrencyEnum.USD)))
            .totalTaxMoney(new Money().amount(28L).currency(CurrencyEnum.USD))
            .totalDiscountMoney(new Money().amount(50L).currency(CurrencyEnum.USD))
            .totalMoney(new Money().amount(5_78L).currency(CurrencyEnum.USD));

        assertEquals(expected, actual);
    }
}
