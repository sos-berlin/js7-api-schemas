Contains collection of Agents where each Agent has the fields
* controllerId
* agentId
* agentName
* url (only for standalone agent)
* hidden
* disabled (only for standalone agent)
* isClusterWatcher (only for standalone agent)
* state (only for standalone agent; COUPLED, COUPLINGFAILED, RESET, RESETTING, SHUTDOWN, UNKNOWN)
* healthstate (ALL\_SUBAGENTS\_ARE\_COUPLED\_AND\_ENABLED, ONLY\_SOME\_SUBAGENTS\_ARE\_COUPLED\_AND\_ENABLED, NO\_SUBAGENTS\_ARE\_COUPLED\_AND\_ENABLED, UNKNOWN)
* runningTasks (for cluster agent the sum of the running tasks over all subagents)
* orders (only for standalone agent, of running tasks if ``compact`` == false)
* errorMessage (if COUPLINGFAILED or UNKNOWN)
* subagents (only for cluster agent; collection of subagent where each subagent has the fields)
	* agentId
	* subagentId
	* url
	* disabled
	* isDirector
	* state (COUPLED, COUPLINGFAILED, RESET, RESETTING, SHUTDOWN, UNKNOWN)
	* runningTasks
	* orders (of running tasks if ``compact`` == false)
	* errorMessage (if COUPLINGFAILED or UNKNOWN)