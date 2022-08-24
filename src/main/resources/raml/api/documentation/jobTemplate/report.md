The response reports the changes of the requested workflows.
The report for each workflow has the following fields

* path
* state ("SKIPPED", "UPTODATE", "CHANGED", "PERMISSION_DENIED")
* jobs (is a map where the key is the job name. Each job report has the following fields)
	* jobTemplateName (optional, only if the job was created by a job template)
	* state ("SKIPPED", "UPTODATE", "CHANGED", "TEMPLATE_REFERENCE_DELETED", "PERMISSION_DENIED")

