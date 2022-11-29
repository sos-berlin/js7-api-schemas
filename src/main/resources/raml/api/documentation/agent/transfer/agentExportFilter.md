<tr>
<td>``exportFile``</td>
<td>required, object</td>
<td>This objects describes the export file with ``filename`` and ``format``.</td>
<td><div>"exportFile" : {</div>
    <div style="padding-left:10px;">"filename" : "test_export.zip",</div>
    <div style="padding-left:10px;">"format" : "ZIP"</div>
    <div>}</div></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``filename``</td>
<td>required, string</td>
<td></td>
<td>"filename" : "test_export.zip"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``format``</td>
<td>optional, enum</td>
<td>The desired ``format`` of the export archive file. Possible values are "ZIP" and "TAR_GZ"</td>
<td>"format" : "ZIP"</td>
<td>ZIP</td>
</tr>
<tr>
<td>``agentIds``</td>
<td>required, array</td>
<td>An array of the desired ``agentIds`` to export to the archive file.</td>
<td>"agentIds" : [ "agent_cluster_001", "agent_001", "agent_002", "agent_003", "agent_006" ]</td>
<td></td>
</tr>
