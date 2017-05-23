
# V1Tender

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The tender&#39;s unique ID. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of tender. |  [optional]
**name** | **String** | A human-readable description of the tender. |  [optional]
**employeeId** | **String** | The ID of the employee that processed the tender. |  [optional]
**receiptUrl** | **String** | The URL of the receipt for the tender. |  [optional]
**cardBrand** | [**CardBrandEnum**](#CardBrandEnum) | The brand of credit card provided. |  [optional]
**panSuffix** | **String** | The last four digits of the provided credit card&#39;s account number. |  [optional]
**entryMethod** | [**EntryMethodEnum**](#EntryMethodEnum) | The tender&#39;s unique ID. |  [optional]
**paymentNote** | **String** | Notes entered by the merchant about the tender at the time of payment, if any. Typically only present for tender with the type: OTHER. |  [optional]
**totalMoney** | [**V1Money**](V1Money.md) | The total amount of money provided in this form of tender. |  [optional]
**tenderedMoney** | [**V1Money**](V1Money.md) | The amount of total_money applied to the payment. |  [optional]
**changeBackMoney** | [**V1Money**](V1Money.md) | The amount of total_money returned to the buyer as change. |  [optional]
**refundedMoney** | [**V1Money**](V1Money.md) | The total of all refunds applied to this tender. This amount is always negative or zero. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CREDIT_CARD | &quot;CREDIT_CARD&quot;
CASH | &quot;CASH&quot;
THIRD_PARTY_CARD | &quot;THIRD_PARTY_CARD&quot;
NO_SALE | &quot;NO_SALE&quot;
SQUARE_WALLET | &quot;SQUARE_WALLET&quot;
SQUARE_GIFT_CARD | &quot;SQUARE_GIFT_CARD&quot;
UNKNOWN | &quot;UNKNOWN&quot;
OTHER | &quot;OTHER&quot;


<a name="CardBrandEnum"></a>
## Enum: CardBrandEnum
Name | Value
---- | -----
OTHER_BRAND | &quot;OTHER_BRAND&quot;
VISA | &quot;VISA&quot;
MASTER_CARD | &quot;MASTER_CARD&quot;
AMERICAN_EXPRESS | &quot;AMERICAN_EXPRESS&quot;
DISCOVER | &quot;DISCOVER&quot;
DISCOVER_DINERS | &quot;DISCOVER_DINERS&quot;
JCB | &quot;JCB&quot;
CHINA_UNIONPAY | &quot;CHINA_UNIONPAY&quot;
SQUARE_GIFT_CARD | &quot;SQUARE_GIFT_CARD&quot;


<a name="EntryMethodEnum"></a>
## Enum: EntryMethodEnum
Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
SCANNED | &quot;SCANNED&quot;
SQUARE_CASH | &quot;SQUARE_CASH&quot;
SQUARE_WALLET | &quot;SQUARE_WALLET&quot;
SWIPED | &quot;SWIPED&quot;
WEB_FORM | &quot;WEB_FORM&quot;
OTHER | &quot;OTHER&quot;



