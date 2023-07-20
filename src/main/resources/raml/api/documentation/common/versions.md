* [JOC API 2.5.4](../../../2.5.4/raml-doc/JOC-API/index.html)
	* *NEW*
		* <a href="../../../2.5.4/raml-doc/JOC-API/resource/jocs.html" target="newtab254">./jocs</a>
		* <a href="../../../2.5.4/raml-doc/JOC-API/resource/inventory/revalidate/folder.html" target="newtab254">./inventory/revalidate/folder</a>
		* <a href="../../../2.5.4/raml-doc/JOC-API/resource/inventory/quick/search.html" target="newtab254">./inventory/quick/search</a>
		* <a href="../../../2.5.4/raml-doc/JOC-API/resource/documentations/quick/search.html" target="newtab254">./documentations/quick/search</a>
		* <a href="../../../2.5.4/raml-doc/JOC-API/resource/schedules/quick/search.html" target="newtab254">./schedules/quick/search</a>
		* <a href="../../../2.5.4/raml-doc/JOC-API/resource/locks/quick/search.html" target="newtab254">./locks/quick/search</a>
		* <a href="../../../2.5.4/raml-doc/JOC-API/resource/notice/boards/quick/search.html" target="newtab254">./notice/boards/quick/search</a>
		* <a href="../../../2.5.4/raml-doc/JOC-API/resource/workflows/quick/search.html" target="newtab254">./workflows/quick/search</a>
		* <a href="../../../2.5.4/raml-doc/JOC-API/resource/workflow/references.html" target="newtab254">./workflow/references</a>
	* *CHANGED*
		* <a href="../../../2.5.3/raml-doc/JOC-API/resource/daily_plan/orders/modify.html" target="newtab254">./daily_plan/orders/modify</a> - Request fields ``forceJobAdmission`` and ``blockPosition`` are added
		* <a href="../../../2.5.3/raml-doc/JOC-API/resource/orders/add.html" target="newtab254">./orders/add</a> - Request fields ``forceJobAdmission`` and ``blockPosition`` are added
		* <a href="../../../2.5.3/raml-doc/JOC-API/resource/orders.html" target="newtab254">./orders</a> - Request field ``stateDateFrom`` and ``stateDateTo`` are added
		* <a href="../../../2.5.3/raml-doc/JOC-API/resource/workflows.html" target="newtab254">./workflows</a> - Request field ``agentNames`` is added
		
* [JOC API 2.5.3](../../../2.5.3/raml-doc/JOC-API/index.html)
	* *NEW*
		* <a href="../../../2.5.3/raml-doc/JOC-API/resource/inventory/workflow/references.html" target="newtab253">./inventory/workflow/references</a>
	* *CHANGED*
		* <a href="../../../2.5.3/raml-doc/JOC-API/resource/orders/resume.html" target="newtab253">./orders/resume</a> - Request field ``cycleEndTime`` is added
		
* [JOC API 2.5.2](../../../2.5.2/raml-doc/JOC-API/index.html)
	* *NEW*
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/daily_plan/orders/cancel.html" target="newtab252">./daily_plan/orders/cancel</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/copy.html" target="newtab252">./descriptor/copy</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/read.html" target="newtab252">./descriptor/read</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/read/folder.html" target="newtab252">./descriptor/read/folder</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/remove.html" target="newtab252">./descriptor/remove</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/remove/folder.html" target="newtab252">./descriptor/remove/folder</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/rename.html" target="newtab252">./descriptor/rename</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/store.html" target="newtab252">./descriptor/store</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/trash/delete.html" target="newtab252">./descriptor/trash/delete</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/trash/delete/folder.html" target="newtab252">./descriptor/trash/delete/folder</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/trash/read.html" target="newtab252">./descriptor/trash/read</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/trash/read/folder.html" target="newtab252">./descriptor/trash/read/folder</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/descriptor/trash/restore.html" target="newtab252">./descriptor/trash/restore</a>
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/workflow/transition.html" target="newtab252">./workflow/transition</a>
	* *DELETED*
		* ./orders/daily_plan/cancel - Is replaced by <a href="../../../2.5.2/raml-doc/JOC-API/resource/daily_plan/orders/cancel.html" target="newtab252">./daily_plan/orders/cancel</a>
	* *CHANGED*
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/daily_plan/orders.html" target="newtab252">./daily_plan/orders</a> - Request field ``dailyPlanDate`` is replaced by ``dailyPlanDateFrom`` and ``dailyPlanDateTo``
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/daily_plan/orders/submit.html" target="newtab252">./daily_plan/orders/submit</a> - Request field ``dailyPlanDate`` is replaced by ``dailyPlanDateFrom`` and ``dailyPlanDateTo``
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/daily_plan/orders/delete.html" target="newtab252">./daily_plan/orders/delete</a> - Request field ``dailyPlanDate`` is replaced by ``dailyPlanDateFrom`` and ``dailyPlanDateTo``
		* <a href="../../../2.5.2/raml-doc/JOC-API/resource/daily_plan/orders/summary.html" target="newtab252">./daily_plan/orders/summary</a> - Request field ``dailyPlanDate`` is replaced by ``dailyPlanDateFrom`` and ``dailyPlanDateTo``
	
