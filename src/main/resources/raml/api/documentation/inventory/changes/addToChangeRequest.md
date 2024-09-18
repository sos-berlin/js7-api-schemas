<tr>
<td>``change``</td>
<td>required, object</td>
<td>A change object specified by its name.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``name``</td>
<td>required, string</td>
<td>The name of the desired change.</td>
<td>"name" : "myFirstChange"</td>
<td></td>
</tr>
<tr>
<td>``add``</td>
<td>required, array</td>
<td>An array of inventory objects that should be assigned to the given change.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``name``</td>
<td>required, string</td>
<td>The name of the desired inventory object to assign to the given change.</td>
<td>"name" : "myWorkflow"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``objectType``</td>
<td>required, string</td>
<td>available types are: <ul>
    <li>"WORKFLOW"</li>
    <li>"JOBRESOURCE"</li>
    <li>"LOCK"</li>
    <li>"NOTICEBOARD"</li>
    <li>"FILEORDERSOURCE"</li>
    <li>"WORKINGDAYSCALENDAR"</li>
    <li>"NONWORKINGDAYSCALENDAR"</li>
    <li>"SCHEDULE"</li>
    <li>"JOBTEMPLATE"</li>
    </ul></td>
<td>"type" : "WORKFLOW"</td>
<td></td>
</tr>

