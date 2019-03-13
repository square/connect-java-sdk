
# ShiftWorkday

### Description

A `Shift` search query filter parameter that sets a range of days that  a `Shift` must start or end in before passing the filter condition.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateRange** | [**DateRange**](DateRange.md) | Dates for fetching the shifts |  [optional]
**matchShiftsBy** | [**MatchShiftsByEnum**](#MatchShiftsByEnum) | The strategy on which the dates are applied. |  [optional]
**defaultTimezone** | **String** | Location-specific timezones convert workdays to datetime filters. Every location included in the query must have a timezone, or this field must be provided as a fallback. Format: the IANA timezone database identifier for the relevant timezone. |  [optional]


<a name="MatchShiftsByEnum"></a>
## Enum: MatchShiftsByEnum
Name | Value
---- | -----
START_AT | &quot;START_AT&quot;
END_AT | &quot;END_AT&quot;
INTERSECTION | &quot;INTERSECTION&quot;



