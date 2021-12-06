Contains collection of Agents where each Agent has fields such as
* controllerId
* agentId
* agentName
* isClusterWatcher
* state (COUPLED, DECOUPLED, COUPLINGFAILED, SHUTDOWN, UNKNOWN)
* runningTasks
* orders (of running tasks if ``compact`` == false)
* errorMessage (if COUPLINGFAILED or UNKNOWN)