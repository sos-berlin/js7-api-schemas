<tr><td>``permissions``</td><td>required, array[object]</td>
<td>A collection with permissions<br/>
The permissions are devided into permissions for JOC and for controllers. There may be one section for each individuell controller.<br/>
Each permission have a path as an identifier and whether this permission is excluded or included.
<td>[{
  <div style="padding-left:10px;">"permissionPath": "sos:products:joc:administration:accounts",</div>
  <div style="padding-left:10px;">"excluded": true</div>
  }]</td><td></td></tr>
<tr><td style="padding-left:20px;">``permissionPath``</td><td>required, string</td><td>The path of the permission</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``excluded``</td><td>optional, boolean</td><td>Whether the permission is excluded or included</td><td>true</td><td>false</td></tr>
 