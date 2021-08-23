Each workflow can have a compact or detailed response.
It depends on the parameter compact.

* Required fields of a compact view are
	* path
	* versionId
	* isCurrentVersion
	* versionDate
	* state
* The compact view have further optional fields
	* title
	* orderPreparation
	* forklistParameters
	* documentationName
	* hasExpectedNoticeBoard
	* hasPostNoticeBoard
* The detailed view has the following required fields in addition to the compact view
	* instructions
	* jobs
* The detailed view has the following optional fields in addition to the compact view
	* fileOrderSources
	* jobResourceNames
