Each transfer can have a compact or detailed response.<br/>
It depends on the parameter ``compact``.
* The compact view has the following fields
    * surveyDate
    * id
    * historyId
    * profile
    * state
    * controllerId
    * _operation
    * source
    	* account
    	* host
    	* port
    	* protocol
    * target
    	* account
    	* host
    	* port
    	* protocol
    * numOfFiles
    * start
    * end
    * error
* The detailed view has the following fields in addition to the compact view
    * jump
    	* host
    	* user
    	* port
    	* protocol
    * workflowPath
    * orderId
    * job
    * jobPosition
