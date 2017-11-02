
# ListAdditionalRecipientReceivablesResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;Error&gt;**](Error.md) | Any errors that occurred during the request. |  [optional]
**receivables** | [**List&lt;AdditionalRecipientReceivable&gt;**](AdditionalRecipientReceivable.md) | An array of AdditionalRecipientReceivables that match your query. |  [optional]
**cursor** | **String** | A pagination cursor for retrieving the next set of results, if any remain. Provide this value as the &#x60;cursor&#x60; parameter in a subsequent request to this endpoint.  See [Paginating results](#paginatingresults) for more information. |  [optional]



