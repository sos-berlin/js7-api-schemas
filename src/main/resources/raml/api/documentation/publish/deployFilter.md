<tr>
<td>``controllerIds``</td>
<td>required, array</td>
<td>Filter collection of JS7 Controllers, specified by their controllerId.</td>
<td> "controllerIds" : [
  <div style="padding-left:10px;">"testsuite",</div>
  <div style="padding-left:10px;">"standalone"</div>
  ]</td>
<td></td>
</tr>
<tr>
<td>``addOrdersDateFrom``</td>
<td>optional, string</td>
<td>Sets the starting date for orders to be added to the daily plan. The API accepts a date in the format YYYY-MM-DD or the string 'now' to indicate to add orders starting from the time of deployment. Previously planned or submitted orders will be canceled.</td>
<td> "addOrdersDateFrom" : "now"</td>
<td></td>
</tr>
<tr>
<td>``includeLate``</td>
<td>optional, boolean</td>
<td>Determines if late orders from the current daily plan date should be updated, too.</td>
<td> "includeLate" : "true"</td>
<td>false</td>
</tr>
<tr>
<td>``store``</td>
<td>required anyOf(``store``, ``delete``), object</td>
<td>Filter collection of deployable objects to add or update, specified by their paths and object types.</td>
<td>"store" : {
<div style="padding-left:10px;">"draftConfigurations" : [{</div>
<div style="padding-left:20px;">...example see below...</div>
<div style="padding-left:10px;">],</div>
<div style="padding-left:10px;">"deployConfigurations" : [{</div>
<div style="padding-left:20px;">...example see below...</div>
<div style="padding-left:10px;">]</div>
}</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``draftConfigurations``</td>
<td>required anyOf(``draftConfigurations``, ``deployConfigurations``), array</td>
<td>An array of draft configuration of deployable objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:40px;">``configuration``</td>
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
<td style="padding-left:60px;">``path``</td>
<td>required, string</td>
<td></td>
<td>"path" : "/myWorkflows/ifElseWorkflow/workflow_10"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``objectType``</td>
<td>required, string</td>
<td>Subset of deployable objects from the enum ConfigurationType. The subset consist of WORKFLOW, NOTICEBOARD, LOCK, FILEORDERSOURCE and FOLDER.</td>
<td>"objectType" : "WORKFLOW"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``recursive``</td>
<td>optional, boolean</td>
<td>Decides if a given folder should be processed recursively.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>
<tr>
<td style="padding-left:20px;">``deployConfigurations``</td>
<td>required anyOf(``draftConfigurations``, ``deployConfigurations``), array</td>
<td>An array of deployed configuration objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:40px;">``configuration``</td>
<td>required, object</td>
<td>An deployed configuration specified by its ``path``, ``objectType`` and ``commitId`` OR a folder specified by ``path`` and ``objectType`` only. If deployed configurations are specified by a folder, all latest deployments of the items from the folder will be processed.</td>
<td><div style="padding-left:10px;">"configuration" : {</div>
<div style="padding-left:20px;">"path" : "/myWorkflows/ifElseWorkflow/workflow_12",</div>
<div style="padding-left:20px;">"objectType" : "WORKFLOW",</div>
<div style="padding-left:20px;">"commitId" : "4273b6c6-c354-4fcd-afdb-2758088abe4a"</div>
<div style="padding-left:10px;">}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``path``</td>
<td>required, string</td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``objectType``</td>
<td>required, enum</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``commitId``</td>
<td>required, string</td>
<td>The ``commitId`` of the deployment of the deployed configuration. If no commitId is set the latest deployment of the configuration will be processed.</td>
<td>"commitId" : "4273b6c6-c354-4fcd-afdb-2758088abe4a"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``recursive``</td>
<td>optional, boolean</td>
<td>Decides if a given folder should be processed recursively.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>
<tr>
<td>``delete``</td>
<td>required anyOf(``store``, ``delete``), object</td>
<td>Filter collection of deployed objects to delete, specified by their paths and object types. All selected objects will be deleted from <u>all</u> known controllers, not just from the selected ones.</td>
<td>"delete" : {
<div style="padding-left:10px;">"deployConfigurations" : [{</div>
<div style="padding-left:20px;">...example see below...</div>
<div style="padding-left:10px;">]</div>
}</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``deployConfigurations``</td>
<td>required, array</td>
<td>An array of deployed configuration objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:40px;">``configuration``</td>
<td>required, object</td>
<td>see above.</td>
<td><div style="padding-left:10px;">"configuration" : {</div>
<div style="padding-left:20px;">"path" : "/myWorkflows/ifElseWorkflow/workflow_12",</div>
<div style="padding-left:20px;">"objectType" : "WORKFLOW",</div>
<div style="padding-left:20px;">"commitId" : "4273b6c6-c354-4fcd-afdb-2758088abe4a"</div>
<div style="padding-left:10px;">}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``path``</td>
<td>required, string</td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``objectType``</td>
<td>required, enum</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``commitId``</td>
<td>required, string</td>
<td>see above.</td>
<td>"commitId" : "4273b6c6-c354-4fcd-afdb-2758088abe4a"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:60px;">``recursive``</td>
<td>optional, boolean</td>
<td>see above.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>

