<tr><td></td>
<td colspan="4">
Following elements filter the projections.<br/>
All filter elements will be combined with "and".<br/>
The elements in the lists schedulePaths and controllerIds will be combined with "or".
</td>
</tr>

<tr><td>``dateFrom``</td>
<td>optional, string</td>
<td>The value has to have the format *YYYY-MM-DD*</td>
<td>2023-01-01</td>
<td></td>
</tr>

<tr><td>``dateTo``</td>
<td>optional, string</td>
<td>The value has to have the format *YYYY-MM-DD*</td>
<td>2023-12-31</td>
<td></td>
</tr>

<tr><td>``schedulePaths``</td>
<td>optional, array[string]</td>
<td>Filters all projections that have been calculated with one of the given schedules in schedulePaths. </td>
<td>["/path/mySchedule"]</td>
<td></td></tr>

<tr><td>``scheduleFolders``</td>
<td>optional, array[object]</td>
<td>Filters all projections that have been calculated with a schedule located in one of the given folders.
Depending on the value for "recursive" in one of the subfolders recursively too.
</td>
<td> [{
  <div style="padding-left:10px;">"folder": "/sos",</div>
  <div style="padding-left:10px;">"recursive": true</div>
  }]
  </td>
<td></td>
</tr>

<tr><td>``workflowPaths``</td>
<td>optional, array[string]</td>
<td>Filters all projections that have been calculated with one of the given workflows in workflowsPaths. </td>   
<td>["/path/to/workflow"]</td>  
<td></td>   
</tr>

<tr><td>``workflowFolders``</td>
<td>optional, array[object]</td>
<td>Filters all projections that have been calculated with a workflow located in one of the given folders.
Depending on the value for "recursive" in one of the subfolders recursively too.
</td>
<td> [{
  <div style="padding-left:10px;">"folder": "/sos",</div>
  <div style="padding-left:10px;">"recursive": true</div>
  }]
  </td>
<td></td>
</tr>
 