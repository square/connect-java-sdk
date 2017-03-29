
# V1PaymentItemization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The item&#39;s name. |  [optional]
**quantity** | [**BigDecimal**](BigDecimal.md) | The quantity of the item purchased. This can be a decimal value. |  [optional]
**itemizationType** | [**ItemizationTypeEnum**](#ItemizationTypeEnum) | The type of purchase that the itemization represents, such as an ITEM or CUSTOM_AMOUNT |  [optional]
**itemDetail** | [**V1PaymentItemDetail**](V1PaymentItemDetail.md) | Details of the item, including its unique identifier and the identifier of the item variation purchased. |  [optional]
**notes** | **String** | Notes entered by the merchant about the item at the time of payment, if any. |  [optional]
**itemVariationName** | **String** | The name of the item variation purchased, if any. |  [optional]
**totalMoney** | [**V1Money**](V1Money.md) | The total cost of the item, including all taxes and discounts. |  [optional]
**singleQuantityMoney** | [**V1Money**](V1Money.md) | The cost of a single unit of this item. |  [optional]
**grossSalesMoney** | [**V1Money**](V1Money.md) | The total cost of the itemization and its modifiers, not including taxes or discounts. |  [optional]
**discountMoney** | [**V1Money**](V1Money.md) | The total of all discounts applied to the itemization. This value is always negative or zero. |  [optional]
**netSalesMoney** | [**V1Money**](V1Money.md) | The sum of gross_sales_money and discount_money. |  [optional]
**taxes** | [**List&lt;V1PaymentTax&gt;**](V1PaymentTax.md) | All taxes applied to this itemization. |  [optional]
**discounts** | [**List&lt;V1PaymentDiscount&gt;**](V1PaymentDiscount.md) | All discounts applied to this itemization. |  [optional]
**modifiers** | [**List&lt;V1PaymentModifier&gt;**](V1PaymentModifier.md) | All modifier options applied to this itemization. |  [optional]


<a name="ItemizationTypeEnum"></a>
## Enum: ItemizationTypeEnum
Name | Value
---- | -----
ITEM | &quot;ITEM&quot;
CUSTOM_AMOUNT | &quot;CUSTOM_AMOUNT&quot;
GIFT_CARD_ACTIVATION | &quot;GIFT_CARD_ACTIVATION&quot;
GIFT_CARD_RELOAD | &quot;GIFT_CARD_RELOAD&quot;
GIFT_CARD_UNKNOWN | &quot;GIFT_CARD_UNKNOWN&quot;
OTHER | &quot;OTHER&quot;



