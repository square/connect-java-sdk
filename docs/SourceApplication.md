
# SourceApplication

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product** | [**ProductEnum**](#ProductEnum) | Read-only [Product](#type-product) type for the application. |  [optional]
**applicationId** | **String** | Read-only Square ID assigned to the application. Only used for [Product](#type-product) type &#x60;EXTERNAL_API&#x60;. |  [optional]
**name** | **String** | Read-only display name assigned to the application (e.g. &#x60;\&quot;Custom Application\&quot;&#x60;, &#x60;\&quot;Square POS 4.74 for Android\&quot;&#x60;). |  [optional]


<a name="ProductEnum"></a>
## Enum: ProductEnum
Name | Value
---- | -----
SQUARE_POS | &quot;SQUARE_POS&quot;
EXTERNAL_API | &quot;EXTERNAL_API&quot;
BILLING | &quot;BILLING&quot;
APPOINTMENTS | &quot;APPOINTMENTS&quot;
INVOICES | &quot;INVOICES&quot;
ONLINE_STORE | &quot;ONLINE_STORE&quot;
PAYROLL | &quot;PAYROLL&quot;
DASHBOARD | &quot;DASHBOARD&quot;
ITEM_LIBRARY_IMPORT | &quot;ITEM_LIBRARY_IMPORT&quot;
OTHER | &quot;OTHER&quot;



