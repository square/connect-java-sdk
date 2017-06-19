
# CreateOrderRequestLineItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the line item. This value cannot exceed 500 characters. |  [optional]
**quantity** | **String** | The quantity to purchase, as a string representation of a number. Currently, only integer values are supported. | 
**basePriceMoney** | [**Money**](Money.md) | The base price for a single unit of the line item&#39;s associated variation. If a line item represents a Custom Amount instead of a particular product, this field indicates that amount. |  [optional]
**taxes** | [**List&lt;CreateOrderRequestTax&gt;**](CreateOrderRequestTax.md) | The taxes include the custom taxes. |  [optional]
**discounts** | [**List&lt;CreateOrderRequestDiscount&gt;**](CreateOrderRequestDiscount.md) | The discounts include the custom discounts. |  [optional]



