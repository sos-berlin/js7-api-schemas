Each order can have a compact or detailed response.<br/>
It depends on the parameter ``compact``.<br/>
* Required fields are
    * orderId
    * workflowId
    	* path
    	* version
    * position
    * priority
    * state
    	* reason (if state is WAITING)
* The compact view has further optional fields
    * attachedState
    	* agentRefPath
    * lastOutcome
    	* returnCode
    	* keyValues
    * scheduledFor
    * requirements if state is PENDING, SCHEDULED, BLOCKED or SUSPENDED
* The detailed view has the following optional fields in addition to the compact view
    * arguments
	* historicOutcome
