
<tr><td></td><td colspan="2"><b>Either ``notices`` or (``noticeBoardPaths`` and ``noticeId``) are required! ``notices`` beats a specified ``noticeBoardPaths``/``noticeId`` tuple</b></td><td></td><td></td></tr>

<tr><td>``notices``</td><td>required, array[object]</td><td>contains objects with notice ids per board</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``noticeBoardPath``</td><td>required, string</td><td>Path of the notice board</td><td rowspan="2"><pre>{
  "noticeBoardPath": "myGlobalBoard",
  "noticeIds": ["2024-09-20test"]
},
{
  "noticeBoardPath": "myPlannableBoard",
  "noticeIds": ["DailyPlan/2024-09-20"]
}</pre></td>
<td></td></tr>
<tr><td style="padding-left:20px;">``noticeIds``</td><td>optional, array[string]</td><td>Collection of notice ids. 
If no noticeId is specified, all expected notices of the board will be posted</td><td></td></tr>

<tr><td>``noticeBoardPaths``<pre style="color:red"> (deprecated) </pre></td><td>required, array[string]</td><td>Paths of notice boards</td><td></td><td></td></tr>
<tr><td>``noticeId``<pre style="color:red"> (deprecated) </pre></td><td>required, string</td><td>Id of the notice</td><td></td><td></td></tr>