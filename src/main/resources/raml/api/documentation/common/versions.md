* [JOC API 2.5.0](../../../2.5.0/raml-doc/JOC-API/index.html)
* [JOC API 2.4.1](../../../2.4.1/raml-doc/JOC-API/index.html)
	* *NEW*
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/agents/export.html" target="newtab241">./agents/export</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/agents/import.html" target="newtab241">./agents/import</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/calendars/search.html" target="newtab241">./calendars/search</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/iam/sessions.html" target="newtab241">./iam/sessions</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/iam/sessions/cancel.html" target="newtab241">./iam/sessions/cancel</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/job/update.html" target="newtab241">./inventory/job/update</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/search.html" target="newtab241">./inventory/search</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/workflows/update.html" target="newtab241">./inventory/workflows/update</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/job_template.html" target="newtab241">./job_template</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/job_template/state.html" target="newtab241">./job_template/state</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/job_templates.html" target="newtab241">./job_templates</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/job_templates/propagate.html" target="newtab241">./job_templates/propagate</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/job_templates/used.html" target="newtab241">./job_templates/used</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/joc/versions.html" target="newtab241">./joc/versions</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/locks/search.html" target="newtab241">./locks/search</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/notice/boards/search.html" target="newtab241">./notice/boards/search</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/workflow/order_templates.html" target="newtab241">./workflow/order_templates</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/workflows/search.html" target="newtab241">./workflows/search</a>
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/locks/search.html" target="newtab241">./locks/search</a>
	* *CHANGED*
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/audit_log.html" target="newtab241">./audit_log</a> - Request field ``objectTypes`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/export.html" target="newtab241">./inventory/export</a> - Request field ``releasables...objectType`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/export/folder.html" target="newtab241">./inventory/export/folder</a> - Request field ``shallowCopy.objectTypes`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/delete_draft.html" target="newtab241">./inventory/delete_draft</a> - Request field ``objectType`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/path.html" target="newtab241">./inventory/path</a> - Request field ``objectType`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/read/configuration.html" target="newtab241">./inventory/read/configuration</a> - Request field ``objectType`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/read/folder.html" target="newtab241">./inventory/read/folder</a> - Request field ``objectTypes`` has "JOB_TEMPLATE" as possible value - Response field ``jobTemplates`` is added
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/release.html" target="newtab241">./inventory/release</a> - Request field ``objectType`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/releasable.html" target="newtab241">./inventory/releasable</a> - Request field ``objectType`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/releasables.html" target="newtab241">./inventory/releasables</a> - Request field ``objectTypes`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/remove.html" target="newtab241">./inventory/remove</a> - Request field ``objectType`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/replace.html" target="newtab241">./inventory/replace</a> - Request field ``objectType`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/statistics.html" target="newtab241">./inventory/statistics</a> - Response field ``numOfJobTemplates`` is added
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/store.html" target="newtab241">./inventory/store</a> - Request field ``objectType`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/trash/delete.html" target="newtab241">./inventory/trash/delete</a> - Request field ``objectType`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/trash/read/configuration.html" target="newtab241">./inventory/trash/read/configuration</a> - Request field ``objectType`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/trash/read/folder.html" target="newtab241">./inventory/trash/read/folder</a> - Request field ``objectTypes`` has "JOB_TEMPLATE" as possible value
		* <a href="../../../2.4.1/raml-doc/JOC-API/resource/inventory/wizard/job.html" target="newtab241">./inventory/wizard/job</a> - Response field ``arguments`` replaces ``params`` with a new schema
		
* [JOC API 2.4.0](../../../2.4.0/raml-doc/JOC-API/index.html)
	* *NEW*
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/audit_log/login_history.html" target="newtab240">./audit_log/login_history</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/iam/blockedAccount/store.html" target="newtab240">./iam/blockedAccount/store</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/iam/blockedAccounts.html" target="newtab240">./iam/blockedAccounts</a>		
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/iam/blockedAccounts/delete.html" target="newtab240">./iam/blockedAccounts/delete</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/inventory/export/folder.html" target="newtab240">./inventory/export/folder</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/inventory/favorites.html" target="newtab240">./inventory/favorites</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/inventory/favorites/delete.html" target="newtab240">./inventory/favorites/delete</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/inventory/favorites/make_private.html" target="newtab240">./inventory/favorites/make_private</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/inventory/favorites/ordering.html" target="newtab240">./inventory/favorites/ordering</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/inventory/favorites/rename.html" target="newtab240">./inventory/favorites/rename</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/inventory/favorites/share.html" target="newtab240">./inventory/favorites/share</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/inventory/favorites/store.html" target="newtab240">./inventory/favorites/store</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/inventory/favorites/take_over.html" target="newtab240">./inventory/favorites/take_over</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/inventory/read/order/positions.html" target="newtab240">./inventory/read/order/positions</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/inventory/releasables/recall.html" target="newtab240">./inventory/releasables/recall</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/notification.html" target="newtab240">./notification</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/notification/delete.html" target="newtab240">./notification/delete</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/notification/store.html" target="newtab240">./notification/store</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/orders/add/positions.html" target="newtab240">./orders/add/positions</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/profile/pref.html" target="newtab240">./profile/pref</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/profile/pref/store.html" target="newtab240">./profile/pref/store</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/profiles.html" target="newtab240">./profiles</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/profiles/delete.html" target="newtab240">./profiles/delete</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/settings.html" target="newtab240">./settings</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/settings/store.html" target="newtab240">./settings/store</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/workflow/skip.html" target="newtab240">./workflow/skip</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/workflow/stop.html" target="newtab240">./workflow/stop</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/workflow/state.html" target="newtab240">./workflow/state</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/workflow/unskip.html" target="newtab240">./workflow/unskip</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/workflow/unstop.html" target="newtab240">./workflow/unstop</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/workflows/resume.html" target="newtab240">./workflows/resume</a>
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/workflows/suspend.html" target="newtab240">./workflows/suspend</a>
	* *CHANGED*
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/agents.html" target="newtab240">./agents</a> - Response: each agent has the ``version`` in addition and the ``state`` can contain a ``_reason``. "RESET" is not longer a state. It is a reason for the new state "INITIALSED"
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/controller/register.html" target="newtab240">./controller/register</a> - Request field ``clusterWatcher.asStandaloneAgent`` and ``clusterWatcher.primaryDirectorId`` are added
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/daily_plan/orders/modify.html" target="newtab240">./daily_plan/orders/modify</a>- Request fields ``startPosition`` and ``endPositions`` are added
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/orders/add.html" target="newtab240">./orders/add</a> - Request field ``orders`` has ``startPosition`` and ``endPositions`` in addition
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/orders/resume/positions.html" target="newtab240">./orders/resume/positions</a> - Response items of the field ``positions`` contain ``type`` and optionally ``label`` in addition
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/workflows.html" target="newtab240">./workflows</a>  - Request field ``states`` is added
		
* [JOC API 2.3.1](../../../2.3.1/raml-doc/JOC-API/index.html)
* [JOC API 2.3.0](../../../2.3.0/raml-doc/JOC-API/index.html)
* [JOC API 2.2.2](../../../2.2.2/raml-doc/JOC-API/index.html)
* [JOC API 2.2.1&nbsp;&nbsp;(same as 2.2.0)](../../../2.2.0/raml-doc/JOC-API/index.html)
* [JOC API 2.2.0](../../../2.2.0/raml-doc/JOC-API/index.html)
* [JOC API 2.1.2&nbsp;&nbsp;(same as 2.1.1)](../../../2.1.1/raml-doc/JOC-API/index.html)
* [JOC API 2.1.1](../../../2.1.1/raml-doc/JOC-API/index.html)
* [JOC API 2.0.1](../../../2.0.1/raml-doc/JOC-API/index.html)
* [JOC API 2.0.0](../../../2.0.0/raml-doc/JOC-API/index.html)
