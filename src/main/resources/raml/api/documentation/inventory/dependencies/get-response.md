* requestedItems
** a set of <i>requested item</i>s
** A <i>requested item</i> contains the following properties:
*** name
**** the <i>name</i> of the inventory object
*** type
**** the <i>configuration type</i> of the inventory object
*** configuration
**** the json <i>configuration</i> and meta data of the inventory object
*** referencedBy
**** a set of dependend inventory objects the requested inventory object is <i>referenced by</i>
*** references
**** a set of dependend inventory objects the requested inventory object is <i>references</i> itself

* affectedItems
** a set of inventory objects that are related to one or more of the referenced items of the <i>requested items</i>.