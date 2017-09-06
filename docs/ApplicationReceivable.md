
# ApplicationReceivable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The application receivable&#39;s unique ID, issued by Square payments servers. | 
**transactionId** | **String** | The ID of the transaction that the application receivable was applied to. | 
**transactionLocationId** | **String** | The ID of the location that created the receivable. This is the location ID on the associated transaction. | 
**amountMoney** | [**Money**](Money.md) | The amount of the receivable. This will always be non-negative. | 
**createdAt** | **String** | The time when the application receivable was created, in RFC 3339 format. |  [optional]
**refunds** | [**List&lt;ApplicationReceivableRefund&gt;**](ApplicationReceivableRefund.md) | Any refunds of the receivable that have been applied. |  [optional]



