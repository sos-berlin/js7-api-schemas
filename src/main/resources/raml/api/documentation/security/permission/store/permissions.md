<tr><td>``permissions``</td><td>required, array</td>
<td>An array with permission names that should be assigned to the role and controller-ID. If the permission already exists, it will be updated. If the permission does not
exist it will be inserted. Permissions that are already assigned and are not in the list, will not be deleted. As a result the account will have the permissons in this array and the 
the permissions that did alread exist.<br/>
<td> [
  <div style="padding-left:10px;">"permissions":["myPermission1","myPermission2"]</div>
  ]</td>
<td></td>
</tr>

 