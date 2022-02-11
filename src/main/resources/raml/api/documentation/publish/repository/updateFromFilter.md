<tr>
<td>``configurations``</td>
<td>required, array</td>
<td>An array of configuration objects from the local repository to update in JOC.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``configuration``</td>
<td>required, object</td>
<td>A configuration specified by its ``path`` and ``objectType``. If the ``objectType`` FOLDER is specified, all configurations from the folder will be updated in JOC.</td>
<td><div style="padding-left:10px;">"configuration" : {</div>
<div style="padding-left:20px;">"path" : "/myWorkflows/ifElseWorkflow/workflow_12",</div>
<div style="padding-left:20px;">"objectType" : "WORKFLOW",</div>
<div style="padding-left:10px;">}</div>
</td>
<td></td>
</tr>
<tr>
<td>``category``</td>
<td>required, string</td>
<td>Categorize the repository nature. Possible values are LOCAL or ROLLOUT.</td>
<td></td>
<td></td>
</tr>

