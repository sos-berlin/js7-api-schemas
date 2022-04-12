<tr><td>``folders``</td><td>required; object</td><td>An array with folders objects that should be assigned to the role and controller-ID. If the folder already exists, it will be updated. If the folder does not
exist it will be inserted. Folders that are already assigned and are not in the list, will not be deleted. As a result the role will have the folders in this array and the 
the folders that did alread exist.<br/></td><td></td><td></td></tr>

<tr><td>``folder``</td><td>required; string</td><td>The path of the folder</td><td>myNewfolder</td><td></td></tr>
<tr><td>``recursive``</td><td>optional; boolean</td><td>Whether the folder is recursive or not</td><td>true</td><td>false</td></tr>



