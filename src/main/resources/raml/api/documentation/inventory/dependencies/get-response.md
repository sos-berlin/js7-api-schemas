* requestedItems

    a set of <i>ids</i> representing the items from the request

* objects

    a map of all items related to the requested items. The items <i>id</i> is the key of this map.

    Each item of this map contains the following properties:
    
* id

    The numeric identifier of this object.

* name

    The name of the object.

* objectType

    The type of the object

* path

    The path of the object.

* released

    A boolean flag that shows if the current state of the object is already released.

* deployed

    A boolean flag that shows if the current state of the object is already deployed.

* valid

    A boolean flag that shows if the current state of the object is valid.

* references

    A set of ids of objects that are referenced by the object.

* referencedBy

    A set of ids of objects that this object is referenced by.

* enforcedReferences

    A set of ids of objects that are referenced by the object and have to be published together with it.

* enforcedReferencedBy

    A set of ids of objects that this object is referenced by and have to be published together with it.

