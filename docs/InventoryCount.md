
# InventoryCount

### Description

Represents the estimated quantity of items in a particular state at a particular location based on the known history of physical counts and inventory adjustments.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogObjectId** | **String** | The Square generated ID of the [CatalogObject](#type-catalogobject) being tracked. |  [optional]
**catalogObjectType** | **String** | The [CatalogObjectType](#type-catalogobjecttype) of the [CatalogObject](#type-catalogobject) being tracked. Tracking is only supported for the &#x60;ITEM_VARIATION&#x60; type. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The current [InventoryState](#type-inventorystate) for the related quantity of items. See [InventoryState](#type-inventorystate) for possible values |  [optional]
**locationId** | **String** | The Square ID of the [Location](#type-location) where the related quantity of items are being tracked. |  [optional]
**quantity** | **String** | The number of items in the count as a decimal string. Fractional quantities are not supported. |  [optional]
**calculatedAt** | **String** | A read-only timestamp in RFC 3339 format that indicates when Square received the most recent physical count or adjustment that had an affect on the estimated count. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
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



