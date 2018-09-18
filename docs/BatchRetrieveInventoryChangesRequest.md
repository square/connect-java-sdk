
# BatchRetrieveInventoryChangesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogObjectIds** | **List&lt;String&gt;** | Filters results by [CatalogObject](#type-catalogobject) ID. Only applied when set. Default: unset. |  [optional]
**locationIds** | **List&lt;String&gt;** | Filters results by [Location](#type-location) ID. Only applied when set. Default: unset. |  [optional]
**types** | [**List&lt;TypesEnum&gt;**](#List&lt;TypesEnum&gt;) | Filters results by [InventoryChangeType](#type-inventorychangetype). Default: [&#x60;PHYSICAL_COUNT&#x60;, &#x60;ADJUSTMENT&#x60;]. &#x60;TRANSFER&#x60; is not supported as a filter. |  [optional]
**states** | [**List&lt;StatesEnum&gt;**](#List&lt;StatesEnum&gt;) | Filters &#x60;ADJUSTMENT&#x60; query results by [InventoryState](#type-inventorystate). Only applied when set. Default: unset. |  [optional]
**updatedAfter** | **String** | Provided as an RFC 3339 timestamp. Returns results whose &#x60;created_at&#x60; or &#x60;calculated_at&#x60; value is after the given time. Default: UNIX epoch (&#x60;1970-01-01T00:00:00Z&#x60;). |  [optional]
**updatedBefore** | **String** | Provided as an RFC 3339 timestamp. Returns results whose &#x60;created_at&#x60; or &#x60;calculated_at&#x60; value is strictly before the given time. Default: UNIX epoch (&#x60;1970-01-01T00:00:00Z&#x60;). |  [optional]
**cursor** | **String** | A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.  See [Paginating results](#paginatingresults) for more information. |  [optional]


<a name="List<TypesEnum>"></a>
## Enum: List&lt;TypesEnum&gt;
Name | Value
---- | -----
PHYSICAL_COUNT | &quot;PHYSICAL_COUNT&quot;
ADJUSTMENT | &quot;ADJUSTMENT&quot;
TRANSFER | &quot;TRANSFER&quot;


<a name="List<StatesEnum>"></a>
## Enum: List&lt;StatesEnum&gt;
Name | Value
---- | -----
CUSTOM | &quot;CUSTOM&quot;
IN_STOCK | &quot;IN_STOCK&quot;
SOLD | &quot;SOLD&quot;
RETURNED_BY_CUSTOMER | &quot;RETURNED_BY_CUSTOMER&quot;
RESERVED_FOR_SALE | &quot;RESERVED_FOR_SALE&quot;
SOLD_ONLINE | &quot;SOLD_ONLINE&quot;
ORDERED_FROM_VENDOR | &quot;ORDERED_FROM_VENDOR&quot;
RECEIVED_FROM_VENDOR | &quot;RECEIVED_FROM_VENDOR&quot;
IN_TRANSIT_TO | &quot;IN_TRANSIT_TO&quot;
NONE | &quot;NONE&quot;
WASTE | &quot;WASTE&quot;
UNLINKED_RETURN | &quot;UNLINKED_RETURN&quot;



