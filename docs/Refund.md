
# Refund

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The refund&#39;s unique ID. | 
**locationId** | **String** | The ID of the refund&#39;s associated location. | 
**transactionId** | **String** | The ID of the transaction that the refunded tender is part of. | 
**tenderId** | **String** | The ID of the refunded tender. | 
**createdAt** | **String** | The time when the refund was created, in RFC 3339 format. |  [optional]
**reason** | **String** | The reason for the refund being issued. | 
**amountMoney** | [**Money**](Money.md) | The amount of money refunded to the buyer. | 
**status** | [**StatusEnum**](#StatusEnum) | The current status of the refund (&#x60;PENDING&#x60;, &#x60;APPROVED&#x60;, &#x60;REJECTED&#x60;, or &#x60;FAILED&#x60;). | 
**processingFeeMoney** | [**Money**](Money.md) | The amount of Square processing fee money refunded to the *merchant*. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
APPROVED | &quot;APPROVED&quot;
REJECTED | &quot;REJECTED&quot;
FAILED | &quot;FAILED&quot;



