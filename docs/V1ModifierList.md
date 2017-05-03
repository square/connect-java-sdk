
# V1ModifierList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The modifier list&#39;s unique ID. |  [optional]
**name** | **String** | The modifier list&#39;s name. |  [optional]
**selectionType** | [**SelectionTypeEnum**](#SelectionTypeEnum) | Indicates whether MULTIPLE options or a SINGLE option from the modifier list can be applied to a single item. |  [optional]
**modifierOptions** | [**List&lt;V1ModifierOption&gt;**](V1ModifierOption.md) | The options included in the modifier list. |  [optional]


<a name="SelectionTypeEnum"></a>
## Enum: SelectionTypeEnum
Name | Value
---- | -----
SINGLE | &quot;SINGLE&quot;
MULTIPLE | &quot;MULTIPLE&quot;