* [JOC API 2.5.1](../../../2.5.1/raml-doc/JOC-API/index.html)
	* *NEW*
		* <a href="../../../2.5.1/raml-doc/JOC-API/resource/agents/reset.html" target="newtab251">./agents/reset</a>
	
* [JOC API 2.5.0](../../../2.5.0/raml-doc/JOC-API/index.html)
	* *NEW*
		* <a href="../../../2.5.0/raml-doc/JOC-API/resource/notification/release.html" target="newtab250">./notification/release</a>
	* *CHANGED*
		* <a href="../../../2.5.0/raml-doc/JOC-API/resource/workflows.html" target="newtab250">./workflows</a> - Request field ``instructionStates`` is added
		* <a href="../../../2.5.0/raml-doc/JOC-API/resource/workflows/search.html" target="newtab250">./workflows/search</a> - Request fields ``states`` and``instructionStates`` are added
		
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
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/controller/register.html" target="newtab240">./controller/register</a> - Request fields ``clusterWatcher.asStandaloneAgent`` and ``clusterWatcher.primaryDirectorId`` are added
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/daily_plan/orders/modify.html" target="newtab240">./daily_plan/orders/modify</a>- Request fields ``startPosition`` and ``endPositions`` are added
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/orders/add.html" target="newtab240">./orders/add</a> - Request field ``orders`` has ``startPosition`` and ``endPositions`` in addition
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/orders/resume/positions.html" target="newtab240">./orders/resume/positions</a> - Response items of the field ``positions`` contain ``type`` and optionally ``label`` in addition
		* <a href="../../../2.4.0/raml-doc/JOC-API/resource/workflows.html" target="newtab240">./workflows</a>  - Request field ``states`` is added
		
* [JOC API 2.3.2](../../../2.3.2/raml-doc/JOC-API/index.html)
	* *NEW*
		* <a href="../../../2.3.2/raml-doc/JOC-API/resource/agents/cluster/ordering.html" target="newtab232">./agents/cluster/ordering</a>
		* <a href="../../../2.3.2/raml-doc/JOC-API/resource/agents/inventory/cluster/ordering.html" target="newtab232">./agents/inventory/cluster/ordering</a>
		* <a href="../../../2.3.2/raml-doc/JOC-API/resource/agents/inventory/cluster/subagents/ordering.html" target="newtab232">./agents/inventory/cluster/subagents/ordering</a>
		* <a href="../../../2.3.2/raml-doc/JOC-API/resource/agents/inventory/ordering.html" target="newtab232">./agents/inventory/ordering</a>
		* <a href="../../../2.3.2/raml-doc/JOC-API/resource/joc/license.html" target="newtab232">./joc/license</a>
	* *CHANGED*
		* <a href="../../../2.3.2/raml-doc/JOC-API/resource/iam/accounts.html" target="newtab232">./iam/accounts</a> - Request field ``enabled`` is added 
		* <a href="../../../2.3.2/raml-doc/JOC-API/resource/iam/accounts/delete.html" target="newtab232">./iam/accounts/delete</a> - Request field ``enabled`` is added 
		* <a href="../../../2.3.2/raml-doc/JOC-API/resource/orders/history.html" target="newtab232">./orders/history</a> - Request ...
		* <a href="../../../2.3.2/raml-doc/JOC-API/resource/tasks/history.html" target="newtab232">./tasks/history</a> - Request ...
			
