The response contains subfolders and deployable objects.
 
Each deployable object contains the following fields depends on the requested parameters

* id
* folder
* objectName
* objectType
* valid
* deleted
* deployed
* deployablesVersions
* syncState if controllerId is specified in the request 

It is an array where the first item is the draft if the draft is valid and ``withoutDrafts`` == false

The draft item has the fields

  * id
  * versionDate

If ``withoutDeployed`` == false then further items from previous deployments are included

If ``latest`` == true then only the last deployments is included

The deployed items have the fields

  * id
  * commitId
  * deploymentId
  * deploymentPath
  * deploymentOperation
  * versionDate
  * versions - It is an array with the controllerIds where this iten was deployed

A subfolder contains the following fields

* id
* folder
* objectName
* objectType
* deleted 