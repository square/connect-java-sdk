
# CardPaymentDetails

### Description

Reflects the current status of a card payment.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The card payment&#39;s current state. It can be one of: &#x60;AUTHORIZED&#x60;, &#x60;CAPTURED&#x60;, &#x60;VOIDED&#x60;, &#x60;FAILED&#x60;. |  [optional]
**card** | [**Card**](Card.md) | The credit card&#39;s non-confidential details. |  [optional]
**entryMethod** | **String** | The method used to enter the card&#39;s details for the payment.  Can be &#x60;KEYED&#x60;, &#x60;SWIPED&#x60;, &#x60;EMV&#x60;, &#x60;ON_FILE&#x60;, or &#x60;CONTACTLESS&#x60;. |  [optional]
**cvvStatus** | **String** | Status code returned from the Card Verification Value (CVV) check. Can be &#x60;CVV_ACCEPTED&#x60;, &#x60;CVV_REJECTED&#x60;, &#x60;CVV_NOT_CHECKED&#x60;. |  [optional]
**avsStatus** | **String** | Status code returned from the Address Verification System (AVS) check. Can be &#x60;AVS_ACCEPTED&#x60;, &#x60;AVS_REJECTED&#x60;, &#x60;AVS_NOT_CHECKED&#x60;. |  [optional]
**authResultCode** | **String** | Status code returned by the card issuer that describes the payment&#39;s authorization status. |  [optional]
**applicationIdentifier** | **String** | For EMV payments, identifies the EMV application used for the payment. |  [optional]
**applicationName** | **String** | For EMV payments, the human-readable name of the EMV application used for the payment. |  [optional]
**applicationCryptogram** | **String** | For EMV payments, the cryptogram generated for the payment. |  [optional]
**verificationMethod** | **String** | For EMV payments, method used to verify the cardholder&#39;s identity.  Can be one of &#x60;PIN&#x60;, &#x60;SIGNATURE&#x60;, &#x60;PIN_AND_SIGNATURE&#x60;, &#x60;ON_DEVICE&#x60;, or &#x60;NONE&#x60;. |  [optional]
**verificationResults** | **String** | For EMV payments, the results of the cardholder verification.  Can be one of &#x60;SUCCESS&#x60;, &#x60;FAILURE&#x60;, or &#x60;UNKNOWN&#x60;. |  [optional]
**statementDescription** | **String** | The statement description sent to the card networks.  Note: The actual statement description will vary and is likely to be truncated and appended with additional information on a per issuer basis. |  [optional]
**errors** | [**List&lt;Error&gt;**](Error.md) | Information on errors encountered during the request. |  [optional]



