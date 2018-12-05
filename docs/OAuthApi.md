# OAuthApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**obtainToken**](OAuthApi.md#obtainToken) | **POST** /oauth2/token | ObtainToken
[**renewToken**](OAuthApi.md#renewToken) | **POST** /oauth2/clients/{client_id}/access-token/renew | RenewToken
[**revokeToken**](OAuthApi.md#revokeToken) | **POST** /oauth2/revoke | RevokeToken


<a name="obtainToken"></a>
# **obtainToken**
> ObtainTokenResponse obtainToken(body)

ObtainToken

Exchanges the authorization code for an access token.  After a merchant authorizes your application with the permissions form, an authorization code is sent to the application&#39;s redirect URL (See [Implementing OAuth](https://docs.connect.squareup.com/api/oauth#implementingoauth) for information about how to set up the redirect URL).

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.OAuthApi;


OAuthApi apiInstance = new OAuthApi();
ObtainTokenRequest body = new ObtainTokenRequest(); // ObtainTokenRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    ObtainTokenResponse result = apiInstance.obtainToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#obtainToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObtainTokenRequest**](ObtainTokenRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**ObtainTokenResponse**](ObtainTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="renewToken"></a>
# **renewToken**
> RenewTokenResponse renewToken(clientId, body)

RenewToken

Renews an OAuth access token before it expires.  OAuth access tokens besides your application&#39;s personal access token expire after __30 days__. You can also renew expired tokens within __15 days__ of their expiration. You cannot renew an access token that has been expired for more than 15 days. Instead, the associated merchant must complete the [OAuth flow](https://docs.connect.squareup.com/api/oauth#implementingoauth) from the beginning.  __Important:__ The &#x60;Authorization&#x60; header you provide to this endpoint must have the following format:  &#x60;&#x60;&#x60; Authorization: Client APPLICATION_SECRET &#x60;&#x60;&#x60;  Replace &#x60;APPLICATION_SECRET&#x60; with your application&#39;s secret, available from the [application dashboard](https://connect.squareup.com/apps).

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: oauth2ClientSecret
ApiKeyAuth oauth2ClientSecret = (ApiKeyAuth) defaultClient.getAuthentication("oauth2ClientSecret");
oauth2ClientSecret.setApiKey("APPLICATION SECRET");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
oauth2ClientSecret.setApiKeyPrefix("Client");

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Your application's ID, available from the [application dashboard](https://connect.squareup.com/apps).
RenewTokenRequest body = new RenewTokenRequest(); // RenewTokenRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    RenewTokenResponse result = apiInstance.renewToken(clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#renewToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Your application&#39;s ID, available from the [application dashboard](https://connect.squareup.com/apps). |
 **body** | [**RenewTokenRequest**](RenewTokenRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**RenewTokenResponse**](RenewTokenResponse.md)

### Authorization

[oauth2ClientSecret](../README.md#oauth2ClientSecret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="revokeToken"></a>
# **revokeToken**
> RevokeTokenResponse revokeToken(body)

RevokeToken

Revokes an access token generated with the OAuth flow.  If a merchant has more than one access token for your application, this endpoint revokes all of them, regardless of which token you specify. If you revoke a merchant&#39;s access token, all of the merchant&#39;s active subscriptions associated with your application are canceled immediately.  __Important:__ The &#x60;Authorization&#x60; header you provide to this endpoint must have the following format:  &#x60;&#x60;&#x60; Authorization: Client APPLICATION_SECRET &#x60;&#x60;&#x60;  Replace &#x60;APPLICATION_SECRET&#x60; with your application&#39;s secret, available from the [application dashboard](https://connect.squareup.com/apps).

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: oauth2ClientSecret
ApiKeyAuth oauth2ClientSecret = (ApiKeyAuth) defaultClient.getAuthentication("oauth2ClientSecret");
oauth2ClientSecret.setApiKey("APPLICATION SECRET");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
oauth2ClientSecret.setApiKeyPrefix("Client");

OAuthApi apiInstance = new OAuthApi();
RevokeTokenRequest body = new RevokeTokenRequest(); // RevokeTokenRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    RevokeTokenResponse result = apiInstance.revokeToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#revokeToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RevokeTokenRequest**](RevokeTokenRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**RevokeTokenResponse**](RevokeTokenResponse.md)

### Authorization

[oauth2ClientSecret](../README.md#oauth2ClientSecret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

