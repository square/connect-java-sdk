
# Location

### Description



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Square-issued ID of the location. |  [optional]
**name** | **String** | The name of the location. This information appears in the dashboard as the nickname. |  [optional]
**address** | [**Address**](Address.md) | The physical address of the location. |  [optional]
**timezone** | **String** | The [IANA Timezone](https://www.iana.org/time-zones) identifier for the timezone of the location. |  [optional]
**capabilities** | **List&lt;String&gt;** | The Square features that are enabled for the location. See &#x60;LocationCapability&#x60; for possible values. See [LocationCapability](#type-locationcapability) for possible values |  [optional]
**status** | **String** | The status of the location, either active or inactive. See [LocationStatus](#type-locationstatus) for possible values |  [optional]
**createdAt** | **String** | The time when the location was created, in RFC 3339 format. |  [optional]
**merchantId** | **String** | The ID of the merchant that owns the location. |  [optional]
**country** | **String** | The country of the location, in ISO 3166-1-alpha-2 format.  See &#x60;Country&#x60; for possible values. See [Country](#type-country) for possible values |  [optional]
**languageCode** | **String** | The language associated with the location, in [BCP 47 format](https://tools.ietf.org/html/bcp47#appendix-A). |  [optional]
**currency** | **String** | The currency used for all transactions at this location, in ISO 4217 format. See &#x60;Currency&#x60; for possible values. See [Currency](#type-currency) for possible values |  [optional]
**phoneNumber** | **String** | The phone number of the location in human readable format. |  [optional]
**businessName** | **String** | The business name of the location This is the name visible to the customers of the location. For example, this name appears on customer receipts. |  [optional]
**type** | **String** | The type of the location, either physical or mobile. See [LocationType](#type-locationtype) for possible values |  [optional]
**websiteUrl** | **String** | The website URL of the location. |  [optional]
**businessHours** | [**BusinessHours**](BusinessHours.md) |  Represents the hours of operation for the location. |  [optional]
**businessEmail** | **String** | The email of the location. This email is visible to the customers of the location. For example, the email appears on customer receipts. |  [optional]
**description** | **String** | The description of the location. |  [optional]
**twitterUsername** | **String** | The Twitter username of the location without the &#39;&amp;#64;&#39; symbol. |  [optional]
**instagramUsername** | **String** | The Instagram username of the location without the &#39;&amp;#64;&#39; symbol. |  [optional]
**facebookUrl** | **String** | The Facebook profile URL of the location. The URL should begin with &#39;facebook.com/&#39;. |  [optional]
**coordinates** | [**Coordinates**](Coordinates.md) | The physical coordinates (latitude and longitude) of the location. |  [optional]
**logoUrl** | **String** | The URL of the logo image for the location. |  [optional]
**posBackgroundUrl** | **String** | The URL of the Point of Sale background image for the location. |  [optional]
**mcc** | **String** | The merchant category code (MCC) of the location, as standardized by ISO 18245. The MCC describes the kind of goods or services sold at the location. |  [optional] [beta]



