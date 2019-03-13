
# WorkweekConfig

### Description

Sets the Day of the week and hour of the day that a business starts a  work week. Used for the calculation of overtime pay.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | UUID for this object |  [optional]
**startOfWeek** | [**StartOfWeekEnum**](#StartOfWeekEnum) | The day of the week on which a business week cuts over for compensation purposes. | 
**startOfDayLocalTime** | **String** | The local time at which a business week cuts over. Represented as a string in &#x60;HH:MM&#x60; format (&#x60;HH:MM:SS&#x60; is also accepted, but seconds are truncated). | 
**version** | **Integer** | Used for resolving concurrency issues; request will fail if version provided does not match server version at time of request. If not provided, Square executes a blind write; potentially overwriting data from another write. |  [optional]
**createdAt** | **String** | A read-only timestamp in RFC 3339 format; presented in UTC |  [optional]
**updatedAt** | **String** | A read-only timestamp in RFC 3339 format; presented in UTC |  [optional]


<a name="StartOfWeekEnum"></a>
## Enum: StartOfWeekEnum
Name | Value
---- | -----
MON | &quot;MON&quot;
TUE | &quot;TUE&quot;
WED | &quot;WED&quot;
THU | &quot;THU&quot;
FRI | &quot;FRI&quot;
SAT | &quot;SAT&quot;
SUN | &quot;SUN&quot;



