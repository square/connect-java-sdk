
# V1Variation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The item variation&#39;s unique ID. |  [optional]
**name** | **String** | The item variation&#39;s name. |  [optional]
**itemId** | **String** | The ID of the variation&#39;s associated item. |  [optional]
**pricingType** | [**PricingTypeEnum**](#PricingTypeEnum) | Indicates whether the item variation&#39;s price is fixed or determined at the time of sale. |  [optional]
**priceMoney** | [**V1Money**](V1Money.md) | The item variation&#39;s price, if any. |  [optional]
**sku** | **String** | The item variation&#39;s SKU, if any. |  [optional]
**trackInventory** | **Boolean** | If true, inventory tracking is active for the variation. |  [optional]
**inventoryAlertType** | [**InventoryAlertTypeEnum**](#InventoryAlertTypeEnum) | Indicates whether the item variation displays an alert when its inventory quantity is less than or equal to its inventory_alert_threshold. |  [optional]
**inventoryAlertThreshold** | **Integer** | If the inventory quantity for the variation is less than or equal to this value and inventory_alert_type is LOW_QUANTITY, the variation displays an alert in the merchant dashboard. |  [optional]
**userData** | **String** | Arbitrary metadata associated with the variation. Cannot exceed 255 characters. |  [optional]


<a name="PricingTypeEnum"></a>
## Enum: PricingTypeEnum
Name | Value
---- | -----
FIXED_PRICING | &quot;FIXED_PRICING&quot;
VARIABLE_PRICING | &quot;VARIABLE_PRICING&quot;


<a name="InventoryAlertTypeEnum"></a>
## Enum: InventoryAlertTypeEnum
Name | Value
---- | -----
LOW_QUANTITY | &quot;LOW_QUANTITY&quot;
NONE | &quot;NONE&quot;
INVESTMENT | &quot;INVESTMENT&quot;
LOAN | &quot;LOAN&quot;
SAVINGS | &quot;SAVINGS&quot;
OTHER | &quot;OTHER&quot;



