<tr>
<td>``operationType``</td>
<td>optional, enum</td>
<td>An enum to set the desired operation the dependencies api is called for. available types are: <ul>
    <li>"DEPLOY"</li>
    <li>"RELEASE"</li>
    <li>"REVOKE"</li>
    <li>"RECALL"</li>
    <li>"REMOVE"</li>
    <li>"EXPORT"</li>
    <li>"GIT"</li>
    </ul></td>
<td></td>
<td></td>
</tr>
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
