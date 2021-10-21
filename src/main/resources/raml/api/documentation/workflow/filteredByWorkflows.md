<tr><td>``workflowIds``</td><td>optional, object</td>
<td>Filtered response by a collection of workflows specified by its path and optional version<br/>
If this parameter is specified then parameters such as ``folders`` and ``regex`` where applicable are ignored.</td>
<td> {
  <div style="padding-left:10px;">"path": "/path/to/workflow",</div>
  <div style="padding-left:10px;">"versionId": "c79caab4-4e72-4818-bae7-902f1037d8b6"</div>
  }</td>
<td></td>
</tr>
<tr><td style="padding-left:20px;">``path``</td><td>required, string</td><td>Field for each item in ``workflowIds`` to specify the path of a workflow</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``versionId``</td><td>optional, string</td><td>Field for each in ``workflowIds`` to specify the version of a workflow</td><td></td><td></td></tr>
