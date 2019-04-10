
# RegisterDomainResponse

### Description

Defines the fields that are included in the response body of a request to the RegisterDomain endpoint.  Either `errors` or `status` will be present in a given response (never both).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;Error&gt;**](Error.md) | Any errors that occurred during the request. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the domain registration. See [RegisterDomainResponseStatus](#type-registerdomainresponsestatus) for possible values |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
VERIFIED | &quot;VERIFIED&quot;



