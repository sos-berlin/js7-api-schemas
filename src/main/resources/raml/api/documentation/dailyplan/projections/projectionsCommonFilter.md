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

<tr><td>``withoutStartTime``</td>
<td>optional, boolean</td>
<td>If true, the workflows that have a start time for a day are considered. With false it is the other way round</td>   
<td></td>  
<td>false</td>   
</tr>
 