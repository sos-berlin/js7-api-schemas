* ``variables``: It contains a merge of the returned values of all previous jobs
* ``variablesNotSettable``: true or false
	* It is true if the requested ``position`` is at the beginning of the Order's scope
	* In this case a resume of the Order is only possible without setting any variables
	* For example: The first position of the Workflow for a "main" Order or the first position of a branch in a fork for a "child" Order