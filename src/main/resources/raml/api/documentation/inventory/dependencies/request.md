<tr>
<td>``configurations``</td>
<td>required, array</td>
<td>An array of configuration objects either specified by ``name`` and ``type`` the technical dependencies are shown for.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``name``</td>
<td>required, string</td>
<td>The name of the desired configuration.</td>
<td>"name" : "myWorkflow"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``type``</td>
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
