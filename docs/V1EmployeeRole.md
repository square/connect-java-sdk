
# V1EmployeeRole

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The role&#39;s unique ID, Can only be set by Square. |  [optional]
**name** | **String** | The role&#39;s merchant-defined name. | 
**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | The role&#39;s permissions. | 
**isOwner** | **Boolean** | If true, employees with this role have all permissions, regardless of the values indicated in permissions. |  [optional]
**createdAt** | **String** | The time when the employee entity was created, in ISO 8601 format. Is set by Square when the Role is created. |  [optional]
**updatedAt** | **String** | The time when the employee entity was most recently updated, in ISO 8601 format. Is set by Square when the Role updated. |  [optional]


<a name="List<PermissionsEnum>"></a>
## Enum: List&lt;PermissionsEnum&gt;
Name | Value
---- | -----
ACCESS_SALES_HISTORY | &quot;REGISTER_ACCESS_SALES_HISTORY&quot;
APPLY_RESTRICTED_DISCOUNTS | &quot;REGISTER_APPLY_RESTRICTED_DISCOUNTS&quot;
CHANGE_SETTINGS | &quot;REGISTER_CHANGE_SETTINGS&quot;
EDIT_ITEM | &quot;REGISTER_EDIT_ITEM&quot;
ISSUE_REFUNDS | &quot;REGISTER_ISSUE_REFUNDS&quot;
OPEN_CASH_DRAWER_OUTSIDE_SALE | &quot;REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE&quot;
VIEW_SUMMARY_REPORTS | &quot;REGISTER_VIEW_SUMMARY_REPORTS&quot;



