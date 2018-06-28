
# V1AdjustInventoryRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantityDelta** | [**BigDecimal**](BigDecimal.md) | The number to adjust the variation&#39;s quantity by. |  [optional]
**adjustmentType** | [**AdjustmentTypeEnum**](#AdjustmentTypeEnum) | The reason for the inventory adjustment. |  [optional]
**memo** | **String** | A note about the inventory adjustment. |  [optional]


<a name="AdjustmentTypeEnum"></a>
## Enum: AdjustmentTypeEnum
Name | Value
---- | -----
SALE | &quot;SALE&quot;
RECEIVE_STOCK | &quot;RECEIVE_STOCK&quot;
MANUAL_ADJUST | &quot;MANUAL_ADJUST&quot;



