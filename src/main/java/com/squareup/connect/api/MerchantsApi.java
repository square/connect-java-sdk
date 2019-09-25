package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.ApiClient;
import com.squareup.connect.Configuration;
import com.squareup.connect.Pair;
import com.squareup.connect.CompleteResponse;

import javax.ws.rs.core.GenericType;

import com.squareup.connect.models.RetrieveMerchantResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MerchantsApi {
  private ApiClient apiClient;

  public MerchantsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MerchantsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * RetrieveMerchant
   * Retrieve a &#x60;Merchant&#x60; object for the given &#x60;merchant_id&#x60;.
   * @param merchantId The ID of the merchant to retrieve (required)
   * @return RetrieveMerchantResponse
   * @throws ApiException if fails to make API call
   */  public RetrieveMerchantResponse retrieveMerchant(String merchantId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'merchantId' is set
    if (merchantId == null) {
      throw new ApiException(400, "Missing the required parameter 'merchantId' when calling retrieveMerchant");
    }
    
    // create path and map variables
    String localVarPath = "/v2/merchants/{merchant_id}"
      .replaceAll("\\{" + "merchant_id" + "\\}", apiClient.escapeString(merchantId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-09-25");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<RetrieveMerchantResponse> localVarReturnType = new GenericType<RetrieveMerchantResponse>() {};
    CompleteResponse<RetrieveMerchantResponse> completeResponse = (CompleteResponse<RetrieveMerchantResponse>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return completeResponse.getData();
      }

  /**
   * RetrieveMerchant
   * Retrieve a &#x60;Merchant&#x60; object for the given &#x60;merchant_id&#x60;.
   * @param merchantId The ID of the merchant to retrieve (required)
   * @return CompleteResponse<RetrieveMerchantResponse>
   * @throws ApiException if fails to make API call
   */
  public CompleteResponse<RetrieveMerchantResponse>retrieveMerchantWithHttpInfo(String merchantId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'merchantId' is set
    if (merchantId == null) {
      throw new ApiException(400, "Missing the required parameter 'merchantId' when calling retrieveMerchant");
    }
    
    // create path and map variables
    String localVarPath = "/v2/merchants/{merchant_id}"
      .replaceAll("\\{" + "merchant_id" + "\\}", apiClient.escapeString(merchantId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<RetrieveMerchantResponse> localVarReturnType = new GenericType<RetrieveMerchantResponse>() {};
    return (CompleteResponse<RetrieveMerchantResponse>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
