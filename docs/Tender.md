
# Tender

### Description

Represents a tender (i.e., a method of payment) used in a Square transaction.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The tender&#39;s unique ID. |  [optional]
**locationId** | **String** | The ID of the transaction&#39;s associated location. |  [optional]
**transactionId** | **String** | The ID of the tender&#39;s associated transaction. |  [optional]
**createdAt** | **String** | The time when the tender was created, in RFC 3339 format. |  [optional]
**note** | **String** | An optional note associated with the tender at the time of payment. |  [optional]
**amountMoney** | [**Money**](Money.md) | The amount of the tender. |  [optional]
**tipMoney** | [**Money**](Money.md) | The tip&#39;s amount of the tender. |  [optional]
**processingFeeMoney** | [**Money**](Money.md) | The amount of any Square processing fees applied to the tender.  This field is not immediately populated when a new transaction is created. It is usually available after about ten seconds. |  [optional]
**customerId** | **String** | If the tender is associated with a customer or represents a customer&#39;s card on file, this is the ID of the associated customer. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of tender, such as &#x60;CARD&#x60; or &#x60;CASH&#x60;. | 
**cardDetails** | [**TenderCardDetails**](TenderCardDetails.md) | The details of the card tender.  This value is present only if the value of &#x60;type&#x60; is &#x60;CARD&#x60;. |  [optional]
**cashDetails** | [**TenderCashDetails**](TenderCashDetails.md) | The details of the cash tender.  This value is present only if the value of &#x60;type&#x60; is &#x60;CASH&#x60;. |  [optional]
**additionalRecipients** | [**List&lt;AdditionalRecipient&gt;**](AdditionalRecipient.md) | Additional recipients (other than the merchant) receiving a portion of this tender. For example, fees assessed on the purchase by a third party integration. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CARD | &quot;CARD&quot;
CASH | &quot;CASH&quot;
THIRD_PARTY_CARD | &quot;THIRD_PARTY_CARD&quot;
SQUARE_GIFT_CARD | &quot;SQUARE_GIFT_CARD&quot;
NO_SALE | &quot;NO_SALE&quot;
OTHER | &quot;OTHER&quot;



