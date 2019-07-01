
# OrderReturnTax

### Description

The line item tax being returned.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uid** | **String** | Unique ID that identifies the return tax only within this order.  This field is read-only. |  [optional]
**sourceTaxUid** | **String** | &#x60;uid&#x60; of the Tax from the Order which contains the original charge of this tax. |  [optional]
**catalogObjectId** | **String** | The catalog object id referencing [CatalogTax](#type-catalogtax). |  [optional]
**name** | **String** | The tax&#39;s name. |  [optional]
**type** | **String** | Indicates the calculation method used to apply the tax. See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values |  [optional]
**percentage** | **String** | The percentage of the tax, as a string representation of a decimal number.  A value of &#x60;7.25&#x60; corresponds to a percentage of 7.25%. |  [optional]
**appliedMoney** | [**Money**](Money.md) | The amount of the money applied by the tax in an order. |  [optional]
**scope** | **String** | Indicates the level at which the tax applies. This field is set by the server. If set in a CreateOrder request, it will be ignored on write. See [OrderLineItemTaxScope](#type-orderlineitemtaxscope) for possible values |  [optional]



