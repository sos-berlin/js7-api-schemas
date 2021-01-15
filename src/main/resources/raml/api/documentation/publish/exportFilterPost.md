<tr>
<td>``exportFile``</td>
<td>required, object</td>
<td>This objects describes the export file with ``filename`` and ``format``.</td>
<td><div style="padding-left:10px;">"exportFile" : {</div>
    <div style="padding-left:10px;">"filename" : "test_export.zip",</div>
    <div style="padding-left:10px;">"format" : "ZIP"</div>
    <div style="padding-left:10px;">}</div></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``filename``</td>
<td>required, string</td>
<td></td>
<td>"filename" : "test_export.zip"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``format``</td>
<td>required, enum</td>
<td>The desired ``format`` of the export archive file. The enum archiveFormat for the value consist of ZIP and TAR_GZ</td>
<td>"format" : "ZIP"</td>
<td></td>
</tr>
<tr>
<td>``forSigning``</td>
<td>required oneOf(``forSigning``, ``shallowCopy``), object</td>
<td>Object consists of a ``controllerId`` and a ``deployables`` object.</td>
<td>"forSigning" : {
<div style="padding-left:10px;">"controllerId" : "testsuite",</div>
<div style="padding-left:10px;">"deployables" : {</div>
<div style="padding-left:20px;">...example see below...</div>
<div style="padding-left:10px;">}</div>
}</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``controllerId``</td>
<td>required, string</td>
<td>ControllerId of the controller the export is meant for.</td>
<td>"controllerId" : "testsuite"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``deployables``</td>
<td>required, object</td>
<td>Contains a set of deployable draft objects and/or a set of already deployed objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:40px;">``draftConfigurations``</td>
<td>required anyOf(``draftConfigurations``, ``deployConfigurations``), array</td>
<td>An array of draft configuration of deployable objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``configuration``</td>
<td>required, object</td>
<td>A configuration or a Folder specified by its ``path`` and ``objectType``. If draft configurations are specified by a folder, all draft items from the folder will be processed.</td>
<td><div style="padding-left:10px;">"configuration" : {</div>
<div style="padding-left:20px;">"path" : "/myWorkflows/ifElseWorkflow/workflow_10",</div>
<div style="padding-left:20px;">"objectType" : "WORKFLOW"</div>
<div style="padding-left:10px;">}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``path``</td>
<td>required, string</td>
<td></td>
<td>"path" : "/myWorkflows/ifElseWorkflow/workflow_10"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``objectType``</td>
<td>required, enum</td>
<td>Subset of deployable objects from the enum ConfigurationType. The subset consist of WORKFLOW, JUNCTION, LOCK, JOBCLASS and FOLDER.</td>
<td>"objectType" : "WORKFLOW"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``recursive``</td>
<td>optional, boolean</td>
<td>Decides if a given folder should be processed recursively.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>
<tr>
<td style="padding-left:40px;">``deployConfigurations``</td>
<td>required anyOf(``draftConfigurations``, ``deployConfigurations``), array</td>
<td>An array of already deployed configuration objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``configuration``</td>
<td>required, object</td>
<td>An already deployed configuration specified by its ``path``, ``objectType`` and ``commitId`` OR a folder specified by ``path`` and ``objectType`` only. If already deployed configurations are specified by a folder, all latest deployments of the items from the folder will be processed.</td>
<td><div style="padding-left:10px;">"configuration" : {</div>
<div style="padding-left:20px;">"path" : "/myWorkflows/ifElseWorkflow/workflow_12",</div>
<div style="padding-left:20px;">"objectType" : "WORKFLOW",</div>
<div style="padding-left:20px;">"commitId" : "4273b6c6-c354-4fcd-afdb-2758088abe4a"</div>
<div style="padding-left:10px;">}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``path``</td>
<td>required, string</td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``objectType``</td>
<td>required, enum</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``commitId``</td>
<td>optional, string</td>
<td>The ``commitId`` of the deployment of the already deployed configuration. If no commitId is set the latest deployment of the configuration will be processed.</td>
<td>"commitId" : "4273b6c6-c354-4fcd-afdb-2758088abe4a"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``recursive``</td>
<td>optional, boolean</td>
<td>see above.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>
<tr>
<td>``shallowCopy``</td>
<td>required oneOf(``forSigning``, ``shallowCopy``), object</td>
<td>Object  of ``deployables`` and ``releasables`` objects.</td>
<td>"shallowCopy" : {
<div style="padding-left:10px;">"deployables" : {</div>
<div style="padding-left:20px;">...example see below...</div>
<div style="padding-left:10px;">}, {</div>
<div style="padding-left:10px;">"releasables" : {</div>
<div style="padding-left:20px;">...example see below...</div>
<div style="padding-left:10px;">}</div>
}</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``deployables``</td>
<td>required, object</td>
<td>Contains a set of deployable draft objects and/or a set of already deployed objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:40px;">``draftConfigurations``</td>
<td>required anyOf(``draftConfigurations``, ``deployConfigurations``), array</td>
<td>An array of draft configuration of deployable objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``configuration``</td>
<td>required, object</td>
<td>A configuration or a Folder specified by its ``path`` and ``objectType``. If draft configurations are specified by a folder, all draft items from the folder will be processed.</td>
<td><div style="padding-left:10px;">"configuration" : {</div>
<div style="padding-left:20px;">"path" : "/myWorkflows/ifElseWorkflow/workflow_10",</div>
<div style="padding-left:20px;">"objectType" : "WORKFLOW"</div>
<div style="padding-left:10px;">}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``path``</td>
<td>required, string</td>
<td></td>
<td>"path" : "/myWorkflows/ifElseWorkflow/workflow_10"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``objectType``</td>
<td>required, enum</td>
<td>Subset of deployable objects from the enum ConfigurationType. The subset consist of WORKFLOW, JUNCTION, LOCK, JOBCLASS and FOLDER.</td>
<td>"objectType" : "WORKFLOW"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``recursive``</td>
<td>optional, boolean</td>
<td>Decides if a given folder should be processed recursively.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>
<tr>
<td style="padding-left:40px;">``deployConfigurations``</td>
<td>required anyOf(``draftConfigurations``, ``deployConfigurations``), array</td>
<td>An array of already deployed configuration objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``configuration``</td>
<td>required, object</td>
<td>An already deployed configuration specified by its ``path``, ``objectType`` and ``commitId`` OR a folder specified by ``path`` and ``objectType`` only. If already deployed configurations are specified by a folder, all latest deployments of the items from the folder will be processed.</td>
<td><div style="padding-left:10px;">"configuration" : {</div>
<div style="padding-left:20px;">"path" : "/myWorkflows/ifElseWorkflow/workflow_12",</div>
<div style="padding-left:20px;">"objectType" : "WORKFLOW",</div>
<div style="padding-left:20px;">"commitId" : "4273b6c6-c354-4fcd-afdb-2758088abe4a"</div>
<div style="padding-left:10px;">}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``path``</td>
<td>required, string</td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``objectType``</td>
<td>required, enum</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``commitId``</td>
<td>optional, string</td>
<td>The ``commitId`` of the deployment of the already deployed configuration. If no commitId is set the latest deployment of the configuration will be processed.</td>
<td>"commitId" : "4273b6c6-c354-4fcd-afdb-2758088abe4a"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``recursive``</td>
<td>optional, boolean</td>
<td>see above.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>
<tr>
<tr>
<td style="padding-left:40px;">``withoutInvalid``</td>
<td>optional, boolean</td>
<td>Decides if invalid draft objects are excluded from export.</td>
<td>"withoutInvalid" : true</td>
<td>false</td>
</tr>
<td style="padding-left:20px;">``releasables``</td>
<td>required, object</td>
<td>Contains a set of releasable draft objects and/or a set of already released objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:40px;">``draftConfigurations``</td>
<td>required anyOf(``draftConfigurations``, ``releasedConfigurations``), array</td>
<td>An array of draft configuration of releasable objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``configuration``</td>
<td>required, object</td>
<td>A draft configuration specified by its ``path`` and ``objectType``. If draft configurations are specified by a folder, all draft items from the folder will be processed.</td>
<td><div style="padding-left:10px;">"configuration" : {</div>
<div style="padding-left:20px;">"path" : "/mySchedules/newSchedules/mySchedule",</div>
<div style="padding-left:20px;">"objectType" : "SCHEDULE"</div>
<div style="padding-left:10px;">}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``path``</td>
<td>required, string</td>
<td></td>
<td>"path" : "/mySchedules/newSchedules/mySchedule"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``objectType``</td>
<td>required, enum</td>
<td>Subset of releasable objects from the enum ConfigurationType. Subset consist of SCHEDULE, WORKINGDAYSCALENDAR, NONWORKINGDAYSCALENDAR and FOLDER.</td>
<td>"objectType" : "SCHEDULE"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``recursive``</td>
<td>optional, boolean</td>
<td>see above.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>
<tr>
<td style="padding-left:40px;">``releasedConfigurations``</td>
<td>required anyOf(``draftConfigurations``, ``releasedConfigurations``), array</td>
<td>An array of configuration of already released objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``configuration``</td>
<td>required, object</td>
<td>An already released configuration specified by its ``path`` and ``objectType``. If already released configurations are specified by a folder, all released items from the folder will be processed.</td>
<td><div style="padding-left:10px;">"configuration" : {</div>
<div style="padding-left:20px;">"path" : "/myCalendars/newCalendars/myCalendar",</div>
<div style="padding-left:20px;">"objectType" : "WORKINGDAYSCALENDAR"</div>
<div style="padding-left:10px;">}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``path``</td>
<td>required, string</td>
<td></td>
<td>"path" : "/myCalendars/newCalendars/myCalendar"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``objectType``</td>
<td>required, enum</td>
<td>see above.</td>
<td>"objectType" : "WORKINGDAYSCALENDAR"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:80px;">``recursive``</td>
<td>optional, boolean</td>
<td>see above.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>
<tr>
<td style="padding-left:40px;">``withoutInvalid``</td>
<td>optional, boolean</td>
<td>Decides if invalid draft objects are excluded from export.</td>
<td>"withoutInvalid" : true</td>
<td>false</td>
</tr>
<tr>
<td>``auditLog``</td>
<td>optional, object</td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``comment``</td>
<td>optional, string</td>
<td>for auditLog</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``timeSpent``</td>
<td>optional, string</td>
<td>for auditLog</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``ticketLink``</td>
<td>optional, string</td>
<td>for auditLog</td>
<td></td>
<td></td>
</tr>
