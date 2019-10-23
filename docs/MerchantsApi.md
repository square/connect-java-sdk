# MerchantsApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listMerchants**](MerchantsApi.md#listMerchants) | **GET** /v2/merchants | ListMerchants
[**retrieveMerchant**](MerchantsApi.md#retrieveMerchant) | **GET** /v2/merchants/{merchant_id} | RetrieveMerchant


<a name="listMerchants"></a>
# **listMerchants**
> ListMerchantsResponse listMerchants()

ListMerchants

Returns &#x60;Merchant&#x60; information for a given access token.  If you don&#39;t know a &#x60;Merchant&#x60; ID, you can use this endpoint to retrieve the merchant ID for an access token. You can specify your personal access token to get your own merchant information or specify an OAuth token to get the information for the  merchant that granted you access.  If you know the merchant ID, you can also use the [RetrieveMerchant](#endpoint-merchants-retrievemerchant)  endpoint to get the merchant information.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.MerchantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MerchantsApi apiInstance = new MerchantsApi();
try {
    ListMerchantsResponse result = apiInstance.listMerchants();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantsApi#listMerchants");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListMerchantsResponse**](ListMerchantsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveMerchant"></a>
# **retrieveMerchant**
> RetrieveMerchantResponse retrieveMerchant(merchantId)

RetrieveMerchant

Retrieve a &#x60;Merchant&#x60; object for the given &#x60;merchant_id&#x60;.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.MerchantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MerchantsApi apiInstance = new MerchantsApi();
String merchantId = "merchantId_example"; // String | The ID of the merchant to retrieve.
try {
    RetrieveMerchantResponse result = apiInstance.retrieveMerchant(merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantsApi#retrieveMerchant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**| The ID of the merchant to retrieve. |

### Return type

[**RetrieveMerchantResponse**](RetrieveMerchantResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

