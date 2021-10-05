Each lock can have a compact or detailed response.<br/>
It depends on the parameter ``compact``.<br/>
* Required fields are
    * lock
    	* path
    	* versionDate
    	* state
    	* limit
    * acquiredLockCount
    * ordersHoldingLocksCount
    * ordersWaitingForLocksCount
* The compact view has further optional fields
    * title
    * documentationName
* The detailed view has the following optional fields in addition to the compact view
	* workflows
	
	Each workflow has the fields<br/>
		* path
		* versionId
		* ordersHoldingLocks
			* lock
				* type (EXCLUSIVE, SHARED)
				* count
			* orders
		* ordersWaitingForLocks
			* lock
				* type (EXCLUSIVE, SHARED)
				* count
			* orders

