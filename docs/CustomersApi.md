# CustomersApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomer**](CustomersApi.md#createCustomer) | **POST** /v2/customers | CreateCustomer
[**createCustomerCard**](CustomersApi.md#createCustomerCard) | **POST** /v2/customers/{customer_id}/cards | CreateCustomerCard
[**deleteCustomer**](CustomersApi.md#deleteCustomer) | **DELETE** /v2/customers/{customer_id} | DeleteCustomer
[**deleteCustomerCard**](CustomersApi.md#deleteCustomerCard) | **DELETE** /v2/customers/{customer_id}/cards/{card_id} | DeleteCustomerCard
[**listCustomers**](CustomersApi.md#listCustomers) | **GET** /v2/customers | ListCustomers
[**retrieveCustomer**](CustomersApi.md#retrieveCustomer) | **GET** /v2/customers/{customer_id} | RetrieveCustomer
[**updateCustomer**](CustomersApi.md#updateCustomer) | **PUT** /v2/customers/{customer_id} | UpdateCustomer


<a name="createCustomer"></a>
# **createCustomer**
> CreateCustomerResponse createCustomer(authorization, body)

CreateCustomer

Creates a new customer for a business, which can have associated cards on file.  You must provide __at least one__ of the following values in your request to this endpoint:  - &#x60;given_name&#x60; - &#x60;family_name&#x60; - &#x60;company_name&#x60; - &#x60;email_address&#x60; - &#x60;phone_number&#x60;  This endpoint does not accept an idempotency key. If you accidentally create a duplicate customer, you can delete it with the [DeleteCustomer](#endpoint-deletecustomer) endpoint.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
CreateCustomerRequest body = new CreateCustomerRequest(); // CreateCustomerRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    CreateCustomerResponse result = apiInstance.createCustomer(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#createCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **body** | [**CreateCustomerRequest**](CreateCustomerRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**CreateCustomerResponse**](CreateCustomerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCustomerCard"></a>
# **createCustomerCard**
> CreateCustomerCardResponse createCustomerCard(authorization, customerId, body)

CreateCustomerCard

Adds a card on file to an existing customer.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String customerId = "customerId_example"; // String | The ID of the customer to link the card on file to.
CreateCustomerCardRequest body = new CreateCustomerCardRequest(); // CreateCustomerCardRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    CreateCustomerCardResponse result = apiInstance.createCustomerCard(authorization, customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#createCustomerCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **customerId** | **String**| The ID of the customer to link the card on file to. |
 **body** | [**CreateCustomerCardRequest**](CreateCustomerCardRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**CreateCustomerCardResponse**](CreateCustomerCardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomer"></a>
# **deleteCustomer**
> DeleteCustomerResponse deleteCustomer(authorization, customerId)

DeleteCustomer

Deletes a customer from a business, along with any linked cards on file.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String customerId = "customerId_example"; // String | The ID of the customer to delete.
try {
    DeleteCustomerResponse result = apiInstance.deleteCustomer(authorization, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#deleteCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **customerId** | **String**| The ID of the customer to delete. |

### Return type

[**DeleteCustomerResponse**](DeleteCustomerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomerCard"></a>
# **deleteCustomerCard**
> DeleteCustomerCardResponse deleteCustomerCard(authorization, customerId, cardId)

DeleteCustomerCard

Removes a card on file from a customer.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String customerId = "customerId_example"; // String | The ID of the customer that the card on file belongs to.
String cardId = "cardId_example"; // String | The ID of the card on file to delete.
try {
    DeleteCustomerCardResponse result = apiInstance.deleteCustomerCard(authorization, customerId, cardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#deleteCustomerCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **customerId** | **String**| The ID of the customer that the card on file belongs to. |
 **cardId** | **String**| The ID of the card on file to delete. |

### Return type

[**DeleteCustomerCardResponse**](DeleteCustomerCardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCustomers"></a>
# **listCustomers**
> ListCustomersResponse listCustomers(authorization, cursor)

ListCustomers

Lists a business&#39;s customers.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String cursor = "cursor_example"; // String | A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.  See [Paginating results](#paginatingresults) for more information.
try {
    ListCustomersResponse result = apiInstance.listCustomers(authorization, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#listCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **cursor** | **String**| A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.  See [Paginating results](#paginatingresults) for more information. | [optional]

### Return type

[**ListCustomersResponse**](ListCustomersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveCustomer"></a>
# **retrieveCustomer**
> RetrieveCustomerResponse retrieveCustomer(authorization, customerId)

RetrieveCustomer

Returns details for a single customer.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String customerId = "customerId_example"; // String | The ID of the customer to retrieve.
try {
    RetrieveCustomerResponse result = apiInstance.retrieveCustomer(authorization, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#retrieveCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **customerId** | **String**| The ID of the customer to retrieve. |

### Return type

[**RetrieveCustomerResponse**](RetrieveCustomerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomer"></a>
# **updateCustomer**
> UpdateCustomerResponse updateCustomer(authorization, customerId, body)

UpdateCustomer

Updates the details of an existing customer.  You cannot edit a customer&#39;s cards on file with this endpoint. To make changes to a card on file, you must delete the existing card on file with the [DeleteCustomerCard](#endpoint-deletecustomercard) endpoint, then create a new one with the [CreateCustomerCard](#endpoint-createcustomercard) endpoint.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String customerId = "customerId_example"; // String | The ID of the customer to update.
UpdateCustomerRequest body = new UpdateCustomerRequest(); // UpdateCustomerRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    UpdateCustomerResponse result = apiInstance.updateCustomer(authorization, customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **customerId** | **String**| The ID of the customer to update. |
 **body** | [**UpdateCustomerRequest**](UpdateCustomerRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**UpdateCustomerResponse**](UpdateCustomerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

