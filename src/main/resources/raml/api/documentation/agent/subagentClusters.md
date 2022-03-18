<tr><td>``subagentClusters``</td><td>required, array[object]</td><td>Collection of Agents
    <br/>each Cluster Agent has the following fields</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``agentId``</td><td>required, integer</td><td>The ``agentId`` is the (technical) name that is used in the Controller to identify an Agent.</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``subagentIds``</td><td>required, array[object]</td><td>Collection of SubagentIds and its priority
    <br/>each subagentIds has the following fields</td><td></td><td></td></tr>
<tr><td style="padding-left:40px;">``subagentId``</td><td>required, string</td><td>The ``subagentId`` is the name that is used in the Controller to identify a Subagent Cluster.</td><td></td><td></td></tr>
<tr><td style="padding-left:40px;">``priority``</td><td>required, string</td><td>Priority of the Subagent inside the Cluster</td><td></td><td></td></tr>