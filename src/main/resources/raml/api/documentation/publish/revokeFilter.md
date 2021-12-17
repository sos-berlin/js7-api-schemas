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
<td>``deployConfigurations``</td>
<td>required, array</td>
<td>An array of deployed configuration objects.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``configuration``</td>
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
<td style="padding-left:40px;">``path``</td>
<td>required, string</td>
<td></td>
<td>"path" : "/myWorkflows/ifElseWorkflow/workflow_10"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:40px;">``objectType``</td>
<td>required, enum</td>
<td>Subset of deployable objects from the enum ConfigurationType. The subset consist of WORKFLOW, NOTICEBOARD, LOCK, FILEORDERSOURCE and FOLDER.</td>
<td>"objectType" : "WORKFLOW"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:40px;">``commitId``</td>
<td>required, string</td>
<td>The ``commitId`` of the deployment of the deployed configuration. If no commitId is set the latest deployment of the configuration will be processed.</td>
<td>"commitId" : "4273b6c6-c354-4fcd-afdb-2758088abe4a"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:40px;">``recursive``</td>
<td>optional, boolean</td>
<td>Decides if a given folder should be processed recursively.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>
