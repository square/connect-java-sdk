
# RevokeTokenRequest

### Description



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | The Square issued ID for your application, available from the [application dashboard](https://connect.squareup.com/apps). |  [optional]
**accessToken** | **String** | The access token of the merchant whose token you want to revoke. Do not provide a value for merchant_id if you provide this parameter. |  [optional]
**merchantId** | **String** | The ID of the merchant whose token you want to revoke. Do not provide a value for access_token if you provide this parameter. |  [optional]



