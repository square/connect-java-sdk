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
    <version>2.0.2</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.squareup:connect:2.0.2"
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

* target/connect-2.0.2.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.squareup.connect.*;
import com.squareup.connect.auth.*;
import com.squareup.connect.models.*;
import com.squareup.connect.api.CheckoutApi;

import java.io.File;
import java.util.*;

public class CheckoutApiExample {

    public static void main(String[] args) {
        
        CheckoutApi apiInstance = new CheckoutApi();
        String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
        String locationId = "locationId_example"; // String | The ID of the business location to associate the checkout with.
        CreateCheckoutRequest body = new CreateCheckoutRequest(); // CreateCheckoutRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
        try {
            CreateCheckoutResponse result = apiInstance.createCheckout(authorization, locationId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckoutApi#createCheckout");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://connect.squareup.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CheckoutApi* | [**createCheckout**](docs/CheckoutApi.md#createCheckout) | **POST** /v2/locations/{location_id}/checkouts | CreateCheckout
*CustomerApi* | [**createCustomer**](docs/CustomerApi.md#createCustomer) | **POST** /v2/customers | CreateCustomer
*CustomerApi* | [**deleteCustomer**](docs/CustomerApi.md#deleteCustomer) | **DELETE** /v2/customers/{customer_id} | DeleteCustomer
*CustomerApi* | [**listCustomers**](docs/CustomerApi.md#listCustomers) | **GET** /v2/customers | ListCustomers
*CustomerApi* | [**retrieveCustomer**](docs/CustomerApi.md#retrieveCustomer) | **GET** /v2/customers/{customer_id} | RetrieveCustomer
*CustomerApi* | [**updateCustomer**](docs/CustomerApi.md#updateCustomer) | **PUT** /v2/customers/{customer_id} | UpdateCustomer
*CustomerCardApi* | [**createCustomerCard**](docs/CustomerCardApi.md#createCustomerCard) | **POST** /v2/customers/{customer_id}/cards | CreateCustomerCard
*CustomerCardApi* | [**deleteCustomerCard**](docs/CustomerCardApi.md#deleteCustomerCard) | **DELETE** /v2/customers/{customer_id}/cards/{card_id} | DeleteCustomerCard
*LocationApi* | [**listLocations**](docs/LocationApi.md#listLocations) | **GET** /v2/locations | ListLocations
*RefundApi* | [**createRefund**](docs/RefundApi.md#createRefund) | **POST** /v2/locations/{location_id}/transactions/{transaction_id}/refund | CreateRefund
*RefundApi* | [**listRefunds**](docs/RefundApi.md#listRefunds) | **GET** /v2/locations/{location_id}/refunds | ListRefunds
*TransactionApi* | [**captureTransaction**](docs/TransactionApi.md#captureTransaction) | **POST** /v2/locations/{location_id}/transactions/{transaction_id}/capture | CaptureTransaction
*TransactionApi* | [**charge**](docs/TransactionApi.md#charge) | **POST** /v2/locations/{location_id}/transactions | Charge
*TransactionApi* | [**listTransactions**](docs/TransactionApi.md#listTransactions) | **GET** /v2/locations/{location_id}/transactions | ListTransactions
*TransactionApi* | [**retrieveTransaction**](docs/TransactionApi.md#retrieveTransaction) | **GET** /v2/locations/{location_id}/transactions/{transaction_id} | RetrieveTransaction
*TransactionApi* | [**voidTransaction**](docs/TransactionApi.md#voidTransaction) | **POST** /v2/locations/{location_id}/transactions/{transaction_id}/void | VoidTransaction


## Documentation for Models

 - [Address](docs/Address.md)
 - [CaptureTransactionRequest](docs/CaptureTransactionRequest.md)
 - [CaptureTransactionResponse](docs/CaptureTransactionResponse.md)
 - [Card](docs/Card.md)
 - [CardBrand](docs/CardBrand.md)
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
 - [CreateOrderRequest](docs/CreateOrderRequest.md)
 - [CreateOrderRequestLineItem](docs/CreateOrderRequestLineItem.md)
 - [CreateOrderRequestOrder](docs/CreateOrderRequestOrder.md)
 - [CreateRefundRequest](docs/CreateRefundRequest.md)
 - [CreateRefundResponse](docs/CreateRefundResponse.md)
 - [Currency](docs/Currency.md)
 - [Customer](docs/Customer.md)
 - [CustomerGroupInfo](docs/CustomerGroupInfo.md)
 - [CustomerPreferences](docs/CustomerPreferences.md)
 - [DeleteCustomerCardRequest](docs/DeleteCustomerCardRequest.md)
 - [DeleteCustomerCardResponse](docs/DeleteCustomerCardResponse.md)
 - [DeleteCustomerRequest](docs/DeleteCustomerRequest.md)
 - [DeleteCustomerResponse](docs/DeleteCustomerResponse.md)
 - [Error](docs/Error.md)
 - [ErrorCategory](docs/ErrorCategory.md)
 - [ErrorCode](docs/ErrorCode.md)
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
 - [RetrieveCustomerRequest](docs/RetrieveCustomerRequest.md)
 - [RetrieveCustomerResponse](docs/RetrieveCustomerResponse.md)
 - [RetrieveTransactionRequest](docs/RetrieveTransactionRequest.md)
 - [RetrieveTransactionResponse](docs/RetrieveTransactionResponse.md)
 - [SortOrder](docs/SortOrder.md)
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

