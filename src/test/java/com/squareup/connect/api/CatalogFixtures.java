package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.models.BatchDeleteCatalogObjectsRequest;
import com.squareup.connect.models.BatchUpsertCatalogObjectsRequest;
import com.squareup.connect.models.BatchUpsertCatalogObjectsResponse;
import com.squareup.connect.models.CatalogCategory;
import com.squareup.connect.models.CatalogDiscount;
import com.squareup.connect.models.CatalogIdMapping;
import com.squareup.connect.models.CatalogItem;
import com.squareup.connect.models.CatalogItemModifierListInfo;
import com.squareup.connect.models.CatalogItemVariation;
import com.squareup.connect.models.CatalogModifier;
import com.squareup.connect.models.CatalogModifierList;
import com.squareup.connect.models.CatalogObject;
import com.squareup.connect.models.CatalogObjectBatch;
import com.squareup.connect.models.CatalogTax;
import com.squareup.connect.models.ListCatalogResponse;
import com.squareup.connect.models.Money;
import com.squareup.connect.models.Money.CurrencyEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

/**
 * Helper class for populating a usable catalog on the server.
 */
class CatalogFixtures implements AutoCloseable {

    static final String COFFEE_CLIENT_ID = "#Coffee";
    static final String SMALL_COFFEE_CLIENT_ID = "#SmallCoffee";
    static final String LARGE_COFFEE_CLIENT_ID = "#LargeCoffee";
    static final String SMALL_TEA_CLIENT_ID = "#SmallTea";
    static final String WHOLE_MILK_CLIENT_ID = "#WholeMilk";
    static final String BEVERAGES_CLIENT_ID = "#Beverages";
    static final String MILKS_CLIENT_ID = "#Milks";
    static final String SOY_MILK_CLIENT_ID = "#SoyMilk";
    static final String AMOUNT_DISCOUNT_CLIENT_ID = "#AmountDiscount";
    static final String SALES_TAX_CLIENT_ID = "#SalesTax";

    static final CatalogObject BEVERAGES = new CatalogObject()
        .type(CatalogObject.TypeEnum.CATEGORY)
        .id("#Beverages")
        .categoryData(new CatalogCategory()
            .name("Beverages"));

    static final CatalogObject MILKS = new CatalogObject()
        .type(CatalogObject.TypeEnum.MODIFIER_LIST)
        .id("#Milks")
        .modifierListData(new CatalogModifierList()
            .name("Milks")
            .modifiers(asList(new CatalogObject()
                    .type(CatalogObject.TypeEnum.MODIFIER)
                    .id(WHOLE_MILK_CLIENT_ID)
                    .modifierData(new CatalogModifier()
                        .name("Whole Milk")),
                new CatalogObject()
                    .type(CatalogObject.TypeEnum.MODIFIER)
                    .id("#SkimMilk")
                    .modifierData(new CatalogModifier()
                        .name("Skim Milk")),
                new CatalogObject()
                    .type(CatalogObject.TypeEnum.MODIFIER)
                    .id(SOY_MILK_CLIENT_ID)
                    .modifierData(new CatalogModifier()
                        .name("SoyMilk")
                        .priceMoney(new Money().amount(50L).currency(Money.CurrencyEnum.USD))))));

    static final CatalogObject SYRUPS = new CatalogObject()
        .type(CatalogObject.TypeEnum.MODIFIER_LIST)
        .id("#Syrups")
        .modifierListData(new CatalogModifierList()
            .name("Syrups")
            .modifiers(asList(new CatalogObject()
                    .type(CatalogObject.TypeEnum.MODIFIER)
                    .id("#Hazelnut")
                    .modifierData(new CatalogModifier()
                        .name("Hazelnut")),
                new CatalogObject()
                    .type(CatalogObject.TypeEnum.MODIFIER)
                    .id("#Vanilla")
                    .modifierData(new CatalogModifier()
                        .name("Vanilla")),
                new CatalogObject()
                    .type(CatalogObject.TypeEnum.MODIFIER)
                    .id("#Chocolate")
                    .modifierData(new CatalogModifier()
                        .name("Chocolate")))));

    static final CatalogObject SMALL_COFFEE_ITEM_VARIATION = new CatalogObject()
        .type(CatalogObject.TypeEnum.ITEM_VARIATION)
        .id(SMALL_COFFEE_CLIENT_ID)
        .presentAtAllLocations(true)
        .itemVariationData(new CatalogItemVariation()
            .itemId(COFFEE_CLIENT_ID)
            .name("Small")
            .pricingType(CatalogItemVariation.PricingTypeEnum.FIXED_PRICING)
            .priceMoney(new Money().amount(195L).currency(Money.CurrencyEnum.USD)));

    static final CatalogObject LARGE_COFFEE_ITEM_VARIATION = new CatalogObject()
        .type(CatalogObject.TypeEnum.ITEM_VARIATION)
        .id(LARGE_COFFEE_CLIENT_ID)
        .presentAtAllLocations(true)
        .itemVariationData(new CatalogItemVariation()
            .itemId(COFFEE_CLIENT_ID)
            .name("Large")
            .pricingType(CatalogItemVariation.PricingTypeEnum.FIXED_PRICING)
            .priceMoney(new Money().amount(250L).currency(Money.CurrencyEnum.USD)));

