
# OrderLineItemDiscount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The discount&#39;s name. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the discount. If it is created by API, it would be either FIXED_PERCENTAGE or FIXED_AMOUNT as VARIABLE_* is not supported in API because the order is created at the time of sale and either percentage or amount has to be specified. |  [optional]
**percentage** | **String** | The percentage of the tax, as a string representation of a decimal number. A value of &#x60;7.25&#x60; corresponds to a percentage of 7.25%. |  [optional]
**amountMoney** | [**Money**](Money.md) | The amount of the discount. |  [optional]
**appliedMoney** | [**Money**](Money.md) | The amount of the money applied by the discount in an order. |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) | The scope of the discount. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
FIXED_PERCENTAGE | &quot;FIXED_PERCENTAGE&quot;
FIXED_AMOUNT | &quot;FIXED_AMOUNT&quot;
VARIABLE_PERCENTAGE | &quot;VARIABLE_PERCENTAGE&quot;
VARIABLE_AMOUNT | &quot;VARIABLE_AMOUNT&quot;


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
LINEITEM | &quot;LINEITEM&quot;
ORDER | &quot;ORDER&quot;



