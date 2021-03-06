/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.models.ObtainTokenRequest;
import com.squareup.connect.models.ObtainTokenResponse;
import com.squareup.connect.models.RenewTokenRequest;
import com.squareup.connect.models.RenewTokenResponse;
import com.squareup.connect.models.RevokeTokenRequest;
import com.squareup.connect.models.RevokeTokenResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuthApi
 */
@Ignore
public class OAuthApiTest {

    private final OAuthApi api = new OAuthApi();


    /**
     * ObtainToken
     *
     * Exchanges the authorization code for an access token.  After a merchant authorizes your application with the permissions form, an authorization code is sent to the application&#39;s redirect URL (See [Implementing OAuth](https://docs.connect.squareup.com/api/oauth#implementingoauth) for information about how to set up the redirect URL).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void obtainTokenTest() throws ApiException {
        ObtainTokenRequest body = null;
        ObtainTokenResponse response = api.obtainToken(body);

        // TODO: test validations
    }

    /**
     * RenewToken
     *
     * Renews an OAuth access token before it expires.  OAuth access tokens besides your application&#39;s personal access token expire after __30 days__. You can also renew expired tokens within __15 days__ of their expiration. You cannot renew an access token that has been expired for more than 15 days. Instead, the associated merchant must complete the [OAuth flow](https://docs.connect.squareup.com/api/oauth#implementingoauth) from the beginning.  __Important:__ The &#x60;Authorization&#x60; header you provide to this endpoint must have the following format:  &#x60;&#x60;&#x60; Authorization: Client APPLICATION_SECRET &#x60;&#x60;&#x60;  Replace &#x60;APPLICATION_SECRET&#x60; with your application&#39;s secret, available from the [application dashboard](https://connect.squareup.com/apps).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void renewTokenTest() throws ApiException {
        String clientId = null;
        RenewTokenRequest body = null;
        RenewTokenResponse response = api.renewToken(clientId, body);

        // TODO: test validations
    }

    /**
     * RevokeToken
     *
     * Revokes an access token generated with the OAuth flow.  If a merchant has more than one access token for your application, this endpoint revokes all of them, regardless of which token you specify. If you revoke a merchant&#39;s access token, all of the merchant&#39;s active subscriptions associated with your application are canceled immediately.  __Important:__ The &#x60;Authorization&#x60; header you provide to this endpoint must have the following format:  &#x60;&#x60;&#x60; Authorization: Client APPLICATION_SECRET &#x60;&#x60;&#x60;  Replace &#x60;APPLICATION_SECRET&#x60; with your application&#39;s secret, available from the [application dashboard](https://connect.squareup.com/apps).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revokeTokenTest() throws ApiException {
        RevokeTokenRequest body = null;
        RevokeTokenResponse response = api.revokeToken(body);

        // TODO: test validations
    }

}
