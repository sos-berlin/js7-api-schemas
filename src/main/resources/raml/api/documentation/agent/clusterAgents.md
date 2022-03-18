<tr><td>``subagentClusters``</td><td>required, array[object]</td><td>Collection of Agents
    <br/>each Cluster Agent has the following fields</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``agentId``</td><td>required, integer</td><td>The ``agentId`` is the (technical) name that is used in the Controller to identify an Agent. This value is set once and cannot be overwritten</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``subagentIds``</td><td>required, array[object]</td><td>Collection of Subagents
    <br/>each Subagent has the following fields where one of them has to be a primary director and another optionally a standby director</td><td></td><td></td></tr>
<tr><td style="padding-left:40px;">``subagentId``</td><td>required, string</td><td>The ``subagentId`` is the name that is used in the Controller to identify a Subagent. This value is set once and cannot be overwritten</td><td></td><td></td></tr>
<tr><td style="padding-left:40px;">``priority``</td><td>required, string</td><td>Priority of the Subagent inside the Cluster</td><td></td><td></td></tr>