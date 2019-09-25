
# SearchOrdersResponse

### Description

Only one of `order_entries` or `orders` fields will be set, depending on whether `return_entries` was set on the [SearchOrdersRequest](#type-searchorderrequest).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderEntries** | [**List&lt;OrderEntry&gt;**](OrderEntry.md) | List of &#x60;OrderEntries&#x60; that fit the query conditions. Populated only if &#x60;return_entries&#x60; was set to &#x60;true&#x60; in the request. |  [optional]
**orders** | [**List&lt;Order&gt;**](Order.md) | List of &#x60;Order&#x60; objects that match query conditions. Populated only if &#x60;return_entries&#x60; in the request is set to &#x60;false&#x60;. |  [optional]
**cursor** | **String** | The pagination cursor to be used in a subsequent request. If unset, this is the final response. See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information. |  [optional]
**errors** | [**List&lt;Error&gt;**](Error.md) | &#x60;Errors&#x60; encountered during the search. |  [optional]



