package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.ApiClient;
import com.squareup.connect.Configuration;
import com.squareup.connect.Pair;
import com.squareup.connect.CompleteResponse;

import javax.ws.rs.core.GenericType;

import com.squareup.connect.models.V1Merchant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class V1LocationsApi {
  private ApiClient apiClient;

  public V1LocationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public V1LocationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * ListLocations
   * Provides details for all business locations associated with a Square account, including the Square-assigned object ID for the location.  ---  - __Deprecation date__: 2019-11-20 - [__Retirement date__](/build-basics/api-lifecycle#deprecated): 2020-11-18 - [Migration guide](/migrate-from-v1/guides/v1-locations)  ---
   * @return List&lt;V1Merchant&gt;
   * @throws ApiException if fails to make API call
   */
  @Deprecated
  public List<V1Merchant> listLocations() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/me/locations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-11-20");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<V1Merchant>> localVarReturnType = new GenericType<List<V1Merchant>>() {};
    CompleteResponse<List<V1Merchant>> completeResponse = (CompleteResponse<List<V1Merchant>>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return completeResponse.getData();
      }

  /**
   * ListLocations
   * Provides details for all business locations associated with a Square account, including the Square-assigned object ID for the location.  ---  - __Deprecation date__: 2019-11-20 - [__Retirement date__](/build-basics/api-lifecycle#deprecated): 2020-11-18 - [Migration guide](/migrate-from-v1/guides/v1-locations)  ---
   * @return CompleteResponse<List<V1Merchant>>
   * @throws ApiException if fails to make API call
   */
  public CompleteResponse<List<V1Merchant>>listLocationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/me/locations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-11-20");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<V1Merchant>> localVarReturnType = new GenericType<List<V1Merchant>>() {};
    return (CompleteResponse<List<V1Merchant>>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * RetrieveBusiness
   * Get the general information for a business.  ---  - __Deprecation date__: 2019-11-20 - [__Retirement date__](/build-basics/api-lifecycle#deprecated): 2020-11-18 - [Migration guide](/migrate-from-v1/guides/v1-locations)  ---
   * @return V1Merchant
   * @throws ApiException if fails to make API call
   */
  @Deprecated
  public V1Merchant retrieveBusiness() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/me";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-11-20");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<V1Merchant> localVarReturnType = new GenericType<V1Merchant>() {};
    CompleteResponse<V1Merchant> completeResponse = (CompleteResponse<V1Merchant>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return completeResponse.getData();
      }

  /**
   * RetrieveBusiness
   * Get the general information for a business.  ---  - __Deprecation date__: 2019-11-20 - [__Retirement date__](/build-basics/api-lifecycle#deprecated): 2020-11-18 - [Migration guide](/migrate-from-v1/guides/v1-locations)  ---
   * @return CompleteResponse<V1Merchant>
   * @throws ApiException if fails to make API call
   */
  public CompleteResponse<V1Merchant>retrieveBusinessWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/me";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-11-20");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<V1Merchant> localVarReturnType = new GenericType<V1Merchant>() {};
    return (CompleteResponse<V1Merchant>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
