<tr><td>``path``</td><td>required, string<td>Path or name of a workflow</td><td></td><td></td></tr>
<tr><td>``objectTypes``</td><td>optional, array</td><td>A workflow can be referenced by fileOrderSources, schedules and in the addOrder instructions of other workflows so that possible object types are
<ul><li>"WORKFLOW"</li>
    <li>"FILEORDERSOURCE"</li>
    <li>"SCHEDULE"</li>
    </ul>
</td><td>["FILEORDERSOURCE"]</td><td></td></tr>