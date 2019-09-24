
# BatchDeleteCatalogObjectsResponse

### Description



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;Error&gt;**](Error.md) | The set of &#x60;Error&#x60;s encountered. |  [optional]
**deletedObjectIds** | **List&lt;String&gt;** | The IDs of all &#x60;CatalogObject&#x60;s deleted by this request. |  [optional]
**deletedAt** | **String** | The database [timestamp](#workingwithdates) of this deletion in RFC 3339 format, e.g., \&quot;2016-09-04T23:59:33.123Z\&quot;. |  [optional]



