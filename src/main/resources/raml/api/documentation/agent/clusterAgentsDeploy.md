<tr><td>``clusterAgents``</td><td>required, array[object]</td><td>Collection of Agents
    <br/>each Cluster Agent has the following fields</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``agentId``</td><td>required, integer</td><td>The ``agentId`` is the (technical) name that is used in the Controller to identify an Agent. This value is set once and cannot be overwritten</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``agentName``</td><td>required, string</td><td>The ``agentName`` is the (logical) name that is used for the configuration of a Job to identify an Agent</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``agentNameAliases``</td><td>optional, array[string]</td><td>Aliases of the ``agentName``</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``schedulingType``</td><td>optional, string</td><td>Possible values are 
	<ul>
		<li>ROUND_ROBIN</li>
		<li>FIX_PRIORITY</li>
	</ul></td><td></td><td>ROUND_ROBIN</td></tr>
    <!-- tr><td style="padding-left:20px;">``url``</td><td>required, string</td><td>URL of the Agent</td><td></td><td></td></tr -->
    <!-- tr><td style="padding-left:20px;">``isClusterWatcher``</td><td>optional, boolean</td><td>If a Controller Cluster is configured then at least one Agent must be a Cluster Watcher</td><td></td><td>false</td></tr -->
    <tr><td style="padding-left:20px;">``disabled``</td><td>optional, boolean</td><td>A disabled Agent will not be offered in JOC Cockpit during the Job configuration</td><td></td><td>false</td></tr>
    <tr><td style="padding-left:20px;">``subagents``</td><td>required, array[object]</td><td>Collection of Subagents
    	<br/>each Subagent has the following fields where one of them has to be a primary director and another optionally a standby director</td><td></td><td></td></tr>
    	<tr><td style="padding-left:40px;">``subagentId``</td><td>required, string</td><td>The ``subagentId`` is the name that is used in the Controller to identify a Subagent. This value is set once and cannot be overwritten</td><td></td><td></td></tr>
    	<tr><td style="padding-left:40px;">``url``</td><td>required, string</td><td>URL of the Subagent</td><td></td><td></td></tr>
    	<tr><td style="padding-left:40px;">``isDirector``</td><td>required, string</td><td>Possible values are
    	<ul>
			<li>NO_DIRECTOR</li>
			<li>PRIMARY_DIRECTOR</li>
			<li>STANDBY_DIRECTOR</li>
		</ul></td><td></td><td></td></tr>
    
    