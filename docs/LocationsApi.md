# LocationsApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listLocations**](LocationsApi.md#listLocations) | **GET** /v2/locations | ListLocations


<a name="listLocations"></a>
# **listLocations**
> ListLocationsResponse listLocations(authorization)

ListLocations

Provides the details for all of a business&#39;s locations.  Most other Connect API endpoints have a required &#x60;location_id&#x60; path parameter. The &#x60;id&#x60; field of the [&#x60;Location&#x60;](#type-location) objects returned by this endpoint correspond to that &#x60;location_id&#x60; parameter.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
try {
    ListLocationsResponse result = apiInstance.listLocations(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#listLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |

### Return type

[**ListLocationsResponse**](ListLocationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

