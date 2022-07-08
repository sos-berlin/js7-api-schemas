<tr><td>``agents``</td><td>required, array[object]</td><td>Collection of Agents
    <br/>each Standalone Agent has the following fields</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``agentId``</td><td>required, integer</td><td>The ``agentId`` is the (technical) name that is used in the Controller to identify an Agent. This value is set once and cannot be overwritten</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``agentName``</td><td>required, string</td><td>The ``agentName`` is the (logical) name that is used for the configuration of a Job to identify an Agent</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``agentNameAliases``</td><td>optional, array[string]</td><td>Aliases of the ``agentName``</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``url``</td><td>required, string</td><td>URL of the Agent</td><td></td><td></td></tr>
    <!-- tr><td style="padding-left:20px;">``isClusterWatcher``</td><td>optional, boolean</td><td>If a Controller Cluster is configured then at least one Agent must be a Cluster Watcher</td><td></td><td>false</td></tr -->
    <tr><td style="padding-left:20px;">``hidden``</td><td>optional, boolean</td><td>A hidden Agent will not be offered in JOC Cockpit during the Job configuration</td><td></td><td>false</td></tr>
    <!-- tr><td style="padding-left:20px;">``ordering``</td><td>optional, integer</td><td></td><td></td><td></td></tr -->
    	