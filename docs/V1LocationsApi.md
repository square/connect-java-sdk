# V1LocationsApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listLocations**](V1LocationsApi.md#listLocations) | **GET** /v1/me/locations | ListLocations
[**retrieveBusiness**](V1LocationsApi.md#retrieveBusiness) | **GET** /v1/me | RetrieveBusiness


<a name="listLocations"></a>
# **listLocations**
**Note: This endpoint is deprecated.**
> List&lt;V1Merchant&gt; listLocations()

ListLocations

Provides details for all business locations associated with a Square account, including the Square-assigned object ID for the location.  ---  - __Deprecation date__: 2019-11-20 - [__Retirement date__](/build-basics/api-lifecycle#deprecated): 2020-11-18 - [Migration guide](/migrate-from-v1/guides/v1-locations)  ---

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1LocationsApi apiInstance = new V1LocationsApi();
try {
    List<V1Merchant> result = apiInstance.listLocations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1LocationsApi#listLocations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;V1Merchant&gt;**](V1Merchant.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveBusiness"></a>
# **retrieveBusiness**
**Note: This endpoint is deprecated.**
> V1Merchant retrieveBusiness()

RetrieveBusiness

Get the general information for a business.  ---  - __Deprecation date__: 2019-11-20 - [__Retirement date__](/build-basics/api-lifecycle#deprecated): 2020-11-18 - [Migration guide](/migrate-from-v1/guides/v1-locations)  ---

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1LocationsApi apiInstance = new V1LocationsApi();
try {
    V1Merchant result = apiInstance.retrieveBusiness();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1LocationsApi#retrieveBusiness");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1Merchant**](V1Merchant.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

