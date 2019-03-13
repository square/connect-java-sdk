
# ListCustomersRequest

### Description

Defines the query parameters that can be provided in a request to the [ListCustomers](#endpoint-listcustomers) endpoint.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cursor** | **String** | A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.  See [Pagination](/basics/api101/pagination) for more information. |  [optional]
**sortField** | [**SortFieldEnum**](#SortFieldEnum) | Indicates how Customers should be sorted. Default: &#x60;DEFAULT&#x60;. See [CustomerSortField](#type-customersortfield) for possible values. |  [optional]
**sortOrder** | [**SortOrderEnum**](#SortOrderEnum) | Indicates whether Customers should be sorted in ascending (&#x60;ASC&#x60;) or descending (&#x60;DESC&#x60;) order. Default: &#x60;ASC&#x60;. See [SortOrder](#type-sortorder) for possible values. |  [optional]


<a name="SortFieldEnum"></a>
## Enum: SortFieldEnum
Name | Value
---- | -----
DEFAULT | &quot;DEFAULT&quot;
CREATED_AT | &quot;CREATED_AT&quot;


<a name="SortOrderEnum"></a>
## Enum: SortOrderEnum
Name | Value
---- | -----
DESC | &quot;DESC&quot;
ASC | &quot;ASC&quot;



