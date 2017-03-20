# RefundApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRefund**](RefundApi.md#createRefund) | **POST** /v2/locations/{location_id}/transactions/{transaction_id}/refund | CreateRefund
[**listRefunds**](RefundApi.md#listRefunds) | **GET** /v2/locations/{location_id}/refunds | ListRefunds


<a name="createRefund"></a>
# **createRefund**
> CreateRefundResponse createRefund(authorization, locationId, transactionId, body)

CreateRefund

Initiates a refund for a previously charged tender.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.RefundApi;


RefundApi apiInstance = new RefundApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String locationId = "locationId_example"; // String | The ID of the original transaction's associated location.
String transactionId = "transactionId_example"; // String | The ID of the original transaction that includes the tender to refund.
CreateRefundRequest body = new CreateRefundRequest(); // CreateRefundRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    CreateRefundResponse result = apiInstance.createRefund(authorization, locationId, transactionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundApi#createRefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **locationId** | **String**| The ID of the original transaction&#39;s associated location. |
 **transactionId** | **String**| The ID of the original transaction that includes the tender to refund. |
 **body** | [**CreateRefundRequest**](CreateRefundRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**CreateRefundResponse**](CreateRefundResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listRefunds"></a>
# **listRefunds**
> ListRefundsResponse listRefunds(authorization, locationId, beginTime, endTime, sortOrder, cursor)

ListRefunds

Lists refunds for one of a business&#39;s locations.  Refunds with a &#x60;status&#x60; of &#x60;PENDING&#x60; are not currently included in this endpoint&#39;s response.  Max results per [page](#paginatingresults): 50

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.RefundApi;


RefundApi apiInstance = new RefundApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String locationId = "locationId_example"; // String | The ID of the location to list refunds for.
String beginTime = "beginTime_example"; // String | The beginning of the requested reporting period, in RFC 3339 format.  See [Date ranges](#dateranges) for details on date inclusivity/exclusivity.  Default value: The current time minus one year.
String endTime = "endTime_example"; // String | The end of the requested reporting period, in RFC 3339 format.  See [Date ranges](#dateranges) for details on date inclusivity/exclusivity.  Default value: The current time.
String sortOrder = "sortOrder_example"; // String | The order in which results are listed in the response (`ASC` for oldest first, `DESC` for newest first).  Default value: `DESC`
String cursor = "cursor_example"; // String | A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.  See [Paginating results](#paginatingresults) for more information.
try {
    ListRefundsResponse result = apiInstance.listRefunds(authorization, locationId, beginTime, endTime, sortOrder, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundApi#listRefunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **locationId** | **String**| The ID of the location to list refunds for. |
 **beginTime** | **String**| The beginning of the requested reporting period, in RFC 3339 format.  See [Date ranges](#dateranges) for details on date inclusivity/exclusivity.  Default value: The current time minus one year. | [optional]
 **endTime** | **String**| The end of the requested reporting period, in RFC 3339 format.  See [Date ranges](#dateranges) for details on date inclusivity/exclusivity.  Default value: The current time. | [optional]
 **sortOrder** | **String**| The order in which results are listed in the response (&#x60;ASC&#x60; for oldest first, &#x60;DESC&#x60; for newest first).  Default value: &#x60;DESC&#x60; | [optional] [enum: DESC, ASC]
 **cursor** | **String**| A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.  See [Paginating results](#paginatingresults) for more information. | [optional]

### Return type

[**ListRefundsResponse**](ListRefundsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

