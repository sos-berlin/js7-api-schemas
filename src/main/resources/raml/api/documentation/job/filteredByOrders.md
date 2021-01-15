<tr><td>``orders``</td><td>optional, array[object]</td>
<td>Filtered response by a collection of orders specified by its workflow path and an optional order id and position.<br/>
If "orderId" and "position" is undefined then all orders of the specified workflow are included in the response.<br/>
If "orders" is specified then all other optional parameters except ``controllerId``, ``taskIds`` and ``historyIds`` are ignored.</td>
<td> [{
  <div style="padding-left:10px;">"workflowPath":"/sos/reporting/Inventory",</div>
  <div style="padding-left:10px;">"orderId":"Inventory"</div>
  <div style="padding-left:10px;">"position":"exec"</div>
  }]</td>
<td></td>
</tr>
