# Square Connect Java SDK [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.squareup/connect/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.squareup/connect)

## Requirements

Java 8

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.squareup</groupId>
    <artifactId>connect</artifactId>
    <version>2.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.squareup:connect:2.1.0"
```

### Build and Install locally

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/connect-2.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.squareup.connect.*;
import com.squareup.connect.auth.*;
import com.squareup.connect.models.*;
import com.squareup.connect.api.CatalogApi;

import java.io.File;
import java.util.*;

public class CatalogApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        CatalogApi apiInstance = new CatalogApi();
        BatchDeleteCatalogObjectsRequest body = new BatchDeleteCatalogObjectsRequest(); // BatchDeleteCatalogObjectsRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
        try {
            BatchDeleteCatalogObjectsResponse result = apiInstance.batchDeleteCatalogObjects(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#batchDeleteCatalogObjects");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://connect.squareup.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CatalogApi* | [**batchDeleteCatalogObjects**](docs/CatalogApi.md#batchDeleteCatalogObjects) | **POST** /v2/catalog/batch-delete | BatchDeleteCatalogObjects
*CatalogApi* | [**batchRetrieveCatalogObjects**](docs/CatalogApi.md#batchRetrieveCatalogObjects) | **POST** /v2/catalog/batch-retrieve | BatchRetrieveCatalogObjects
*CatalogApi* | [**batchUpsertCatalogObjects**](docs/CatalogApi.md#batchUpsertCatalogObjects) | **POST** /v2/catalog/batch-upsert | BatchUpsertCatalogObjects
*CatalogApi* | [**catalogInfo**](docs/CatalogApi.md#catalogInfo) | **GET** /v2/catalog/info | CatalogInfo
*CatalogApi* | [**deleteCatalogObject**](docs/CatalogApi.md#deleteCatalogObject) | **DELETE** /v2/catalog/object/{object_id} | DeleteCatalogObject
*CatalogApi* | [**listCatalog**](docs/CatalogApi.md#listCatalog) | **GET** /v2/catalog/list | ListCatalog
*CatalogApi* | [**retrieveCatalogObject**](docs/CatalogApi.md#retrieveCatalogObject) | **GET** /v2/catalog/object/{object_id} | RetrieveCatalogObject
*CatalogApi* | [**searchCatalogObjects**](docs/CatalogApi.md#searchCatalogObjects) | **POST** /v2/catalog/search | SearchCatalogObjects
*CatalogApi* | [**updateItemModifierLists**](docs/CatalogApi.md#updateItemModifierLists) | **POST** /v2/catalog/update-item-modifier-lists | UpdateItemModifierLists
*CatalogApi* | [**updateItemTaxes**](docs/CatalogApi.md#updateItemTaxes) | **POST** /v2/catalog/update-item-taxes | UpdateItemTaxes
*CatalogApi* | [**upsertCatalogObject**](docs/CatalogApi.md#upsertCatalogObject) | **POST** /v2/catalog/object | UpsertCatalogObject
*CheckoutApi* | [**createCheckout**](docs/CheckoutApi.md#createCheckout) | **POST** /v2/locations/{location_id}/checkouts | CreateCheckout
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createCustomer) | **POST** /v2/customers | CreateCustomer
*CustomersApi* | [**createCustomerCard**](docs/CustomersApi.md#createCustomerCard) | **POST** /v2/customers/{customer_id}/cards | CreateCustomerCard
*CustomersApi* | [**deleteCustomer**](docs/CustomersApi.md#deleteCustomer) | **DELETE** /v2/customers/{customer_id} | DeleteCustomer
*CustomersApi* | [**deleteCustomerCard**](docs/CustomersApi.md#deleteCustomerCard) | **DELETE** /v2/customers/{customer_id}/cards/{card_id} | DeleteCustomerCard
*CustomersApi* | [**listCustomers**](docs/CustomersApi.md#listCustomers) | **GET** /v2/customers | ListCustomers
*CustomersApi* | [**retrieveCustomer**](docs/CustomersApi.md#retrieveCustomer) | **GET** /v2/customers/{customer_id} | RetrieveCustomer
*CustomersApi* | [**updateCustomer**](docs/CustomersApi.md#updateCustomer) | **PUT** /v2/customers/{customer_id} | UpdateCustomer
*LocationsApi* | [**listLocations**](docs/LocationsApi.md#listLocations) | **GET** /v2/locations | ListLocations
*TransactionsApi* | [**captureTransaction**](docs/TransactionsApi.md#captureTransaction) | **POST** /v2/locations/{location_id}/transactions/{transaction_id}/capture | CaptureTransaction
*TransactionsApi* | [**charge**](docs/TransactionsApi.md#charge) | **POST** /v2/locations/{location_id}/transactions | Charge
*TransactionsApi* | [**createRefund**](docs/TransactionsApi.md#createRefund) | **POST** /v2/locations/{location_id}/transactions/{transaction_id}/refund | CreateRefund
*TransactionsApi* | [**listRefunds**](docs/TransactionsApi.md#listRefunds) | **GET** /v2/locations/{location_id}/refunds | ListRefunds
*TransactionsApi* | [**listTransactions**](docs/TransactionsApi.md#listTransactions) | **GET** /v2/locations/{location_id}/transactions | ListTransactions
*TransactionsApi* | [**retrieveTransaction**](docs/TransactionsApi.md#retrieveTransaction) | **GET** /v2/locations/{location_id}/transactions/{transaction_id} | RetrieveTransaction
*TransactionsApi* | [**voidTransaction**](docs/TransactionsApi.md#voidTransaction) | **POST** /v2/locations/{location_id}/transactions/{transaction_id}/void | VoidTransaction
*V1EmployeesApi* | [**createEmployee**](docs/V1EmployeesApi.md#createEmployee) | **POST** /v1/me/employees | Creates an employee for a business.
*V1EmployeesApi* | [**createEmployeeRole**](docs/V1EmployeesApi.md#createEmployeeRole) | **POST** /v1/me/roles | Creates an employee role you can then assign to employees.
*V1EmployeesApi* | [**createTimecard**](docs/V1EmployeesApi.md#createTimecard) | **POST** /v1/me/timecards | Creates a timecard for an employee. Each timecard corresponds to a single shift.
*V1EmployeesApi* | [**deleteTimecard**](docs/V1EmployeesApi.md#deleteTimecard) | **DELETE** /v1/me/timecards/{timecard_id} | Deletes a timecard. Deleted timecards are still accessible from Connect API endpoints, but the value of their deleted field is set to true. See Handling deleted timecards for more information.
*V1EmployeesApi* | [**listCashDrawerShifts**](docs/V1EmployeesApi.md#listCashDrawerShifts) | **GET** /v1/{location_id}/cash-drawer-shifts | Provides the details for all of a location&#39;s cash drawer shifts during a date range. The date range you specify cannot exceed 90 days.
*V1EmployeesApi* | [**listEmployeeRoles**](docs/V1EmployeesApi.md#listEmployeeRoles) | **GET** /v1/me/roles | Provides summary information for all of a business&#39;s employee roles.
*V1EmployeesApi* | [**listEmployees**](docs/V1EmployeesApi.md#listEmployees) | **GET** /v1/me/employees | Provides summary information for all of a business&#39;s employees.
*V1EmployeesApi* | [**listTimecardEvents**](docs/V1EmployeesApi.md#listTimecardEvents) | **GET** /v1/me/timecards/{timecard_id}/events | Provides summary information for all events associated with a particular timecard.
*V1EmployeesApi* | [**listTimecards**](docs/V1EmployeesApi.md#listTimecards) | **GET** /v1/me/timecards | Provides summary information for all of a business&#39;s employee timecards.
*V1EmployeesApi* | [**retrieveCashDrawerShift**](docs/V1EmployeesApi.md#retrieveCashDrawerShift) | **GET** /v1/{location_id}/cash-drawer-shifts/{shift_id} | Provides the details for a single cash drawer shift, including all events that occurred during the shift.
*V1EmployeesApi* | [**retrieveEmployee**](docs/V1EmployeesApi.md#retrieveEmployee) | **GET** /v1/me/employees/{employee_id} | Provides the details for a single employee.
*V1EmployeesApi* | [**retrieveEmployeeRole**](docs/V1EmployeesApi.md#retrieveEmployeeRole) | **GET** /v1/me/roles/{role_id} | Provides the details for a single employee role.
*V1EmployeesApi* | [**retrieveTimecard**](docs/V1EmployeesApi.md#retrieveTimecard) | **GET** /v1/me/timecards/{timecard_id} | Provides the details for a single timecard.
*V1EmployeesApi* | [**updateEmployee**](docs/V1EmployeesApi.md#updateEmployee) | **PUT** /v1/me/employees/{employee_id} | V1 UpdateEmployee
*V1EmployeesApi* | [**updateEmployeeRole**](docs/V1EmployeesApi.md#updateEmployeeRole) | **PUT** /v1/me/roles/{role_id} | Modifies the details of an employee role.
*V1EmployeesApi* | [**updateTimecard**](docs/V1EmployeesApi.md#updateTimecard) | **PUT** /v1/me/timecards/{timecard_id} | Modifies a timecard&#39;s details. This creates an API_EDIT event for the timecard. You can view a timecard&#39;s event history with the List Timecard Events endpoint.
*V1ItemsApi* | [**adjustInventory**](docs/V1ItemsApi.md#adjustInventory) | **POST** /v1/{location_id}/inventory/{variation_id} | Adjusts an item variation&#39;s current available inventory.
*V1ItemsApi* | [**applyFee**](docs/V1ItemsApi.md#applyFee) | **PUT** /v1/{location_id}/items/{item_id}/fees/{fee_id} | Associates a fee with an item, meaning the fee is automatically applied to the item in Square Register.
*V1ItemsApi* | [**applyModifierList**](docs/V1ItemsApi.md#applyModifierList) | **PUT** /v1/{location_id}/items/{item_id}/modifier-lists/{modifier_list_id} | Associates a modifier list with an item, meaning modifier options from the list can be applied to the item.
*V1ItemsApi* | [**createCategory**](docs/V1ItemsApi.md#createCategory) | **POST** /v1/{location_id}/categories | Creates an item category.
*V1ItemsApi* | [**createDiscount**](docs/V1ItemsApi.md#createDiscount) | **POST** /v1/{location_id}/discounts | Creates a discount.
*V1ItemsApi* | [**createFee**](docs/V1ItemsApi.md#createFee) | **POST** /v1/{location_id}/fees | Creates a fee (tax).
*V1ItemsApi* | [**createItem**](docs/V1ItemsApi.md#createItem) | **POST** /v1/{location_id}/items | Creates an item and at least one variation for it.
*V1ItemsApi* | [**createModifierList**](docs/V1ItemsApi.md#createModifierList) | **POST** /v1/{location_id}/modifier-lists | Creates an item modifier list and at least one modifier option for it.
*V1ItemsApi* | [**createModifierOption**](docs/V1ItemsApi.md#createModifierOption) | **POST** /v1/{location_id}/modifier-lists/{modifier_list_id}/modifier-options | Creates an item modifier option and adds it to a modifier list.
*V1ItemsApi* | [**createPage**](docs/V1ItemsApi.md#createPage) | **POST** /v1/{location_id}/pages | Creates a Favorites page in Square Register.
*V1ItemsApi* | [**createVariation**](docs/V1ItemsApi.md#createVariation) | **POST** /v1/{location_id}/items/{item_id}/variations | Creates an item variation for an existing item.
*V1ItemsApi* | [**deleteCategory**](docs/V1ItemsApi.md#deleteCategory) | **DELETE** /v1/{location_id}/categories/{category_id} | Deletes an existing item category.
*V1ItemsApi* | [**deleteDiscount**](docs/V1ItemsApi.md#deleteDiscount) | **DELETE** /v1/{location_id}/discounts/{discount_id} | Deletes an existing discount.
*V1ItemsApi* | [**deleteFee**](docs/V1ItemsApi.md#deleteFee) | **DELETE** /v1/{location_id}/fees/{fee_id} | Deletes an existing fee (tax).
*V1ItemsApi* | [**deleteItem**](docs/V1ItemsApi.md#deleteItem) | **DELETE** /v1/{location_id}/items/{item_id} | Deletes an existing item and all item variations associated with it.
*V1ItemsApi* | [**deleteModifierList**](docs/V1ItemsApi.md#deleteModifierList) | **DELETE** /v1/{location_id}/modifier-lists/{modifier_list_id} | Deletes an existing item modifier list and all modifier options associated with it.
*V1ItemsApi* | [**deleteModifierOption**](docs/V1ItemsApi.md#deleteModifierOption) | **DELETE** /v1/{location_id}/modifier-lists/{modifier_list_id}/modifier-options/{modifier_option_id} | Deletes an existing item modifier option from a modifier list.
*V1ItemsApi* | [**deletePage**](docs/V1ItemsApi.md#deletePage) | **DELETE** /v1/{location_id}/pages/{page_id} | Deletes an existing Favorites page and all of its cells.
*V1ItemsApi* | [**deletePageCell**](docs/V1ItemsApi.md#deletePageCell) | **DELETE** /v1/{location_id}/pages/{page_id}/cells | Deletes a cell from a Favorites page in Square Register.
*V1ItemsApi* | [**deleteVariation**](docs/V1ItemsApi.md#deleteVariation) | **DELETE** /v1/{location_id}/items/{item_id}/variations/{variation_id} | Deletes an existing item variation from an item.
*V1ItemsApi* | [**listCategories**](docs/V1ItemsApi.md#listCategories) | **GET** /v1/{location_id}/categories | Lists all of a location&#39;s item categories.
*V1ItemsApi* | [**listDiscounts**](docs/V1ItemsApi.md#listDiscounts) | **GET** /v1/{location_id}/discounts | Lists all of a location&#39;s discounts.
*V1ItemsApi* | [**listFees**](docs/V1ItemsApi.md#listFees) | **GET** /v1/{location_id}/fees | Lists all of a location&#39;s fees (taxes).
*V1ItemsApi* | [**listInventory**](docs/V1ItemsApi.md#listInventory) | **GET** /v1/{location_id}/inventory | Provides inventory information for all of a merchant&#39;s inventory-enabled item variations.
*V1ItemsApi* | [**listItems**](docs/V1ItemsApi.md#listItems) | **GET** /v1/{location_id}/items | Provides summary information for all of a location&#39;s items.
*V1ItemsApi* | [**listModifierLists**](docs/V1ItemsApi.md#listModifierLists) | **GET** /v1/{location_id}/modifier-lists | Lists all of a location&#39;s modifier lists.
*V1ItemsApi* | [**listPages**](docs/V1ItemsApi.md#listPages) | **GET** /v1/{location_id}/pages | Lists all of a location&#39;s Favorites pages in Square Register.
*V1ItemsApi* | [**removeFee**](docs/V1ItemsApi.md#removeFee) | **DELETE** /v1/{location_id}/items/{item_id}/fees/{fee_id} | Removes a fee assocation from an item, meaning the fee is no longer automatically applied to the item in Square Register.
*V1ItemsApi* | [**removeModifierList**](docs/V1ItemsApi.md#removeModifierList) | **DELETE** /v1/{location_id}/items/{item_id}/modifier-lists/{modifier_list_id} | Removes a modifier list association from an item, meaning modifier options from the list can no longer be applied to the item.
*V1ItemsApi* | [**retrieveItem**](docs/V1ItemsApi.md#retrieveItem) | **GET** /v1/{location_id}/items/{item_id} | Provides the details for a single item, including associated modifier lists and fees.
*V1ItemsApi* | [**retrieveModifierList**](docs/V1ItemsApi.md#retrieveModifierList) | **GET** /v1/{location_id}/modifier-lists/{modifier_list_id} | Provides the details for a single modifier list.
*V1ItemsApi* | [**updateCategory**](docs/V1ItemsApi.md#updateCategory) | **PUT** /v1/{location_id}/categories/{category_id} | Modifies the details of an existing item category.
*V1ItemsApi* | [**updateDiscount**](docs/V1ItemsApi.md#updateDiscount) | **PUT** /v1/{location_id}/discounts/{discount_id} | Modifies the details of an existing discount.
*V1ItemsApi* | [**updateFee**](docs/V1ItemsApi.md#updateFee) | **PUT** /v1/{location_id}/fees/{fee_id} | Modifies the details of an existing fee (tax).
*V1ItemsApi* | [**updateItem**](docs/V1ItemsApi.md#updateItem) | **PUT** /v1/{location_id}/items/{item_id} | Modifies the core details of an existing item.
*V1ItemsApi* | [**updateModifierList**](docs/V1ItemsApi.md#updateModifierList) | **PUT** /v1/{location_id}/modifier-lists/{modifier_list_id} | Modifies the details of an existing item modifier list.
*V1ItemsApi* | [**updateModifierOption**](docs/V1ItemsApi.md#updateModifierOption) | **PUT** /v1/{location_id}/modifier-lists/{modifier_list_id}/modifier-options/{modifier_option_id} | Modifies the details of an existing item modifier option.
*V1ItemsApi* | [**updatePage**](docs/V1ItemsApi.md#updatePage) | **PUT** /v1/{location_id}/pages/{page_id} | Modifies the details of a Favorites page in Square Register.
*V1ItemsApi* | [**updatePageCell**](docs/V1ItemsApi.md#updatePageCell) | **PUT** /v1/{location_id}/pages/{page_id}/cells | Modifies a cell of a Favorites page in Square Register.
*V1ItemsApi* | [**updateVariation**](docs/V1ItemsApi.md#updateVariation) | **PUT** /v1/{location_id}/items/{item_id}/variations/{variation_id} | Modifies the details of an existing item variation.
*V1LocationsApi* | [**listLocations**](docs/V1LocationsApi.md#listLocations) | **GET** /v1/me/locations | Provides details for a business&#39;s locations, including their IDs.
*V1LocationsApi* | [**retrieveBusiness**](docs/V1LocationsApi.md#retrieveBusiness) | **GET** /v1/me | Get a business&#39;s information.
*V1TransactionsApi* | [**createRefund**](docs/V1TransactionsApi.md#createRefund) | **POST** /v1/{location_id}/refunds | Issues a refund for a previously processed payment. You must issue a refund within 60 days of the associated payment.
*V1TransactionsApi* | [**listBankAccounts**](docs/V1TransactionsApi.md#listBankAccounts) | **GET** /v1/{location_id}/bank-accounts | Provides non-confidential details for all of a location&#39;s associated bank accounts. This endpoint does not provide full bank account numbers, and there is no way to obtain a full bank account number with the Connect API.
*V1TransactionsApi* | [**listOrders**](docs/V1TransactionsApi.md#listOrders) | **GET** /v1/{location_id}/orders | Provides summary information for a merchant&#39;s online store orders.
*V1TransactionsApi* | [**listPayments**](docs/V1TransactionsApi.md#listPayments) | **GET** /v1/{location_id}/payments | Provides summary information for all payments taken by a merchant or any of the merchant&#39;s mobile staff during a date range. Date ranges cannot exceed one year in length. See Date ranges for details of inclusive and exclusive dates.
*V1TransactionsApi* | [**listRefunds**](docs/V1TransactionsApi.md#listRefunds) | **GET** /v1/{location_id}/refunds | Provides the details for all refunds initiated by a merchant or any of the merchant&#39;s mobile staff during a date range. Date ranges cannot exceed one year in length.
*V1TransactionsApi* | [**listSettlements**](docs/V1TransactionsApi.md#listSettlements) | **GET** /v1/{location_id}/settlements | Provides summary information for all deposits and withdrawals initiated by Square to a merchant&#39;s bank account during a date range. Date ranges cannot exceed one year in length.
*V1TransactionsApi* | [**retrieveBankAccount**](docs/V1TransactionsApi.md#retrieveBankAccount) | **GET** /v1/{location_id}/bank-accounts/{bank_account_id} | Provides non-confidential details for a merchant&#39;s associated bank account. This endpoint does not provide full bank account numbers, and there is no way to obtain a full bank account number with the Connect API.
*V1TransactionsApi* | [**retrieveOrder**](docs/V1TransactionsApi.md#retrieveOrder) | **GET** /v1/{location_id}/orders/{order_id} | Provides comprehensive information for a single online store order, including the order&#39;s history.
*V1TransactionsApi* | [**retrievePayment**](docs/V1TransactionsApi.md#retrievePayment) | **GET** /v1/{location_id}/payments/{payment_id} | Provides comprehensive information for a single payment.
*V1TransactionsApi* | [**retrieveSettlement**](docs/V1TransactionsApi.md#retrieveSettlement) | **GET** /v1/{location_id}/settlements/{settlement_id} | Provides comprehensive information for a single settlement, including the entries that contribute to the settlement&#39;s total.
*V1TransactionsApi* | [**updateOrder**](docs/V1TransactionsApi.md#updateOrder) | **PUT** /v1/{location_id}/orders/{order_id} | Updates the details of an online store order. Every update you perform on an order corresponds to one of three actions:


## Documentation for Models

 - [Address](docs/Address.md)
 - [BatchDeleteCatalogObjectsRequest](docs/BatchDeleteCatalogObjectsRequest.md)
 - [BatchDeleteCatalogObjectsResponse](docs/BatchDeleteCatalogObjectsResponse.md)
 - [BatchRetrieveCatalogObjectsRequest](docs/BatchRetrieveCatalogObjectsRequest.md)
 - [BatchRetrieveCatalogObjectsResponse](docs/BatchRetrieveCatalogObjectsResponse.md)
 - [BatchUpsertCatalogObjectsRequest](docs/BatchUpsertCatalogObjectsRequest.md)
 - [BatchUpsertCatalogObjectsResponse](docs/BatchUpsertCatalogObjectsResponse.md)
 - [CaptureTransactionRequest](docs/CaptureTransactionRequest.md)
 - [CaptureTransactionResponse](docs/CaptureTransactionResponse.md)
 - [Card](docs/Card.md)
 - [CardBrand](docs/CardBrand.md)
 - [CatalogCategory](docs/CatalogCategory.md)
 - [CatalogDiscount](docs/CatalogDiscount.md)
 - [CatalogDiscountType](docs/CatalogDiscountType.md)
 - [CatalogIdMapping](docs/CatalogIdMapping.md)
 - [CatalogInfoRequest](docs/CatalogInfoRequest.md)
 - [CatalogInfoResponse](docs/CatalogInfoResponse.md)
 - [CatalogInfoResponseLimits](docs/CatalogInfoResponseLimits.md)
 - [CatalogItem](docs/CatalogItem.md)
 - [CatalogItemModifierListInfo](docs/CatalogItemModifierListInfo.md)
 - [CatalogItemProductType](docs/CatalogItemProductType.md)
 - [CatalogItemVariation](docs/CatalogItemVariation.md)
 - [CatalogModifier](docs/CatalogModifier.md)
 - [CatalogModifierList](docs/CatalogModifierList.md)
 - [CatalogModifierListSelectionType](docs/CatalogModifierListSelectionType.md)
 - [CatalogModifierOverride](docs/CatalogModifierOverride.md)
 - [CatalogObject](docs/CatalogObject.md)
 - [CatalogObjectBatch](docs/CatalogObjectBatch.md)
 - [CatalogObjectType](docs/CatalogObjectType.md)
 - [CatalogPricingType](docs/CatalogPricingType.md)
 - [CatalogQuery](docs/CatalogQuery.md)
 - [CatalogQueryExact](docs/CatalogQueryExact.md)
 - [CatalogQueryItemsForModifierList](docs/CatalogQueryItemsForModifierList.md)
 - [CatalogQueryItemsForTax](docs/CatalogQueryItemsForTax.md)
 - [CatalogQueryPrefix](docs/CatalogQueryPrefix.md)
 - [CatalogQueryRange](docs/CatalogQueryRange.md)
 - [CatalogQuerySortedAttribute](docs/CatalogQuerySortedAttribute.md)
 - [CatalogQueryText](docs/CatalogQueryText.md)
 - [CatalogTax](docs/CatalogTax.md)
 - [CatalogV1Id](docs/CatalogV1Id.md)
 - [ChargeRequest](docs/ChargeRequest.md)
 - [ChargeResponse](docs/ChargeResponse.md)
 - [Checkout](docs/Checkout.md)
 - [Country](docs/Country.md)
 - [CreateCheckoutRequest](docs/CreateCheckoutRequest.md)
 - [CreateCheckoutResponse](docs/CreateCheckoutResponse.md)
 - [CreateCustomerCardRequest](docs/CreateCustomerCardRequest.md)
 - [CreateCustomerCardResponse](docs/CreateCustomerCardResponse.md)
 - [CreateCustomerRequest](docs/CreateCustomerRequest.md)
 - [CreateCustomerResponse](docs/CreateCustomerResponse.md)
 - [CreateOrderRequestLineItem](docs/CreateOrderRequestLineItem.md)
 - [CreateOrderRequestOrder](docs/CreateOrderRequestOrder.md)
 - [CreateRefundRequest](docs/CreateRefundRequest.md)
 - [CreateRefundResponse](docs/CreateRefundResponse.md)
 - [Currency](docs/Currency.md)
 - [Customer](docs/Customer.md)
 - [CustomerGroupInfo](docs/CustomerGroupInfo.md)
 - [CustomerPreferences](docs/CustomerPreferences.md)
 - [DeleteCatalogObjectRequest](docs/DeleteCatalogObjectRequest.md)
 - [DeleteCatalogObjectResponse](docs/DeleteCatalogObjectResponse.md)
 - [DeleteCustomerCardRequest](docs/DeleteCustomerCardRequest.md)
 - [DeleteCustomerCardResponse](docs/DeleteCustomerCardResponse.md)
 - [DeleteCustomerRequest](docs/DeleteCustomerRequest.md)
 - [DeleteCustomerResponse](docs/DeleteCustomerResponse.md)
 - [Device](docs/Device.md)
 - [Error](docs/Error.md)
 - [ErrorCategory](docs/ErrorCategory.md)
 - [ErrorCode](docs/ErrorCode.md)
 - [InventoryAlertType](docs/InventoryAlertType.md)
 - [ItemVariationLocationOverrides](docs/ItemVariationLocationOverrides.md)
 - [ListCatalogRequest](docs/ListCatalogRequest.md)
 - [ListCatalogResponse](docs/ListCatalogResponse.md)
 - [ListCustomersRequest](docs/ListCustomersRequest.md)
 - [ListCustomersResponse](docs/ListCustomersResponse.md)
 - [ListLocationsRequest](docs/ListLocationsRequest.md)
 - [ListLocationsResponse](docs/ListLocationsResponse.md)
 - [ListRefundsRequest](docs/ListRefundsRequest.md)
 - [ListRefundsResponse](docs/ListRefundsResponse.md)
 - [ListTransactionsRequest](docs/ListTransactionsRequest.md)
 - [ListTransactionsResponse](docs/ListTransactionsResponse.md)
 - [Location](docs/Location.md)
 - [LocationCapability](docs/LocationCapability.md)
 - [Money](docs/Money.md)
 - [Order](docs/Order.md)
 - [OrderLineItem](docs/OrderLineItem.md)
 - [Refund](docs/Refund.md)
 - [RefundStatus](docs/RefundStatus.md)
 - [RetrieveCatalogObjectRequest](docs/RetrieveCatalogObjectRequest.md)
 - [RetrieveCatalogObjectResponse](docs/RetrieveCatalogObjectResponse.md)
 - [RetrieveCustomerRequest](docs/RetrieveCustomerRequest.md)
 - [RetrieveCustomerResponse](docs/RetrieveCustomerResponse.md)
 - [RetrieveTransactionRequest](docs/RetrieveTransactionRequest.md)
 - [RetrieveTransactionResponse](docs/RetrieveTransactionResponse.md)
 - [SearchCatalogObjectsRequest](docs/SearchCatalogObjectsRequest.md)
 - [SearchCatalogObjectsResponse](docs/SearchCatalogObjectsResponse.md)
 - [SortOrder](docs/SortOrder.md)
 - [TaxCalculationPhase](docs/TaxCalculationPhase.md)
 - [TaxInclusionType](docs/TaxInclusionType.md)
 - [Tender](docs/Tender.md)
 - [TenderCardDetails](docs/TenderCardDetails.md)
 - [TenderCardDetailsEntryMethod](docs/TenderCardDetailsEntryMethod.md)
 - [TenderCardDetailsStatus](docs/TenderCardDetailsStatus.md)
 - [TenderCashDetails](docs/TenderCashDetails.md)
 - [TenderType](docs/TenderType.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionProduct](docs/TransactionProduct.md)
 - [UpdateCustomerRequest](docs/UpdateCustomerRequest.md)
 - [UpdateCustomerResponse](docs/UpdateCustomerResponse.md)
 - [UpdateItemModifierListsRequest](docs/UpdateItemModifierListsRequest.md)
 - [UpdateItemModifierListsResponse](docs/UpdateItemModifierListsResponse.md)
 - [UpdateItemTaxesRequest](docs/UpdateItemTaxesRequest.md)
 - [UpdateItemTaxesResponse](docs/UpdateItemTaxesResponse.md)
 - [UpsertCatalogObjectRequest](docs/UpsertCatalogObjectRequest.md)
 - [UpsertCatalogObjectResponse](docs/UpsertCatalogObjectResponse.md)
 - [V1AdjustInventoryRequest](docs/V1AdjustInventoryRequest.md)
 - [V1BankAccount](docs/V1BankAccount.md)
 - [V1CashDrawerEvent](docs/V1CashDrawerEvent.md)
 - [V1CashDrawerShift](docs/V1CashDrawerShift.md)
 - [V1Category](docs/V1Category.md)
 - [V1CreateRefundRequest](docs/V1CreateRefundRequest.md)
 - [V1Discount](docs/V1Discount.md)
 - [V1Employee](docs/V1Employee.md)
 - [V1EmployeeRole](docs/V1EmployeeRole.md)
 - [V1Fee](docs/V1Fee.md)
 - [V1InventoryEntry](docs/V1InventoryEntry.md)
 - [V1Item](docs/V1Item.md)
 - [V1ItemImage](docs/V1ItemImage.md)
 - [V1Merchant](docs/V1Merchant.md)
 - [V1MerchantLocationDetails](docs/V1MerchantLocationDetails.md)
 - [V1ModifierList](docs/V1ModifierList.md)
 - [V1ModifierOption](docs/V1ModifierOption.md)
 - [V1Money](docs/V1Money.md)
 - [V1Order](docs/V1Order.md)
 - [V1OrderHistoryEntry](docs/V1OrderHistoryEntry.md)
 - [V1Page](docs/V1Page.md)
 - [V1PageCell](docs/V1PageCell.md)
 - [V1Payment](docs/V1Payment.md)
 - [V1PaymentDiscount](docs/V1PaymentDiscount.md)
 - [V1PaymentItemDetail](docs/V1PaymentItemDetail.md)
 - [V1PaymentItemization](docs/V1PaymentItemization.md)
 - [V1PaymentModifier](docs/V1PaymentModifier.md)
 - [V1PaymentTax](docs/V1PaymentTax.md)
 - [V1PhoneNumber](docs/V1PhoneNumber.md)
 - [V1Refund](docs/V1Refund.md)
 - [V1Settlement](docs/V1Settlement.md)
 - [V1SettlementEntry](docs/V1SettlementEntry.md)
 - [V1Tender](docs/V1Tender.md)
 - [V1Timecard](docs/V1Timecard.md)
 - [V1TimecardEvent](docs/V1TimecardEvent.md)
 - [V1UpdateModifierListRequest](docs/V1UpdateModifierListRequest.md)
 - [V1UpdateOrderRequest](docs/V1UpdateOrderRequest.md)
 - [V1Variation](docs/V1Variation.md)
 - [VoidTransactionRequest](docs/VoidTransactionRequest.md)
 - [VoidTransactionResponse](docs/VoidTransactionResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://connect.squareup.com/oauth2/authorize?&lt;PARAMETERS&gt;
- **Scopes**: 
  - MERCHANT_PROFILE_READ: GET endpoints related to a merchant&#39;s business and location entities. Almost all Connect API applications need this permission in order to obtain a merchant&#39;s location IDs
  - PAYMENTS_READ: GET endpoints related to transactions and refunds
  - PAYMENTS_WRITE: POST, PUT, and DELETE endpoints related to transactions and refunds. E-commerce applications must request this permission
  - CUSTOMERS_READ:  GET endpoints related to customer management
  - CUSTOMERS_WRITE: POST, PUT, and DELETE endpoints related to customer management
  - SETTLEMENTS_READ: GET endpoints related to settlements (deposits)
  - BANK_ACCOUNTS_READ: GET endpoints related to a merchant&#39;s bank accounts
  - ITEMS_READ: GET endpoints related to a merchant&#39;s item library
  - ITEMS_WRITE: POST, PUT, and DELETE endpoints related to a merchant&#39;s item library
  - ORDERS_READ: GET endpoints related to a merchant&#39;s Square online store.
  - ORDERS_WRITE: POST, PUT, and DELETE endpoints related to a merchant&#39;s Square online store
  - EMPLOYEES_READ: GET endpoints related to employee management
  - EMPLOYEES_WRITE: POST, PUT, and DELETE endpoints related to employee management
  - TIMECARDS_READ: GET endpoints related to employee timecards
  - TIMECARDS_WRITE: POST, PUT, and DELETE endpoints related to employee timecards


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

developers@squareup.com

