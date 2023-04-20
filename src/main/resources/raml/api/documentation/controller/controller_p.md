Contains collection of Controllers and Agents where each Controller has fields such as
* controllerId
* securityLevel
* clusterUrl (if not STANDALONE)
* role (STANDALONE, PRIMARY or BACKUP)
* host
* version
* javaVersion
* operating system
    * name
    * architecture

and each Agent has fields such as
* controllerId
* agentId
* agentName
* agentNameAliases
* url