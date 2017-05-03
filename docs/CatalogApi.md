# CatalogApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchDeleteCatalogObjects**](CatalogApi.md#batchDeleteCatalogObjects) | **POST** /v2/catalog/batch-delete | BatchDeleteCatalogObjects
[**batchRetrieveCatalogObjects**](CatalogApi.md#batchRetrieveCatalogObjects) | **POST** /v2/catalog/batch-retrieve | BatchRetrieveCatalogObjects
[**batchUpsertCatalogObjects**](CatalogApi.md#batchUpsertCatalogObjects) | **POST** /v2/catalog/batch-upsert | BatchUpsertCatalogObjects
[**catalogInfo**](CatalogApi.md#catalogInfo) | **GET** /v2/catalog/info | CatalogInfo
[**deleteCatalogObject**](CatalogApi.md#deleteCatalogObject) | **DELETE** /v2/catalog/object/{object_id} | DeleteCatalogObject
[**listCatalog**](CatalogApi.md#listCatalog) | **GET** /v2/catalog/list | ListCatalog
[**retrieveCatalogObject**](CatalogApi.md#retrieveCatalogObject) | **GET** /v2/catalog/object/{object_id} | RetrieveCatalogObject
[**searchCatalogObjects**](CatalogApi.md#searchCatalogObjects) | **POST** /v2/catalog/search | SearchCatalogObjects
[**updateItemModifierLists**](CatalogApi.md#updateItemModifierLists) | **POST** /v2/catalog/update-item-modifier-lists | UpdateItemModifierLists
[**updateItemTaxes**](CatalogApi.md#updateItemTaxes) | **POST** /v2/catalog/update-item-taxes | UpdateItemTaxes
[**upsertCatalogObject**](CatalogApi.md#upsertCatalogObject) | **POST** /v2/catalog/object | UpsertCatalogObject


<a name="batchDeleteCatalogObjects"></a>
# **batchDeleteCatalogObjects**
> BatchDeleteCatalogObjectsResponse batchDeleteCatalogObjects(authorization, body)

BatchDeleteCatalogObjects

Deletes a set of [CatalogItem](#type-catalogitem)s based on the provided list of target IDs and returns a set of successfully deleted IDs in the response. Deletion is a cascading event such that all children of the targeted object are also deleted. For example, deleting a CatalogItem will also delete all of its [CatalogItemVariation](#type-catalogitemvariation) children.  &#x60;BatchDeleteCatalogObjects&#x60; succeeds even if only a portion of the targeted IDs can be deleted. The response will only include IDs that were actually deleted.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
BatchDeleteCatalogObjectsRequest body = new BatchDeleteCatalogObjectsRequest(); // BatchDeleteCatalogObjectsRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    BatchDeleteCatalogObjectsResponse result = apiInstance.batchDeleteCatalogObjects(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#batchDeleteCatalogObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **body** | [**BatchDeleteCatalogObjectsRequest**](BatchDeleteCatalogObjectsRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**BatchDeleteCatalogObjectsResponse**](BatchDeleteCatalogObjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="batchRetrieveCatalogObjects"></a>
# **batchRetrieveCatalogObjects**
> BatchRetrieveCatalogObjectsResponse batchRetrieveCatalogObjects(authorization, body)

BatchRetrieveCatalogObjects

Returns a set of objects based on the provided ID. [CatalogItem](#type-catalogitem)s returned in the set include all of the child information including: all [CatalogItemVariation](#type-catalogitemvariation) objects, references to its [CatalogModifierList](#type-catalogmodifierlist) objects, and the ids of any [CatalogTax](#type-catalogtax) objects that apply to it.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
BatchRetrieveCatalogObjectsRequest body = new BatchRetrieveCatalogObjectsRequest(); // BatchRetrieveCatalogObjectsRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    BatchRetrieveCatalogObjectsResponse result = apiInstance.batchRetrieveCatalogObjects(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#batchRetrieveCatalogObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **body** | [**BatchRetrieveCatalogObjectsRequest**](BatchRetrieveCatalogObjectsRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**BatchRetrieveCatalogObjectsResponse**](BatchRetrieveCatalogObjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="batchUpsertCatalogObjects"></a>
# **batchUpsertCatalogObjects**
> BatchUpsertCatalogObjectsResponse batchUpsertCatalogObjects(authorization, body)

BatchUpsertCatalogObjects

Creates or updates up to 10,000 target objects based on the provided list of objects. The target objects are grouped into batches and each batch is inserted/updated in an all-or-nothing manner. If an object within a batch is malformed in some way, or violates a database constraint, the entire batch containing that item will be disregarded. However, other batches in the same request may still succeed. Each batch may contain up to 1,000 objects, and batches will be processed in order as long as the total object count for the request (items, variations, modifier lists, discounts, and taxes) is no more than 10,000.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
BatchUpsertCatalogObjectsRequest body = new BatchUpsertCatalogObjectsRequest(); // BatchUpsertCatalogObjectsRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    BatchUpsertCatalogObjectsResponse result = apiInstance.batchUpsertCatalogObjects(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#batchUpsertCatalogObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **body** | [**BatchUpsertCatalogObjectsRequest**](BatchUpsertCatalogObjectsRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**BatchUpsertCatalogObjectsResponse**](BatchUpsertCatalogObjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogInfo"></a>
# **catalogInfo**
> CatalogInfoResponse catalogInfo(authorization)

CatalogInfo

Returns information about the Square Catalog API, such as batch size limits for &#x60;BatchUpsertCatalogObjects&#x60;.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
try {
    CatalogInfoResponse result = apiInstance.catalogInfo(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |

### Return type

[**CatalogInfoResponse**](CatalogInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCatalogObject"></a>
# **deleteCatalogObject**
> DeleteCatalogObjectResponse deleteCatalogObject(authorization, objectId)

DeleteCatalogObject

Deletes a single [CatalogObject](#type-catalogobject) based on the provided ID and returns the set of successfully deleted IDs in the response. Deletion is a cascading event such that all children of the targeted object are also deleted. For example, deleting a [CatalogItem](#type-catalogitem) will also delete all of its [CatalogItemVariation](#type-catalogitemvariation) children.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String objectId = "objectId_example"; // String | The ID of the [CatalogObject](#type-catalogobject) to be deleted. When an object is deleted, other objects in the graph that depend on that object will be deleted as well (for example, deleting a [CatalogItem](#type-catalogitem) will delete its [CatalogItemVariation](#type-catalogitemvariation)s).
try {
    DeleteCatalogObjectResponse result = apiInstance.deleteCatalogObject(authorization, objectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#deleteCatalogObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **objectId** | **String**| The ID of the [CatalogObject](#type-catalogobject) to be deleted. When an object is deleted, other objects in the graph that depend on that object will be deleted as well (for example, deleting a [CatalogItem](#type-catalogitem) will delete its [CatalogItemVariation](#type-catalogitemvariation)s). |

### Return type

[**DeleteCatalogObjectResponse**](DeleteCatalogObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCatalog"></a>
# **listCatalog**
> ListCatalogResponse listCatalog(authorization, cursor, types)

ListCatalog

Returns a list of [CatalogObject](#type-catalogobject)s that includes all objects of a set of desired types (for example, all [CatalogItem](#type-catalogitem) and [CatalogTax](#type-catalogtax) objects) in the catalog. The types parameter is specified as a comma-separated list of valid [CatalogObject](#type-catalogobject) types: &#x60;ITEM&#x60;, &#x60;ITEM_VARIATION&#x60;, &#x60;MODIFIER&#x60;, &#x60;MODIFIER_LIST&#x60;, &#x60;CATEGORY&#x60;, &#x60;DISCOUNT&#x60;, &#x60;TAX&#x60;.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String cursor = "cursor_example"; // String | The pagination cursor returned in the previous response. Leave unset for an initial request. See [Paginating results](#paginatingresults) for more information.
String types = "types_example"; // String | An optional case-insensitive, comma-separated list of object types to retrieve, for example `ITEM,ITEM_VARIATION,CATEGORY`.  The legal values are taken from the [CatalogObjectType](#type-catalogobjecttype) enumeration, namely `\"ITEM\"`, `\"ITEM_VARIATION\"`, `\"CATEGORY\"`, `\"DISCOUNT\"`, `\"TAX\"`, `\"MODIFIER\"`, or `\"MODIFIER_LIST\"`.
try {
    ListCatalogResponse result = apiInstance.listCatalog(authorization, cursor, types);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#listCatalog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **cursor** | **String**| The pagination cursor returned in the previous response. Leave unset for an initial request. See [Paginating results](#paginatingresults) for more information. | [optional]
 **types** | **String**| An optional case-insensitive, comma-separated list of object types to retrieve, for example &#x60;ITEM,ITEM_VARIATION,CATEGORY&#x60;.  The legal values are taken from the [CatalogObjectType](#type-catalogobjecttype) enumeration, namely &#x60;\&quot;ITEM\&quot;&#x60;, &#x60;\&quot;ITEM_VARIATION\&quot;&#x60;, &#x60;\&quot;CATEGORY\&quot;&#x60;, &#x60;\&quot;DISCOUNT\&quot;&#x60;, &#x60;\&quot;TAX\&quot;&#x60;, &#x60;\&quot;MODIFIER\&quot;&#x60;, or &#x60;\&quot;MODIFIER_LIST\&quot;&#x60;. | [optional]

### Return type

[**ListCatalogResponse**](ListCatalogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveCatalogObject"></a>
# **retrieveCatalogObject**
> RetrieveCatalogObjectResponse retrieveCatalogObject(authorization, objectId, includeRelatedObjects)

RetrieveCatalogObject

Returns a single [CatalogItem](#type-catalogitem) as a [CatalogObject](#type-catalogobject) based on the provided ID. The returned object includes all of the relevant [CatalogItem](#type-catalogitem) information including: [CatalogItemVariation](#type-catalogitemvariation) children, references to its [CatalogModifierList](#type-catalogmodifierlist) objects, and the ids of any [CatalogTax](#type-catalogtax) objects that apply to it.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String objectId = "objectId_example"; // String | The object ID of any type of [CatalogObject](#type-catalogobject)s to be retrieved.
Boolean includeRelatedObjects = true; // Boolean | If `true`, the response will include additional objects that are related to the requested object, as follows:  If the `object` field of the response contains a [CatalogItem](#type-catalogitem), its associated [CatalogCategory](#type-catalogcategory), [CatalogTax](#type-catalogtax)es, and [CatalogModifierList](#type-catalogmodifierlist)s will be returned in the `related_objects` field of the response. If the `object` field of the response contains a [CatalogItemVariation](#type-catalogitemvariation), its parent [CatalogItem](#type-catalogitem) will be returned in the `related_objects` field of the response.
try {
    RetrieveCatalogObjectResponse result = apiInstance.retrieveCatalogObject(authorization, objectId, includeRelatedObjects);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#retrieveCatalogObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **objectId** | **String**| The object ID of any type of [CatalogObject](#type-catalogobject)s to be retrieved. |
 **includeRelatedObjects** | **Boolean**| If &#x60;true&#x60;, the response will include additional objects that are related to the requested object, as follows:  If the &#x60;object&#x60; field of the response contains a [CatalogItem](#type-catalogitem), its associated [CatalogCategory](#type-catalogcategory), [CatalogTax](#type-catalogtax)es, and [CatalogModifierList](#type-catalogmodifierlist)s will be returned in the &#x60;related_objects&#x60; field of the response. If the &#x60;object&#x60; field of the response contains a [CatalogItemVariation](#type-catalogitemvariation), its parent [CatalogItem](#type-catalogitem) will be returned in the &#x60;related_objects&#x60; field of the response. | [optional]

### Return type

[**RetrieveCatalogObjectResponse**](RetrieveCatalogObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchCatalogObjects"></a>
# **searchCatalogObjects**
> SearchCatalogObjectsResponse searchCatalogObjects(authorization, body)

SearchCatalogObjects

Queries the targeted catalog using a variety of query types ([CatalogQuerySortedAttribute](#type-catalogquerysortedattribute), ([CatalogQueryExact](#type-catalogqueryexact, ([CatalogQueryRange](#type-catalogqueryrange), ([CatalogQueryText](#type-catalogquerytext), ([CatalogQueryItemsForTax](#type-catalogqueryitemsfortax), ([CatalogQueryItemsForModifierList](#type-catalogqueryitemsformodifierlist)).

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
SearchCatalogObjectsRequest body = new SearchCatalogObjectsRequest(); // SearchCatalogObjectsRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    SearchCatalogObjectsResponse result = apiInstance.searchCatalogObjects(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#searchCatalogObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **body** | [**SearchCatalogObjectsRequest**](SearchCatalogObjectsRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**SearchCatalogObjectsResponse**](SearchCatalogObjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemModifierLists"></a>
# **updateItemModifierLists**
> UpdateItemModifierListsResponse updateItemModifierLists(authorization, body)

UpdateItemModifierLists

Updates the [CatalogModifierList](#type-catalogmodifierlist) objects that apply to the targeted [CatalogItem](#type-catalogitem) without having to perform an upsert on the entire item.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
UpdateItemModifierListsRequest body = new UpdateItemModifierListsRequest(); // UpdateItemModifierListsRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    UpdateItemModifierListsResponse result = apiInstance.updateItemModifierLists(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#updateItemModifierLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **body** | [**UpdateItemModifierListsRequest**](UpdateItemModifierListsRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**UpdateItemModifierListsResponse**](UpdateItemModifierListsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemTaxes"></a>
# **updateItemTaxes**
> UpdateItemTaxesResponse updateItemTaxes(authorization, body)

UpdateItemTaxes

Updates the [CatalogTax](#type-catalogtax) objects that apply to the targeted [CatalogItem](#type-catalogitem) without having to perform an upsert on the entire item.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
UpdateItemTaxesRequest body = new UpdateItemTaxesRequest(); // UpdateItemTaxesRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    UpdateItemTaxesResponse result = apiInstance.updateItemTaxes(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#updateItemTaxes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **body** | [**UpdateItemTaxesRequest**](UpdateItemTaxesRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**UpdateItemTaxesResponse**](UpdateItemTaxesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="upsertCatalogObject"></a>
# **upsertCatalogObject**
> UpsertCatalogObjectResponse upsertCatalogObject(authorization, body)

UpsertCatalogObject

Creates or updates the target [CatalogObject](#type-catalogobject).

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
UpsertCatalogObjectRequest body = new UpsertCatalogObjectRequest(); // UpsertCatalogObjectRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    UpsertCatalogObjectResponse result = apiInstance.upsertCatalogObject(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#upsertCatalogObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **body** | [**UpsertCatalogObjectRequest**](UpsertCatalogObjectRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**UpsertCatalogObjectResponse**](UpsertCatalogObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

