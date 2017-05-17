
# V1Merchant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The merchant account&#39;s unique identifier. |  [optional]
**name** | **String** | The name associated with the merchant account. |  [optional]
**email** | **String** | The email address associated with the merchant account. |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Indicates whether the merchant account corresponds to a single-location account (LOCATION) or a business account (BUSINESS). This value is almost always LOCATION. |  [optional]
**accountCapabilities** | **List&lt;String&gt;** | Capabilities that are enabled for the merchant&#39;s Square account. Capabilities that are not listed in this array are not enabled for the account. |  [optional]
**countryCode** | **String** | The country associated with the merchant account, in ISO 3166-1-alpha-2 format. |  [optional]
**languageCode** | **String** | The language associated with the merchant account, in BCP 47 format. |  [optional]
**currencyCode** | **String** | The currency associated with the merchant account, in ISO 4217 format. For example, the currency code for US dollars is USD. |  [optional]
**businessName** | **String** | The name of the merchant&#39;s business. |  [optional]
**businessAddress** | [**Address**](Address.md) | The address of the merchant&#39;s business. |  [optional]
**businessPhone** | [**V1PhoneNumber**](V1PhoneNumber.md) | The phone number of the merchant&#39;s business. |  [optional]
**businessType** | [**BusinessTypeEnum**](#BusinessTypeEnum) | The type of business operated by the merchant. |  [optional]
**shippingAddress_** | [**Address**](Address.md) | The merchant&#39;s shipping address. |  [optional]
**locationDetails** | [**V1MerchantLocationDetails**](V1MerchantLocationDetails.md) |  |  [optional]
**marketUrl** | **String** | The URL of the merchant&#39;s online store. |  [optional]


<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
LOCATION | &quot;LOCATION&quot;
BUSINESS | &quot;BUSINESS&quot;


<a name="BusinessTypeEnum"></a>
## Enum: BusinessTypeEnum
Name | Value
---- | -----
ACCOUNTING | &quot;ACCOUNTING&quot;
APPAREL_AND_ACCESSORY_SHOPS | &quot;APPAREL_AND_ACCESSORY_SHOPS&quot;
ART_DEALERS_GALLERIES | &quot;ART_DEALERS_GALLERIES&quot;
ART_DESIGN_AND_PHOTOGRAPHY | &quot;ART_DESIGN_AND_PHOTOGRAPHY&quot;
BAR_CLUB_LOUNGE | &quot;BAR_CLUB_LOUNGE&quot;
BEAUTY_AND_BARBER_SHOPS | &quot;BEAUTY_AND_BARBER_SHOPS&quot;
BOOK_STORES | &quot;BOOK_STORES&quot;
BUSINESS_SERVICES | &quot;BUSINESS_SERVICES&quot;
CATERING | &quot;CATERING&quot;
CHARITABLE_SOCIAL_SERVICE_ORGANIZATIONS | &quot;CHARITABLE_SOCIAL_SERVICE_ORGANIZATIONS&quot;
CHARITIBLE_ORGS | &quot;CHARITIBLE_ORGS&quot;
CLEANING_SERVICES | &quot;CLEANING_SERVICES&quot;
COMPUTER_EQUIPMENT_SOFTWARE_MAINTENANCE_REPAIR_SERVICES | &quot;COMPUTER_EQUIPMENT_SOFTWARE_MAINTENANCE_REPAIR_SERVICES&quot;
CONSULTANT | &quot;CONSULTANT&quot;
CONTRACTORS | &quot;CONTRACTORS&quot;
DELIVERY_SERVICES | &quot;DELIVERY_SERVICES&quot;
DENTISTRY | &quot;DENTISTRY&quot;
EDUCATION | &quot;EDUCATION&quot;
FOOD_STORES_CONVENIENCE_STORES_AND_SPECIALTY_MARKETS | &quot;FOOD_STORES_CONVENIENCE_STORES_AND_SPECIALTY_MARKETS&quot;
FOOD_TRUCK_CART | &quot;FOOD_TRUCK_CART&quot;
FURNITURE_HOME_AND_OFFICE_EQUIPMENT | &quot;FURNITURE_HOME_AND_OFFICE_EQUIPMENT&quot;
FURNITURE_HOME_GOODS | &quot;FURNITURE_HOME_GOODS&quot;
HOTELS_AND_LODGING | &quot;HOTELS_AND_LODGING&quot;
INDIVIDUAL_USE | &quot;INDIVIDUAL_USE&quot;
JEWELRY_AND_WATCHES | &quot;JEWELRY_AND_WATCHES&quot;
LANDSCAPING_AND_HORTICULTURAL_SERVICES | &quot;LANDSCAPING_AND_HORTICULTURAL_SERVICES&quot;
LANGUAGE_SCHOOLS | &quot;LANGUAGE_SCHOOLS&quot;
LEGAL_SERVICES | &quot;LEGAL_SERVICES&quot;
MEDICAL_PRACTITIONERS | &quot;MEDICAL_PRACTITIONERS&quot;
MEDICAL_SERVICES_AND_HEALTH_PRACTITIONERS | &quot;MEDICAL_SERVICES_AND_HEALTH_PRACTITIONERS&quot;
MEMBERSHIP_ORGANIZATIONS | &quot;MEMBERSHIP_ORGANIZATIONS&quot;
MUSIC_AND_ENTERTAINMENT | &quot;MUSIC_AND_ENTERTAINMENT&quot;
OTHER | &quot;OTHER&quot;
OUTDOOR_MARKETS | &quot;OUTDOOR_MARKETS&quot;
PERSONAL_SERVICES | &quot;PERSONAL_SERVICES&quot;
POLITICAL_ORGANIZATIONS | &quot;POLITICAL_ORGANIZATIONS&quot;
PROFESSIONAL_SERVICES | &quot;PROFESSIONAL_SERVICES&quot;
REAL_ESTATE | &quot;REAL_ESTATE&quot;
RECREATION_SERVICES | &quot;RECREATION_SERVICES&quot;
REPAIR_SHOPS_AND_RELATED_SERVICES | &quot;REPAIR_SHOPS_AND_RELATED_SERVICES&quot;
RESTAURANTS | &quot;RESTAURANTS&quot;
RETAIL_SHOPS | &quot;RETAIL_SHOPS&quot;
SCHOOLS_AND_EDUCATIONAL_SERVICES | &quot;SCHOOLS_AND_EDUCATIONAL_SERVICES&quot;
SPORTING_GOODS | &quot;SPORTING_GOODS&quot;
TAXICABS_AND_LIMOUSINES | &quot;TAXICABS_AND_LIMOUSINES&quot;
TICKET_SALES | &quot;TICKET_SALES&quot;
TOURISM | &quot;TOURISM&quot;
TRAVEL_TOURISM | &quot;TRAVEL_TOURISM&quot;
VETERINARY_SERVICES | &quot;VETERINARY_SERVICES&quot;
WEB_DEV_DESIGN | &quot;WEB_DEV_DESIGN&quot;



