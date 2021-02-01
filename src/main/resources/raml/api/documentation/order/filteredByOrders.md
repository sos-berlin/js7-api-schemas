<tr><td>``orders``</td><td>optional, array</td>
<td>Filtered response by a collection of orders specified by its workflow path and an optional order id.<br/>
If the "orderId" is undefined then all orders of the specified workflow path are included in the response.<br/>
If this parameter is specified then parameters such as ``folders``, ``excludeOrders`` and ``regex`` where applicable are ignored.</td>
<td> [{
  <div style="padding-left:10px;">"workflowPath": "/path/to/workflow",</div>
  <div style="padding-left:10px;">"orderId":"myOrder"</div>
  }]</td>
<td></td>
</tr>