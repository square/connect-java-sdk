
# V1Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The payment&#39;s unique identifier. |  [optional]
**merchantId** | **String** | The unique identifier of the merchant that took the payment. |  [optional]
**createdAt** | **String** | The time when the payment was created, in ISO 8601 format. |  [optional]
**creatorId** | **Boolean** | The unique identifier of the Square account that took the payment. |  [optional]
**device** | [**Device**](Device.md) | The device that took the payment. |  [optional]
**paymentUrl** | **String** | The URL of the payment&#39;s detail page in the merchant dashboard. The merchant must be signed in to the merchant dashboard to view this page. |  [optional]
**receiptUrl** | **String** | The URL of the receipt for the payment. Note that for split tender payments, this URL corresponds to the receipt for the first tender listed in the payment&#39;s tender field. Each Tender object has its own receipt_url field you can use to get the other receipts associated with a split tender payment. |  [optional]
**inclusiveTaxMoney** | [**V1Money**](V1Money.md) | The sum of all inclusive taxes associated with the payment. |  [optional]
**additiveTaxMoney** | [**V1Money**](V1Money.md) | The sum of all additive taxes associated with the payment. |  [optional]
**taxMoney** | [**V1Money**](V1Money.md) | The total of all taxes applied to the payment. This is always the sum of inclusive_tax_money and additive_tax_money. |  [optional]
**tipMoney** | [**V1Money**](V1Money.md) | The total of all tips applied to the payment. |  [optional]
**discountMoney** | [**V1Money**](V1Money.md) | The total of all discounts applied to the payment. |  [optional]
**totalCollectedMoney** | [**V1Money**](V1Money.md) | The total of all discounts applied to the payment. |  [optional]
**processingFeeMoney** | [**V1Money**](V1Money.md) | The total of all processing fees collected by Square for the payment. |  [optional]
**netTotalMoney** | [**V1Money**](V1Money.md) | The amount to be deposited into the merchant&#39;s bank account for the payment. |  [optional]
**refundedMoney** | [**V1Money**](V1Money.md) | The total of all refunds applied to the payment. |  [optional]
**swedishRoundingMoney** | [**V1Money**](V1Money.md) |  |  [optional]
**grossSalesMoney** | [**V1Money**](V1Money.md) |  |  [optional]
**netSalesMoney** | [**V1Money**](V1Money.md) |  |  [optional]
**inclusiveTax** | [**List&lt;V1PaymentTax&gt;**](V1PaymentTax.md) | All of the inclusive taxes associated with the payment. |  [optional]
**additiveTax** | [**List&lt;V1PaymentTax&gt;**](V1PaymentTax.md) | All of the additive taxes associated with the payment. |  [optional]
**tender** | [**List&lt;V1Tender&gt;**](V1Tender.md) | All of the additive taxes associated with the payment. |  [optional]
**refunds** | [**List&lt;V1Refund&gt;**](V1Refund.md) | All of the refunds applied to the payment. |  [optional]
**itemizations** | [**List&lt;V1PaymentItemization&gt;**](V1PaymentItemization.md) | The items purchased in the payment. |  [optional]



