
# CatalogItemOption

### Description

A group of variations for a [CatalogItem](#type-catalogitem)'s.
**Note: This model is in beta.**

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The item option&#39;s display name for the seller. Must be unique across all item options. Searchable. |  [optional]
**displayName** | **String** | The item option&#39;s display name for the customer. Searchable. |  [optional]
**description** | **String** | The item option&#39;s human-readable description. Displays for in the Square Point of Sale app for the seller and in the Online Store or on receipts for the buyer. |  [optional]
**showColors** | **Boolean** | If true, display colors for entries in &#x60;values&#x60; when present. |  [optional]
**values** | [**List&lt;CatalogObject&gt;**](CatalogObject.md) | A list of &#x60;CatalogObject&#x60;s containing the &#x60;CatalogItemOptionValue&#x60;s for this item. |  [optional]
**itemCount** | **Long** | The number of &#x60;CatalogItem&#x60;s currently associated with this item option. Present only if the &#x60;include_counts&#x60; was specified in the request. Any count over 100 will be returned as &#x60;100&#x60;. |  [optional]



