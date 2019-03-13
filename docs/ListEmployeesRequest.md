
# ListEmployeesRequest

### Description

Retrieve a paged-list of employees for a Square account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationId** | **String** | Filter employees returned to only those that are associated with the specified location. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Specifies the EmployeeStatus to filter the employee by. |  [optional]
**limit** | **Integer** | The number of employees to be returned on each page. |  [optional]
**cursor** | **String** | The token required to retrieve the specified page of results. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;



