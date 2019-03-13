
# TenderCardDetails

### Description

Represents additional details of a tender with `type` `CARD` or `SQUARE_GIFT_CARD`

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | The credit card payment&#39;s current state (such as &#x60;AUTHORIZED&#x60; or &#x60;CAPTURED&#x60;). See [TenderCardDetailsStatus](#type-tendercarddetailsstatus) for possible values. |  [optional]
**card** | [**Card**](Card.md) | The credit card&#39;s non-confidential details. |  [optional]
**entryMethod** | [**EntryMethodEnum**](#EntryMethodEnum) | The method used to enter the card&#39;s details for the transaction. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AUTHORIZED | &quot;AUTHORIZED&quot;
CAPTURED | &quot;CAPTURED&quot;
VOIDED | &quot;VOIDED&quot;
FAILED | &quot;FAILED&quot;


<a name="EntryMethodEnum"></a>
## Enum: EntryMethodEnum
Name | Value
---- | -----
SWIPED | &quot;SWIPED&quot;
KEYED | &quot;KEYED&quot;
EMV | &quot;EMV&quot;
ON_FILE | &quot;ON_FILE&quot;
CONTACTLESS | &quot;CONTACTLESS&quot;



