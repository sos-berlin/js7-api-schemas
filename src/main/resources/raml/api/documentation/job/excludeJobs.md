<tr><td>``excludeJobs``</td><td>optional, array[object]</td>
<td>Response contains all jobs except the jobs that are specified in this collection.<br/>
A job is specified by its workflow path and an optional job name.<br/>
If "job" is undefined then all jobs of the specified workflow are excluded in the response.<br/>
This parameter will be ignored if ``jobs`` parameter is set.</td>
<td> [{
  <div style="padding-left:10px;">"workflowPath":"/path/to/workflow",</div>
  <div style="padding-left:10px;">"job":"myJob"</div>
  }]</td>
<td></td>
</tr>

