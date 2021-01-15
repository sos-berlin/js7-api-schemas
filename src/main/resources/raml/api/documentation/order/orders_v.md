Each order can have a compact or detailed response.<br/>
It depends on the parameter ``compact``.<br/>
* Required fields are
    * orderId
    * workflowId
    	* path
    	* version
    * position
    * state
* The compact view has further optional fields
    * arguments
    * attachedState
    	* agentRefPath
    * lastOutcome
    	* returnCode
    	* keyValues
    * scheduledFor
* The detailed view has the following optional fields in addition to the compact view
	* historicOutcome
