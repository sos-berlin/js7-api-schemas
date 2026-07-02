* controller id
* host
* url
* clusterUrl (if not STANDALONE)
* role (STANDALONE, PRIMARY or BACKUP)
* version
* javaVersion
* operating system
    * name
    * architecture
* connectionState - such as
	* established
	* unstable
	* unreachable
* componentStatus - such as
	* operational
	* limited
	* inoperable
	* unknown
* clusterNodeState (if not STANDALONE) - such as
	* active
	* inactive
	* unknown
* requireFailoverConfirmation (optional; applies only to a Controller in a cluster)