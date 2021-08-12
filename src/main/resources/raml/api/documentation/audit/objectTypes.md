<tr><td>``objectTypes``</td><td>optional, array</td><td>Limits result to specified types of processed objects. Possibly values are 
<ul><li>"WORKFLOW"</li>
    <li>"JOBCLASS"</li>
    <li>"JOBRESOURCE"</li>
    <li>"LOCK"</li>
    <li>"FILEORDERSOURCE"</li>
    <li>"BOARD"</li>
    <li>"WORKINGDAYSCALENDAR"</li>
    <li>"NONWORKINGDAYSCALENDAR"</li>
    <li>"SCHEDULE"</li>
    <li>"DOCUMENTATION"</li>
    <li>"ORDER"</li>
</ul>
</td><td>["ORDER"]</td><td></td></tr>
<tr><td>``objectName``</td><td>optional, string</td><td>Limits result to a specified glob pattern of an object's name 
that supports '&#42;' and '?' as wildcards where
<ul>
  <li> &#42; : match zero or more characters</li>
  <li> ? : match any single character</li>
</ul></td><td>"my*Workflow"</td><td></td></tr>
<tr><td>``categories``</td><td>optional, array</td><td>Limits result to specified categories of the item. Possibly values are 
<ul><li>"INVENTORY"</li>
    <li>"CONTROLLER"</li>
    <li>"DAILYPLAN"</li>
    <li>"DEPLOYMENT"</li>
    <li>"DOCUMENTATIONS"</li>
    <li>"CERTIFICATES"</li>
</ul>
</td><td>["CONTROLLER","INVENTORY"]</td><td></td></tr>
