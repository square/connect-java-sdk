
# RetrieveInventoryChangesResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;Error&gt;**](Error.md) | Any errors that occurred during the request. |  [optional]
**changes** | [**List&lt;InventoryChange&gt;**](InventoryChange.md) | The set of inventory changes for the requested object and locations. |  [optional]
**cursor** | **String** | The pagination cursor to be used in a subsequent request. If unset, this is the final response.  See [Paginating results](#paginatingresults) for more information. |  [optional]



