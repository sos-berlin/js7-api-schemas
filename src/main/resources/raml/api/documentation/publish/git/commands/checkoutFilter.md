<tr>
<td>``branch``</td>
<td>required oneOf(``branch``, ``tag``), string</td>
<td>Branch name to checkout.</td>
<td>"branch" : "master"</td>
<td></td>
</tr>
<tr>
<td>``tag``</td>
<td>required oneOf(``branch``, ``tag``), string</td>
<td>Tag name to checkout.</td>
<td>"tag" : "v1.0.0"</td>
<td></td>
</tr>
<tr>
<td>``folder``</td>
<td>required, string</td>
<td>Folder path of the local repository the checkout should be performed in.</td>
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
