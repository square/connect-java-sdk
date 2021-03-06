
# CatalogQuery

### Description

A query to be applied to a `SearchCatalogObjectsRequest`. Only one query field may be present.  Where an attribute name is required, it should be specified as the name of any field marked \"searchable\" from the structured data types for the desired result object type(s) (`CatalogItem`, `CatalogItemVariation`, `CatalogCategory`, `CatalogTax`, `CatalogDiscount`, `CatalogModifierList`, `CatalogModifier`).  For example, a query that should return Items may specify attribute names from any of the searchable fields of the `CatalogItem` data type, namely `\"name\"`, `\"description\"`, and `\"abbreviation\"`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sortedAttributeQuery** | [**CatalogQuerySortedAttribute**](CatalogQuerySortedAttribute.md) | A query that returns all objects, sorted by the given attribute. |  [optional]
**exactQuery** | [**CatalogQueryExact**](CatalogQueryExact.md) | A query that returns only objects for which the given (string-valued) attribute has the given case-insensitive value. |  [optional]
**prefixQuery** | [**CatalogQueryPrefix**](CatalogQueryPrefix.md) | A query that returns only objects for which the given (string-valued) attribute has the given case-insensitive prefix. |  [optional]
**rangeQuery** | [**CatalogQueryRange**](CatalogQueryRange.md) | A query that returns only objects for which the given (integer-valued) attribute lies in the given range. |  [optional]
**textQuery** | [**CatalogQueryText**](CatalogQueryText.md) | A query that returns only objects whose searchable attributes contain all of the given keywords as prefixes. For example, if a &#x60;CatalogItem&#x60; contains attributes &#x60;{\&quot;name\&quot;: \&quot;t-shirt\&quot;}&#x60; and &#x60;{\&quot;description\&quot;: \&quot;Small, Purple\&quot;}&#x60;, it will be matched by the query &#x60;{\&quot;keywords\&quot;: [\&quot;shirt\&quot;, \&quot;sma\&quot;, \&quot;purp\&quot;]}&#x60;. |  [optional]
**itemsForTaxQuery** | [**CatalogQueryItemsForTax**](CatalogQueryItemsForTax.md) | A query that returns all &#x60;CatalogItem&#x60;s that have any of the given &#x60;CatalogTax&#x60;es enabled. |  [optional]
**itemsForModifierListQuery** | [**CatalogQueryItemsForModifierList**](CatalogQueryItemsForModifierList.md) | A query that returns all &#x60;CatalogItem&#x60;s that have any of the given &#x60;CatalogModifierList&#x60;s enabled. |  [optional]
**itemsForItemOptionsQuery** | [**CatalogQueryItemsForItemOptions**](CatalogQueryItemsForItemOptions.md) | A query that returns all &#x60;CatalogItem&#x60;s that have all of the given &#x60;CatalogItemOption&#x60;s. |  [optional]
**itemVariationsForItemOptionValuesQuery** | [**CatalogQueryItemVariationsForItemOptionValues**](CatalogQueryItemVariationsForItemOptionValues.md) | A query that returns all &#x60;CatalogItemVariation&#x60;s that have all of the given &#x60;CatalogItemOption&#x60; values. |  [optional]



