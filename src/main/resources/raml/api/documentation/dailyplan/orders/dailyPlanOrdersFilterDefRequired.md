<tr><td></td>
<td colspan="4">
Following elements filter the orders that should be considered.<br/>
All filter elements will be combined with "and".<br/>
The elements in the lists schedulePaths, scheduleFolders, workflowPaths, workflowFolders and controllerIds will be combined with "or".
</td>
</tr>

<tr><td>``dailyPlanDateFrom``</td>
<td>required, string</td>
<td>The value has to have the format *YYYY-MM-DD*<br/>
The begin of the day range of the daily plan. Depends on the settings for daily plan timezone and daily plan period.</td>
<td>2020-12-31</td>
<td></td>
</tr>

<tr><td>``dailyPlanDateTo``</td>
<td>optional, string</td>
<td>The value has to have the format *YYYY-MM-DD*<br/>
The end of the day range of the daily plan. Depends on the settings for daily plan timezone and daily plan period.<br/>
If only one day of the daily plan is desired than specify ``dailyPlanDateFrom`` == ``dailyPlanDateTo``</td>
<td>2020-12-31</td>
<td></td>
</tr>

<tr><td>``schedulePaths``</td>
<td>optional, array[string]</td>
<td>Filters all orders in the given daily plan range that have been generated with one of the given schedules in schedulePaths. </td>
<td>["/path/mySchedule"]</td>
<td></td></tr>

<tr><td>``scheduleFolders``</td>
<td>optional, array[object]</td>
<td>Filters all orders in the given daily plan range that have been generated with a schedule located in one of the given folders.
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
<td>Filters all orders in the given daily plan range that are assigned to one of the given workflows in workflowPaths.
</td>	
<td>["/path/to/workflow"]</td>	
<td></td>	
</tr>

<tr><td>``workflowFolders``</td>
<td>optional, array[object]</td>
<td>Filters all orders in the given daily plan range that have been generated with a schedule assigned to a workflow located in one of the given folders.
Depending on the value for "recursive" in one of the subfolders recursively too.
</td>
<td> [{
  <div style="padding-left:10px;">"folder": "/sos",</div>
  <div style="padding-left:10px;">"recursive": true</div>
  }]
  </td>
<td></td>
</tr>
 