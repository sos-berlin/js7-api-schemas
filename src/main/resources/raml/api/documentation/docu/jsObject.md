<tr><td>``path``</td><td>required, string</td><td>Path of a Controller object</td><td></td><td></td></tr>
<tr><td>``objectType``</td><td>required, string</td><td>Path of a Controller object. Possible values are 
<ul><li>"WORKFLOW"</li>
    <li>"JOBRESOURCE"</li>
    <li>"LOCK"</li>
    <li>"FILEORDERSOURCE"</li>
    <li>"NOTICEBOARD"</li>
    <li>"WORKINGDAYSCALENDAR"</li>
    <li>"NONWORKINGDAYSCALENDAR"</li>
    <li>"SCHEDULE"</li>
    <li>"INCLUDESCRIPT"</li>
    <li>"JOB"</li>
    <li>"REPORT"</li>
</ul>
</td><td>["WORKFLOW"]</td><td></td></tr>
<tr><td>``jobName``</td><td>optional, string</td><td>If the ``objectType`` is a JOB then the Workflow path is expected in ``path`` and the job name here</td><td></td><td></td></tr>
