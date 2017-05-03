
# V1TimecardEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The event&#39;s unique ID. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The ID of the timecard to list events for. |  [optional]
**clockinTime** | **String** | The time the employee clocked in, in ISO 8601 format. |  [optional]
**clockoutTime** | **String** | The time the employee clocked out, in ISO 8601 format. |  [optional]
**createdAt** | **String** | The time when the event was created, in ISO 8601 format. |  [optional]


<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
API_CREATE | &quot;API_CREATE&quot;
API_EDIT | &quot;API_EDIT&quot;
API_DELETE | &quot;API_DELETE&quot;
REGISTER_CLOCKIN | &quot;REGISTER_CLOCKIN&quot;
REGISTER_CLOCKOUT | &quot;REGISTER_CLOCKOUT&quot;
DASHBOARD_SUPERVISOR_CLOSE | &quot;DASHBOARD_SUPERVISOR_CLOSE&quot;
DASHBOARD_EDIT | &quot;DASHBOARD_EDIT&quot;
DASHBOARD_DELETE | &quot;DASHBOARD_DELETE&quot;



