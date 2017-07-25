
# Location

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The location&#39;s unique ID. |  [optional]
**name** | **String** | The location&#39;s name. |  [optional]
**address** | [**Address**](Address.md) | The location&#39;s physical address. |  [optional]
**timezone** | **String** | The [IANA Timezone Database](https://www.iana.org/time-zones) identifier for the location&#39;s timezone. |  [optional]
**capabilities** | [**List&lt;CapabilitiesEnum&gt;**](#List&lt;CapabilitiesEnum&gt;) | Indicates which Square features are enabled for the location.  See [LocationCapability](#type-locationcapability) for possible values. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The location&#39;s status  See [LocationStatus](#type-locationstatus) for possible values. |  [optional]


<a name="List<CapabilitiesEnum>"></a>
## Enum: List&lt;CapabilitiesEnum&gt;
Name | Value
---- | -----
PROCESSING | &quot;CREDIT_CARD_PROCESSING&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;



