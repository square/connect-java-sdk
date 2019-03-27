
# Customer

### Description

Represents one of a business's customers, which can have one or more cards on file associated with it.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The customer&#39;s unique ID. | 
**createdAt** | **String** | The time when the customer was created, in RFC 3339 format. | 
**updatedAt** | **String** | The time when the customer was last updated, in RFC 3339 format. | 
**cards** | [**List&lt;Card&gt;**](Card.md) | The payment details of the customer&#39;s cards on file. |  [optional]
**givenName** | **String** | The customer&#39;s given (i.e., first) name. |  [optional]
**familyName** | **String** | The customer&#39;s family (i.e., last) name. |  [optional]
**nickname** | **String** | The customer&#39;s nickname. |  [optional]
**companyName** | **String** | The name of the customer&#39;s company. |  [optional]
**emailAddress** | **String** | The customer&#39;s email address. |  [optional]
**address** | [**Address**](Address.md) | The customer&#39;s physical address. |  [optional]
**phoneNumber** | **String** | The customer&#39;s phone number. |  [optional]
**birthday** | **String** | The customer&#39;s birthday in RFC-3339 format. Year is optional, timezone and times are not allowed. Example: &#x60;0000-09-01T00:00:00-00:00&#x60; for a birthday on September 1st. &#x60;1998-09-01T00:00:00-00:00&#x60; for a birthday on September 1st 1998. |  [optional]
**referenceId** | **String** | A second ID you can set to associate the customer with an entity in another system. |  [optional]
**note** | **String** | A note to associate with the customer. |  [optional]
**preferences** | [**CustomerPreferences**](CustomerPreferences.md) | The customer&#39;s preferences. |  [optional]
**groups** | [**List&lt;CustomerGroupInfo&gt;**](CustomerGroupInfo.md) | The groups the customer belongs to. |  [optional]
**creationSource** | [**CreationSourceEnum**](#CreationSourceEnum) | A creation source represents the method used to create the customer profile. See [CustomerCreationSource](#type-customercreationsource) for possible values |  [optional]


<a name="CreationSourceEnum"></a>
## Enum: CreationSourceEnum
Name | Value
---- | -----
OTHER | &quot;OTHER&quot;
APPOINTMENTS | &quot;APPOINTMENTS&quot;
COUPON | &quot;COUPON&quot;
DELETION_RECOVERY | &quot;DELETION_RECOVERY&quot;
DIRECTORY | &quot;DIRECTORY&quot;
EGIFTING | &quot;EGIFTING&quot;
EMAIL_COLLECTION | &quot;EMAIL_COLLECTION&quot;
FEEDBACK | &quot;FEEDBACK&quot;
IMPORT | &quot;IMPORT&quot;
INVOICES | &quot;INVOICES&quot;
LOYALTY | &quot;LOYALTY&quot;
MARKETING | &quot;MARKETING&quot;
MERGE | &quot;MERGE&quot;
ONLINE_STORE | &quot;ONLINE_STORE&quot;
INSTANT_PROFILE | &quot;INSTANT_PROFILE&quot;
TERMINAL | &quot;TERMINAL&quot;
THIRD_PARTY | &quot;THIRD_PARTY&quot;
THIRD_PARTY_IMPORT | &quot;THIRD_PARTY_IMPORT&quot;
UNMERGE_RECOVERY | &quot;UNMERGE_RECOVERY&quot;



