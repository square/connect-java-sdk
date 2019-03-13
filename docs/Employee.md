
# Employee

### Description

An employee created in the **Square Dashboard** account of a business.  Used by the Labor API.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | UUID for this &#x60;Employee&#x60;. |  [optional]
**firstName** | **String** | Given (first) name of the employee. |  [optional]
**lastName** | **String** | Family (last) name of the employee |  [optional]
**locationIds** | **List&lt;String&gt;** | A list of location IDs where this employee has access. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of the employee being fetched. |  [optional]
**createdAt** | **String** | A read-only timestamp in RFC 3339 format. |  [optional]
**updatedAt** | **String** | A read-only timestamp in RFC 3339 format. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;