    static final CatalogObject COFFEE_ITEM = new CatalogObject()
        .type(CatalogObject.TypeEnum.ITEM)
        .id(COFFEE_CLIENT_ID)
        .presentAtAllLocations(true)
        .itemData(new CatalogItem()
            .name("Coffee")
            .description("Hot bean juice")
            .abbreviation("Co")
            .categoryId("#Beverages")
            .modifierListInfo(
                singletonList(new CatalogItemModifierListInfo().modifierListId("#Milks")))
            .taxIds(singletonList(SALES_TAX_CLIENT_ID))
            .variations(asList(SMALL_COFFEE_ITEM_VARIATION, LARGE_COFFEE_ITEM_VARIATION)));

    static final CatalogObject TEA = new CatalogObject()
        .type(CatalogObject.TypeEnum.ITEM)
        .id("#Tea")
        .presentAtAllLocations(true)
        .itemData(new CatalogItem()
            .name("Tea")
            .description("Hot leaf juice")
            .abbreviation("Te")
            .categoryId("#Beverages")
            .modifierListInfo(
                singletonList(new CatalogItemModifierListInfo().modifierListId("#Milks")))
            .taxIds(singletonList(SALES_TAX_CLIENT_ID))
            .variations(asList(new CatalogObject()
                    .type(CatalogObject.TypeEnum.ITEM_VARIATION)
                    .id("#SmallTea")
                    .presentAtAllLocations(true)
                    .itemVariationData(new CatalogItemVariation()
                        .itemId("#Tea")
                        .name("Small")
                        .pricingType(CatalogItemVariation.PricingTypeEnum.FIXED_PRICING)
                        .priceMoney(new Money().amount(150L).currency(Money.CurrencyEnum.USD))),
                new CatalogObject()
                    .type(CatalogObject.TypeEnum.ITEM_VARIATION)
                    .id("#LargeTea")
                    .presentAtAllLocations(true)
                    .itemVariationData(new CatalogItemVariation()
                        .itemId("#Tea")
                        .name("Large")
                        .pricingType(CatalogItemVariation.PricingTypeEnum.FIXED_PRICING)
                        .priceMoney(new Money().amount(200L).currency(Money.CurrencyEnum.USD)))))
        );

    static final CatalogObject AMOUNT_DISCOUNT = new CatalogObject()
        .type(CatalogObject.TypeEnum.DISCOUNT)
        .id(AMOUNT_DISCOUNT_CLIENT_ID)
        .discountData(new CatalogDiscount()
            .name("50 cents off")
            .amountMoney(new Money().amount(50L).currency(CurrencyEnum.USD)));

    static final CatalogObject SALES_TAX = new CatalogObject()
        .type(CatalogObject.TypeEnum.TAX)
        .id(SALES_TAX_CLIENT_ID)
        .presentAtAllLocations(true)
        .taxData(new CatalogTax()
            .name("Sales Tax")
            .calculationPhase(CatalogTax.CalculationPhaseEnum.SUBTOTAL_PHASE)
            .inclusionType(CatalogTax.InclusionTypeEnum.ADDITIVE)
            .percentage("5.0")
            .appliesToCustomAmounts(true)
            .enabled(true));

    static final List<CatalogObject> OBJECTS =
        asList(BEVERAGES, MILKS, SYRUPS, COFFEE_ITEM, TEA, AMOUNT_DISCOUNT, SALES_TAX);

    private final CatalogApi api;
    private final Map<String, String> idMap = new HashMap<>();

    private CatalogFixtures(CatalogApi api) {
        this.api = api;

        try {
            buildTestCatalog();
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Create catalog objects on the server. To properly clean up these objects, call the
     * {@link #close} method.
     */
    static CatalogFixtures populateCatalog(CatalogApi api) {
        return new CatalogFixtures(api);
    }

    /**
     * @param clientId Client ID of a catalog object.
     * @return Server ID of the catalog object.
     * @throws NullPointerException Thrown if this TestCatalog did not create an object with a
     * matching client ID.
     */
    String getObjectId(String clientId) {
        String serverId = idMap.get(clientId);
        if (serverId == null) {
            throw new NullPointerException(clientId);
        }

        return serverId;
    }

    /**
     * Deletes all catalog objects that were created when instantiating this TestCatalog.
     */
    @Override public void close() throws Exception {
        String cursor = "";
        List<String> objectsToDelete = new ArrayList<>();
        do {
            ListCatalogResponse response = api.listCatalog(cursor, null);
            for (CatalogObject object : response.getObjects()) {
                objectsToDelete.add(object.getId());
            }

            cursor = response.getCursor();
        } while (cursor != null && !cursor.isEmpty());

        while (objectsToDelete.size() > 0) {
            int elements = Math.min(200, objectsToDelete.size());

            api.batchDeleteCatalogObjects(new BatchDeleteCatalogObjectsRequest()
                .objectIds(objectsToDelete.subList(0, elements)));
            objectsToDelete = objectsToDelete.subList(elements, objectsToDelete.size());
        }
    }

    private void buildTestCatalog() throws ApiException {
        BatchUpsertCatalogObjectsResponse
            response = api.batchUpsertCatalogObjects(new BatchUpsertCatalogObjectsRequest()
            .idempotencyKey(UUID.randomUUID().toString())
            .addBatchesItem(new CatalogObjectBatch().objects(OBJECTS)));

        for (CatalogIdMapping idMapping : response.getIdMappings()) {
            idMap.put(idMapping.getClientObjectId(), idMapping.getObjectId());
        }
    }
}
