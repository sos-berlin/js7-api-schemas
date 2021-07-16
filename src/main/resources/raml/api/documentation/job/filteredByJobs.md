<tr><td>``jobs``</td><td>optional, array[object]</td>
<td>Filtered response by a collection of jobs specified by its workflow path and an optional job name.<br/>
If "job" is undefined then the answer contains all jobs of the specified workflow.<br/>
If this parameter is specified then the parameters ``folders``, ``excludeJobs``, ``jobName`` and ``workflowPath`` are ignored.</td>
<td> [{
  <div style="padding-left:10px;">"workflowPath":"/path/to/workflow",</div>
  <div style="padding-left:10px;">"job":"myJob"</div>
  }]</td>
<td></td>
</tr>
