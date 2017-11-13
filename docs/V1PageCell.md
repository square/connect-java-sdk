
# V1PageCell

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pageId** | **String** | The unique identifier of the page the cell is included on. |  [optional]
**row** | **Integer** | The row of the cell. Always an integer between 0 and 4, inclusive. |  [optional]
**column** | **Integer** | The column of the cell. Always an integer between 0 and 4, inclusive. |  [optional]
**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) | The type of entity represented in the cell (ITEM, DISCOUNT, CATEGORY, or PLACEHOLDER). |  [optional]
**objectId** | **String** | The unique identifier of the entity represented in the cell. Not present for cells with an object_type of PLACEHOLDER. |  [optional]
**placeholderType** | [**PlaceholderTypeEnum**](#PlaceholderTypeEnum) | For a cell with an object_type of PLACEHOLDER, this value indicates the cell&#39;s special behavior. |  [optional]


<a name="ObjectTypeEnum"></a>
## Enum: ObjectTypeEnum
Name | Value
---- | -----
ITEM | &quot;ITEM&quot;
DISCOUNT | &quot;DISCOUNT&quot;
CATEGORY | &quot;CATEGORY&quot;
PLACEHOLDER | &quot;PLACEHOLDER&quot;


<a name="PlaceholderTypeEnum"></a>
## Enum: PlaceholderTypeEnum
Name | Value
---- | -----
ALL_ITEMS | &quot;ALL_ITEMS&quot;
DISCOUNTS_CATEGORY | &quot;DISCOUNTS_CATEGORY&quot;
REWARDS_FINDER | &quot;REWARDS_FINDER&quot;



