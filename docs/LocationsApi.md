# LocationsApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLocation**](LocationsApi.md#createLocation) | **POST** /v2/locations | CreateLocation
[**listLocations**](LocationsApi.md#listLocations) | **GET** /v2/locations | ListLocations
[**retrieveLocation**](LocationsApi.md#retrieveLocation) | **GET** /v2/locations/{location_id} | RetrieveLocation
[**updateLocation**](LocationsApi.md#updateLocation) | **PUT** /v2/locations/{location_id} | UpdateLocation


<a name="createLocation"></a>
# **createLocation**
**Note: This endpoint is in beta.**
> CreateLocationResponse createLocation(body)

CreateLocation

Creates a location. For more information about locations, see [Locations API Overview](/locations-api).

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
CreateLocationRequest body = new CreateLocationRequest(); // CreateLocationRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    CreateLocationResponse result = apiInstance.createLocation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#createLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateLocationRequest**](CreateLocationRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**CreateLocationResponse**](CreateLocationResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listLocations"></a>
# **listLocations**
> ListLocationsResponse listLocations()

ListLocations

Provides information of all locations of a business.  Most other Connect API endpoints have a required &#x60;location_id&#x60; path parameter. The &#x60;id&#x60; field of the [&#x60;Location&#x60;](#type-location) objects returned by this endpoint correspond to that &#x60;location_id&#x60; parameter.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
try {
    ListLocationsResponse result = apiInstance.listLocations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#listLocations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListLocationsResponse**](ListLocationsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveLocation"></a>
# **retrieveLocation**
> RetrieveLocationResponse retrieveLocation(locationId)

RetrieveLocation

Retrieves details of a location.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
String locationId = "locationId_example"; // String | The ID of the location to retrieve.
try {
    RetrieveLocationResponse result = apiInstance.retrieveLocation(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#retrieveLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to retrieve. |

### Return type

[**RetrieveLocationResponse**](RetrieveLocationResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocation"></a>
# **updateLocation**
**Note: This endpoint is in beta.**
> UpdateLocationResponse updateLocation(locationId, body)

UpdateLocation

Updates a location.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
String locationId = "locationId_example"; // String | The ID of the location to update.
UpdateLocationRequest body = new UpdateLocationRequest(); // UpdateLocationRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    UpdateLocationResponse result = apiInstance.updateLocation(locationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#updateLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to update. |
 **body** | [**UpdateLocationRequest**](UpdateLocationRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**UpdateLocationResponse**](UpdateLocationResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

