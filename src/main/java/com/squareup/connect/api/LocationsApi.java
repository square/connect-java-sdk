package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.ApiClient;
import com.squareup.connect.Configuration;
import com.squareup.connect.Pair;
import com.squareup.connect.CompleteResponse;

import javax.ws.rs.core.GenericType;

import com.squareup.connect.models.ListLocationsResponse;
import com.squareup.connect.models.RetrieveLocationResponse;
import com.squareup.connect.models.UpdateLocationRequest;
import com.squareup.connect.models.UpdateLocationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LocationsApi {
  private ApiClient apiClient;

  public LocationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LocationsApi(ApiClient apiClient) {
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
   * Provides the details for all of a business&#39;s locations.  Most other Connect API endpoints have a required &#x60;location_id&#x60; path parameter. The &#x60;id&#x60; field of the [&#x60;Location&#x60;](#type-location) objects returned by this endpoint correspond to that &#x60;location_id&#x60; parameter.
   * @return ListLocationsResponse
   * @throws ApiException if fails to make API call
   */
  public ListLocationsResponse listLocations() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/locations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-10-23");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<ListLocationsResponse> localVarReturnType = new GenericType<ListLocationsResponse>() {};
    CompleteResponse<ListLocationsResponse> completeResponse = (CompleteResponse<ListLocationsResponse>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return completeResponse.getData();
      }

  /**
   * ListLocations
   * Provides the details for all of a business&#39;s locations.  Most other Connect API endpoints have a required &#x60;location_id&#x60; path parameter. The &#x60;id&#x60; field of the [&#x60;Location&#x60;](#type-location) objects returned by this endpoint correspond to that &#x60;location_id&#x60; parameter.
   * @return CompleteResponse<ListLocationsResponse>
   * @throws ApiException if fails to make API call
   */
  public CompleteResponse<ListLocationsResponse>listLocationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/locations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-10-23");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<ListLocationsResponse> localVarReturnType = new GenericType<ListLocationsResponse>() {};
    return (CompleteResponse<ListLocationsResponse>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * RetrieveLocation
   * Retrieves details of a location.
   * Note: This endpoint is in beta.
   * @param locationId The ID of the location to retrieve. (required)
   * @return RetrieveLocationResponse
   * @throws ApiException if fails to make API call
   */
  public RetrieveLocationResponse retrieveLocation(String locationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling retrieveLocation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-10-23");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<RetrieveLocationResponse> localVarReturnType = new GenericType<RetrieveLocationResponse>() {};
    CompleteResponse<RetrieveLocationResponse> completeResponse = (CompleteResponse<RetrieveLocationResponse>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return completeResponse.getData();
      }

  /**
   * RetrieveLocation
   * Retrieves details of a location.
   * @param locationId The ID of the location to retrieve. (required)
   * @return CompleteResponse<RetrieveLocationResponse>
   * @throws ApiException if fails to make API call
   */
  public CompleteResponse<RetrieveLocationResponse>retrieveLocationWithHttpInfo(String locationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling retrieveLocation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-10-23");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<RetrieveLocationResponse> localVarReturnType = new GenericType<RetrieveLocationResponse>() {};
    return (CompleteResponse<RetrieveLocationResponse>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * UpdateLocation
   * Updates the &#x60;Location&#x60; specified by the given ID.
   * Note: This endpoint is in beta.
   * @param locationId The ID of the location to update. (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return UpdateLocationResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateLocationResponse updateLocation(String locationId, UpdateLocationRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling updateLocation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-10-23");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<UpdateLocationResponse> localVarReturnType = new GenericType<UpdateLocationResponse>() {};
    CompleteResponse<UpdateLocationResponse> completeResponse = (CompleteResponse<UpdateLocationResponse>)apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return completeResponse.getData();
      }

  /**
   * UpdateLocation
   * Updates the &#x60;Location&#x60; specified by the given ID.
   * @param locationId The ID of the location to update. (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return CompleteResponse<UpdateLocationResponse>
   * @throws ApiException if fails to make API call
   */
  public CompleteResponse<UpdateLocationResponse>updateLocationWithHttpInfo(String locationId, UpdateLocationRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling updateLocation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-10-23");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<UpdateLocationResponse> localVarReturnType = new GenericType<UpdateLocationResponse>() {};
    return (CompleteResponse<UpdateLocationResponse>)apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
