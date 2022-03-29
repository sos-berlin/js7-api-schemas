<tr><td>``subagents``</td><td>required, array[object]</td><td>Collection of Subagents
    <br/>each Subagent has the following fields</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``subagentId``</td><td>required, string</td><td>The ``subagentId`` is the name that is used in the Controller to identify a Subagent. This value is set once and cannot be overwritten</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``url``</td><td>required, string</td><td>URL of the Subagent</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``title``</td><td>optional, string</td><td></td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``isDirector``</td><td>optional, string</td><td>Possible values are
    		<ul>
    			<li>NO_DIRECTOR</li>
    			<li>PRIMARY_DIRECTOR</li>
    			<li>SECONDARY_DIRECTOR</li>
    		</ul></td><td></td><td>NO_DIRECTOR</td></tr>
    <tr><td style="padding-left:20px;">``ordering``</td><td>optional, integer</td><td></td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``withGenerateSubagentCluster``</td><td>optional, boolean</td><td></td><td></td><td>false</td></tr>
    