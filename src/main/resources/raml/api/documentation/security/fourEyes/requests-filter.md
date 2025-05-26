<tr><td></td>
<td colspan="4">
Following elements filter the approval requests that should be considered.<br/>
All filter elements will be combined with "and".<br/>
The elements in the lists requestors, approvers, requestorStates and approverStates will be combined with "or".
</td>
</tr>

<tr><td>``requestors``</td>
<td>optional, array[string]</td>
<td>This parameter is only used for approvers. Requestors can see only their own approval request.<br/>
Filters all approval requests by the account names of requestors</td>
<td></td>
<td></td></tr>

<tr><td>``approvers``</td>
<td>optional, array[string]</td>
<td>Filters all approval requests by the account names of approvers</td>
<td></td>
<td></td></tr>

<tr><td>``requestorStates``</td>
<td>optional, array[string]</td>
<td>Filters all approval requests by the requestor states such as
<ul>
    <li>REQUESTED</li>
    <li>WITHDRAWN</li>
    <li>EXECUTED</li>
</ul>
</td>
<td></td>
<td></td></tr>

<tr><td>``approverStates``</td>
<td>optional, array[string]</td>
<td>Filters all approval requests by the approver states such as
<ul>
    <li>PENDING</li>
    <li>APPROVED</li>
    <li>REJECTED</li>
</ul>
</td>
<td></td>
<td></td></tr>
 