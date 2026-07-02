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
* requireFailoverConfirmation (applies only to a Controller in a cluster)

and each Agent has fields such as
* controllerId
* agentId
* agentName
* agentNameAliases
* url