
# V1ListOrdersRequest

### Description



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order** | [**OrderEnum**](#OrderEnum) | TThe order in which payments are listed in the response. See [SortOrder](#type-sortorder) for possible values |  [optional]
**limit** | **Integer** | The maximum number of payments to return in a single response. This value cannot exceed 200. |  [optional]
**batchToken** | **String** | A pagination cursor to retrieve the next set of results for your original query to the endpoint. |  [optional]


<a name="OrderEnum"></a>
## Enum: OrderEnum
Name | Value
---- | -----
DESC | &quot;DESC&quot;
ASC | &quot;ASC&quot;



