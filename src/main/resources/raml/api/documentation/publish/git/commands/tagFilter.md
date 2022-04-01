<tr>
<td>``commitHash``</td>
<td>required, string</td>
<td>Commit Hash of the desired commit a tag should be performed on. First 8 characters of a commit hash may be sufficient, depending on the Git Server.</td>
<td>"commitHash" : "e58abc37caee531d6f791e0b976a4baf39185186"</td>
<td></td>
</tr>
<tr>
<td>``name``</td>
<td>required, string</td>
<td>The desired tag name. Most commonly version strings are used.</td>
<td>"name" : "v1.0.0"</td>
<td></td>
</tr>
<tr>
<td>``folder``</td>
<td>required, string</td>
<td>Folder path of the local repository the tag should be created in.</td>
<td>"folder" : "/JS7Demo"</td>
<td></td>
</tr>
<tr>
<td>``category``</td>
<td>required, string</td>
<td>Categorize the repository nature. Possible values are LOCAL or ROLLOUT.</td>
<td>"category" : "ROLLOUT"</td>
<td></td>
</tr>
