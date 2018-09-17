
# InventoryChange

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Indicates how the inventory change was applied. See [InventoryChangeType](#type-inventorychangetype) for all possible values. |  [optional]
**physicalCount** | [**InventoryPhysicalCount**](InventoryPhysicalCount.md) | Contains details about the physical count when &#x60;type&#x60; is &#x60;PHYSICAL_COUNT&#x60; and unset for all other types. |  [optional]
**adjustment** | [**InventoryAdjustment**](InventoryAdjustment.md) | Contains details about the inventory adjustment when &#x60;type&#x60; is &#x60;ADJUSTMENT&#x60; and unset for all other types. |  [optional]
**transfer** | [**InventoryTransfer**](InventoryTransfer.md) | Contains details about the inventory transfer when &#x60;type&#x60; is &#x60;TRANSFER&#x60; and unset for all other types. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PHYSICAL_COUNT | &quot;PHYSICAL_COUNT&quot;
ADJUSTMENT | &quot;ADJUSTMENT&quot;
TRANSFER | &quot;TRANSFER&quot;



