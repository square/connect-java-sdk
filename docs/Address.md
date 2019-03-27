
# Address

### Description

Represents a physical address.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressLine1** | **String** | The first line of the address.  Fields that start with &#x60;address_line&#x60; provide the address&#39;s most specific details, like street number, street name, and building name. They do *not* provide less specific details like city, state/province, or country (these details are provided in other fields). |  [optional]
**addressLine2** | **String** | The second line of the address, if any. |  [optional]
**addressLine3** | **String** | The third line of the address, if any. |  [optional]
**locality** | **String** | The city or town of the address. |  [optional]
**sublocality** | **String** | A civil region within the address&#39;s &#x60;locality&#x60;, if any. |  [optional]
**sublocality2** | **String** | A civil region within the address&#39;s &#x60;sublocality&#x60;, if any. |  [optional]
**sublocality3** | **String** | A civil region within the address&#39;s &#x60;sublocality_2&#x60;, if any. |  [optional]
**administrativeDistrictLevel1** | **String** | A civil entity within the address&#39;s country. In the US, this is the state. |  [optional]
**administrativeDistrictLevel2** | **String** | A civil entity within the address&#39;s &#x60;administrative_district_level_1&#x60;. In the US, this is the county. |  [optional]
**administrativeDistrictLevel3** | **String** | A civil entity within the address&#39;s &#x60;administrative_district_level_2&#x60;, if any. |  [optional]
**postalCode** | **String** | The address&#39;s postal code. |  [optional]
**country** | [**CountryEnum**](#CountryEnum) | The address&#39;s country, in ISO 3166-1-alpha-2 format. See [Country](#type-country) for possible values |  [optional]
**firstName** | **String** | Optional first name when it&#39;s representing recipient. |  [optional]
**lastName** | **String** | Optional last name when it&#39;s representing recipient. |  [optional]
**organization** | **String** | Optional organization name when it&#39;s representing recipient. |  [optional]


<a name="CountryEnum"></a>
## Enum: CountryEnum
Name | Value
---- | -----
ZZ | &quot;ZZ&quot;
AD | &quot;AD&quot;
AE | &quot;AE&quot;
AF | &quot;AF&quot;
AG | &quot;AG&quot;
AI | &quot;AI&quot;
AL | &quot;AL&quot;
AM | &quot;AM&quot;
AO | &quot;AO&quot;
AQ | &quot;AQ&quot;
AR | &quot;AR&quot;
AS | &quot;AS&quot;
AT | &quot;AT&quot;
AU | &quot;AU&quot;
AW | &quot;AW&quot;
AX | &quot;AX&quot;
AZ | &quot;AZ&quot;
BA | &quot;BA&quot;
BB | &quot;BB&quot;
BD | &quot;BD&quot;
BE | &quot;BE&quot;
BF | &quot;BF&quot;
BG | &quot;BG&quot;
BH | &quot;BH&quot;
BI | &quot;BI&quot;
BJ | &quot;BJ&quot;
BL | &quot;BL&quot;
BM | &quot;BM&quot;
BN | &quot;BN&quot;
BO | &quot;BO&quot;
BQ | &quot;BQ&quot;
BR | &quot;BR&quot;
BS | &quot;BS&quot;
BT | &quot;BT&quot;
BV | &quot;BV&quot;
BW | &quot;BW&quot;
BY | &quot;BY&quot;
BZ | &quot;BZ&quot;
CA | &quot;CA&quot;
CC | &quot;CC&quot;
CD | &quot;CD&quot;
CF | &quot;CF&quot;
CG | &quot;CG&quot;
CH | &quot;CH&quot;
CI | &quot;CI&quot;
CK | &quot;CK&quot;
CL | &quot;CL&quot;
CM | &quot;CM&quot;
CN | &quot;CN&quot;
CO | &quot;CO&quot;
CR | &quot;CR&quot;
CU | &quot;CU&quot;
CV | &quot;CV&quot;
CW | &quot;CW&quot;
CX | &quot;CX&quot;
CY | &quot;CY&quot;
CZ | &quot;CZ&quot;
DE | &quot;DE&quot;
DJ | &quot;DJ&quot;
DK | &quot;DK&quot;
DM | &quot;DM&quot;
DO | &quot;DO&quot;
DZ | &quot;DZ&quot;
EC | &quot;EC&quot;
EE | &quot;EE&quot;
EG | &quot;EG&quot;
EH | &quot;EH&quot;
ER | &quot;ER&quot;
ES | &quot;ES&quot;
ET | &quot;ET&quot;
FI | &quot;FI&quot;
FJ | &quot;FJ&quot;
FK | &quot;FK&quot;
FM | &quot;FM&quot;
FO | &quot;FO&quot;
FR | &quot;FR&quot;
GA | &quot;GA&quot;
GB | &quot;GB&quot;
GD | &quot;GD&quot;
GE | &quot;GE&quot;
GF | &quot;GF&quot;
GG | &quot;GG&quot;
GH | &quot;GH&quot;
GI | &quot;GI&quot;
GL | &quot;GL&quot;
GM | &quot;GM&quot;
GN | &quot;GN&quot;
GP | &quot;GP&quot;
GQ | &quot;GQ&quot;
GR | &quot;GR&quot;
GS | &quot;GS&quot;
GT | &quot;GT&quot;
GU | &quot;GU&quot;
GW | &quot;GW&quot;
GY | &quot;GY&quot;
HK | &quot;HK&quot;
HM | &quot;HM&quot;
HN | &quot;HN&quot;
HR | &quot;HR&quot;
HT | &quot;HT&quot;
HU | &quot;HU&quot;
ID | &quot;ID&quot;
IE | &quot;IE&quot;
IL | &quot;IL&quot;
IM | &quot;IM&quot;
IN | &quot;IN&quot;
IO | &quot;IO&quot;
IQ | &quot;IQ&quot;
IR | &quot;IR&quot;
IS | &quot;IS&quot;
IT | &quot;IT&quot;
JE | &quot;JE&quot;
JM | &quot;JM&quot;
JO | &quot;JO&quot;
JP | &quot;JP&quot;
KE | &quot;KE&quot;
KG | &quot;KG&quot;
KH | &quot;KH&quot;
KI | &quot;KI&quot;
KM | &quot;KM&quot;
KN | &quot;KN&quot;
KP | &quot;KP&quot;
KR | &quot;KR&quot;
KW | &quot;KW&quot;
KY | &quot;KY&quot;
KZ | &quot;KZ&quot;
LA | &quot;LA&quot;
LB | &quot;LB&quot;
LC | &quot;LC&quot;
LI | &quot;LI&quot;
LK | &quot;LK&quot;
LR | &quot;LR&quot;
LS | &quot;LS&quot;
LT | &quot;LT&quot;
LU | &quot;LU&quot;
LV | &quot;LV&quot;
LY | &quot;LY&quot;
MA | &quot;MA&quot;
MC | &quot;MC&quot;
MD | &quot;MD&quot;
ME | &quot;ME&quot;
MF | &quot;MF&quot;
MG | &quot;MG&quot;
MH | &quot;MH&quot;
MK | &quot;MK&quot;
ML | &quot;ML&quot;
MM | &quot;MM&quot;
MN | &quot;MN&quot;
MO | &quot;MO&quot;
MP | &quot;MP&quot;
MQ | &quot;MQ&quot;
MR | &quot;MR&quot;
MS | &quot;MS&quot;
MT | &quot;MT&quot;
MU | &quot;MU&quot;
MV | &quot;MV&quot;
MW | &quot;MW&quot;
MX | &quot;MX&quot;
MY | &quot;MY&quot;
MZ | &quot;MZ&quot;
NA | &quot;NA&quot;
NC | &quot;NC&quot;
NE | &quot;NE&quot;
NF | &quot;NF&quot;
NG | &quot;NG&quot;
NI | &quot;NI&quot;
NL | &quot;NL&quot;
NO | &quot;NO&quot;
NP | &quot;NP&quot;
NR | &quot;NR&quot;
NU | &quot;NU&quot;
NZ | &quot;NZ&quot;
OM | &quot;OM&quot;
PA | &quot;PA&quot;
PE | &quot;PE&quot;
PF | &quot;PF&quot;
PG | &quot;PG&quot;
PH | &quot;PH&quot;
PK | &quot;PK&quot;
PL | &quot;PL&quot;
PM | &quot;PM&quot;
PN | &quot;PN&quot;
PR | &quot;PR&quot;
PS | &quot;PS&quot;
PT | &quot;PT&quot;
PW | &quot;PW&quot;
PY | &quot;PY&quot;
QA | &quot;QA&quot;
RE | &quot;RE&quot;
RO | &quot;RO&quot;
RS | &quot;RS&quot;
RU | &quot;RU&quot;
RW | &quot;RW&quot;
SA | &quot;SA&quot;
SB | &quot;SB&quot;
SC | &quot;SC&quot;
SD | &quot;SD&quot;
SE | &quot;SE&quot;
SG | &quot;SG&quot;
SH | &quot;SH&quot;
SI | &quot;SI&quot;
SJ | &quot;SJ&quot;
SK | &quot;SK&quot;
SL | &quot;SL&quot;
SM | &quot;SM&quot;
SN | &quot;SN&quot;
SO | &quot;SO&quot;
SR | &quot;SR&quot;
SS | &quot;SS&quot;
ST | &quot;ST&quot;
SV | &quot;SV&quot;
SX | &quot;SX&quot;
SY | &quot;SY&quot;
SZ | &quot;SZ&quot;
TC | &quot;TC&quot;
TD | &quot;TD&quot;
TF | &quot;TF&quot;
TG | &quot;TG&quot;
TH | &quot;TH&quot;
TJ | &quot;TJ&quot;
TK | &quot;TK&quot;
TL | &quot;TL&quot;
TM | &quot;TM&quot;
TN | &quot;TN&quot;
TO | &quot;TO&quot;
TR | &quot;TR&quot;
TT | &quot;TT&quot;
TV | &quot;TV&quot;
TW | &quot;TW&quot;
TZ | &quot;TZ&quot;
UA | &quot;UA&quot;
UG | &quot;UG&quot;
UM | &quot;UM&quot;
US | &quot;US&quot;
UY | &quot;UY&quot;
UZ | &quot;UZ&quot;
VA | &quot;VA&quot;
VC | &quot;VC&quot;
VE | &quot;VE&quot;
VG | &quot;VG&quot;
VI | &quot;VI&quot;
VN | &quot;VN&quot;
VU | &quot;VU&quot;
WF | &quot;WF&quot;
WS | &quot;WS&quot;
YE | &quot;YE&quot;
YT | &quot;YT&quot;
ZA | &quot;ZA&quot;
ZM | &quot;ZM&quot;
ZW | &quot;ZW&quot;



