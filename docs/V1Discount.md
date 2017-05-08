
# V1Discount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The discount&#39;s unique ID. |  [optional]
**name** | **String** | The discount&#39;s name. |  [optional]
**rate** | **String** | The rate of the discount, as a string representation of a decimal number. A value of 0.07 corresponds to a rate of 7%. This rate is 0 if discount_type is VARIABLE_PERCENTAGE. |  [optional]
**amountMoney** | [**V1Money**](V1Money.md) | The amount of the discount. This amount is 0 if discount_type is VARIABLE_AMOUNT. This field is not included for rate-based discounts. |  [optional]
**discountType** | [**DiscountTypeEnum**](#DiscountTypeEnum) | Indicates whether the discount is a FIXED value or entered at the time of sale. |  [optional]
**pinRequired** | **Boolean** | Indicates whether a mobile staff member needs to enter their PIN to apply the discount to a payment. |  [optional]
**color** | [**ColorEnum**](#ColorEnum) | The color of the discount&#39;s display label in Square Register, if not the default color. The default color is 9da2a6. |  [optional]


<a name="DiscountTypeEnum"></a>
## Enum: DiscountTypeEnum
Name | Value
---- | -----
FIXED | &quot;FIXED&quot;
VARIABLE_PERCENTAGE | &quot;VARIABLE_PERCENTAGE&quot;
VARIABLE_AMOUNT | &quot;VARIABLE_AMOUNT&quot;


<a name="ColorEnum"></a>
## Enum: ColorEnum
Name | Value
---- | -----
_9DA2A6 | &quot;9da2a6&quot;
_4AB200 | &quot;4ab200&quot;
_0B8000 | &quot;0b8000&quot;
_2952CC | &quot;2952cc&quot;
A82EE5 | &quot;a82ee5&quot;
E5457A | &quot;e5457a&quot;
B21212 | &quot;b21212&quot;
_593C00 | &quot;593c00&quot;
E5BF00 | &quot;e5BF00&quot;