* [JOC API 2.3.1](../../../2.3.1/raml-doc/JOC-API/index.html)
	* *CHANGED*
		* <a href="../../../2.3.1/raml-doc/JOC-API/resource/yade/transfers.html" target="newtab231">./yade/transfers</a> - Request field ``transferIds`` is deleted, ``sourceFiles`` replaces ``sourceFile``, ``targetFiles`` replaces ``targetFile`` and ``workflowNames`` is added
		* <a href="../../../2.3.1/raml-doc/JOC-API/resource/yade/files.html" target="newtab231">./yade/files</a> - Request field ``sourceFiles`` replaces ``sourceFile`` and ``targetFiles`` replaces ``targetFile``
		
* [JOC API 2.3.0](../../../2.3.0/raml-doc/JOC-API/index.html)
	* *REPLACED*
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agent/delete.html" target="newtab230">./agent/delete</a> replaces _./agent/remove_
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/reassign.html" target="newtab230">./agents/inventory/reassign</a> replaces _./agent/reassign_
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/cluster/subagents/delete.html" target="newtab230">./agents/inventory/cluster/subagents/delete</a> replaces _./agent/subagents/remove_
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/cluster/subagents/store.html" target="newtab230">./agents/inventory/cluster/subagents/store</a> replaces _./agent/subagents/store_
	* *NEW*
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/cluster.html" target="newtab230">./agents/cluster</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/cluster/revoke.html" target="newtab230">./agents/cluster/revoke</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/cluster/delete.html" target="newtab230">./agents/cluster/delete</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory.html" target="newtab230">./agents/inventory</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/cluster.html" target="newtab230">./agents/inventory/cluster</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/cluster/deploy.html" target="newtab230">./agents/inventory/cluster/deploy</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/cluster/revoke.html" target="newtab230">./agents/inventory/cluster/revoke</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/cluster/subagent.html" target="newtab230">./agents/inventory/cluster/subagent</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/cluster/subagent/reset.html" target="newtab230">./agents/inventory/cluster/subagent/reset</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/cluster/subagents/disable.html" target="newtab230">./agents/inventory/cluster/subagents/disable</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/cluster/subagents/enable.html" target="newtab230">./agents/inventory/cluster/subagents/enable</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/cluster/store.html" target="newtab230">./agents/inventory/cluster/store</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/deploy.html" target="newtab230">./agents/inventory/deploy</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/disable.html" target="newtab230">./agents/inventory/disable</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/enable.html" target="newtab230">./agents/inventory/enable</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/revoke.html" target="newtab230">./agents/inventory/revoke</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory/store.html" target="newtab230">./agents/inventory/store</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/agents/inventory.html" target="newtab230">./agents/inventory</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/inventory/repository/git/add.html" target="newtab230">./inventory/repository/git/add</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/inventory/repository/git/ckeckout.html" target="newtab230">./inventory/repository/git/ckeckout</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/inventory/repository/git/clone.html" target="newtab230">./inventory/repository/git/clone</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/inventory/repository/git/commit.html" target="newtab230">./inventory/repository/git/commit</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/inventory/repository/git/credentials.html" target="newtab230">./inventory/repository/git/credentials</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/inventory/repository/git/credentials/add.html" target="newtab230">./inventory/repository/git/credentials/add</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/inventory/repository/git/credentials/remove.html" target="newtab230">./inventory/repository/git/credentials/remove</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/inventory/repository/git/pull.html" target="newtab230">./inventory/repository/git/pull</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/inventory/repository/git/push.html" target="newtab230">./inventory/repository/git/push</a>
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/inventory/repository/git/pull.html" target="newtab230">./inventory/repository/git/pull</a>
	* *CHANGED*
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/inventory/read/configuration.html" target="newtab230">./inventory/read/configuration</a> - Request field ``commitId`` is added
		* <a href="../../../2.3.0/raml-doc/JOC-API/resource/yade/files.html" target="newtab230">./yade/files</a> - Request field ``integrityHash`` is added
			
* [JOC API 2.2.2](../../../2.2.2/raml-doc/JOC-API/index.html)
* [JOC API 2.2.1&nbsp;&nbsp;(same as 2.2.0)](../../../2.2.0/raml-doc/JOC-API/index.html)
* [JOC API 2.2.0](../../../2.2.0/raml-doc/JOC-API/index.html)
* [JOC API 2.1.2&nbsp;&nbsp;(same as 2.1.1)](../../../2.1.1/raml-doc/JOC-API/index.html)
* [JOC API 2.1.1](../../../2.1.1/raml-doc/JOC-API/index.html)
* [JOC API 2.0.1](../../../2.0.1/raml-doc/JOC-API/index.html)
* [JOC API 2.0.0](../../../2.0.0/raml-doc/JOC-API/index.html)
