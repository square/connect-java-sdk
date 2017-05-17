
# V1Item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The item&#39;s ID. Must be unique among all entity IDs ever provided on behalf of the merchant. You can never reuse an ID. This value can include alphanumeric characters, dashes (-), and underscores (_). |  [optional]
**name** | **String** | The item&#39;s name. |  [optional]
**description** | **String** | The item&#39;s description. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The item&#39;s type. This value is NORMAL for almost all items. |  [optional]
**color** | [**ColorEnum**](#ColorEnum) | The color of the discount&#39;s display label in Square Register, if not the default color. The default color is 9da2a6. |  [optional]
**abbreviation** | **String** | The text of the item&#39;s display label in Square Register. Only up to the first five characters of the string are used. |  [optional]
**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Indicates whether the item is viewable from the merchant&#39;s online store (PUBLIC) or PRIVATE. |  [optional]
**availableOnline** | **Boolean** | If true, the item can be added to shipping orders from the merchant&#39;s online store. |  [optional]
**masterImage** | [**V1ItemImage**](V1ItemImage.md) | The item&#39;s master image, if any. |  [optional]
**category** | [**V1Category**](V1Category.md) | The category the item belongs to, if any. |  [optional]
**variations** | [**List&lt;V1Variation&gt;**](V1Variation.md) | The item&#39;s variations. You must specify at least one variation. |  [optional]
**modifierLists** | [**List&lt;V1Variation&gt;**](V1Variation.md) | The modifier lists that apply to the item, if any. |  [optional]
**fees** | [**List&lt;V1Fee&gt;**](V1Fee.md) | The fees that apply to the item, if any. |  [optional]
**taxable** | **Boolean** | Deprecated. This field is not used. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NORMAL | &quot;NORMAL&quot;
GIFT_CARD | &quot;GIFT_CARD&quot;
OTHER | &quot;OTHER&quot;


<a name="ColorEnum"></a>
## Enum: ColorEnum
Name | Value
---- | -----
_9DA2A6 | &quot;9da2a6&quot;
_4AB200 | &quot;4ab200&quot;
_0B8000 | &quot;0b8000&quot;
_2952CC | &quot;2952cc&quot;
A82EE5 | &quot;a82ee5&quot;
E5457A | &quot;e5457a&quot;
B21212 | &quot;b21212&quot;
_593C00 | &quot;593c00&quot;
E5BF00 | &quot;e5BF00&quot;


<a name="VisibilityEnum"></a>
## Enum: VisibilityEnum
Name | Value
---- | -----
PUBLIC | &quot;PUBLIC&quot;
PRIVATE | &quot;PRIVATE&quot;



