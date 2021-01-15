<tr><td>``excludeOrders``</td><td>optional, array</td>
<td>Response contains all orders except the orders which are specified in this collection.<br/>
An order is specified by its workflow path and an optional order id.<br/>
If "orderId" is undefined then all orders of the specified workflow are excluded in the response.<br/>
This parameter will be ignored if ``orders`` parameter is set.</td>
<td> [{
  <div style="padding-left:10px;">"workflowPath":"/path/to/workflow",</div>
  <div style="padding-left:10px;">"orderId":"myOrder"</div>
  }]</td>
<td></td>
</tr>
