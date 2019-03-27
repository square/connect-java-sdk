
# CustomerCreationSourceFilter

### Description

Creation source filter.  If one or more creation sources are set, customer profiles are included in, or excluded from, the result if they match at least one of the filter criteria.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;ValuesEnum&gt;**](#List&lt;ValuesEnum&gt;) | The list of creation sources used as filtering criteria. See [CustomerCreationSource](#type-customercreationsource) for possible values |  [optional]
**rule** | [**RuleEnum**](#RuleEnum) | Indicates whether a customer profile matching the filter criteria should be included in the result or excluded from the result. Default: &#x60;INCLUDE&#x60;. See [CustomerInclusionExclusion](#type-customerinclusionexclusion) for possible values |  [optional]


<a name="List<ValuesEnum>"></a>
## Enum: List&lt;ValuesEnum&gt;
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


<a name="RuleEnum"></a>
## Enum: RuleEnum
Name | Value
---- | -----
INCLUDE | &quot;INCLUDE&quot;
EXCLUDE | &quot;EXCLUDE&quot;



