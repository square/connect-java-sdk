
# OrderLineItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The line item&#39;s ID, unique only within this order. |  [optional]
**name** | **String** | The name of the line item. |  [optional]
**quantity** | **String** | The quantity of the product to purchase. Currently, this string must have an integer value. |  [optional]
**basePriceMoney** | [**Money**](Money.md) | The base price for a single unit of the line item&#39;s associated variation.  If a line item represents a Custom Amount instead of a particular product, this field indicates that amount. |  [optional]
**totalMoney** | [**Money**](Money.md) | The total amount of money to collect for this line item. |  [optional]



