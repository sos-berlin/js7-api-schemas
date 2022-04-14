<tr><td>``accounts``</td><td>required, array[object]</td>
<td>A collection with accounts that should be created or changed.<br/>
If the account does not exist, it will be created. Otherwise it will be updated.
<td> [
  <div style="padding-left:10px;">{"account": "myAccount", "password": "myPassword", "disabled":true,"forcePasswordChange":true,"roles":["123"]},</div>
  <div style="padding-left:10px;">{"account": "yourAccount", "password": "yourPassword", "disabled":true,"forcePasswordChange":true,"roles":["123"]}</div>
  ]</td>
<td></td>
</tr>

 