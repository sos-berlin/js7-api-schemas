<tr><td>``permissions``</td><td>required; object</td><td>An array with permission names that should be assigned to the role and controller-ID. If the permission already exists, it will be updated. If the permission does not
exist it will be inserted. Permissions that are already assigned and are not in the list, will not be deleted. As a result the account will have the permissons in this array and the 
the permissions that did alread exist</td><td></td><td></td></tr>

<tr><td>``permissionPath``</td><td>required; string</td><td>The path of the permission</td><td>myNewfolder</td><td></td></tr>
<tr><td>``excluded``</td><td>optional; boolean</td><td>Whether the permission is excluded or included</td><td>true</td><td>false</td></tr>



 