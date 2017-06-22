
# OrderLineItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the line item. |  [optional]
**quantity** | **String** | The quantity of the product to purchase. Currently, this string must have an integer value. |  [optional]
**taxes** | [**List&lt;OrderLineItemTax&gt;**](OrderLineItemTax.md) | The taxes applied to this line item. |  [optional]
**discounts** | [**List&lt;OrderLineItemDiscount&gt;**](OrderLineItemDiscount.md) | The discounts applied to this line item. |  [optional]
**basePriceMoney** | [**Money**](Money.md) | The base price for a single unit of the line item. |  [optional]
**totalTaxMoney** | [**Money**](Money.md) | The total tax amount of money to collect for the line item. |  [optional]
**totalDiscountMoney** | [**Money**](Money.md) | The total discount amount of money to collect for the line item. |  [optional]
**totalMoney** | [**Money**](Money.md) | The total amount of money to collect for this line item. |  [optional]



