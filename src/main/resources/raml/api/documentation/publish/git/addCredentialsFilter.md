<tr>
<td>``credentials``</td>
<td>required, array</td>
<td>Git credentials to store.</td>
<td>
<div>{</div>
<div style="padding-left:10px;">"gitAccount" : "myExampleGitAccount",</div>
<div style="padding-left:10px;">"keyfilePath" : "/example/path/to/keyfile",</div>
<div style="padding-left:10px;">"gitServer" : "my-example-remote.git-host.net"</div>
<div>}</div>
</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``gitAccount``</td>
<td>required, string</td>
<td>Account name for the access to the Git Server.</td>
<td>"gitAccount" : "myExampleGitAccount"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``password``</td>
<td>required anyOf(``password``, ``personalAccessToken``, ``keyfilePath``), string</td>
<td>Password to use with the Git account for http(s) access to the Git Server.</td>
<td>"password" : "myExampleGitPasswd"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``personalAccessToken``</td>
<td>required anyOf(``password``, ``personalAccessToken``, ``keyfilePath``), string</td>
<td>Personal Access Token (PAT) to use with the Git account for http(s) access to the Git Server.</td>
<td>"personalAccessToken" : "ExaM29pl4evLx7ebhWzo"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``keyfilePath``</td>
<td>required anyOf(``password``, ``personalAccessToken``, ``keyfilePath``), string</td>
<td>Path to the keyfile to use for SSH access to the Git Server.</td>
<td>"keyfilePath" : "/example/path/to/keyfile"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``gitServer``</td>
<td>required, string</td>
<td>The hostname(:port) of the Git Server.</td>
<td>"gitServer" : "my-example-remote.git-host.net"</td>
<td></td>
</tr>
