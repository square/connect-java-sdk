
# CatalogQuerySortedAttribute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | The attribute whose value should be used as the sort key. | 
**initialAttributeValue** | **String** | The first attribute value to be returned by the query. Ascending sorts will return only objects with this value or greater, while descending sorts will return only objects with this value or less. If unset, start at the beginning (for ascending sorts) or end (for descending sorts). |  [optional]
**sortOrder** | [**SortOrderEnum**](#SortOrderEnum) | The desired [SortOrder](#type-sortorder), &#x60;\&quot;ASC\&quot;&#x60; (ascending) or &#x60;\&quot;DESC\&quot;&#x60; (descending). |  [optional]


<a name="SortOrderEnum"></a>
## Enum: SortOrderEnum
Name | Value
---- | -----
DESC | &quot;DESC&quot;
ASC | &quot;ASC&quot;



