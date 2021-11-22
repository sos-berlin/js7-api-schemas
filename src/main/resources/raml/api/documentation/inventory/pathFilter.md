<tr>
  <td>``name``</td>
  <td>required, string</td>
  <td>The ``name`` (unique identifier) of the inventory object.</td>
  <td>"name": "myWorkflow"</td>
  <td></td>
</tr>
<tr>
  <td>``objectType``</td>
  <td>required, string</td>
  <td>String representation of the ``objectType`` from the enum ConfigurationType. The Enum consist of:
    <ul>
      <li>"FOLDER"</li>
      <li>"WORKFLOW"</li>
      <li>"JOBRESOURCE"</li>
      <li>"NOTICEBOARD"</li>
      <li>"LOCK"</li>
      <li>"FILEORDERSOURCE"</li>
      <li>"WORKINGDAYSCALENDAR"</li>
      <li>"NONWORKINGDAYSCALENDAR"</li>
      <li>"SCHEDULE"</li>
      <li>"SCRIPT"</li>
    </ul>
  </td>
  <td>"objectType" : "WORKFLOW"</td>
  <td></td>
</tr>
<tr>
  <td>``useDrafts``</td>
  <td>boolean, optional</td>
  <td>This property decides if delivered paths for the object will be determined from draft state or from released/deployed state of the object.</td>
  <td>"useDrafts" : true</td>
  <td>false</td>
</tr>
