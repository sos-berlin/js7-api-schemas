<tr><td>``scheduleFolders``</td>
	
<td>optional; array[scheduleFolder]</td>
	
<td>Filters all orders in the given daily plan that have been generated with a schedule located in one of the given folders.
Depending on the value for "recursive" in one of the subfolders recursively too.
</td>
<td> [{
  <div style="padding-left:10px;">"folder": "/sos",</div>
  <div style="padding-left:10px;">"recursive": true</div>
  }]
  </td>
<td></td>
	
</tr>

<tr><td>``workflowFolders``</td>
	
<td>optional; array[workflowFolder]</td>
	
<td>Filters all orders in the given daily plan that have been generated with a schedule assigned to a workflow located in one of the given folders.
Depending on the value for "recursive" in one of the subfolders recursively too.
</td>
<td> [{
  <div style="padding-left:10px;">"folder": "/sos",</div>
  <div style="padding-left:10px;">"recursive": true</div>
  }]
  </td>
<td></td>
	
</tr>
