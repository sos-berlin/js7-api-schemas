<tr><td>``noticeSpaceKeys``</td><td>optional, array[string]</td>
<td>This parameter is ignored for the ‘Global’ schema because it doesn't have a plan key.<br/>
Plan keys of the 'DailyPlan' schema have the format YYYY-MM-DD.<br/>
Each string of the array can be a glob pattern of that supports '&#42;' and '?' as wildcards where
<ul>
  <li> &#42; : match zero or more characters</li>
  <li> ? : match any single character</li>
</ul> 
<ul>
</td><td>["2025-02-*"]</td><td></td></tr>
