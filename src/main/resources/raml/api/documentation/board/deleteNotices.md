<tr><td></td><td colspan="2"><b>Either ``notices`` or (``noticeBoardPath`` and ``noticeIds``) are required! ``notices`` beats a specified ``noticeBoardPath``/``noticeIds`` tuple</b></td><td></td><td></td></tr>

<tr><td>``notices``</td><td>required, array[object]</td><td>contains objects with notice ids per board</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``noticeBoardPath``</td><td>required, string</td><td>Path of the notice board</td><td rowspan="2"><pre>{
  "noticeBoardPath": "myBoard",
  "noticeIds": [
    "2024-09-20"
  ]
}</pre></td>
<td></td></tr>
<tr><td style="padding-left:20px;">``noticeIds``</td><td>optional, array[string]</td><td>Collection of notice ids. 
If no noticeId is specified, all posted notices of the board will be deleted</td><td></td></tr>

<tr><td>``noticeBoardPath``<pre style="color:red"> (deprecated) </pre></td><td>required, string</td><td>Path of the notice board</td><td></td><td></td></tr>
<tr><td>``noticeIds``<pre style="color:red"> (deprecated) </pre></td><td>required, array[string]</td><td>IDs of the notices</td><td></td><td></td></tr>