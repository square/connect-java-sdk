# V1ItemsApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustInventory**](V1ItemsApi.md#adjustInventory) | **POST** /v1/{location_id}/inventory/{variation_id} | Adjusts an item variation&#39;s current available inventory.
[**applyFee**](V1ItemsApi.md#applyFee) | **PUT** /v1/{location_id}/items/{item_id}/fees/{fee_id} | Associates a fee with an item, meaning the fee is automatically applied to the item in Square Register.
[**applyModifierList**](V1ItemsApi.md#applyModifierList) | **PUT** /v1/{location_id}/items/{item_id}/modifier-lists/{modifier_list_id} | Associates a modifier list with an item, meaning modifier options from the list can be applied to the item.
[**createCategory**](V1ItemsApi.md#createCategory) | **POST** /v1/{location_id}/categories | Creates an item category.
[**createDiscount**](V1ItemsApi.md#createDiscount) | **POST** /v1/{location_id}/discounts | Creates a discount.
[**createFee**](V1ItemsApi.md#createFee) | **POST** /v1/{location_id}/fees | Creates a fee (tax).
[**createItem**](V1ItemsApi.md#createItem) | **POST** /v1/{location_id}/items | Creates an item and at least one variation for it.
[**createModifierList**](V1ItemsApi.md#createModifierList) | **POST** /v1/{location_id}/modifier-lists | Creates an item modifier list and at least one modifier option for it.
[**createModifierOption**](V1ItemsApi.md#createModifierOption) | **POST** /v1/{location_id}/modifier-lists/{modifier_list_id}/modifier-options | Creates an item modifier option and adds it to a modifier list.
[**createPage**](V1ItemsApi.md#createPage) | **POST** /v1/{location_id}/pages | Creates a Favorites page in Square Register.
[**createVariation**](V1ItemsApi.md#createVariation) | **POST** /v1/{location_id}/items/{item_id}/variations | Creates an item variation for an existing item.
[**deleteCategory**](V1ItemsApi.md#deleteCategory) | **DELETE** /v1/{location_id}/categories/{category_id} | Deletes an existing item category.
[**deleteDiscount**](V1ItemsApi.md#deleteDiscount) | **DELETE** /v1/{location_id}/discounts/{discount_id} | Deletes an existing discount.
[**deleteFee**](V1ItemsApi.md#deleteFee) | **DELETE** /v1/{location_id}/fees/{fee_id} | Deletes an existing fee (tax).
[**deleteItem**](V1ItemsApi.md#deleteItem) | **DELETE** /v1/{location_id}/items/{item_id} | Deletes an existing item and all item variations associated with it.
[**deleteModifierList**](V1ItemsApi.md#deleteModifierList) | **DELETE** /v1/{location_id}/modifier-lists/{modifier_list_id} | Deletes an existing item modifier list and all modifier options associated with it.
[**deleteModifierOption**](V1ItemsApi.md#deleteModifierOption) | **DELETE** /v1/{location_id}/modifier-lists/{modifier_list_id}/modifier-options/{modifier_option_id} | Deletes an existing item modifier option from a modifier list.
[**deletePage**](V1ItemsApi.md#deletePage) | **DELETE** /v1/{location_id}/pages/{page_id} | Deletes an existing Favorites page and all of its cells.
[**deletePageCell**](V1ItemsApi.md#deletePageCell) | **DELETE** /v1/{location_id}/pages/{page_id}/cells | Deletes a cell from a Favorites page in Square Register.
[**deleteVariation**](V1ItemsApi.md#deleteVariation) | **DELETE** /v1/{location_id}/items/{item_id}/variations/{variation_id} | Deletes an existing item variation from an item.
[**listCategories**](V1ItemsApi.md#listCategories) | **GET** /v1/{location_id}/categories | Lists all of a location&#39;s item categories.
[**listDiscounts**](V1ItemsApi.md#listDiscounts) | **GET** /v1/{location_id}/discounts | Lists all of a location&#39;s discounts.
[**listFees**](V1ItemsApi.md#listFees) | **GET** /v1/{location_id}/fees | Lists all of a location&#39;s fees (taxes).
[**listInventory**](V1ItemsApi.md#listInventory) | **GET** /v1/{location_id}/inventory | Provides inventory information for all of a merchant&#39;s inventory-enabled item variations.
[**listItems**](V1ItemsApi.md#listItems) | **GET** /v1/{location_id}/items | Provides summary information for all of a location&#39;s items.
[**listModifierLists**](V1ItemsApi.md#listModifierLists) | **GET** /v1/{location_id}/modifier-lists | Lists all of a location&#39;s modifier lists.
[**listPages**](V1ItemsApi.md#listPages) | **GET** /v1/{location_id}/pages | Lists all of a location&#39;s Favorites pages in Square Register.
[**removeFee**](V1ItemsApi.md#removeFee) | **DELETE** /v1/{location_id}/items/{item_id}/fees/{fee_id} | Removes a fee assocation from an item, meaning the fee is no longer automatically applied to the item in Square Register.
[**removeModifierList**](V1ItemsApi.md#removeModifierList) | **DELETE** /v1/{location_id}/items/{item_id}/modifier-lists/{modifier_list_id} | Removes a modifier list association from an item, meaning modifier options from the list can no longer be applied to the item.
[**retrieveItem**](V1ItemsApi.md#retrieveItem) | **GET** /v1/{location_id}/items/{item_id} | Provides the details for a single item, including associated modifier lists and fees.
[**retrieveModifierList**](V1ItemsApi.md#retrieveModifierList) | **GET** /v1/{location_id}/modifier-lists/{modifier_list_id} | Provides the details for a single modifier list.
[**updateCategory**](V1ItemsApi.md#updateCategory) | **PUT** /v1/{location_id}/categories/{category_id} | Modifies the details of an existing item category.
[**updateDiscount**](V1ItemsApi.md#updateDiscount) | **PUT** /v1/{location_id}/discounts/{discount_id} | Modifies the details of an existing discount.
[**updateFee**](V1ItemsApi.md#updateFee) | **PUT** /v1/{location_id}/fees/{fee_id} | Modifies the details of an existing fee (tax).
[**updateItem**](V1ItemsApi.md#updateItem) | **PUT** /v1/{location_id}/items/{item_id} | Modifies the core details of an existing item.
[**updateModifierList**](V1ItemsApi.md#updateModifierList) | **PUT** /v1/{location_id}/modifier-lists/{modifier_list_id} | Modifies the details of an existing item modifier list.
[**updateModifierOption**](V1ItemsApi.md#updateModifierOption) | **PUT** /v1/{location_id}/modifier-lists/{modifier_list_id}/modifier-options/{modifier_option_id} | Modifies the details of an existing item modifier option.
[**updatePage**](V1ItemsApi.md#updatePage) | **PUT** /v1/{location_id}/pages/{page_id} | Modifies the details of a Favorites page in Square Register.
[**updatePageCell**](V1ItemsApi.md#updatePageCell) | **PUT** /v1/{location_id}/pages/{page_id}/cells | Modifies a cell of a Favorites page in Square Register.
[**updateVariation**](V1ItemsApi.md#updateVariation) | **PUT** /v1/{location_id}/items/{item_id}/variations/{variation_id} | Modifies the details of an existing item variation.


<a name="adjustInventory"></a>
# **adjustInventory**
> V1InventoryEntry adjustInventory(locationId, variationId, body)

Adjusts an item variation&#39;s current available inventory.

Adjusts an item variation&#39;s current available inventory.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String variationId = "variationId_example"; // String | The ID of the variation to adjust inventory information for.
V1AdjustInventoryRequest body = new V1AdjustInventoryRequest(); // V1AdjustInventoryRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1InventoryEntry result = apiInstance.adjustInventory(locationId, variationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#adjustInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **variationId** | **String**| The ID of the variation to adjust inventory information for. |
 **body** | [**V1AdjustInventoryRequest**](V1AdjustInventoryRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1InventoryEntry**](V1InventoryEntry.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="applyFee"></a>
# **applyFee**
> V1Item applyFee(locationId, itemId, feeId)

Associates a fee with an item, meaning the fee is automatically applied to the item in Square Register.

Associates a fee with an item, meaning the fee is automatically applied to the item in Square Register.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the fee's associated location.
String itemId = "itemId_example"; // String | The ID of the item to add the fee to.
String feeId = "feeId_example"; // String | The ID of the fee to apply.
try {
    V1Item result = apiInstance.applyFee(locationId, itemId, feeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#applyFee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the fee&#39;s associated location. |
 **itemId** | **String**| The ID of the item to add the fee to. |
 **feeId** | **String**| The ID of the fee to apply. |

### Return type

[**V1Item**](V1Item.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="applyModifierList"></a>
# **applyModifierList**
> V1Item applyModifierList(locationId, modifierListId, itemId)

Associates a modifier list with an item, meaning modifier options from the list can be applied to the item.

Associates a modifier list with an item, meaning modifier options from the list can be applied to the item.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String modifierListId = "modifierListId_example"; // String | The ID of the modifier list to apply.
String itemId = "itemId_example"; // String | The ID of the item to add the modifier list to.
try {
    V1Item result = apiInstance.applyModifierList(locationId, modifierListId, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#applyModifierList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **modifierListId** | **String**| The ID of the modifier list to apply. |
 **itemId** | **String**| The ID of the item to add the modifier list to. |

### Return type

[**V1Item**](V1Item.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCategory"></a>
# **createCategory**
> V1Category createCategory(locationId, body)

Creates an item category.

Creates an item category.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to create an item for.
V1Category body = new V1Category(); // V1Category | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Category result = apiInstance.createCategory(locationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#createCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to create an item for. |
 **body** | [**V1Category**](V1Category.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Category**](V1Category.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDiscount"></a>
# **createDiscount**
> V1Discount createDiscount(locationId, body)

Creates a discount.

Creates a discount.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to create an item for.
V1Discount body = new V1Discount(); // V1Discount | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Discount result = apiInstance.createDiscount(locationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#createDiscount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to create an item for. |
 **body** | [**V1Discount**](V1Discount.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Discount**](V1Discount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFee"></a>
# **createFee**
> V1Fee createFee(locationId, body)

Creates a fee (tax).

Creates a fee (tax).

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to create a fee for.
V1Fee body = new V1Fee(); // V1Fee | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Fee result = apiInstance.createFee(locationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#createFee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to create a fee for. |
 **body** | [**V1Fee**](V1Fee.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Fee**](V1Fee.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createItem"></a>
# **createItem**
> V1Item createItem(locationId, body)

Creates an item and at least one variation for it.

Creates an item and at least one variation for it.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to create an item for.
V1Item body = new V1Item(); // V1Item | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Item result = apiInstance.createItem(locationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#createItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to create an item for. |
 **body** | [**V1Item**](V1Item.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Item**](V1Item.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createModifierList"></a>
# **createModifierList**
> V1ModifierList createModifierList(locationId, body)

Creates an item modifier list and at least one modifier option for it.

Creates an item modifier list and at least one modifier option for it.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to create a modifier list for.
V1ModifierList body = new V1ModifierList(); // V1ModifierList | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1ModifierList result = apiInstance.createModifierList(locationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#createModifierList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to create a modifier list for. |
 **body** | [**V1ModifierList**](V1ModifierList.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1ModifierList**](V1ModifierList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createModifierOption"></a>
# **createModifierOption**
> V1ModifierOption createModifierOption(locationId, modifierListId, body)

Creates an item modifier option and adds it to a modifier list.

Creates an item modifier option and adds it to a modifier list.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String modifierListId = "modifierListId_example"; // String | The ID of the modifier list to edit.
V1ModifierOption body = new V1ModifierOption(); // V1ModifierOption | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1ModifierOption result = apiInstance.createModifierOption(locationId, modifierListId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#createModifierOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **modifierListId** | **String**| The ID of the modifier list to edit. |
 **body** | [**V1ModifierOption**](V1ModifierOption.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1ModifierOption**](V1ModifierOption.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPage"></a>
# **createPage**
> V1Page createPage(locationId, body)

Creates a Favorites page in Square Register.

Creates a Favorites page in Square Register.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to create an item for.
V1Page body = new V1Page(); // V1Page | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Page result = apiInstance.createPage(locationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#createPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to create an item for. |
 **body** | [**V1Page**](V1Page.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Page**](V1Page.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createVariation"></a>
# **createVariation**
> V1Variation createVariation(locationId, itemId, body)

Creates an item variation for an existing item.

Creates an item variation for an existing item.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String itemId = "itemId_example"; // String | The item's ID.
V1Variation body = new V1Variation(); // V1Variation | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Variation result = apiInstance.createVariation(locationId, itemId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#createVariation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **itemId** | **String**| The item&#39;s ID. |
 **body** | [**V1Variation**](V1Variation.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Variation**](V1Variation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCategory"></a>
# **deleteCategory**
> V1Category deleteCategory(locationId, categoryId)

Deletes an existing item category.

Deletes an existing item category.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String categoryId = "categoryId_example"; // String | The ID of the category to delete.
try {
    V1Category result = apiInstance.deleteCategory(locationId, categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#deleteCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **categoryId** | **String**| The ID of the category to delete. |

### Return type

[**V1Category**](V1Category.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDiscount"></a>
# **deleteDiscount**
> V1Discount deleteDiscount(locationId, discountId)

Deletes an existing discount.

Deletes an existing discount.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String discountId = "discountId_example"; // String | The ID of the discount to delete.
try {
    V1Discount result = apiInstance.deleteDiscount(locationId, discountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#deleteDiscount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **discountId** | **String**| The ID of the discount to delete. |

### Return type

[**V1Discount**](V1Discount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFee"></a>
# **deleteFee**
> V1Fee deleteFee(locationId, feeId)

Deletes an existing fee (tax).

Deletes an existing fee (tax).

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the fee's associated location.
String feeId = "feeId_example"; // String | The ID of the fee to delete.
try {
    V1Fee result = apiInstance.deleteFee(locationId, feeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#deleteFee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the fee&#39;s associated location. |
 **feeId** | **String**| The ID of the fee to delete. |

### Return type

[**V1Fee**](V1Fee.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItem"></a>
# **deleteItem**
> V1Item deleteItem(locationId, itemId)

Deletes an existing item and all item variations associated with it.

Deletes an existing item and all item variations associated with it.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String itemId = "itemId_example"; // String | The ID of the item to modify.
try {
    V1Item result = apiInstance.deleteItem(locationId, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#deleteItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **itemId** | **String**| The ID of the item to modify. |

### Return type

[**V1Item**](V1Item.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteModifierList"></a>
# **deleteModifierList**
> V1ModifierList deleteModifierList(locationId, modifierListId)

Deletes an existing item modifier list and all modifier options associated with it.

Deletes an existing item modifier list and all modifier options associated with it.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String modifierListId = "modifierListId_example"; // String | The ID of the modifier list to delete.
try {
    V1ModifierList result = apiInstance.deleteModifierList(locationId, modifierListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#deleteModifierList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **modifierListId** | **String**| The ID of the modifier list to delete. |

### Return type

[**V1ModifierList**](V1ModifierList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteModifierOption"></a>
# **deleteModifierOption**
> V1ModifierOption deleteModifierOption(locationId, modifierListId, modifierOptionId)

Deletes an existing item modifier option from a modifier list.

Deletes an existing item modifier option from a modifier list.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String modifierListId = "modifierListId_example"; // String | The ID of the modifier list to delete.
String modifierOptionId = "modifierOptionId_example"; // String | The ID of the modifier list to edit.
try {
    V1ModifierOption result = apiInstance.deleteModifierOption(locationId, modifierListId, modifierOptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#deleteModifierOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **modifierListId** | **String**| The ID of the modifier list to delete. |
 **modifierOptionId** | **String**| The ID of the modifier list to edit. |

### Return type

[**V1ModifierOption**](V1ModifierOption.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePage"></a>
# **deletePage**
> V1Page deletePage(locationId, pageId)

Deletes an existing Favorites page and all of its cells.

Deletes an existing Favorites page and all of its cells.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the Favorites page's associated location.
String pageId = "pageId_example"; // String | The ID of the page to delete.
try {
    V1Page result = apiInstance.deletePage(locationId, pageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#deletePage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the Favorites page&#39;s associated location. |
 **pageId** | **String**| The ID of the page to delete. |

### Return type

[**V1Page**](V1Page.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePageCell"></a>
# **deletePageCell**
> V1Page deletePageCell(locationId, pageId, row, column)

Deletes a cell from a Favorites page in Square Register.

Deletes a cell from a Favorites page in Square Register.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the Favorites page's associated location.
String pageId = "pageId_example"; // String | The ID of the page to delete.
String row = "row_example"; // String | The row of the cell to clear. Always an integer between 0 and 4, inclusive. Row 0 is the top row.
String column = "column_example"; // String | The column of the cell to clear. Always an integer between 0 and 4, inclusive. Column 0 is the leftmost column.
try {
    V1Page result = apiInstance.deletePageCell(locationId, pageId, row, column);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#deletePageCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the Favorites page&#39;s associated location. |
 **pageId** | **String**| The ID of the page to delete. |
 **row** | **String**| The row of the cell to clear. Always an integer between 0 and 4, inclusive. Row 0 is the top row. | [optional]
 **column** | **String**| The column of the cell to clear. Always an integer between 0 and 4, inclusive. Column 0 is the leftmost column. | [optional]

### Return type

[**V1Page**](V1Page.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVariation"></a>
# **deleteVariation**
> V1Variation deleteVariation(locationId, itemId, variationId)

Deletes an existing item variation from an item.

Deletes an existing item variation from an item.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String itemId = "itemId_example"; // String | The ID of the item to delete.
String variationId = "variationId_example"; // String | The ID of the variation to delete.
try {
    V1Variation result = apiInstance.deleteVariation(locationId, itemId, variationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#deleteVariation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **itemId** | **String**| The ID of the item to delete. |
 **variationId** | **String**| The ID of the variation to delete. |

### Return type

[**V1Variation**](V1Variation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCategories"></a>
# **listCategories**
> List&lt;V1Category&gt; listCategories(locationId)

Lists all of a location&#39;s item categories.

Lists all of a location&#39;s item categories.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to list categories for.
try {
    List<V1Category> result = apiInstance.listCategories(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#listCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to list categories for. |

### Return type

[**List&lt;V1Category&gt;**](V1Category.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDiscounts"></a>
# **listDiscounts**
> List&lt;V1Discount&gt; listDiscounts(locationId)

Lists all of a location&#39;s discounts.

Lists all of a location&#39;s discounts.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to list categories for.
try {
    List<V1Discount> result = apiInstance.listDiscounts(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#listDiscounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to list categories for. |

### Return type

[**List&lt;V1Discount&gt;**](V1Discount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFees"></a>
# **listFees**
> List&lt;V1Fee&gt; listFees(locationId)

Lists all of a location&#39;s fees (taxes).

Lists all of a location&#39;s fees (taxes).

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to list fees for.
try {
    List<V1Fee> result = apiInstance.listFees(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#listFees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to list fees for. |

### Return type

[**List&lt;V1Fee&gt;**](V1Fee.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listInventory"></a>
# **listInventory**
> List&lt;V1InventoryEntry&gt; listInventory(locationId, limit)

Provides inventory information for all of a merchant&#39;s inventory-enabled item variations.

Provides inventory information for all of a merchant&#39;s inventory-enabled item variations.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
Integer limit = 56; // Integer | The maximum number of inventory entries to return in a single response. This value cannot exceed 1000.
try {
    List<V1InventoryEntry> result = apiInstance.listInventory(locationId, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#listInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **limit** | **Integer**| The maximum number of inventory entries to return in a single response. This value cannot exceed 1000. | [optional]

### Return type

[**List&lt;V1InventoryEntry&gt;**](V1InventoryEntry.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listItems"></a>
# **listItems**
> List&lt;V1Item&gt; listItems(locationId)

Provides summary information for all of a location&#39;s items.

Provides summary information for all of a location&#39;s items.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to list items for.
try {
    List<V1Item> result = apiInstance.listItems(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#listItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to list items for. |

### Return type

[**List&lt;V1Item&gt;**](V1Item.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listModifierLists"></a>
# **listModifierLists**
> List&lt;V1ModifierList&gt; listModifierLists(locationId)

Lists all of a location&#39;s modifier lists.

Lists all of a location&#39;s modifier lists.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to list modifier lists for.
try {
    List<V1ModifierList> result = apiInstance.listModifierLists(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#listModifierLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to list modifier lists for. |

### Return type

[**List&lt;V1ModifierList&gt;**](V1ModifierList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPages"></a>
# **listPages**
> List&lt;V1Page&gt; listPages(locationId)

Lists all of a location&#39;s Favorites pages in Square Register.

Lists all of a location&#39;s Favorites pages in Square Register.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the location to list Favorites pages for.
try {
    List<V1Page> result = apiInstance.listPages(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#listPages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the location to list Favorites pages for. |

### Return type

[**List&lt;V1Page&gt;**](V1Page.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeFee"></a>
# **removeFee**
> V1Item removeFee(locationId, itemId, feeId)

Removes a fee assocation from an item, meaning the fee is no longer automatically applied to the item in Square Register.

Removes a fee assocation from an item, meaning the fee is no longer automatically applied to the item in Square Register.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the fee's associated location.
String itemId = "itemId_example"; // String | The ID of the item to add the fee to.
String feeId = "feeId_example"; // String | The ID of the fee to apply.
try {
    V1Item result = apiInstance.removeFee(locationId, itemId, feeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#removeFee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the fee&#39;s associated location. |
 **itemId** | **String**| The ID of the item to add the fee to. |
 **feeId** | **String**| The ID of the fee to apply. |

### Return type

[**V1Item**](V1Item.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeModifierList"></a>
# **removeModifierList**
> V1Item removeModifierList(locationId, modifierListId, itemId)

Removes a modifier list association from an item, meaning modifier options from the list can no longer be applied to the item.

Removes a modifier list association from an item, meaning modifier options from the list can no longer be applied to the item.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String modifierListId = "modifierListId_example"; // String | The ID of the modifier list to remove.
String itemId = "itemId_example"; // String | The ID of the item to remove the modifier list from.
try {
    V1Item result = apiInstance.removeModifierList(locationId, modifierListId, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#removeModifierList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **modifierListId** | **String**| The ID of the modifier list to remove. |
 **itemId** | **String**| The ID of the item to remove the modifier list from. |

### Return type

[**V1Item**](V1Item.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveItem"></a>
# **retrieveItem**
> V1Item retrieveItem(locationId, itemId)

Provides the details for a single item, including associated modifier lists and fees.

Provides the details for a single item, including associated modifier lists and fees.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String itemId = "itemId_example"; // String | The item's ID.
try {
    V1Item result = apiInstance.retrieveItem(locationId, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#retrieveItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **itemId** | **String**| The item&#39;s ID. |

### Return type

[**V1Item**](V1Item.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveModifierList"></a>
# **retrieveModifierList**
> V1ModifierList retrieveModifierList(locationId, modifierListId)

Provides the details for a single modifier list.

Provides the details for a single modifier list.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String modifierListId = "modifierListId_example"; // String | The modifier list's ID.
try {
    V1ModifierList result = apiInstance.retrieveModifierList(locationId, modifierListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#retrieveModifierList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **modifierListId** | **String**| The modifier list&#39;s ID. |

### Return type

[**V1ModifierList**](V1ModifierList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCategory"></a>
# **updateCategory**
> V1Category updateCategory(locationId, categoryId, body)

Modifies the details of an existing item category.

Modifies the details of an existing item category.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the category's associated location.
String categoryId = "categoryId_example"; // String | The ID of the category to edit.
V1Category body = new V1Category(); // V1Category | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Category result = apiInstance.updateCategory(locationId, categoryId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#updateCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the category&#39;s associated location. |
 **categoryId** | **String**| The ID of the category to edit. |
 **body** | [**V1Category**](V1Category.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Category**](V1Category.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDiscount"></a>
# **updateDiscount**
> V1Discount updateDiscount(locationId, discountId, body)

Modifies the details of an existing discount.

Modifies the details of an existing discount.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the category's associated location.
String discountId = "discountId_example"; // String | The ID of the discount to edit.
V1Discount body = new V1Discount(); // V1Discount | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Discount result = apiInstance.updateDiscount(locationId, discountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#updateDiscount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the category&#39;s associated location. |
 **discountId** | **String**| The ID of the discount to edit. |
 **body** | [**V1Discount**](V1Discount.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Discount**](V1Discount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFee"></a>
# **updateFee**
> V1Fee updateFee(locationId, feeId, body)

Modifies the details of an existing fee (tax).

Modifies the details of an existing fee (tax).

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the fee's associated location.
String feeId = "feeId_example"; // String | The ID of the fee to edit.
V1Fee body = new V1Fee(); // V1Fee | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Fee result = apiInstance.updateFee(locationId, feeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#updateFee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the fee&#39;s associated location. |
 **feeId** | **String**| The ID of the fee to edit. |
 **body** | [**V1Fee**](V1Fee.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Fee**](V1Fee.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItem"></a>
# **updateItem**
> V1Item updateItem(locationId, itemId, body)

Modifies the core details of an existing item.

Modifies the core details of an existing item.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String itemId = "itemId_example"; // String | The ID of the item to modify.
V1Item body = new V1Item(); // V1Item | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Item result = apiInstance.updateItem(locationId, itemId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#updateItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **itemId** | **String**| The ID of the item to modify. |
 **body** | [**V1Item**](V1Item.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Item**](V1Item.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateModifierList"></a>
# **updateModifierList**
> V1ModifierList updateModifierList(locationId, modifierListId, body)

Modifies the details of an existing item modifier list.

Modifies the details of an existing item modifier list.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String modifierListId = "modifierListId_example"; // String | The ID of the modifier list to edit.
V1UpdateModifierListRequest body = new V1UpdateModifierListRequest(); // V1UpdateModifierListRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1ModifierList result = apiInstance.updateModifierList(locationId, modifierListId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#updateModifierList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **modifierListId** | **String**| The ID of the modifier list to edit. |
 **body** | [**V1UpdateModifierListRequest**](V1UpdateModifierListRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1ModifierList**](V1ModifierList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateModifierOption"></a>
# **updateModifierOption**
> V1ModifierOption updateModifierOption(locationId, modifierListId, modifierOptionId, body)

Modifies the details of an existing item modifier option.

Modifies the details of an existing item modifier option.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String modifierListId = "modifierListId_example"; // String | The ID of the modifier list to edit.
String modifierOptionId = "modifierOptionId_example"; // String | The ID of the modifier list to edit.
V1ModifierOption body = new V1ModifierOption(); // V1ModifierOption | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1ModifierOption result = apiInstance.updateModifierOption(locationId, modifierListId, modifierOptionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#updateModifierOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **modifierListId** | **String**| The ID of the modifier list to edit. |
 **modifierOptionId** | **String**| The ID of the modifier list to edit. |
 **body** | [**V1ModifierOption**](V1ModifierOption.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1ModifierOption**](V1ModifierOption.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePage"></a>
# **updatePage**
> V1Page updatePage(locationId, pageId, body)

Modifies the details of a Favorites page in Square Register.

Modifies the details of a Favorites page in Square Register.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the Favorites page's associated location
String pageId = "pageId_example"; // String | The ID of the page to modify.
V1Page body = new V1Page(); // V1Page | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Page result = apiInstance.updatePage(locationId, pageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#updatePage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the Favorites page&#39;s associated location |
 **pageId** | **String**| The ID of the page to modify. |
 **body** | [**V1Page**](V1Page.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Page**](V1Page.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePageCell"></a>
# **updatePageCell**
> V1Page updatePageCell(locationId, pageId, body)

Modifies a cell of a Favorites page in Square Register.

Modifies a cell of a Favorites page in Square Register.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the Favorites page's associated location.
String pageId = "pageId_example"; // String | The ID of the page the cell belongs to.
V1PageCell body = new V1PageCell(); // V1PageCell | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Page result = apiInstance.updatePageCell(locationId, pageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#updatePageCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the Favorites page&#39;s associated location. |
 **pageId** | **String**| The ID of the page the cell belongs to. |
 **body** | [**V1PageCell**](V1PageCell.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Page**](V1Page.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVariation"></a>
# **updateVariation**
> V1Variation updateVariation(locationId, itemId, variationId, body)

Modifies the details of an existing item variation.

Modifies the details of an existing item variation.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.V1ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

V1ItemsApi apiInstance = new V1ItemsApi();
String locationId = "locationId_example"; // String | The ID of the item's associated location.
String itemId = "itemId_example"; // String | The ID of the item to modify.
String variationId = "variationId_example"; // String | The ID of the variation to modify.
V1Variation body = new V1Variation(); // V1Variation | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    V1Variation result = apiInstance.updateVariation(locationId, itemId, variationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1ItemsApi#updateVariation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the item&#39;s associated location. |
 **itemId** | **String**| The ID of the item to modify. |
 **variationId** | **String**| The ID of the variation to modify. |
 **body** | [**V1Variation**](V1Variation.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**V1Variation**](V1Variation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

