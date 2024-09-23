<tr><td>``expectedNotices``</td><td>required, array[object]</td><td>contains objects with workflow paths per board</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``noticeBoardPath``</td><td>required, string</td><td>Path of the notice board</td><td rowspan="2"><pre>{
  "noticeBoardPath": "myBoard",
  "workflowPaths": [
    "myWorkflow"
  ]
}</pre></td>
<td></td></tr>
<tr><td style="padding-left:20px;">``workflowPaths``</td><td>required, array[string]</td><td>Collection of workflow paths</td><td></td></tr>
