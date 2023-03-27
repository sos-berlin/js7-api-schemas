<tr><td>``path``</td><td>required, string<td>Path or name of the workflow</td><td></td><td></td></tr>
<tr><td>``objectTypes``</td><td>optional, array</td><td>A workflows can be referenced by fileOrderSources, schedules and in the addOrder instruction of other workflows so that possible object types are
<ul><li>"WORKFLOW"</li>
    <li>"FILEORDERSOURCE"</li>
    <li>"SCHEDULE"</li>
    </ul>
</td><td>["FILEORDERSOURCE"]</td><td></td></tr>