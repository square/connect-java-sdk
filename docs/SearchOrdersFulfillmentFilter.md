
# SearchOrdersFulfillmentFilter

### Description

Filter based on [Order Fulfillment](#type-orderfulfillment) information.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fulfillmentTypes** | [**List&lt;FulfillmentTypesEnum&gt;**](#List&lt;FulfillmentTypesEnum&gt;) | List of [fulfillment types](#type-orderfulfillmenttype) to filter for. Will return orders if any of its fulfillments match any of the fulfillment types listed in this field. See [OrderFulfillmentType](#type-orderfulfillmenttype) for possible values | 
**fulfillmentStates** | [**List&lt;FulfillmentStatesEnum&gt;**](#List&lt;FulfillmentStatesEnum&gt;) | List of [fulfillment states](#type-orderfulfillmentstate) to filter for. Will return orders if any of its fulfillments match any of the fulfillment states listed in this field. See [OrderFulfillmentState](#type-orderfulfillmentstate) for possible values |  [optional]


<a name="List<FulfillmentTypesEnum>"></a>
## Enum: List&lt;FulfillmentTypesEnum&gt;
Name | Value
---- | -----
PICKUP | &quot;PICKUP&quot;


<a name="List<FulfillmentStatesEnum>"></a>
## Enum: List&lt;FulfillmentStatesEnum&gt;
Name | Value
---- | -----
PROPOSED | &quot;PROPOSED&quot;
RESERVED | &quot;RESERVED&quot;
PREPARED | &quot;PREPARED&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELED | &quot;CANCELED&quot;
FAILED | &quot;FAILED&quot;



