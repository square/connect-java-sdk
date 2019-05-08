
# OrderReturn

### Description

The set of line items, service charges, taxes, discounts, tips, etc. being returned in an Order.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uid** | **String** | The return&#39;s Unique identifier, unique only within this order. This field is read-only. |  [optional]
**sourceOrderId** | **String** | Order which contains the original sale of these returned line items. This will be unset for unlinked returns. |  [optional]
**returnLineItems** | [**List&lt;OrderReturnLineItem&gt;**](OrderReturnLineItem.md) | Collection of line items which are being returned. |  [optional]
**returnTaxes** | [**List&lt;OrderReturnTax&gt;**](OrderReturnTax.md) | Collection of taxes which are being returned. |  [optional]
**returnDiscounts** | [**List&lt;OrderReturnDiscount&gt;**](OrderReturnDiscount.md) | Collection of discounts which are being returned. |  [optional]
**roundingAdjustment** | [**OrderRoundingAdjustment**](OrderRoundingAdjustment.md) | A positive or negative rounding adjustment to the total value being returned. Commonly used to apply Cash Rounding when the minimum unit of account is smaller than the lowest physical denomination of currency. |  [optional]
**returnAmounts** | [**OrderMoneyAmounts**](OrderMoneyAmounts.md) | Aggregate monetary value being returned by this Return entry. |  [optional]



