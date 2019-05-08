
# BusinessHoursPeriod

### Description

 Represents a period of time during which a business location is open.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dayOfWeek** | [**DayOfWeekEnum**](#DayOfWeekEnum) | The day of week for this time period. See [DayOfWeek](#type-dayofweek) for possible values |  [optional]
**startLocalTime** | **String** | The start time of a business hours period, specified in local time using partial-time RFC3339 format. |  [optional]
**endLocalTime** | **String** | The end time of a business hours period, specified in local time using partial-time RFC3339 format. |  [optional]


<a name="DayOfWeekEnum"></a>
## Enum: DayOfWeekEnum
Name | Value
---- | -----
SUN | &quot;SUN&quot;
MON | &quot;MON&quot;
TUE | &quot;TUE&quot;
WED | &quot;WED&quot;
THU | &quot;THU&quot;
FRI | &quot;FRI&quot;
SAT | &quot;SAT&quot;



