
# SearchOrdersSort

### Description

Sorting options for a query. Returned Orders will always be sorted on a timestamp.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sortField** | [**SortFieldEnum**](#SortFieldEnum) | The field to sort by.  __Important:__ When using a [DateTimeFilter](#type-searchordersfilter), &#x60;sort_field&#x60; must match the set time range field. If this field does not match the time range field in &#x60;DateTimeFilter&#x60;, SearchOrder will return an error.  Default: &#x60;CREATED_AT&#x60;. See [SearchOrdersSortField](#type-searchorderssortfield) for possible values | 
**sortOrder** | [**SortOrderEnum**](#SortOrderEnum) | The order in which results are returned. Defaults to &#x60;DESC&#x60;. See [SortOrder](#type-sortorder) for possible values |  [optional]


<a name="SortFieldEnum"></a>
## Enum: SortFieldEnum
Name | Value
---- | -----
CREATED_AT | &quot;CREATED_AT&quot;
UPDATED_AT | &quot;UPDATED_AT&quot;
CLOSED_AT | &quot;CLOSED_AT&quot;


<a name="SortOrderEnum"></a>
## Enum: SortOrderEnum
Name | Value
---- | -----
DESC | &quot;DESC&quot;
ASC | &quot;ASC&quot;



