
# CustomerSort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**FieldEnum**](#FieldEnum) | The field to sort the results on. It could be the total money spent at the merchant, the date of the first visit (etc).  Default value: &#x60;DEFAULT&#x60;. |  [optional]
**order** | [**OrderEnum**](#OrderEnum) | Indicates the order in which results should be displayed based on the value of the sort field. String comparisons use standard alphabetic comparison to determine order. Strings representing numbers are sorted as strings. Default value: &#x60;ASC&#x60;. |  [optional]


<a name="FieldEnum"></a>
## Enum: FieldEnum
Name | Value
---- | -----
DEFAULT | &quot;DEFAULT&quot;
CREATED_AT | &quot;CREATED_AT&quot;


<a name="OrderEnum"></a>
## Enum: OrderEnum
Name | Value
---- | -----
DESC | &quot;DESC&quot;
ASC | &quot;ASC&quot;



