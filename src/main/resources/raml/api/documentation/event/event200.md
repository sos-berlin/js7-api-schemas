Different events trigger the following different actions:

* Update ``Dashboard Widgets``
	* ``JS7 Cluster Status``: once for any of the following events
		* **JOCStateChanged**
		* **ControllerStateChanged**
		* **ProxyCoupled**
		* **ProxyDecoupled**
	* ``JS7 Controller Status``: once for any of the following events
		* **ControllerStateChanged**
		* **ProxyCoupled**
		* **ProxyDecoupled**
	* ``Agent Status``: once for any of the following events
		* **AgentStateChanged**
		* **ProxyCoupled**
		* **ProxyDecoupled**
		* **ItemAdded** (with "objectype": "AGENT")
		* **ItemDeleted** (with "objectype": "AGENT")
		* **ItemChanged** (with "objectype": "AGENT")
	* ``Agent Running Tasks``: once for the following event
		* **JobStateChanged**
	* ``Order Summary``: once for the following event
		* **WorkflowStateChanged**
	* ``Order History``: once for the following event
		* **HistoryOrderTerminated**
	* ``Task History``: once for the following event
		* **HistoryTaskTerminated**
* Update ``Inventory View``: for each following event
	* **InventoryUpdated**
		* It contains the changed folder in the "path" field
* Update ``Workflow View``: for each following event
	* **WorkflowStateChanged**
		* It contains the changed Workflow in the "path" field
		* The Workflow itself is not changed but its Orders -> only the Orders need to update 
	* **ItemAdded** (with "objectype": "WORKFLOW")
	* **ItemDeleted** (with "objectype": "WORKFLOW")
	* **ItemChanged** (with "objectype": "WORKFLOW") 
		* They contain the added/deleted/changed Workflow in the "path" field
		* The Workflow itself is changed -> the tree and the list need to update
* Update ``Lock View``: for each following event
	* **LockStateChanged**
		* It contains the changed Lock in the "path" field
		* The Lock itself is not changed -> only numbers of waiting/holding orders need to update
	* **ItemAdded** (with "objectype": "LOCK")
	* **ItemDeleted** (with "objectype": "LOCK")
	* **ItemChanged** (with "objectype": "LOCK") 
		* They contain the added/deleted/changed Lock in the "path" field
		* The Lock itself is changed -> the tree and the list need to update
* Update ``Calendar View``: for each following event
	* to be continued...
* Update ``History View``: 
	* Order Tab: once for following event
		* to be continued...
	* Task Tab: once for following event
		* to be continued...
* Alert ``Problem``: for each following event
	* **ProblemEvent** 
		* but only in that browser window where the accesstoken of the event equals the window's accesstoken.
		* It contains a message in the message" field 
		