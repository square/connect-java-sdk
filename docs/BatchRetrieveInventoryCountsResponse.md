
# BatchRetrieveInventoryCountsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;Error&gt;**](Error.md) | Any errors that occurred during the request. |  [optional]
**counts** | [**List&lt;InventoryCount&gt;**](InventoryCount.md) | The current calculated inventory counts for the requested objects and locations. |  [optional]
**cursor** | **String** | The pagination cursor to be used in a subsequent request. If unset, this is the final response.  See [Paginating results](#paginatingresults) for more information. |  [optional]



