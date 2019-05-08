
# SearchOrdersFilter

### Description

Filter options to use for a query. Multiple filters will be ANDed together.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stateFilter** | [**SearchOrdersStateFilter**](SearchOrdersStateFilter.md) | Filter by [&#x60;OrderState&#x60;](#type-orderstate). |  [optional]
**dateTimeFilter** | [**SearchOrdersDateTimeFilter**](SearchOrdersDateTimeFilter.md) | Filter for results within a time range. |  [optional]
**fulfillmentFilter** | [**SearchOrdersFulfillmentFilter**](SearchOrdersFulfillmentFilter.md) | Filter by fulfillment type or state. |  [optional]
**sourceFilter** | [**SearchOrdersSourceFilter**](SearchOrdersSourceFilter.md) | Filter by source of order. |  [optional]
**customerFilter** | [**SearchOrdersCustomerFilter**](SearchOrdersCustomerFilter.md) | Filter by customers associated with the order. |  [optional]



