<tr><td>`` objects``</td><td>required, array[object]</td><td>Each item of this array specifies an inventory object with<br/>
<b>Either ``id`` or the tupel (``path`` and ``objectType``). ``id`` beats a specified ``path``/``objectType`` tuple</b></td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``id``</td><td>integer</td><td>ID of the inventory item</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``path``</td><td>string<td>Path of the inventory item</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``objectType``</td><td>string</td><td>Object type of the inventory item. Possible value are 
<ul><li>"WORKFLOW"</li>
    <li>"JOBRESOURCE"</li>
    <li>"LOCK"</li>
    <li>"NOTICEBOARD"</li>
    <li>"FILEORDERSOURCE"</li>
    <li>"WORKINGDAYSCALENDAR"</li>
    <li>"NONWORKINGDAYSCALENDAR"</li>
    <li>"SCHEDULE"</li></ul>
</td><td></td><td></td></tr>