
# CreateOrderRequestTax

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The tax&#39;s name. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Indicates the calculation method used to apply the line item tax.  Default: &#x60;ADDITIVE&#x60;; See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values. |  [optional]
**percentage** | **String** | The percentage of the tax, as a string representation of a decimal number.  A value of &#x60;7.25&#x60; corresponds to a percentage of 7.25%. This value range between 0.0 up to 100.0 |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
ADDITIVE | &quot;ADDITIVE&quot;
INCLUSIVE | &quot;INCLUSIVE&quot;



