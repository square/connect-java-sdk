
# V1SettlementEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentId** | **String** | The settlement&#39;s unique identifier. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The settlement&#39;s current status. |  [optional]
**amountMoney** | [**V1Money**](V1Money.md) | The total amount of money this entry contributes to the total settlement amount. |  [optional]
**feeMoney** | [**V1Money**](V1Money.md) | The amount of all Square fees associated with this settlement entry. This value is always negative or zero. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ADJUSTMENT | &quot;ADJUSTMENT&quot;
BALANCE_CHARGE | &quot;BALANCE_CHARGE&quot;
CHARGE | &quot;CHARGE&quot;
FREE_PROCESSING | &quot;FREE_PROCESSING&quot;
HOLD_ADJUSTMENT | &quot;HOLD_ADJUSTMENT&quot;
PAID_SERVICE_FEE | &quot;PAID_SERVICE_FEE&quot;
PAID_SERVICE_FEE_REFUND | &quot;PAID_SERVICE_FEE_REFUND&quot;
REDEMPTION_CODE | &quot;REDEMPTION_CODE&quot;
REFUND | &quot;REFUND&quot;
RETURNED_PAYOUT | &quot;RETURNED_PAYOUT&quot;
SQUARE_CAPITAL_ADVANCE | &quot;SQUARE_CAPITAL_ADVANCE&quot;
SQUARE_CAPITAL_PAYMENT | &quot;SQUARE_CAPITAL_PAYMENT&quot;
SQUARE_CAPITAL_REVERSED_PAYMENT | &quot;SQUARE_CAPITAL_REVERSED_PAYMENT&quot;
SUBSCRIPTION_FEE | &quot;SUBSCRIPTION_FEE&quot;
SUBSCRIPTION_FEE_REFUND | &quot;SUBSCRIPTION_FEE_REFUND&quot;
INCENTED_PAYMENT | &quot;INCENTED_PAYMENT&quot;
RETURNED_ACH_ENTRY | &quot;RETURNED_ACH_ENTRY&quot;
RETURNED_SQUARE_275 | &quot;RETURNED_SQUARE_275&quot;
SQUARE_275 | &quot;SQUARE_275&quot;



