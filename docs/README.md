![Square logo]

# Square Connect Java SDK Technical Reference

---
## The Square Connect Java SDK is retired (EOL) as of 2019-12-17 and will no longer receive bug fixes or product updates.
---

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.squareup/connect/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.squareup/connect)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)
==================

**If you have feedback about the new SDKs, or just want to talk to other Square Developers, request an invite to the new [slack community for Square Developers](https://squ.re/2GB8GHk)**

## Requirements

Java 8

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

### Option 1: Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.squareup</groupId>
    <artifactId>connect</artifactId>
    <version>2.20191120.0</version>
    <scope>compile</scope>
</dependency>
```

### Option 2: Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.squareup:connect:2.20191120.0"
```

### Option 3: Build and Install locally

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install -DskipTests
```

To run tests, you would need to create below **accounts.json** under **travis-ci** folder.

```json
{
  "US-Prod": {
    "email": "your_email",
    "access_token": "your_access_token",
    "location_id": "your_location_id",
    "application_id": "your_application_id"
  },
  "US-Prod-Sandbox": {
    "email": "your_email",
    "access_token": "your_sandbox_access_token",
    "location_id": "your_sandbox_location_id",
    "application_id": "your_sandbox_application_id"
  }
}
```

```shell
mvn install
```

### Option 4: Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/connect-2.20191120.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.squareup.connect.ApiClient;
import com.squareup.connect.ApiException;
import com.squareup.connect.Configuration;
import com.squareup.connect.api.LocationsApi;
import com.squareup.connect.auth.OAuth;
import com.squareup.connect.models.Location;

import java.io.File;
import java.util.*;

public class Example {

    public static void main(String[] args) {
        ApiClient apiClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) apiClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR_ACCESS_TOKEN");

        // List all locations
        LocationsApi locationsApi = new LocationsApi();
        locationsApi.setApiClient(apiClient);

        try {
            List<Location> locations = locationsApi.listLocations().getLocations();
            System.out.println(locations);
        } catch (ApiException e) {
            System.err.println("Exception when calling API");
            e.printStackTrace();
        }
    }
}
```

### How to configure sandbox environment
```java

import com.squareup.connect.ApiClient;
import com.squareup.connect.ApiException;
import com.squareup.connect.Configuration;
import com.squareup.connect.api.LocationsApi;
import com.squareup.connect.auth.OAuth;
import com.squareup.connect.models.Location;

import java.io.File;
import java.util.*;

public class Example {

    public static void main(String[] args) {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        // Set sandbox url
        apiClient.setBasePath('https://connect.squareupsandbox.com');

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) apiClient.getAuthentication("oauth2");
        // Set your sandbox token
        oauth2.setAccessToken("YOUR_SANDBOX_ACCESS_TOKEN");

        LocationsApi locationsApi = new LocationsApi();
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://connect.squareup.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplePayApi* | [**registerDomain**](ApplePayApi.md#registerDomain) | **POST** /v2/apple-pay/domains | RegisterDomain
*CatalogApi* | [**batchDeleteCatalogObjects**](CatalogApi.md#batchDeleteCatalogObjects) | **POST** /v2/catalog/batch-delete | BatchDeleteCatalogObjects
*CatalogApi* | [**batchRetrieveCatalogObjects**](CatalogApi.md#batchRetrieveCatalogObjects) | **POST** /v2/catalog/batch-retrieve | BatchRetrieveCatalogObjects
*CatalogApi* | [**batchUpsertCatalogObjects**](CatalogApi.md#batchUpsertCatalogObjects) | **POST** /v2/catalog/batch-upsert | BatchUpsertCatalogObjects
*CatalogApi* | [**catalogInfo**](CatalogApi.md#catalogInfo) | **GET** /v2/catalog/info | CatalogInfo
*CatalogApi* | [**deleteCatalogObject**](CatalogApi.md#deleteCatalogObject) | **DELETE** /v2/catalog/object/{object_id} | DeleteCatalogObject
*CatalogApi* | [**listCatalog**](CatalogApi.md#listCatalog) | **GET** /v2/catalog/list | ListCatalog
*CatalogApi* | [**retrieveCatalogObject**](CatalogApi.md#retrieveCatalogObject) | **GET** /v2/catalog/object/{object_id} | RetrieveCatalogObject
*CatalogApi* | [**searchCatalogObjects**](CatalogApi.md#searchCatalogObjects) | **POST** /v2/catalog/search | SearchCatalogObjects
*CatalogApi* | [**updateItemModifierLists**](CatalogApi.md#updateItemModifierLists) | **POST** /v2/catalog/update-item-modifier-lists | UpdateItemModifierLists
*CatalogApi* | [**updateItemTaxes**](CatalogApi.md#updateItemTaxes) | **POST** /v2/catalog/update-item-taxes | UpdateItemTaxes
*CatalogApi* | [**upsertCatalogObject**](CatalogApi.md#upsertCatalogObject) | **POST** /v2/catalog/object | UpsertCatalogObject
*CheckoutApi* | [**createCheckout**](CheckoutApi.md#createCheckout) | **POST** /v2/locations/{location_id}/checkouts | CreateCheckout
*CustomersApi* | [**createCustomer**](CustomersApi.md#createCustomer) | **POST** /v2/customers | CreateCustomer
*CustomersApi* | [**createCustomerCard**](CustomersApi.md#createCustomerCard) | **POST** /v2/customers/{customer_id}/cards | CreateCustomerCard
*CustomersApi* | [**deleteCustomer**](CustomersApi.md#deleteCustomer) | **DELETE** /v2/customers/{customer_id} | DeleteCustomer
*CustomersApi* | [**deleteCustomerCard**](CustomersApi.md#deleteCustomerCard) | **DELETE** /v2/customers/{customer_id}/cards/{card_id} | DeleteCustomerCard
*CustomersApi* | [**listCustomers**](CustomersApi.md#listCustomers) | **GET** /v2/customers | ListCustomers
*CustomersApi* | [**retrieveCustomer**](CustomersApi.md#retrieveCustomer) | **GET** /v2/customers/{customer_id} | RetrieveCustomer
*CustomersApi* | [**searchCustomers**](CustomersApi.md#searchCustomers) | **POST** /v2/customers/search | SearchCustomers
*CustomersApi* | [**updateCustomer**](CustomersApi.md#updateCustomer) | **PUT** /v2/customers/{customer_id} | UpdateCustomer
*EmployeesApi* | [**listEmployees**](EmployeesApi.md#listEmployees) | **GET** /v2/employees | ListEmployees
*EmployeesApi* | [**retrieveEmployee**](EmployeesApi.md#retrieveEmployee) | **GET** /v2/employees/{id} | RetrieveEmployee
*InventoryApi* | [**batchChangeInventory**](InventoryApi.md#batchChangeInventory) | **POST** /v2/inventory/batch-change | BatchChangeInventory
*InventoryApi* | [**batchRetrieveInventoryChanges**](InventoryApi.md#batchRetrieveInventoryChanges) | **POST** /v2/inventory/batch-retrieve-changes | BatchRetrieveInventoryChanges
*InventoryApi* | [**batchRetrieveInventoryCounts**](InventoryApi.md#batchRetrieveInventoryCounts) | **POST** /v2/inventory/batch-retrieve-counts | BatchRetrieveInventoryCounts
*InventoryApi* | [**retrieveInventoryAdjustment**](InventoryApi.md#retrieveInventoryAdjustment) | **GET** /v2/inventory/adjustment/{adjustment_id} | RetrieveInventoryAdjustment
*InventoryApi* | [**retrieveInventoryChanges**](InventoryApi.md#retrieveInventoryChanges) | **GET** /v2/inventory/{catalog_object_id}/changes | RetrieveInventoryChanges
*InventoryApi* | [**retrieveInventoryCount**](InventoryApi.md#retrieveInventoryCount) | **GET** /v2/inventory/{catalog_object_id} | RetrieveInventoryCount
*InventoryApi* | [**retrieveInventoryPhysicalCount**](InventoryApi.md#retrieveInventoryPhysicalCount) | **GET** /v2/inventory/physical-count/{physical_count_id} | RetrieveInventoryPhysicalCount
*LaborApi* | [**createBreakType**](LaborApi.md#createBreakType) | **POST** /v2/labor/break-types | CreateBreakType
*LaborApi* | [**createShift**](LaborApi.md#createShift) | **POST** /v2/labor/shifts | CreateShift
*LaborApi* | [**deleteBreakType**](LaborApi.md#deleteBreakType) | **DELETE** /v2/labor/break-types/{id} | DeleteBreakType
*LaborApi* | [**deleteShift**](LaborApi.md#deleteShift) | **DELETE** /v2/labor/shifts/{id} | DeleteShift
*LaborApi* | [**getBreakType**](LaborApi.md#getBreakType) | **GET** /v2/labor/break-types/{id} | GetBreakType
*LaborApi* | [**getEmployeeWage**](LaborApi.md#getEmployeeWage) | **GET** /v2/labor/employee-wages/{id} | GetEmployeeWage
*LaborApi* | [**getShift**](LaborApi.md#getShift) | **GET** /v2/labor/shifts/{id} | GetShift
*LaborApi* | [**listBreakTypes**](LaborApi.md#listBreakTypes) | **GET** /v2/labor/break-types | ListBreakTypes
*LaborApi* | [**listEmployeeWages**](LaborApi.md#listEmployeeWages) | **GET** /v2/labor/employee-wages | ListEmployeeWages
*LaborApi* | [**listWorkweekConfigs**](LaborApi.md#listWorkweekConfigs) | **GET** /v2/labor/workweek-configs | ListWorkweekConfigs
*LaborApi* | [**searchShifts**](LaborApi.md#searchShifts) | **POST** /v2/labor/shifts/search | SearchShifts
*LaborApi* | [**updateBreakType**](LaborApi.md#updateBreakType) | **PUT** /v2/labor/break-types/{id} | UpdateBreakType
*LaborApi* | [**updateShift**](LaborApi.md#updateShift) | **PUT** /v2/labor/shifts/{id} | UpdateShift
*LaborApi* | [**updateWorkweekConfig**](LaborApi.md#updateWorkweekConfig) | **PUT** /v2/labor/workweek-configs/{id} | UpdateWorkweekConfig
*LocationsApi* | [**createLocation**](LocationsApi.md#createLocation) | **POST** /v2/locations | CreateLocation
*LocationsApi* | [**listLocations**](LocationsApi.md#listLocations) | **GET** /v2/locations | ListLocations
*LocationsApi* | [**retrieveLocation**](LocationsApi.md#retrieveLocation) | **GET** /v2/locations/{location_id} | RetrieveLocation
*LocationsApi* | [**updateLocation**](LocationsApi.md#updateLocation) | **PUT** /v2/locations/{location_id} | UpdateLocation
*MerchantsApi* | [**listMerchants**](MerchantsApi.md#listMerchants) | **GET** /v2/merchants | ListMerchants
*MerchantsApi* | [**retrieveMerchant**](MerchantsApi.md#retrieveMerchant) | **GET** /v2/merchants/{merchant_id} | RetrieveMerchant
*MobileAuthorizationApi* | [**createMobileAuthorizationCode**](MobileAuthorizationApi.md#createMobileAuthorizationCode) | **POST** /mobile/authorization-code | CreateMobileAuthorizationCode
*OAuthApi* | [**obtainToken**](OAuthApi.md#obtainToken) | **POST** /oauth2/token | ObtainToken
*OAuthApi* | [**renewToken**](OAuthApi.md#renewToken) | **POST** /oauth2/clients/{client_id}/access-token/renew | RenewToken
*OAuthApi* | [**revokeToken**](OAuthApi.md#revokeToken) | **POST** /oauth2/revoke | RevokeToken
*OrdersApi* | [**batchRetrieveOrders**](OrdersApi.md#batchRetrieveOrders) | **POST** /v2/locations/{location_id}/orders/batch-retrieve | BatchRetrieveOrders
*OrdersApi* | [**createOrder**](OrdersApi.md#createOrder) | **POST** /v2/locations/{location_id}/orders | CreateOrder
*OrdersApi* | [**payOrder**](OrdersApi.md#payOrder) | **POST** /v2/orders/{order_id}/pay | PayOrder
*OrdersApi* | [**searchOrders**](OrdersApi.md#searchOrders) | **POST** /v2/orders/search | SearchOrders
*OrdersApi* | [**updateOrder**](OrdersApi.md#updateOrder) | **PUT** /v2/locations/{location_id}/orders/{order_id} | UpdateOrder
*PaymentsApi* | [**cancelPayment**](PaymentsApi.md#cancelPayment) | **POST** /v2/payments/{payment_id}/cancel | CancelPayment
*PaymentsApi* | [**cancelPaymentByIdempotencyKey**](PaymentsApi.md#cancelPaymentByIdempotencyKey) | **POST** /v2/payments/cancel | CancelPaymentByIdempotencyKey
*PaymentsApi* | [**completePayment**](PaymentsApi.md#completePayment) | **POST** /v2/payments/{payment_id}/complete | CompletePayment
*PaymentsApi* | [**createPayment**](PaymentsApi.md#createPayment) | **POST** /v2/payments | CreatePayment
*PaymentsApi* | [**getPayment**](PaymentsApi.md#getPayment) | **GET** /v2/payments/{payment_id} | GetPayment
*PaymentsApi* | [**listPayments**](PaymentsApi.md#listPayments) | **GET** /v2/payments | ListPayments
*RefundsApi* | [**getPaymentRefund**](RefundsApi.md#getPaymentRefund) | **GET** /v2/refunds/{refund_id} | GetPaymentRefund
*RefundsApi* | [**listPaymentRefunds**](RefundsApi.md#listPaymentRefunds) | **GET** /v2/refunds | ListPaymentRefunds
*RefundsApi* | [**refundPayment**](RefundsApi.md#refundPayment) | **POST** /v2/refunds | RefundPayment
*ReportingApi* | [**listAdditionalRecipientReceivableRefunds**](ReportingApi.md#listAdditionalRecipientReceivableRefunds) | **GET** /v2/locations/{location_id}/additional-recipient-receivable-refunds | ListAdditionalRecipientReceivableRefunds
*ReportingApi* | [**listAdditionalRecipientReceivables**](ReportingApi.md#listAdditionalRecipientReceivables) | **GET** /v2/locations/{location_id}/additional-recipient-receivables | ListAdditionalRecipientReceivables
*TransactionsApi* | [**captureTransaction**](TransactionsApi.md#captureTransaction) | **POST** /v2/locations/{location_id}/transactions/{transaction_id}/capture | CaptureTransaction
*TransactionsApi* | [**charge**](TransactionsApi.md#charge) | **POST** /v2/locations/{location_id}/transactions | Charge
*TransactionsApi* | [**createRefund**](TransactionsApi.md#createRefund) | **POST** /v2/locations/{location_id}/transactions/{transaction_id}/refund | CreateRefund
*TransactionsApi* | [**listRefunds**](TransactionsApi.md#listRefunds) | **GET** /v2/locations/{location_id}/refunds | ListRefunds
*TransactionsApi* | [**listTransactions**](TransactionsApi.md#listTransactions) | **GET** /v2/locations/{location_id}/transactions | ListTransactions
*TransactionsApi* | [**retrieveTransaction**](TransactionsApi.md#retrieveTransaction) | **GET** /v2/locations/{location_id}/transactions/{transaction_id} | RetrieveTransaction
*TransactionsApi* | [**voidTransaction**](TransactionsApi.md#voidTransaction) | **POST** /v2/locations/{location_id}/transactions/{transaction_id}/void | VoidTransaction
*V1EmployeesApi* | [**createEmployee**](V1EmployeesApi.md#createEmployee) | **POST** /v1/me/employees | CreateEmployee
*V1EmployeesApi* | [**createEmployeeRole**](V1EmployeesApi.md#createEmployeeRole) | **POST** /v1/me/roles | CreateEmployeeRole
*V1EmployeesApi* | [**createTimecard**](V1EmployeesApi.md#createTimecard) | **POST** /v1/me/timecards | CreateTimecard
*V1EmployeesApi* | [**deleteTimecard**](V1EmployeesApi.md#deleteTimecard) | **DELETE** /v1/me/timecards/{timecard_id} | DeleteTimecard
*V1EmployeesApi* | [**listCashDrawerShifts**](V1EmployeesApi.md#listCashDrawerShifts) | **GET** /v1/{location_id}/cash-drawer-shifts | ListCashDrawerShifts
*V1EmployeesApi* | [**listEmployeeRoles**](V1EmployeesApi.md#listEmployeeRoles) | **GET** /v1/me/roles | ListEmployeeRoles
*V1EmployeesApi* | [**listEmployees**](V1EmployeesApi.md#listEmployees) | **GET** /v1/me/employees | ListEmployees
*V1EmployeesApi* | [**listTimecardEvents**](V1EmployeesApi.md#listTimecardEvents) | **GET** /v1/me/timecards/{timecard_id}/events | ListTimecardEvents
*V1EmployeesApi* | [**listTimecards**](V1EmployeesApi.md#listTimecards) | **GET** /v1/me/timecards | ListTimecards
*V1EmployeesApi* | [**retrieveCashDrawerShift**](V1EmployeesApi.md#retrieveCashDrawerShift) | **GET** /v1/{location_id}/cash-drawer-shifts/{shift_id} | RetrieveCashDrawerShift
*V1EmployeesApi* | [**retrieveEmployee**](V1EmployeesApi.md#retrieveEmployee) | **GET** /v1/me/employees/{employee_id} | RetrieveEmployee
*V1EmployeesApi* | [**retrieveEmployeeRole**](V1EmployeesApi.md#retrieveEmployeeRole) | **GET** /v1/me/roles/{role_id} | RetrieveEmployeeRole
*V1EmployeesApi* | [**retrieveTimecard**](V1EmployeesApi.md#retrieveTimecard) | **GET** /v1/me/timecards/{timecard_id} | RetrieveTimecard
*V1EmployeesApi* | [**updateEmployee**](V1EmployeesApi.md#updateEmployee) | **PUT** /v1/me/employees/{employee_id} | UpdateEmployee
*V1EmployeesApi* | [**updateEmployeeRole**](V1EmployeesApi.md#updateEmployeeRole) | **PUT** /v1/me/roles/{role_id} | UpdateEmployeeRole
*V1EmployeesApi* | [**updateTimecard**](V1EmployeesApi.md#updateTimecard) | **PUT** /v1/me/timecards/{timecard_id} | UpdateTimecard
*V1ItemsApi* | [**adjustInventory**](V1ItemsApi.md#adjustInventory) | **POST** /v1/{location_id}/inventory/{variation_id} | AdjustInventory
*V1ItemsApi* | [**applyFee**](V1ItemsApi.md#applyFee) | **PUT** /v1/{location_id}/items/{item_id}/fees/{fee_id} | ApplyFee
*V1ItemsApi* | [**applyModifierList**](V1ItemsApi.md#applyModifierList) | **PUT** /v1/{location_id}/items/{item_id}/modifier-lists/{modifier_list_id} | ApplyModifierList
*V1ItemsApi* | [**createCategory**](V1ItemsApi.md#createCategory) | **POST** /v1/{location_id}/categories | CreateCategory
*V1ItemsApi* | [**createDiscount**](V1ItemsApi.md#createDiscount) | **POST** /v1/{location_id}/discounts | CreateDiscount
*V1ItemsApi* | [**createFee**](V1ItemsApi.md#createFee) | **POST** /v1/{location_id}/fees | CreateFee
*V1ItemsApi* | [**createItem**](V1ItemsApi.md#createItem) | **POST** /v1/{location_id}/items | CreateItem
*V1ItemsApi* | [**createModifierList**](V1ItemsApi.md#createModifierList) | **POST** /v1/{location_id}/modifier-lists | CreateModifierList
*V1ItemsApi* | [**createModifierOption**](V1ItemsApi.md#createModifierOption) | **POST** /v1/{location_id}/modifier-lists/{modifier_list_id}/modifier-options | CreateModifierOption
*V1ItemsApi* | [**createPage**](V1ItemsApi.md#createPage) | **POST** /v1/{location_id}/pages | CreatePage
*V1ItemsApi* | [**createVariation**](V1ItemsApi.md#createVariation) | **POST** /v1/{location_id}/items/{item_id}/variations | CreateVariation
*V1ItemsApi* | [**deleteCategory**](V1ItemsApi.md#deleteCategory) | **DELETE** /v1/{location_id}/categories/{category_id} | DeleteCategory
*V1ItemsApi* | [**deleteDiscount**](V1ItemsApi.md#deleteDiscount) | **DELETE** /v1/{location_id}/discounts/{discount_id} | DeleteDiscount
*V1ItemsApi* | [**deleteFee**](V1ItemsApi.md#deleteFee) | **DELETE** /v1/{location_id}/fees/{fee_id} | DeleteFee
*V1ItemsApi* | [**deleteItem**](V1ItemsApi.md#deleteItem) | **DELETE** /v1/{location_id}/items/{item_id} | DeleteItem
*V1ItemsApi* | [**deleteModifierList**](V1ItemsApi.md#deleteModifierList) | **DELETE** /v1/{location_id}/modifier-lists/{modifier_list_id} | DeleteModifierList
*V1ItemsApi* | [**deleteModifierOption**](V1ItemsApi.md#deleteModifierOption) | **DELETE** /v1/{location_id}/modifier-lists/{modifier_list_id}/modifier-options/{modifier_option_id} | DeleteModifierOption
*V1ItemsApi* | [**deletePage**](V1ItemsApi.md#deletePage) | **DELETE** /v1/{location_id}/pages/{page_id} | DeletePage
*V1ItemsApi* | [**deletePageCell**](V1ItemsApi.md#deletePageCell) | **DELETE** /v1/{location_id}/pages/{page_id}/cells | DeletePageCell
*V1ItemsApi* | [**deleteVariation**](V1ItemsApi.md#deleteVariation) | **DELETE** /v1/{location_id}/items/{item_id}/variations/{variation_id} | DeleteVariation
*V1ItemsApi* | [**listCategories**](V1ItemsApi.md#listCategories) | **GET** /v1/{location_id}/categories | ListCategories
*V1ItemsApi* | [**listDiscounts**](V1ItemsApi.md#listDiscounts) | **GET** /v1/{location_id}/discounts | ListDiscounts
*V1ItemsApi* | [**listFees**](V1ItemsApi.md#listFees) | **GET** /v1/{location_id}/fees | ListFees
*V1ItemsApi* | [**listInventory**](V1ItemsApi.md#listInventory) | **GET** /v1/{location_id}/inventory | ListInventory
*V1ItemsApi* | [**listItems**](V1ItemsApi.md#listItems) | **GET** /v1/{location_id}/items | ListItems
*V1ItemsApi* | [**listModifierLists**](V1ItemsApi.md#listModifierLists) | **GET** /v1/{location_id}/modifier-lists | ListModifierLists
*V1ItemsApi* | [**listPages**](V1ItemsApi.md#listPages) | **GET** /v1/{location_id}/pages | ListPages
*V1ItemsApi* | [**removeFee**](V1ItemsApi.md#removeFee) | **DELETE** /v1/{location_id}/items/{item_id}/fees/{fee_id} | RemoveFee
*V1ItemsApi* | [**removeModifierList**](V1ItemsApi.md#removeModifierList) | **DELETE** /v1/{location_id}/items/{item_id}/modifier-lists/{modifier_list_id} | RemoveModifierList
*V1ItemsApi* | [**retrieveItem**](V1ItemsApi.md#retrieveItem) | **GET** /v1/{location_id}/items/{item_id} | RetrieveItem
*V1ItemsApi* | [**retrieveModifierList**](V1ItemsApi.md#retrieveModifierList) | **GET** /v1/{location_id}/modifier-lists/{modifier_list_id} | RetrieveModifierList
*V1ItemsApi* | [**updateCategory**](V1ItemsApi.md#updateCategory) | **PUT** /v1/{location_id}/categories/{category_id} | UpdateCategory
*V1ItemsApi* | [**updateDiscount**](V1ItemsApi.md#updateDiscount) | **PUT** /v1/{location_id}/discounts/{discount_id} | UpdateDiscount
*V1ItemsApi* | [**updateFee**](V1ItemsApi.md#updateFee) | **PUT** /v1/{location_id}/fees/{fee_id} | UpdateFee
*V1ItemsApi* | [**updateItem**](V1ItemsApi.md#updateItem) | **PUT** /v1/{location_id}/items/{item_id} | UpdateItem
*V1ItemsApi* | [**updateModifierList**](V1ItemsApi.md#updateModifierList) | **PUT** /v1/{location_id}/modifier-lists/{modifier_list_id} | UpdateModifierList
*V1ItemsApi* | [**updateModifierOption**](V1ItemsApi.md#updateModifierOption) | **PUT** /v1/{location_id}/modifier-lists/{modifier_list_id}/modifier-options/{modifier_option_id} | UpdateModifierOption
*V1ItemsApi* | [**updatePage**](V1ItemsApi.md#updatePage) | **PUT** /v1/{location_id}/pages/{page_id} | UpdatePage
*V1ItemsApi* | [**updatePageCell**](V1ItemsApi.md#updatePageCell) | **PUT** /v1/{location_id}/pages/{page_id}/cells | UpdatePageCell
*V1ItemsApi* | [**updateVariation**](V1ItemsApi.md#updateVariation) | **PUT** /v1/{location_id}/items/{item_id}/variations/{variation_id} | UpdateVariation
*V1LocationsApi* | [**listLocations**](V1LocationsApi.md#listLocations) | **GET** /v1/me/locations | ListLocations
*V1LocationsApi* | [**retrieveBusiness**](V1LocationsApi.md#retrieveBusiness) | **GET** /v1/me | RetrieveBusiness
*V1TransactionsApi* | [**createRefund**](V1TransactionsApi.md#createRefund) | **POST** /v1/{location_id}/refunds | CreateRefund
*V1TransactionsApi* | [**listBankAccounts**](V1TransactionsApi.md#listBankAccounts) | **GET** /v1/{location_id}/bank-accounts | ListBankAccounts
*V1TransactionsApi* | [**listOrders**](V1TransactionsApi.md#listOrders) | **GET** /v1/{location_id}/orders | ListOrders
*V1TransactionsApi* | [**listPayments**](V1TransactionsApi.md#listPayments) | **GET** /v1/{location_id}/payments | ListPayments
*V1TransactionsApi* | [**listRefunds**](V1TransactionsApi.md#listRefunds) | **GET** /v1/{location_id}/refunds | ListRefunds
*V1TransactionsApi* | [**listSettlements**](V1TransactionsApi.md#listSettlements) | **GET** /v1/{location_id}/settlements | ListSettlements
*V1TransactionsApi* | [**retrieveBankAccount**](V1TransactionsApi.md#retrieveBankAccount) | **GET** /v1/{location_id}/bank-accounts/{bank_account_id} | RetrieveBankAccount
*V1TransactionsApi* | [**retrieveOrder**](V1TransactionsApi.md#retrieveOrder) | **GET** /v1/{location_id}/orders/{order_id} | RetrieveOrder
*V1TransactionsApi* | [**retrievePayment**](V1TransactionsApi.md#retrievePayment) | **GET** /v1/{location_id}/payments/{payment_id} | RetrievePayment
*V1TransactionsApi* | [**retrieveSettlement**](V1TransactionsApi.md#retrieveSettlement) | **GET** /v1/{location_id}/settlements/{settlement_id} | RetrieveSettlement
*V1TransactionsApi* | [**updateOrder**](V1TransactionsApi.md#updateOrder) | **PUT** /v1/{location_id}/orders/{order_id} | UpdateOrder


## Documentation for Models

 - [AdditionalRecipient](AdditionalRecipient.md)
 - [AdditionalRecipientReceivable](AdditionalRecipientReceivable.md)
 - [AdditionalRecipientReceivableRefund](AdditionalRecipientReceivableRefund.md)
 - [Address](Address.md)
 - [BalancePaymentDetails](BalancePaymentDetails.md)
 - [BatchChangeInventoryRequest](BatchChangeInventoryRequest.md)
 - [BatchChangeInventoryResponse](BatchChangeInventoryResponse.md)
 - [BatchDeleteCatalogObjectsRequest](BatchDeleteCatalogObjectsRequest.md)
 - [BatchDeleteCatalogObjectsResponse](BatchDeleteCatalogObjectsResponse.md)
 - [BatchRetrieveCatalogObjectsRequest](BatchRetrieveCatalogObjectsRequest.md)
 - [BatchRetrieveCatalogObjectsResponse](BatchRetrieveCatalogObjectsResponse.md)
 - [BatchRetrieveInventoryChangesRequest](BatchRetrieveInventoryChangesRequest.md)
 - [BatchRetrieveInventoryChangesResponse](BatchRetrieveInventoryChangesResponse.md)
 - [BatchRetrieveInventoryCountsRequest](BatchRetrieveInventoryCountsRequest.md)
 - [BatchRetrieveInventoryCountsResponse](BatchRetrieveInventoryCountsResponse.md)
 - [BatchRetrieveOrdersRequest](BatchRetrieveOrdersRequest.md)
 - [BatchRetrieveOrdersResponse](BatchRetrieveOrdersResponse.md)
 - [BatchUpsertCatalogObjectsRequest](BatchUpsertCatalogObjectsRequest.md)
 - [BatchUpsertCatalogObjectsResponse](BatchUpsertCatalogObjectsResponse.md)
 - [BreakType](BreakType.md)
 - [BusinessHours](BusinessHours.md)
 - [BusinessHoursPeriod](BusinessHoursPeriod.md)
 - [CancelPaymentByIdempotencyKeyRequest](CancelPaymentByIdempotencyKeyRequest.md)
 - [CancelPaymentByIdempotencyKeyResponse](CancelPaymentByIdempotencyKeyResponse.md)
 - [CancelPaymentRequest](CancelPaymentRequest.md)
 - [CancelPaymentResponse](CancelPaymentResponse.md)
 - [CaptureTransactionRequest](CaptureTransactionRequest.md)
 - [CaptureTransactionResponse](CaptureTransactionResponse.md)
 - [Card](Card.md)
 - [CardBrand](CardBrand.md)
 - [CardPaymentDetails](CardPaymentDetails.md)
 - [CashPaymentDetails](CashPaymentDetails.md)
 - [CatalogCategory](CatalogCategory.md)
 - [CatalogDiscount](CatalogDiscount.md)
 - [CatalogDiscountModifyTaxBasis](CatalogDiscountModifyTaxBasis.md)
 - [CatalogDiscountType](CatalogDiscountType.md)
 - [CatalogIdMapping](CatalogIdMapping.md)
 - [CatalogImage](CatalogImage.md)
 - [CatalogInfoRequest](CatalogInfoRequest.md)
 - [CatalogInfoResponse](CatalogInfoResponse.md)
 - [CatalogInfoResponseLimits](CatalogInfoResponseLimits.md)
 - [CatalogItem](CatalogItem.md)
 - [CatalogItemModifierListInfo](CatalogItemModifierListInfo.md)
 - [CatalogItemOption](CatalogItemOption.md)
 - [CatalogItemOptionForItem](CatalogItemOptionForItem.md)
 - [CatalogItemOptionValue](CatalogItemOptionValue.md)
 - [CatalogItemOptionValueForItemVariation](CatalogItemOptionValueForItemVariation.md)
 - [CatalogItemProductType](CatalogItemProductType.md)
 - [CatalogItemVariation](CatalogItemVariation.md)
 - [CatalogMeasurementUnit](CatalogMeasurementUnit.md)
 - [CatalogModifier](CatalogModifier.md)
 - [CatalogModifierList](CatalogModifierList.md)
 - [CatalogModifierListSelectionType](CatalogModifierListSelectionType.md)
 - [CatalogModifierOverride](CatalogModifierOverride.md)
 - [CatalogObject](CatalogObject.md)
 - [CatalogObjectBatch](CatalogObjectBatch.md)
 - [CatalogObjectType](CatalogObjectType.md)
 - [CatalogPricingRule](CatalogPricingRule.md)
 - [CatalogPricingType](CatalogPricingType.md)
 - [CatalogProductSet](CatalogProductSet.md)
 - [CatalogQuery](CatalogQuery.md)
 - [CatalogQueryCustomAttributeUsage](CatalogQueryCustomAttributeUsage.md)
 - [CatalogQueryExact](CatalogQueryExact.md)
 - [CatalogQueryFilteredItems](CatalogQueryFilteredItems.md)
 - [CatalogQueryFilteredItemsCustomAttributeFilter](CatalogQueryFilteredItemsCustomAttributeFilter.md)
 - [CatalogQueryFilteredItemsCustomAttributeFilterFilterType](CatalogQueryFilteredItemsCustomAttributeFilterFilterType.md)
 - [CatalogQueryFilteredItemsNullableAttribute](CatalogQueryFilteredItemsNullableAttribute.md)
 - [CatalogQueryFilteredItemsStockLevel](CatalogQueryFilteredItemsStockLevel.md)
 - [CatalogQueryItemVariationsForItemOptionValues](CatalogQueryItemVariationsForItemOptionValues.md)
 - [CatalogQueryItemsForItemOptions](CatalogQueryItemsForItemOptions.md)
 - [CatalogQueryItemsForModifierList](CatalogQueryItemsForModifierList.md)
 - [CatalogQueryItemsForTax](CatalogQueryItemsForTax.md)
 - [CatalogQueryPrefix](CatalogQueryPrefix.md)
 - [CatalogQueryRange](CatalogQueryRange.md)
 - [CatalogQuerySortedAttribute](CatalogQuerySortedAttribute.md)
 - [CatalogQueryText](CatalogQueryText.md)
 - [CatalogTax](CatalogTax.md)
 - [CatalogTimePeriod](CatalogTimePeriod.md)
 - [CatalogV1Id](CatalogV1Id.md)
 - [ChargeRequest](ChargeRequest.md)
 - [ChargeRequestAdditionalRecipient](ChargeRequestAdditionalRecipient.md)
 - [ChargeResponse](ChargeResponse.md)
 - [Checkout](Checkout.md)
 - [CompletePaymentRequest](CompletePaymentRequest.md)
 - [CompletePaymentResponse](CompletePaymentResponse.md)
 - [Coordinates](Coordinates.md)
 - [Country](Country.md)
 - [CreateBreakTypeRequest](CreateBreakTypeRequest.md)
 - [CreateBreakTypeResponse](CreateBreakTypeResponse.md)
 - [CreateCatalogImageRequest](CreateCatalogImageRequest.md)
 - [CreateCatalogImageResponse](CreateCatalogImageResponse.md)
 - [CreateCheckoutRequest](CreateCheckoutRequest.md)
 - [CreateCheckoutResponse](CreateCheckoutResponse.md)
 - [CreateCustomerCardRequest](CreateCustomerCardRequest.md)
 - [CreateCustomerCardResponse](CreateCustomerCardResponse.md)
 - [CreateCustomerRequest](CreateCustomerRequest.md)
 - [CreateCustomerResponse](CreateCustomerResponse.md)
 - [CreateLocationRequest](CreateLocationRequest.md)
 - [CreateLocationResponse](CreateLocationResponse.md)
 - [CreateMobileAuthorizationCodeRequest](CreateMobileAuthorizationCodeRequest.md)
 - [CreateMobileAuthorizationCodeResponse](CreateMobileAuthorizationCodeResponse.md)
 - [CreateOrderRequest](CreateOrderRequest.md)
 - [CreateOrderRequestDiscount](CreateOrderRequestDiscount.md)
 - [CreateOrderRequestLineItem](CreateOrderRequestLineItem.md)
 - [CreateOrderRequestModifier](CreateOrderRequestModifier.md)
 - [CreateOrderRequestTax](CreateOrderRequestTax.md)
 - [CreateOrderResponse](CreateOrderResponse.md)
 - [CreatePaymentRequest](CreatePaymentRequest.md)
 - [CreatePaymentResponse](CreatePaymentResponse.md)
 - [CreateRefundRequest](CreateRefundRequest.md)
 - [CreateRefundResponse](CreateRefundResponse.md)
 - [CreateShiftRequest](CreateShiftRequest.md)
 - [CreateShiftResponse](CreateShiftResponse.md)
 - [Currency](Currency.md)
 - [Customer](Customer.md)
 - [CustomerCreationSource](CustomerCreationSource.md)
 - [CustomerCreationSourceFilter](CustomerCreationSourceFilter.md)
 - [CustomerFilter](CustomerFilter.md)
 - [CustomerGroupInfo](CustomerGroupInfo.md)
 - [CustomerInclusionExclusion](CustomerInclusionExclusion.md)
 - [CustomerPreferences](CustomerPreferences.md)
 - [CustomerQuery](CustomerQuery.md)
 - [CustomerSort](CustomerSort.md)
 - [CustomerSortField](CustomerSortField.md)
 - [DateRange](DateRange.md)
 - [DayOfWeek](DayOfWeek.md)
 - [DeleteBreakTypeRequest](DeleteBreakTypeRequest.md)
 - [DeleteBreakTypeResponse](DeleteBreakTypeResponse.md)
 - [DeleteCatalogObjectRequest](DeleteCatalogObjectRequest.md)
 - [DeleteCatalogObjectResponse](DeleteCatalogObjectResponse.md)
 - [DeleteCustomerCardRequest](DeleteCustomerCardRequest.md)
 - [DeleteCustomerCardResponse](DeleteCustomerCardResponse.md)
 - [DeleteCustomerRequest](DeleteCustomerRequest.md)
 - [DeleteCustomerResponse](DeleteCustomerResponse.md)
 - [DeleteShiftRequest](DeleteShiftRequest.md)
 - [DeleteShiftResponse](DeleteShiftResponse.md)
 - [Device](Device.md)
 - [Employee](Employee.md)
 - [EmployeeStatus](EmployeeStatus.md)
 - [EmployeeWage](EmployeeWage.md)
 - [Error](Error.md)
 - [ErrorCategory](ErrorCategory.md)
 - [ErrorCode](ErrorCode.md)
 - [ExcludeStrategy](ExcludeStrategy.md)
 - [ExternalPaymentDetails](ExternalPaymentDetails.md)
 - [GetBreakTypeRequest](GetBreakTypeRequest.md)
 - [GetBreakTypeResponse](GetBreakTypeResponse.md)
 - [GetEmployeeWageRequest](GetEmployeeWageRequest.md)
 - [GetEmployeeWageResponse](GetEmployeeWageResponse.md)
 - [GetPaymentRefundRequest](GetPaymentRefundRequest.md)
 - [GetPaymentRefundResponse](GetPaymentRefundResponse.md)
 - [GetPaymentRequest](GetPaymentRequest.md)
 - [GetPaymentResponse](GetPaymentResponse.md)
 - [GetShiftRequest](GetShiftRequest.md)
 - [GetShiftResponse](GetShiftResponse.md)
 - [InventoryAdjustment](InventoryAdjustment.md)
 - [InventoryAlertType](InventoryAlertType.md)
 - [InventoryChange](InventoryChange.md)
 - [InventoryChangeType](InventoryChangeType.md)
 - [InventoryCount](InventoryCount.md)
 - [InventoryPhysicalCount](InventoryPhysicalCount.md)
 - [InventoryState](InventoryState.md)
 - [InventoryTransfer](InventoryTransfer.md)
 - [ItemVariationLocationOverrides](ItemVariationLocationOverrides.md)
 - [ListAdditionalRecipientReceivableRefundsRequest](ListAdditionalRecipientReceivableRefundsRequest.md)
 - [ListAdditionalRecipientReceivableRefundsResponse](ListAdditionalRecipientReceivableRefundsResponse.md)
 - [ListAdditionalRecipientReceivablesRequest](ListAdditionalRecipientReceivablesRequest.md)
 - [ListAdditionalRecipientReceivablesResponse](ListAdditionalRecipientReceivablesResponse.md)
 - [ListBreakTypesRequest](ListBreakTypesRequest.md)
 - [ListBreakTypesResponse](ListBreakTypesResponse.md)
 - [ListCatalogRequest](ListCatalogRequest.md)
 - [ListCatalogResponse](ListCatalogResponse.md)
 - [ListCustomersRequest](ListCustomersRequest.md)
 - [ListCustomersResponse](ListCustomersResponse.md)
 - [ListEmployeeWagesRequest](ListEmployeeWagesRequest.md)
 - [ListEmployeeWagesResponse](ListEmployeeWagesResponse.md)
 - [ListEmployeesRequest](ListEmployeesRequest.md)
 - [ListEmployeesResponse](ListEmployeesResponse.md)
 - [ListLocationsRequest](ListLocationsRequest.md)
 - [ListLocationsResponse](ListLocationsResponse.md)
 - [ListMerchantsRequest](ListMerchantsRequest.md)
 - [ListMerchantsResponse](ListMerchantsResponse.md)
 - [ListPaymentRefundsRequest](ListPaymentRefundsRequest.md)
 - [ListPaymentRefundsResponse](ListPaymentRefundsResponse.md)
 - [ListPaymentsRequest](ListPaymentsRequest.md)
 - [ListPaymentsResponse](ListPaymentsResponse.md)
 - [ListRefundsRequest](ListRefundsRequest.md)
 - [ListRefundsResponse](ListRefundsResponse.md)
 - [ListTransactionsRequest](ListTransactionsRequest.md)
 - [ListTransactionsResponse](ListTransactionsResponse.md)
 - [ListWorkweekConfigsRequest](ListWorkweekConfigsRequest.md)
 - [ListWorkweekConfigsResponse](ListWorkweekConfigsResponse.md)
 - [Location](Location.md)
 - [LocationCapability](LocationCapability.md)
 - [LocationStatus](LocationStatus.md)
 - [LocationType](LocationType.md)
 - [MeasurementUnit](MeasurementUnit.md)
 - [MeasurementUnitArea](MeasurementUnitArea.md)
 - [MeasurementUnitCustom](MeasurementUnitCustom.md)
 - [MeasurementUnitGeneric](MeasurementUnitGeneric.md)
 - [MeasurementUnitLength](MeasurementUnitLength.md)
 - [MeasurementUnitTime](MeasurementUnitTime.md)
 - [MeasurementUnitUnitType](MeasurementUnitUnitType.md)
 - [MeasurementUnitVolume](MeasurementUnitVolume.md)
 - [MeasurementUnitWeight](MeasurementUnitWeight.md)
 - [Merchant](Merchant.md)
 - [MerchantStatus](MerchantStatus.md)
 - [ModelBreak](ModelBreak.md)
 - [Money](Money.md)
 - [ObtainTokenRequest](ObtainTokenRequest.md)
 - [ObtainTokenResponse](ObtainTokenResponse.md)
 - [Order](Order.md)
 - [OrderEntry](OrderEntry.md)
 - [OrderFulfillment](OrderFulfillment.md)
 - [OrderFulfillmentPickupDetails](OrderFulfillmentPickupDetails.md)
 - [OrderFulfillmentPickupDetailsScheduleType](OrderFulfillmentPickupDetailsScheduleType.md)
 - [OrderFulfillmentRecipient](OrderFulfillmentRecipient.md)
 - [OrderFulfillmentShipmentDetails](OrderFulfillmentShipmentDetails.md)
 - [OrderFulfillmentState](OrderFulfillmentState.md)
 - [OrderFulfillmentType](OrderFulfillmentType.md)
 - [OrderLineItem](OrderLineItem.md)
 - [OrderLineItemAppliedDiscount](OrderLineItemAppliedDiscount.md)
 - [OrderLineItemAppliedTax](OrderLineItemAppliedTax.md)
 - [OrderLineItemDiscount](OrderLineItemDiscount.md)
 - [OrderLineItemDiscountScope](OrderLineItemDiscountScope.md)
 - [OrderLineItemDiscountType](OrderLineItemDiscountType.md)
 - [OrderLineItemModifier](OrderLineItemModifier.md)
 - [OrderLineItemTax](OrderLineItemTax.md)
 - [OrderLineItemTaxScope](OrderLineItemTaxScope.md)
 - [OrderLineItemTaxType](OrderLineItemTaxType.md)
 - [OrderMoneyAmounts](OrderMoneyAmounts.md)
 - [OrderQuantityUnit](OrderQuantityUnit.md)
 - [OrderReturn](OrderReturn.md)
 - [OrderReturnDiscount](OrderReturnDiscount.md)
 - [OrderReturnLineItem](OrderReturnLineItem.md)
 - [OrderReturnLineItemModifier](OrderReturnLineItemModifier.md)
 - [OrderReturnServiceCharge](OrderReturnServiceCharge.md)
 - [OrderReturnTax](OrderReturnTax.md)
 - [OrderRoundingAdjustment](OrderRoundingAdjustment.md)
 - [OrderServiceCharge](OrderServiceCharge.md)
 - [OrderServiceChargeCalculationPhase](OrderServiceChargeCalculationPhase.md)
 - [OrderSource](OrderSource.md)
 - [OrderState](OrderState.md)
 - [PayOrderRequest](PayOrderRequest.md)
 - [PayOrderResponse](PayOrderResponse.md)
 - [Payment](Payment.md)
 - [PaymentRefund](PaymentRefund.md)
 - [ProcessingFee](ProcessingFee.md)
 - [Product](Product.md)
 - [Refund](Refund.md)
 - [RefundPaymentRequest](RefundPaymentRequest.md)
 - [RefundPaymentResponse](RefundPaymentResponse.md)
 - [RefundStatus](RefundStatus.md)
 - [RegisterDomainRequest](RegisterDomainRequest.md)
 - [RegisterDomainResponse](RegisterDomainResponse.md)
 - [RegisterDomainResponseStatus](RegisterDomainResponseStatus.md)
 - [RenewTokenRequest](RenewTokenRequest.md)
 - [RenewTokenResponse](RenewTokenResponse.md)
 - [RetrieveCatalogObjectRequest](RetrieveCatalogObjectRequest.md)
 - [RetrieveCatalogObjectResponse](RetrieveCatalogObjectResponse.md)
 - [RetrieveCustomerRequest](RetrieveCustomerRequest.md)
 - [RetrieveCustomerResponse](RetrieveCustomerResponse.md)
 - [RetrieveEmployeeRequest](RetrieveEmployeeRequest.md)
 - [RetrieveEmployeeResponse](RetrieveEmployeeResponse.md)
 - [RetrieveInventoryAdjustmentRequest](RetrieveInventoryAdjustmentRequest.md)
 - [RetrieveInventoryAdjustmentResponse](RetrieveInventoryAdjustmentResponse.md)
 - [RetrieveInventoryChangesRequest](RetrieveInventoryChangesRequest.md)
 - [RetrieveInventoryChangesResponse](RetrieveInventoryChangesResponse.md)
 - [RetrieveInventoryCountRequest](RetrieveInventoryCountRequest.md)
 - [RetrieveInventoryCountResponse](RetrieveInventoryCountResponse.md)
 - [RetrieveInventoryPhysicalCountRequest](RetrieveInventoryPhysicalCountRequest.md)
 - [RetrieveInventoryPhysicalCountResponse](RetrieveInventoryPhysicalCountResponse.md)
 - [RetrieveLocationRequest](RetrieveLocationRequest.md)
 - [RetrieveLocationResponse](RetrieveLocationResponse.md)
 - [RetrieveMerchantRequest](RetrieveMerchantRequest.md)
 - [RetrieveMerchantResponse](RetrieveMerchantResponse.md)
 - [RetrieveTransactionRequest](RetrieveTransactionRequest.md)
 - [RetrieveTransactionResponse](RetrieveTransactionResponse.md)
 - [RevokeTokenRequest](RevokeTokenRequest.md)
 - [RevokeTokenResponse](RevokeTokenResponse.md)
 - [SearchCatalogObjectsRequest](SearchCatalogObjectsRequest.md)
 - [SearchCatalogObjectsResponse](SearchCatalogObjectsResponse.md)
 - [SearchCustomersRequest](SearchCustomersRequest.md)
 - [SearchCustomersResponse](SearchCustomersResponse.md)
 - [SearchOrdersCustomerFilter](SearchOrdersCustomerFilter.md)
 - [SearchOrdersDateTimeFilter](SearchOrdersDateTimeFilter.md)
 - [SearchOrdersFilter](SearchOrdersFilter.md)
 - [SearchOrdersFulfillmentFilter](SearchOrdersFulfillmentFilter.md)
 - [SearchOrdersQuery](SearchOrdersQuery.md)
 - [SearchOrdersRequest](SearchOrdersRequest.md)
 - [SearchOrdersResponse](SearchOrdersResponse.md)
 - [SearchOrdersSort](SearchOrdersSort.md)
 - [SearchOrdersSortField](SearchOrdersSortField.md)
 - [SearchOrdersSourceFilter](SearchOrdersSourceFilter.md)
 - [SearchOrdersStateFilter](SearchOrdersStateFilter.md)
 - [SearchShiftsRequest](SearchShiftsRequest.md)
 - [SearchShiftsResponse](SearchShiftsResponse.md)
 - [Shift](Shift.md)
 - [ShiftFilter](ShiftFilter.md)
 - [ShiftFilterStatus](ShiftFilterStatus.md)
 - [ShiftQuery](ShiftQuery.md)
 - [ShiftSort](ShiftSort.md)
 - [ShiftSortField](ShiftSortField.md)
 - [ShiftStatus](ShiftStatus.md)
 - [ShiftWage](ShiftWage.md)
 - [ShiftWorkday](ShiftWorkday.md)
 - [ShiftWorkdayMatcher](ShiftWorkdayMatcher.md)
 - [SortOrder](SortOrder.md)
 - [SourceApplication](SourceApplication.md)
 - [StandardUnitDescription](StandardUnitDescription.md)
 - [StandardUnitDescriptionGroup](StandardUnitDescriptionGroup.md)
 - [TaxCalculationPhase](TaxCalculationPhase.md)
 - [TaxInclusionType](TaxInclusionType.md)
 - [Tender](Tender.md)
 - [TenderCardDetails](TenderCardDetails.md)
 - [TenderCardDetailsEntryMethod](TenderCardDetailsEntryMethod.md)
 - [TenderCardDetailsStatus](TenderCardDetailsStatus.md)
 - [TenderCashDetails](TenderCashDetails.md)
 - [TenderType](TenderType.md)
 - [TimeRange](TimeRange.md)
 - [Transaction](Transaction.md)
 - [TransactionProduct](TransactionProduct.md)
 - [UpdateBreakTypeRequest](UpdateBreakTypeRequest.md)
 - [UpdateBreakTypeResponse](UpdateBreakTypeResponse.md)
 - [UpdateCustomerRequest](UpdateCustomerRequest.md)
 - [UpdateCustomerResponse](UpdateCustomerResponse.md)
 - [UpdateItemModifierListsRequest](UpdateItemModifierListsRequest.md)
 - [UpdateItemModifierListsResponse](UpdateItemModifierListsResponse.md)
 - [UpdateItemTaxesRequest](UpdateItemTaxesRequest.md)
 - [UpdateItemTaxesResponse](UpdateItemTaxesResponse.md)
 - [UpdateLocationRequest](UpdateLocationRequest.md)
 - [UpdateLocationResponse](UpdateLocationResponse.md)
 - [UpdateOrderRequest](UpdateOrderRequest.md)
 - [UpdateOrderResponse](UpdateOrderResponse.md)
 - [UpdateShiftRequest](UpdateShiftRequest.md)
 - [UpdateShiftResponse](UpdateShiftResponse.md)
 - [UpdateWorkweekConfigRequest](UpdateWorkweekConfigRequest.md)
 - [UpdateWorkweekConfigResponse](UpdateWorkweekConfigResponse.md)
 - [UpsertCatalogObjectRequest](UpsertCatalogObjectRequest.md)
 - [UpsertCatalogObjectResponse](UpsertCatalogObjectResponse.md)
 - [V1AdjustInventoryRequest](V1AdjustInventoryRequest.md)
 - [V1AdjustInventoryRequestAdjustmentType](V1AdjustInventoryRequestAdjustmentType.md)
 - [V1ApplyFeeRequest](V1ApplyFeeRequest.md)
 - [V1ApplyModifierListRequest](V1ApplyModifierListRequest.md)
 - [V1BankAccount](V1BankAccount.md)
 - [V1BankAccountType](V1BankAccountType.md)
 - [V1CashDrawerEvent](V1CashDrawerEvent.md)
 - [V1CashDrawerEventEventType](V1CashDrawerEventEventType.md)
 - [V1CashDrawerShift](V1CashDrawerShift.md)
 - [V1CashDrawerShiftEventType](V1CashDrawerShiftEventType.md)
 - [V1Category](V1Category.md)
 - [V1CreateCategoryRequest](V1CreateCategoryRequest.md)
 - [V1CreateDiscountRequest](V1CreateDiscountRequest.md)
 - [V1CreateEmployeeRoleRequest](V1CreateEmployeeRoleRequest.md)
 - [V1CreateFeeRequest](V1CreateFeeRequest.md)
 - [V1CreateItemRequest](V1CreateItemRequest.md)
 - [V1CreateModifierListRequest](V1CreateModifierListRequest.md)
 - [V1CreateModifierOptionRequest](V1CreateModifierOptionRequest.md)
 - [V1CreatePageRequest](V1CreatePageRequest.md)
 - [V1CreateRefundRequest](V1CreateRefundRequest.md)
 - [V1CreateRefundRequestType](V1CreateRefundRequestType.md)
 - [V1CreateVariationRequest](V1CreateVariationRequest.md)
 - [V1DeleteCategoryRequest](V1DeleteCategoryRequest.md)
 - [V1DeleteDiscountRequest](V1DeleteDiscountRequest.md)
 - [V1DeleteFeeRequest](V1DeleteFeeRequest.md)
 - [V1DeleteItemRequest](V1DeleteItemRequest.md)
 - [V1DeleteModifierListRequest](V1DeleteModifierListRequest.md)
 - [V1DeleteModifierOptionRequest](V1DeleteModifierOptionRequest.md)
 - [V1DeletePageCellRequest](V1DeletePageCellRequest.md)
 - [V1DeletePageRequest](V1DeletePageRequest.md)
 - [V1DeleteTimecardRequest](V1DeleteTimecardRequest.md)
 - [V1DeleteTimecardResponse](V1DeleteTimecardResponse.md)
 - [V1DeleteVariationRequest](V1DeleteVariationRequest.md)
 - [V1Discount](V1Discount.md)
 - [V1DiscountColor](V1DiscountColor.md)
 - [V1DiscountDiscountType](V1DiscountDiscountType.md)
 - [V1Employee](V1Employee.md)
 - [V1EmployeeRole](V1EmployeeRole.md)
 - [V1EmployeeRolePermissions](V1EmployeeRolePermissions.md)
 - [V1EmployeeStatus](V1EmployeeStatus.md)
 - [V1Fee](V1Fee.md)
 - [V1FeeAdjustmentType](V1FeeAdjustmentType.md)
 - [V1FeeCalculationPhase](V1FeeCalculationPhase.md)
 - [V1FeeInclusionType](V1FeeInclusionType.md)
 - [V1FeeType](V1FeeType.md)
 - [V1InventoryEntry](V1InventoryEntry.md)
 - [V1Item](V1Item.md)
 - [V1ItemColor](V1ItemColor.md)
 - [V1ItemImage](V1ItemImage.md)
 - [V1ItemType](V1ItemType.md)
 - [V1ItemVisibility](V1ItemVisibility.md)
 - [V1ListBankAccountsRequest](V1ListBankAccountsRequest.md)
 - [V1ListBankAccountsResponse](V1ListBankAccountsResponse.md)
 - [V1ListCashDrawerShiftsRequest](V1ListCashDrawerShiftsRequest.md)
 - [V1ListCashDrawerShiftsResponse](V1ListCashDrawerShiftsResponse.md)
 - [V1ListCategoriesRequest](V1ListCategoriesRequest.md)
 - [V1ListCategoriesResponse](V1ListCategoriesResponse.md)
 - [V1ListDiscountsRequest](V1ListDiscountsRequest.md)
 - [V1ListDiscountsResponse](V1ListDiscountsResponse.md)
 - [V1ListEmployeeRolesRequest](V1ListEmployeeRolesRequest.md)
 - [V1ListEmployeeRolesResponse](V1ListEmployeeRolesResponse.md)
 - [V1ListEmployeesRequest](V1ListEmployeesRequest.md)
 - [V1ListEmployeesRequestStatus](V1ListEmployeesRequestStatus.md)
 - [V1ListEmployeesResponse](V1ListEmployeesResponse.md)
 - [V1ListFeesRequest](V1ListFeesRequest.md)
 - [V1ListFeesResponse](V1ListFeesResponse.md)
 - [V1ListInventoryRequest](V1ListInventoryRequest.md)
 - [V1ListInventoryResponse](V1ListInventoryResponse.md)
 - [V1ListItemsRequest](V1ListItemsRequest.md)
 - [V1ListItemsResponse](V1ListItemsResponse.md)
 - [V1ListLocationsRequest](V1ListLocationsRequest.md)
 - [V1ListLocationsResponse](V1ListLocationsResponse.md)
 - [V1ListModifierListsRequest](V1ListModifierListsRequest.md)
 - [V1ListModifierListsResponse](V1ListModifierListsResponse.md)
 - [V1ListOrdersRequest](V1ListOrdersRequest.md)
 - [V1ListOrdersResponse](V1ListOrdersResponse.md)
 - [V1ListPagesRequest](V1ListPagesRequest.md)
 - [V1ListPagesResponse](V1ListPagesResponse.md)
 - [V1ListPaymentsRequest](V1ListPaymentsRequest.md)
 - [V1ListPaymentsResponse](V1ListPaymentsResponse.md)
 - [V1ListRefundsRequest](V1ListRefundsRequest.md)
 - [V1ListRefundsResponse](V1ListRefundsResponse.md)
 - [V1ListSettlementsRequest](V1ListSettlementsRequest.md)
 - [V1ListSettlementsRequestStatus](V1ListSettlementsRequestStatus.md)
 - [V1ListSettlementsResponse](V1ListSettlementsResponse.md)
 - [V1ListTimecardEventsRequest](V1ListTimecardEventsRequest.md)
 - [V1ListTimecardEventsResponse](V1ListTimecardEventsResponse.md)
 - [V1ListTimecardsRequest](V1ListTimecardsRequest.md)
 - [V1ListTimecardsResponse](V1ListTimecardsResponse.md)
 - [V1Merchant](V1Merchant.md)
 - [V1MerchantAccountType](V1MerchantAccountType.md)
 - [V1MerchantBusinessType](V1MerchantBusinessType.md)
 - [V1MerchantLocationDetails](V1MerchantLocationDetails.md)
 - [V1ModifierList](V1ModifierList.md)
 - [V1ModifierListSelectionType](V1ModifierListSelectionType.md)
 - [V1ModifierOption](V1ModifierOption.md)
 - [V1Money](V1Money.md)
 - [V1Order](V1Order.md)
 - [V1OrderHistoryEntry](V1OrderHistoryEntry.md)
 - [V1OrderHistoryEntryAction](V1OrderHistoryEntryAction.md)
 - [V1OrderState](V1OrderState.md)
 - [V1Page](V1Page.md)
 - [V1PageCell](V1PageCell.md)
 - [V1PageCellObjectType](V1PageCellObjectType.md)
 - [V1PageCellPlaceholderType](V1PageCellPlaceholderType.md)
 - [V1Payment](V1Payment.md)
 - [V1PaymentDiscount](V1PaymentDiscount.md)
 - [V1PaymentItemDetail](V1PaymentItemDetail.md)
 - [V1PaymentItemization](V1PaymentItemization.md)
 - [V1PaymentItemizationItemizationType](V1PaymentItemizationItemizationType.md)
 - [V1PaymentModifier](V1PaymentModifier.md)
 - [V1PaymentSurcharge](V1PaymentSurcharge.md)
 - [V1PaymentSurchargeType](V1PaymentSurchargeType.md)
 - [V1PaymentTax](V1PaymentTax.md)
 - [V1PaymentTaxInclusionType](V1PaymentTaxInclusionType.md)
 - [V1PhoneNumber](V1PhoneNumber.md)
 - [V1Refund](V1Refund.md)
 - [V1RefundType](V1RefundType.md)
 - [V1RemoveFeeRequest](V1RemoveFeeRequest.md)
 - [V1RemoveModifierListRequest](V1RemoveModifierListRequest.md)
 - [V1RetrieveBankAccountRequest](V1RetrieveBankAccountRequest.md)
 - [V1RetrieveBusinessRequest](V1RetrieveBusinessRequest.md)
 - [V1RetrieveCashDrawerShiftRequest](V1RetrieveCashDrawerShiftRequest.md)
 - [V1RetrieveEmployeeRequest](V1RetrieveEmployeeRequest.md)
 - [V1RetrieveEmployeeRoleRequest](V1RetrieveEmployeeRoleRequest.md)
 - [V1RetrieveItemRequest](V1RetrieveItemRequest.md)
 - [V1RetrieveModifierListRequest](V1RetrieveModifierListRequest.md)
 - [V1RetrieveOrderRequest](V1RetrieveOrderRequest.md)
 - [V1RetrievePaymentRequest](V1RetrievePaymentRequest.md)
 - [V1RetrieveSettlementRequest](V1RetrieveSettlementRequest.md)
 - [V1RetrieveTimecardRequest](V1RetrieveTimecardRequest.md)
 - [V1Settlement](V1Settlement.md)
 - [V1SettlementEntry](V1SettlementEntry.md)
 - [V1SettlementEntryType](V1SettlementEntryType.md)
 - [V1SettlementStatus](V1SettlementStatus.md)
 - [V1Tender](V1Tender.md)
 - [V1TenderCardBrand](V1TenderCardBrand.md)
 - [V1TenderEntryMethod](V1TenderEntryMethod.md)
 - [V1TenderType](V1TenderType.md)
 - [V1Timecard](V1Timecard.md)
 - [V1TimecardEvent](V1TimecardEvent.md)
 - [V1TimecardEventEventType](V1TimecardEventEventType.md)
 - [V1UpdateCategoryRequest](V1UpdateCategoryRequest.md)
 - [V1UpdateDiscountRequest](V1UpdateDiscountRequest.md)
 - [V1UpdateEmployeeRequest](V1UpdateEmployeeRequest.md)
 - [V1UpdateEmployeeRoleRequest](V1UpdateEmployeeRoleRequest.md)
 - [V1UpdateFeeRequest](V1UpdateFeeRequest.md)
 - [V1UpdateItemRequest](V1UpdateItemRequest.md)
 - [V1UpdateModifierListRequest](V1UpdateModifierListRequest.md)
 - [V1UpdateModifierListRequestSelectionType](V1UpdateModifierListRequestSelectionType.md)
 - [V1UpdateModifierOptionRequest](V1UpdateModifierOptionRequest.md)
 - [V1UpdateOrderRequest](V1UpdateOrderRequest.md)
 - [V1UpdateOrderRequestAction](V1UpdateOrderRequestAction.md)
 - [V1UpdatePageCellRequest](V1UpdatePageCellRequest.md)
 - [V1UpdatePageRequest](V1UpdatePageRequest.md)
 - [V1UpdateTimecardRequest](V1UpdateTimecardRequest.md)
 - [V1UpdateVariationRequest](V1UpdateVariationRequest.md)
 - [V1Variation](V1Variation.md)
 - [V1VariationInventoryAlertType](V1VariationInventoryAlertType.md)
 - [V1VariationPricingType](V1VariationPricingType.md)
 - [VoidTransactionRequest](VoidTransactionRequest.md)
 - [VoidTransactionResponse](VoidTransactionResponse.md)
 - [Weekday](Weekday.md)
 - [WorkweekConfig](WorkweekConfig.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://connect.squareup.com/oauth2/authorize
- **Scopes**:
  - BANK_ACCOUNTS_READ: __HTTP Method__: &#x60;GET&#x60;  Grants read access to bank account information associated with the targeted Square account. For example, to call the Connect v1 ListBankAccounts endpoint.
  - CUSTOMERS_READ: __HTTP Method__: &#x60;GET&#x60;  Grants read access to customer information. For example, to call the ListCustomers endpoint.
  - CUSTOMERS_WRITE: __HTTP Method__: &#x60;POST&#x60;, &#x60;PUT&#x60;, &#x60;DELETE&#x60;  Grants write access to customer information. For example, to create and update customer profiles.
  - EMPLOYEES_READ: __HTTP Method__: &#x60;GET&#x60;  Grants read access to employee profile information. For example, to call the Connect v1 Employees API.
  - EMPLOYEES_WRITE: __HTTP Method__: &#x60;POST&#x60;, &#x60;PUT&#x60;, &#x60;DELETE&#x60;  Grants write access to employee profile information. For example, to create and modify employee profiles.
  - INVENTORY_READ: __HTTP Method__: &#x60;GET&#x60;  Grants read access to inventory information. For example, to call the RetrieveInventoryCount endpoint.
  - INVENTORY_WRITE: __HTTP Method__:  &#x60;POST&#x60;, &#x60;PUT&#x60;, &#x60;DELETE&#x60;  Grants write access to inventory information. For example, to call the BatchChangeInventory endpoint.
  - ITEMS_READ: __HTTP Method__: &#x60;GET&#x60;  Grants read access to business and location information. For example, to obtain a location ID for subsequent activity.
  - ITEMS_WRITE: __HTTP Method__: &#x60;POST&#x60;, &#x60;PUT&#x60;, &#x60;DELETE&#x60;  Grants write access to product catalog information. For example, to modify or add to a product catalog.
  - MERCHANT_PROFILE_READ: __HTTP Method__: &#x60;GET&#x60;  Grants read access to business and location information. For example, to obtain a location ID for subsequent activity.
  - ORDERS_READ: __HTTP Method__: &#x60;GET&#x60;  Grants read access to order information. For example, to call the BatchRetrieveOrders endpoint.
  - ORDERS_WRITE: __HTTP Method__: &#x60;POST&#x60;, &#x60;PUT&#x60;, &#x60;DELETE&#x60;  Grants write access to order information. For example, to call the CreateCheckout endpoint.
  - PAYMENTS_READ: __HTTP Method__: &#x60;GET&#x60;  Grants read access to transaction and refund information. For example, to call the RetrieveTransaction endpoint.
  - PAYMENTS_WRITE: __HTTP Method__: &#x60;POST&#x60;, &#x60;PUT&#x60;, &#x60;DELETE&#x60;  Grants write access to transaction and refunds information. For example, to process payments with the Payments or Checkout API.
  - PAYMENTS_WRITE_ADDITIONAL_RECIPIENTS: __HTTP Method__: &#x60;POST&#x60;, &#x60;PUT&#x60;, &#x60;DELETE&#x60;  Allow third party applications to deduct a portion of each transaction amount. __Required__ to use multiparty transaction functionality with the Payments API.
  - PAYMENTS_WRITE_IN_PERSON: __HTTP Method__: &#x60;POST&#x60;, &#x60;PUT&#x60;, &#x60;DELETE&#x60;  Grants write access to payments and refunds information. For example, to process in-person payments.
  - SETTLEMENTS_READ: __HTTP Method__: &#x60;GET&#x60;  Grants read access to settlement (deposit) information. For example, to call the Connect v1 ListSettlements endpoint.
  - TIMECARDS_READ: __HTTP Method__: &#x60;GET&#x60;  Grants read access to employee timecard information. For example, to call the Connect v2 SearchShifts endpoint.
  - TIMECARDS_WRITE: __HTTP Method__: &#x60;POST&#x60;, &#x60;PUT&#x60;, &#x60;DELETE&#x60;  Grants write access to employee shift information. For example, to create and modify employee shifts.
  - TIMECARDS_SETTINGS_READ: __HTTP Method__: &#x60;GET&#x60;  Grants read access to employee timecard settings information. For example, to call the GetBreakType endpoint.
  - TIMECARDS_SETTINGS_WRITE: __HTTP Method__: &#x60;POST&#x60;, &#x60;PUT&#x60;, &#x60;DELETE&#x60;  Grants write access to employee timecard settings information. For example, to call the UpdateBreakType endpoint.

### oauth2ClientSecret

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Pagination of V1 Endpoints

V1 Endpoints return pagination information via HTTP headers. In order to obtain
response headers and extract the `batch_token` parameter you will need to follow
the following steps:

1. Use the full information endpoint methods of each API to get the response HTTP
Headers. They are named as their simple counterpart with a `WithHttpInfo` suffix.
Hence `listEmployeeRoles` would be called `listEmployeeRolesWithHttpInfo`. This
method returns a `CompleteResponse` object with the response data deserialized along
with a helper to retrieve the token if present.

2. Use `String batchToken = completeResponse.getBatchToken();`
to extract the token and proceed to get the following page if a token is present.

### Example

```java
// Import classes:
//import .ApiClient;
//import .ApiException;
//import .Configuration;
//import .CompleteResponse;
//import .auth.*;
//import .api.V1EmployeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1EmployeesApi apiInstance = new V1EmployeesApi();
String order = "order_example"; // String | The order in which employees are listed in the response, based on their created_at field.Default value: ASC
Integer limit = 56; // Integer | The maximum integer number of employee entities to return in a single response. Default 100, maximum 200.
String batchToken = null;
try {
    do {
        CompleteResponse<List<V1EmployeeRole>> completeResponse = apiInstance.listEmployeeRoles(order, limit, batchToken);
        System.out.println(completeResponse.getData());

        batchToken = completeResponse.getBatchToken();
    } while (batchToken != null);
} catch (ApiException e) {
    System.err.println("Exception when calling V1EmployeesApi#listEmployeeRoles");
    e.printStackTrace();
}
```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

developers@squareup.com




[//]: # "Link anchor definitions"
[Square Logo]: https://docs.connect.squareup.com/images/github/github-square-logo.svg
