<tr><td>``folders``</td><td>required, array[object]</td><td>A collection with folders objects that should be assigned to the role and Controller ID. If the folder already exists, it will be updated. If the folder does not
exist it will be added. Folders that are already assigned and are not in the collection, will not be deleted. As a result the role will have the folders in this collection and the 
folders that did already exist.</td>
<td>[{
  <div style="padding-left:10px;">"folder": "/path/to/myNewfolder",</div>
  <div style="padding-left:10px;">"recursive": true</div>
  }]</td><td></td></tr>
<tr><td style="padding-left:20px;">``folder``</td><td>required, string</td><td>The absolute path of the folder</td><td></td><td></td></tr>
<tr><td style="padding-left:20px;">``recursive``</td><td>optional, boolean</td><td>The new recursive of the folder</td><td></td><td>false</td></tr>



