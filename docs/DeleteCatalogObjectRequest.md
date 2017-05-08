
# DeleteCatalogObjectRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**objectId** | **String** | The ID of the [CatalogObject](#type-catalogobject) to be deleted. When an object is deleted, other objects in the graph that depend on that object will be deleted as well (for example, deleting a [CatalogItem](#type-catalogitem) will delete its [CatalogItemVariation](#type-catalogitemvariation)s). | 



