# CustomerCardApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerCard**](CustomerCardApi.md#createCustomerCard) | **POST** /v2/customers/{customer_id}/cards | CreateCustomerCard
[**deleteCustomerCard**](CustomerCardApi.md#deleteCustomerCard) | **DELETE** /v2/customers/{customer_id}/cards/{card_id} | DeleteCustomerCard


<a name="createCustomerCard"></a>
# **createCustomerCard**
> CreateCustomerCardResponse createCustomerCard(authorization, customerId, body)

CreateCustomerCard

Adds a card on file to an existing customer.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CustomerCardApi;


CustomerCardApi apiInstance = new CustomerCardApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String customerId = "customerId_example"; // String | The ID of the customer to link the card on file to.
CreateCustomerCardRequest body = new CreateCustomerCardRequest(); // CreateCustomerCardRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    CreateCustomerCardResponse result = apiInstance.createCustomerCard(authorization, customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerCardApi#createCustomerCard");
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

<a name="deleteCustomerCard"></a>
# **deleteCustomerCard**
> DeleteCustomerCardResponse deleteCustomerCard(authorization, customerId, cardId)

DeleteCustomerCard

Removes a card on file from a customer.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CustomerCardApi;


CustomerCardApi apiInstance = new CustomerCardApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String customerId = "customerId_example"; // String | The ID of the customer that the card on file belongs to.
String cardId = "cardId_example"; // String | The ID of the card on file to delete.
try {
    DeleteCustomerCardResponse result = apiInstance.deleteCustomerCard(authorization, customerId, cardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerCardApi#deleteCustomerCard");
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

