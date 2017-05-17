
# V1Fee

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The fee&#39;s unique ID. |  [optional]
**name** | **String** | The fee&#39;s name. |  [optional]
**rate** | **String** | The rate of the fee, as a string representation of a decimal number. A value of 0.07 corresponds to a rate of 7%. |  [optional]
**calculationPhase** | [**CalculationPhaseEnum**](#CalculationPhaseEnum) | Forthcoming |  [optional]
**adjustmentType** | [**AdjustmentTypeEnum**](#AdjustmentTypeEnum) | The type of adjustment the fee applies to a payment. Currently, this value is TAX for all fees. |  [optional]
**appliesToCustomAmounts** | **Boolean** | If true, the fee applies to custom amounts entered into Square Register that are not associated with a particular item. |  [optional]
**enabled** | **Boolean** | If true, the fee is applied to all appropriate items. If false, the fee is not applied at all. |  [optional]
**inclusionType** | [**InclusionTypeEnum**](#InclusionTypeEnum) | Whether the fee is ADDITIVE or INCLUSIVE. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | In countries with multiple classifications for sales taxes, indicates which classification the fee falls under. Currently relevant only to Canadian merchants. |  [optional]


<a name="CalculationPhaseEnum"></a>
## Enum: CalculationPhaseEnum
Name | Value
---- | -----
FEE_SUBTOTAL_PHASE | &quot;FEE_SUBTOTAL_PHASE&quot;
OTHER | &quot;OTHER&quot;
FEE_TOTAL_PHASE | &quot;FEE_TOTAL_PHASE&quot;


<a name="AdjustmentTypeEnum"></a>
## Enum: AdjustmentTypeEnum
Name | Value
---- | -----
TAX | &quot;TAX&quot;


<a name="InclusionTypeEnum"></a>
## Enum: InclusionTypeEnum
Name | Value
---- | -----
ADDITIVE | &quot;ADDITIVE&quot;
INCLUSIVE | &quot;INCLUSIVE&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CA_GST | &quot;CA_GST&quot;
CA_HST | &quot;CA_HST&quot;
CA_PST | &quot;CA_PST&quot;
CA_QST | &quot;CA_QST&quot;
JP_CONSUMPTION_TAX | &quot;JP_CONSUMPTION_TAX&quot;
CA_PEI_PST | &quot;CA_PEI_PST&quot;
US_SALES_TAX | &quot;US_SALES_TAX&quot;
OTHER | &quot;OTHER&quot;



