
# V1Timecard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The timecard&#39;s unique ID. |  [optional]
**employeeId** | **String** | The ID of the employee the timecard is associated with. | 
**deleted** | **Boolean** | If true, the timecard was deleted by the merchant, and it is no longer valid. |  [optional]
**clockinTime** | **String** | The clock-in time for the timecard, in ISO 8601 format. |  [optional]
**clockoutTime** | **String** | The clock-out time for the timecard, in ISO 8601 format. Provide this value only if importing timecard information from another system. |  [optional]
**clockinLocationId** | **String** | The ID of the location the employee clocked in from, if any. |  [optional]
**clockoutLocationId** | **String** | The ID of the location the employee clocked out from. Provide this value only if importing timecard information from another system. |  [optional]
**createdAt** | **String** | The time when the timecard was created, in ISO 8601 format. |  [optional]
**updatedAt** | **String** | The time when the timecard was most recently updated, in ISO 8601 format. |  [optional]



