
# CatalogItemVariation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String** | The ID of the [CatalogItem](#type-catalogitem) associated with this item variation. Searchable. |  [optional]
**name** | **String** | The item variation&#39;s name. Searchable. |  [optional]
**sku** | **String** | The item variation&#39;s SKU, if any. Searchable. |  [optional]
**upc** | **String** | The item variation&#39;s UPC, if any. Searchable. |  [optional]
**pricingType** | [**PricingTypeEnum**](#PricingTypeEnum) | Indicates whether the item variation&#39;s price is fixed or determined at the time of sale. See [CatalogPricingType](#type-catalogpricingtype) for all possible values. |  [optional]
**priceMoney** | [**Money**](Money.md) | The item variation&#39;s price, if fixed pricing is used. |  [optional]
**locationOverrides** | [**List&lt;ItemVariationLocationOverrides&gt;**](ItemVariationLocationOverrides.md) | Per-location price and inventory overrides. |  [optional]
**trackInventory** | **Boolean** | If &#x60;true&#x60;, inventory tracking is active for the variation. |  [optional]
**inventoryAlertType** | [**InventoryAlertTypeEnum**](#InventoryAlertTypeEnum) | Indicates whether the item variation displays an alert when its inventory quantity is less than or equal to its &#x60;inventory_alert_threshold&#x60;. See [InventoryAlertType](#type-inventoryalerttype) for all possible values. |  [optional]
**inventoryAlertThreshold** | **Long** | If the inventory quantity for the variation is less than or equal to this value and &#x60;inventory_alert_type&#x60; is &#x60;LOW_QUANTITY&#x60;, the variation displays an alert in the merchant dashboard.  This value is always an integer. |  [optional]
**userData** | **String** | Arbitrary user metadata to associate with the item variation. Cannot exceed 255 characters. Searchable. |  [optional]
**serviceDuration** | **Long** | If the [CatalogItem](#type-catalogitem) that owns this item variation is of type &#x60;APPOINTMENTS_SERVICE&#x60;, then this is the duration of the service in milliseconds. For example, a 30 minute appointment would have the value &#x60;1800000&#x60;, which is equal to 30 (minutes) * 60 (seconds per minute) * 1000 (milliseconds per second). |  [optional]


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



