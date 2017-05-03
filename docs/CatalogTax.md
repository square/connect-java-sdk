
# CatalogTax

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The tax&#39;s name. Searchable. | 
**calculationPhase** | [**CalculationPhaseEnum**](#CalculationPhaseEnum) | Whether the tax is calculated based on a payment&#39;s subtotal or total. See [TaxCalculationPhase](#type-taxcalculationphase) for all possible values. |  [optional]
**inclusionType** | [**InclusionTypeEnum**](#InclusionTypeEnum) | Whether the tax is &#x60;ADDITIVE&#x60; or &#x60;INCLUSIVE&#x60;. See [TaxInclusionType](#type-taxinclusiontype) for all possible values. |  [optional]
**percentage** | **String** | The percentage of the tax in decimal form, using a &#39;.&#39; as the decimal separator and without a &#39;%&#39; sign. A value of &#x60;7.5&#x60; corresponds to 7.5%. |  [optional]
**appliesToCustomAmounts** | **Boolean** | If &#x60;true&#x60;, the fee applies to custom amounts entered into the Square Point of Sale app that are not associated with a particular [CatalogItem](#type-catalogitem). |  [optional]
**enabled** | **Boolean** | If &#x60;true&#x60;, the tax will be shown as enabled in the Square Point of Sale app. |  [optional]


<a name="CalculationPhaseEnum"></a>
## Enum: CalculationPhaseEnum
Name | Value
---- | -----
SUBTOTAL_PHASE | &quot;TAX_SUBTOTAL_PHASE&quot;
TOTAL_PHASE | &quot;TAX_TOTAL_PHASE&quot;


<a name="InclusionTypeEnum"></a>
## Enum: InclusionTypeEnum
Name | Value
---- | -----
ADDITIVE | &quot;ADDITIVE&quot;
INCLUSIVE | &quot;INCLUSIVE&quot;



