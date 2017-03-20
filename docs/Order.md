
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The order&#39;s unique ID.  This value is not present if the order was not created with the [CreateOrder](#endpoint-createorder) endpoint. |  [optional]
**locationId** | **String** | The ID of the merchant location this order is associated with. |  [optional]
**referenceId** | **String** | A client specified identifier to associate an entity in another system with this order. |  [optional]
**lineItems** | [**List&lt;OrderLineItem&gt;**](OrderLineItem.md) | The line items included in the order. Every order has at least one line item. |  [optional]
**totalMoney** | [**Money**](Money.md) | The total amount of money to collect for the order. |  [optional]



