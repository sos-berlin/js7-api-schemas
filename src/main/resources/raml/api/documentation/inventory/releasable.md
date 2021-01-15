A releasable object contains following fields depends on the requested parameters

* id
* folder
* objectName
* objectType
* valid
* deleted
* released
* releasableVersions 

It is an array where the first item is the draft if the draft is valid and ``withoutDrafts`` == false

The draft item has the fields
  
  * id
  * versionDate

If ``withoutReleased`` == false then a further item of a previous release is included

The released item has the fields

  * id
  * releaseId
  * releasePath
  * versionDate