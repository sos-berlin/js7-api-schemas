<tr><td>``permissions``</td><td>required, array[object]</td><td>A collection with permission names that should be assigned to the role and Controller ID. If the permission already exists, it will be updated. If the permission does not
exist it will be inserted. Permissions that are already assigned and are not in the list, will not be deleted. As a result the account will have the permissons in this collection and the 
the permissions that did already exist</td><td>
<td>[{
  <div style="padding-left:10px;">"permissionPath": "myPermission1",</div>
  <div style="padding-left:10px;">"excluded": true</div>
  }]</td><td></td></tr>
<tr><td style="padding-left:20px;">``permissionPath``</td><td>required, string</td><td>The path of the permission</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``excluded``</td><td>optional, boolean</td><td>Whether the permission is excluded or included</td><td>true</td><td>false</td></tr>
 