
# V1OrderHistoryEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | The type of action performed on the order. |  [optional]
**createdAt** | **String** | The time when the action was performed, in ISO 8601 format. |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
ORDER_PLACED | &quot;ORDER_PLACED&quot;
DECLINED | &quot;DECLINED&quot;
PAYMENT_RECEIVED | &quot;PAYMENT_RECEIVED&quot;
CANCELED | &quot;CANCELED&quot;
COMPLETED | &quot;COMPLETED&quot;
REFUNDED | &quot;REFUNDED&quot;
EXPIRED | &quot;EXPIRED&quot;



