* Only suspended or failed Orders of the same Workflow are considered
	* If all Orders neither suspened nor failed then an error is raised with HTTP 420
	* If the Orders are from different Workflows then the answer contains the field ``disabledPositionChange`` with
		* <code>{ "code": "NOT_ONE_WORKFLOW" }</code>
		* In this case a resume of the Orders is only possible without changing the position
	* Considered Orders are listed in the field ``orderIds``
* The field ``positions`` lists all *common* allowed position for resume
	* If there is no common position then the answer contains the field ``disabledPositionChange`` with
		* <code>{ "code": "NO_COMMON_POSITIONS" }</code>
		* In this case a resume of the Orders is only possible without changing the position
		* For example: If the "main" Order and a "child" Order (of a fork) are requested then they cannot have common allowed positions
* If only one Order is requested then some fields are in addition in the answer
	* ``variables``: It contains a merge of the returned values of all previous jobs
	* ``variablesNotSettable``: true or false
		* It is true if the current position is at the beginning of the Order's scope
		* In this case a resume of the Order is only possible without setting any variables
		* For example: The first position of the Workflow for a "main" Order or the first position of a branch in a fork for a "child" Order