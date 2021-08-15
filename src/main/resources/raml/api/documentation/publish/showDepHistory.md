<tr>
<td>``compactFilter``</td>
<td>required oneOf(``compactFilter``, ``detailFilter``), object</td>
<td>Filter to limits the result. Using a ``compactFilter`` narrows down the results to commit information only. To obtain objects of specific commits, use the ``detailFilter``. </td>
<td>"compactFilter" : {
<div style="padding-left:10px;">"from" : "-30d",</div>
<div style="padding-left:10px;">"to" : "-5d"</div>
}</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``account``</td>
<td>optional, string</td>
<td>Account that deployed objects.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"account": "root"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``folder``</td>
<td>optional, string</td>
<td>Path to a folder.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"folder": "/myWorkflows/ifElseWorkflows"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``controllerId``</td>
<td>optional, string</td>
<td>Identifies the controller the deployment was performed for.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"controllerId": "testsuite"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``deployType``</td>
<td>optional, string</td>
<td>Type of the deployed object. Subset of deployable objects from the enum ConfigurationType. The subset consists of WORKFLOW, JOBCLASS, LOCK, NOTICEBOARD, FILEORDERSOURCE.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"deployType": "WORKFLOW"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``operation``</td>
<td>optional, string</td>
<td>The operation of the deployment. Possible values are UPDATE, DELETE.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"operation": "UPDATE"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``state``</td>
<td>optional, string</td>
<td>Status of the deployment. Possible values are DEPLOYED, NOT_DEPLOYED</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"state": "DEPLOYED"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``deploymentDate``</td>
<td>optional, string</td>
<td>Date when the deployment was done.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"deploymentDate": "2020-11-06T11:00:00Z"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``deleteDate``</td>
<td>optional, string</td>
<td>Date when an deployment was deleted from a Controller.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"deleteDate": "2020-11-06T11:00:00Z"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``from``</td>
<td>optional, string</td>
<td>The value has multiple formats
    <ul>
    <li>format for a date in ISO 8601 format where the <i>time offset</i> and milliseconds are optional, e.g.
      <ul>
        <li>YYYY-MM-DDThh:mm:ss[.s][Z (Z means +00)]</li>
        <li>YYYY-MM-DDThh:mm:ss[.s][+01:00]</li>
        <li>YYYY-MM-DDThh:mm:ss[.s][+0100]</li>
        <li>YYYY-MM-DDThh:mm:ss[.s][+01]</li>
      </ul>
    </li>
    <li>a format for a time period in relative to the current time, e.g. 6h, 12h, 1d, 1w can specify in addition with a time offset 0 or digits followed by a letter are expected where the letter has to be:
      <ul>
        <li>s (seconds)</li>
        <li>m (minutes)</li>
        <li>h (hours)</li>
        <li>d (days)</li>
        <li>w (weeks)</li>
        <li>M (months)</li>
        <li>y (years)</li>
      </ul>
    </li>
    <li>a time offset is optional (e.g. 2d+02:00)
      <ul>
        <li>it can be also specify with the parameter ``timeZone``</li>
        <li>if ``timeZone`` undefined then UTC is used</li>
      </ul>
    </li>
    <li>the value 0 means the current time</li>
    <li>start date of a range of dates</li>
    </ul>
</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"from": "-10d"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``to``</td>
<td>optional, string</td>
<td>The value has multiple formats like the ``from`` parameter
  <ul>
    <li>end date of a range of dates</li>
  </ul>
</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"to": "0d"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``timeZone``</td>
<td>optional, string</td>
<td>
  <ul>
    <li>If this parameter is set then it beats the time offset in ``dateFrom`` and ``dateTo``</li>
    <li>See here the list for <a href="https://en.wikipedia.org/wiki/List_of_tz_database_time_zones" target="wiki">available time zones</a>.</li>
  </ul>
</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"timezone": "Europe/Berlin"</div>
  <div>}</div>
</td>
<td></td>
</tr>
</tr>
<tr>
<td style="padding-left:20px;">``limit``</td>
<td>optional, integer</td>
<td>Limits the number of delivered items, -1=unlimited</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"limit": "5000"</div>
  <div>}</div>
</td>
<td>10000</td>
</tr>    
<tr>
<td>``detailFilter``</td>
<td>required oneOf(``compactFilter``, ``detailFilter``), object</td>
<td>Filter to limit the results. Using a ``detailFilter`` will deliver a set of objects. To obtain commit information only, use the ``compactFilter``. </td>
<td>"detailFilter" : {
<div style="padding-left:10px;">"commitId" : "b62bdb71-9553-45bc-8d22-33b32d96d6bf",</div>
<div style="padding-left:10px;">"deployType" : "WORKFLOW"</div>
}</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``account``</td>
<td>optional, string</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``path``</td>
<td>optional, string</td>
<td>Path of a single deployed object.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"path": "/myWorkflows/ifElseWorkflows/test_workflow_01"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``folder``</td>
<td>optional, string</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``controllerId``</td>
<td>optional, string</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``commitId``</td>
<td>optional, string</td>
<td>Commit ID of the deployment.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"commitId": "4cbb095d-b998-4091-92f2-4fb8efb58805"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``version``</td>
<td>optional, string</td>
<td>User defined version of a deployed object.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"version": "0.0.1"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``deployType``</td>
<td>optional, string</td>
<td>Type of the deployed object. Subset of deployable objects from the enum ConfigurationType. The subset consists of WORKFLOW, JOBCLASS, LOCK, BOARD, FILEORDERSOURCE.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"deployType": "WORKFLOW"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``operation``</td>
<td>optional, string</td>
<td>The operation of the deployment. Possible values are UPDATE, DELETE.</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"operation": "UPDATE"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``state``</td>
<td>optional, string</td>
<td>Status of the deployment. Possible values are DEPLOYED, NOT_DEPLOYED</td>
<td>
  <div>{</div>
  <div style="padding-left:10px;">"state": "DEPLOYED"</div>
  <div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``deploymentDate``</td>
<td>optional, Date</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``deleteDate``</td>
<td>optional, Date</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``from``</td>
<td>optional, string</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``to``</td>
<td>optional, string</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``timeZone``</td>
<td>optional, string</td>
<td>see above.</td>
<td></td>
<td></td>
</tr>
</tr>
<tr>
<td style="padding-left:20px;">``limit``</td>
<td>optional, integer</td>
<td>see above.</td>
<td></td>
<td>10000</td>
</tr>