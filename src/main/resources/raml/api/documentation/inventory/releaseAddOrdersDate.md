<tr>
<td>``addOrdersDateFrom``</td>
<td>optional, string</td>
<td>Sets the starting date for orders to be added to the daily plan. The API accepts a date in the format YYYY-MM-DD or the string 'now' to indicate to add orders starting from the time of release. Previously planned or submitted orders will be canceled.</td>
<td> "addOrdersDateFrom" : "now"</td>
<td></td>
</tr>
<tr>
<td>``includeLate``</td>
<td>optional, boolean</td>
<td>Determines if late orders from the current daily plan date should be updated, too.</td>
<td> "includeLate" : "true"</td>
<td>false</td>
</tr>
