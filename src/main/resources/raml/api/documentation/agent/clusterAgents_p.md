Contains collection of Cluster Agents where each Agent following fields
* controllerId
* agentId
* agentName
* agentNameAliases
* processLimit (optional)
* subagents where each Subagent has following fields
	* subagentId
	* url
	* title (optional)
	* syncState
	* disabled
	* isDirector (NO_DIRECTOR, PRIMARY_DIRECTOR, SECONDARY_DIRECTOR)
	* isClusterWatcher