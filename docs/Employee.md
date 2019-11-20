
# Employee

### Description

An employee object that is used by the external API.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | UUID for this object. |  [optional]
**firstName** | **String** | The employee&#39;s first name. |  [optional]
**lastName** | **String** | The employee&#39;s last name. |  [optional]
**email** | **String** | The employee&#39;s email address |  [optional]
**phoneNumber** | **String** | The employee&#39;s phone number in E.164 format, i.e. \&quot;+12125554250\&quot; |  [optional]
**locationIds** | **List&lt;String&gt;** | A list of location IDs where this employee has access to. |  [optional]
**status** | **String** | Specifies the status of the employees being fetched. See [EmployeeStatus](#type-employeestatus) for possible values |  [optional]
**createdAt** | **String** | A read-only timestamp in RFC 3339 format. |  [optional]
**updatedAt** | **String** | A read-only timestamp in RFC 3339 format. |  [optional]



