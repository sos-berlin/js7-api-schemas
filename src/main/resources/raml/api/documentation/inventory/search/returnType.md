<tr><td>``returnType``</td><td>optional, string</td><td>Possible values
<ul>
  <li>WORKFLOW</li>
  <li>LOCK</li>
  <li>FILEORDERSOURCE</li>
  <li>JOBRESOURCE</li>
  <li>NOTICEBOARD</li>
  <li>SCHEDULE</li>
  <li>JOBTEMPLATE</li>
  <li>INCLUDESCRIPT</li>
  <li>CALENDAR (returns both working-day and non-working-day calendars)</li>
  <li>WORKINGDAYSCALENDAR (returns only working-day calendars)</li>
  <li>NONWORKINGDAYSCALENDAR (returns only non-working-day calendars)</li>
  <li>REPORT</li>
</ul></td><td></td><td></td></tr>

<tr><td>``deployedOrReleased``</td><td>optional, boolean</td><td></td><td></td><td>false</td></tr>
<tr><td>``undeployedOrUnreleased``</td><td>optional, boolean</td><td></td><td></td><td>false</td></tr>
<tr><td>``valid``</td><td>optional, boolean</td><td>considered only if ``undeployedOrUnreleased`` is true</td><td></td><td>false</td></tr>