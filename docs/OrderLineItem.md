
# OrderLineItem

### Description

Represents a line item in an order. Each line item describes a different product to purchase, with its own quantity and price details.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the line item. |  [optional]
**quantity** | **String** | The quantity purchased, as a string representation of a number.  This string must have a positive integer value. | 
**note** | **String** | The note of the line item. |  [optional]
**catalogObjectId** | **String** | The [CatalogItemVariation](#type-catalogitemvariation) id applied to this line item. |  [optional]
**variationName** | **String** | The name of the variation applied to this line item. |  [optional]
**modifiers** | [**List&lt;OrderLineItemModifier&gt;**](OrderLineItemModifier.md) | The [CatalogModifier](#type-catalogmodifier)s applied to this line item. |  [optional]
**taxes** | [**List&lt;OrderLineItemTax&gt;**](OrderLineItemTax.md) | A list of taxes applied to this line item. On read or retrieve, this list includes both item-level taxes and any order-level taxes apportioned to this item. When creating an Order, set your item-level taxes in this list. |  [optional]
**discounts** | [**List&lt;OrderLineItemDiscount&gt;**](OrderLineItemDiscount.md) | A list of discounts applied to this line item. On read or retrieve, this list includes both item-level discounts and any order-level discounts apportioned to this item. When creating an Order, set your item-level discounts in this list. |  [optional]
**basePriceMoney** | [**Money**](Money.md) | The base price for a single unit of the line item. |  [optional]
**grossSalesMoney** | [**Money**](Money.md) | The gross sales amount of money calculated as (item base price + modifiers price) * quantity. |  [optional]
**totalTaxMoney** | [**Money**](Money.md) | The total tax amount of money to collect for the line item. |  [optional]
**totalDiscountMoney** | [**Money**](Money.md) | The total discount amount of money to collect for the line item. |  [optional]
**totalMoney** | [**Money**](Money.md) | The total amount of money to collect for this line item. |  [optional]



