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

 