
# ItemVariationLocationOverrides

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationId** | **String** | The ID of the location. |  [optional]
**priceMoney** | [**Money**](Money.md) | The price of the [CatalogItemVariation](#type-catalogitemvariation) at the given location, or blank for variable pricing. |  [optional]
**pricingType** | [**PricingTypeEnum**](#PricingTypeEnum) | The pricing type (fixed or variable) for the [CatalogItemVariation](#type-catalogitemvariation) at the given location. See [CatalogPricingType](#type-catalogpricingtype) for all possible values. |  [optional]
**trackInventory** | **Boolean** | If &#x60;true&#x60;, inventory tracking is active for the [CatalogItemVariation](#type-catalogitemvariation) at this location. |  [optional]
**inventoryAlertType** | [**InventoryAlertTypeEnum**](#InventoryAlertTypeEnum) | Indicates whether the [CatalogItemVariation](#type-catalogitemvariation) displays an alert when its inventory quantity is less than or equal to its &#x60;inventory_alert_threshold&#x60;. See [InventoryAlertType](#type-inventoryalerttype) for all possible values. |  [optional]
**inventoryAlertThreshold** | **Long** | If the inventory quantity for the variation is less than or equal to this value and &#x60;inventory_alert_type&#x60; is &#x60;LOW_QUANTITY&#x60;, the variation displays an alert in the merchant dashboard.  This value is always an integer. |  [optional]


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
NONE | &quot;NONE&quot;
LOW_QUANTITY | &quot;LOW_QUANTITY&quot;



