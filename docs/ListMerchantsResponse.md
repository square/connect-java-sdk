
# ListMerchantsResponse

### Description

The response object returned by the [ListMerchant](#endpoint-listmerchant) endpoint.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;Error&gt;**](Error.md) | Information on errors encountered during the request. |  [optional]
**merchant** | [**List&lt;Merchant&gt;**](Merchant.md) | The requested &#x60;Merchant&#x60; entities. |  [optional]
**cursor** | **Integer** | If the  response is truncated, the cursor to use in next  request to fetch next set of objects. |  [optional]



