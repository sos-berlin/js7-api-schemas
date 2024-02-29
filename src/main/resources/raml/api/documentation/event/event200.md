Different events trigger the following different actions:

* Update ``Dashboard Widgets``
	* ``Components Status``: once for any of the following events
		* **JOCStateChanged**
		* **ControllerStateChanged**
		* **ProxyCoupled**
		* **ProxyDecoupled**
	* ``Controller Status``: once for any of the following events
		* **ControllerStateChanged**
		* **ProxyCoupled**
		* **ProxyDecoupled**
	* ``Agent Status``: once for any of the following events
		* **AgentStateChanged**
		* **ProxyCoupled**
		* **ProxyDecoupled**
		* **ItemAdded** (with "objectType": "AGENT")
		* **ItemDeleted** (with "objectType": "AGENT")
		* **ItemChanged** (with "objectType": "AGENT")
	* ``Agent Running Jobs``: once for the following event
		* **JobStateChanged**
		* **AgentStateChanged**
		* **ProxyCoupled**
		* **ProxyDecoupled**
	* ``Order Summary``: once for the following event
		* **WorkflowStateChanged**
		* **ProxyCoupled**
		* **ProxyDecoupled**
	* ``History`` (failed/successful Orders): once for the following event
		* **HistoryOrderTerminated** (is sent only in an active JOC Cockpit node)
	* ``History`` (failed/successful Jobs): once for the following event
		* **HistoryTaskTerminated** (is sent only in an active JOC Cockpit node)
* Update ``Manage Controller/Agents View``: for each following event
	* **ItemAdded** (with "objectType": "AGENT")
	* **ItemDeleted** (with "objectType": "AGENT")
	* **ItemChanged** (with "objectType": "AGENT")
* Update ``Inventory View``: for each following event
	* **InventoryUpdated**
		* It contains the changed folder in the "path" field
	* **InventoryTreeUpdated**
		* It contains the parent folder in the "path" field to update the tree
* Update ``Inventory Trash View``: for each following event
	* **InventoryTrashUpdated**
		* It contains the changed folder in the "path" field
	* **InventoryTrashTreeUpdated**
		* It contains the parent folder in the "path" field to update the tree
* Update ``Workflow View``: for each following event
	* **WorkflowStateChanged**
		* It contains the changed Workflow in the "path" and "versionId" field
		* The Workflow itself is not changed but its Orders -> only the Orders need to update 
	* **ItemAdded** (with "objectType": "WORKFLOW")
	* **ItemDeleted** (with "objectType": "WORKFLOW")
	* **ItemChanged** (with "objectType": "WORKFLOW") 
		* They contain the added/deleted/changed Workflow in the "path" field
		* The Workflow itself is changed -> the tree and the list need to update
	* **WorkflowUpdated**
		* It contains the changed Workflow(s) in the "path" field
		* The Orders are not changed but the workflow(s) -> the list needs to update (not the tree)
* Update ``Notice Board View``: for each following event
	* **BoardStateChanged**
		* It contains the changed Notice Board in the "path" field
		* The Notice Board itself is not changed -> only the notices need to update
	* **ItemAdded** (with "objectType": "NOTICEBOARD")
	* **ItemDeleted** (with "objectType": "NOTICEBOARD")
	* **ItemChanged** (with "objectType": "NOTICEBOARD") 
		* They contain the added/deleted/changed Notice Board in the "path" field
		* The Notice Board itself is changed -> the tree and the list need to update
* Update ``Lock View``: for each following event
	* **LockStateChanged**
		* It contains the changed Lock in the "path" field
		* The Lock itself is not changed -> only numbers of waiting/holding orders need to update
	* **ItemAdded** (with "objectType": "LOCK")
	* **ItemDeleted** (with "objectType": "LOCK")
	* **ItemChanged** (with "objectType": "LOCK") 
		* They contain the added/deleted/changed Lock in the "path" field
		* The Lock itself is changed -> the tree and the list need to update
* Update ``Calendar View``: for each following event
	* to be continued...
* Update ``Documentation View``: for each following event
	* **DocumentationUpdated**
		* It contains the changed folder in the "path" field
	* **DocumentationTreeUpdated**
		* It contains the parent folder in the "path" field to update the tree
* Update ``History View`` and ``History Tabs`` in ``Workflow View``: 
	* Order Tab: once for following event
		* **HistoryOrderStarted**  (is sent only in an active JOC Cockpit node)
		* **HistoryOrderTerminated**  (is sent only in an active JOC Cockpit node)
	* Task Tab: once for following event
		* **HistoryTaskStarted**  (is sent only in an active JOC Cockpit node)
		* **HistoryTaskTerminated**  (is sent only in an active JOC Cockpit node)
* Update ``DailyPlan View``: for each following event 
	* **DailyPlanUpdated**
		* It contains the changed date in the "message" field
* Update ``Reporting View - Report Run History tab``: for each following event 
    * **ReportRunsUpdated**
    * **ReportsUpdated**
* Update ``Reporting View - Generated Reports tab``: 
    * **ReportsUpdated**
* Alert ``Problem``: for each following event
	* **ProblemEvent** 
		* It contains a message in the "message" field
		* Use a red color as background-color
	* **ProblemAsHintEvent** 
		* It contains a message in the "message" field
		* Use a yellow color as background-color 
		