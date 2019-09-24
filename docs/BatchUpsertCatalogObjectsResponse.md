
# BatchUpsertCatalogObjectsResponse

### Description



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;Error&gt;**](Error.md) | The set of &#x60;Error&#x60;s encountered. |  [optional]
**objects** | [**List&lt;CatalogObject&gt;**](CatalogObject.md) | The created &#x60;CatalogObject&#x60;s |  [optional]
**updatedAt** | **String** | The database [timestamp](#workingwithdates) of this update in RFC 3339 format, e.g., \&quot;2016-09-04T23:59:33.123Z\&quot;. |  [optional]
**idMappings** | [**List&lt;CatalogIdMapping&gt;**](CatalogIdMapping.md) | The mapping between client and server IDs for this Upsert. |  [optional]



