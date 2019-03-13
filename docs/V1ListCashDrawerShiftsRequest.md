
# V1ListCashDrawerShiftsRequest

### Description



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order** | [**OrderEnum**](#OrderEnum) | The order in which cash drawer shifts are listed in the response, based on their created_at field. Default value: ASC See [SortOrder](#type-sortorder) for possible values |  [optional]
**beginTime** | **String** | The beginning of the requested reporting period, in ISO 8601 format. Default value: The current time minus 90 days. |  [optional]
**endTime** | **String** | The beginning of the requested reporting period, in ISO 8601 format. Default value: The current time. |  [optional]


<a name="OrderEnum"></a>
## Enum: OrderEnum
Name | Value
---- | -----
DESC | &quot;DESC&quot;
ASC | &quot;ASC&quot;



