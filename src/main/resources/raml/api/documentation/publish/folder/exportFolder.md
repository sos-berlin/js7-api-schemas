<tr>
<td>``exportFile``</td>
<td>required, object</td>
<td>This objects describes the export file with ``filename`` and ``format``.</td>
<td><div style="padding-left:10px;">"exportFile" : {</div>
    <div style="padding-left:10px;">"filename" : "test_export_folder.zip",</div>
    <div style="padding-left:10px;">"format" : "ZIP"</div>
    <div style="padding-left:10px;">}</div></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``filename``</td>
<td>required, string</td>
<td></td>
<td>"filename" : "test_export_folder.zip"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``format``</td>
<td>required, enum</td>
<td>The desired ``format`` of the export archive file. The enum archiveFormat for the value consist of ZIP and TAR_GZ</td>
<td>"format" : "ZIP"</td>
<td></td>
</tr>
<tr>
<td>``forSigning``</td>
<td>required oneOf(``forSigning``, ``shallowCopy``), object</td>
<td>Object consists of a ``controllerId``, an array of ``objectTypes``, an array of ``folders`` and additional booleans for information on how to filter.</td>
<td>"forSigning" : {
<div style="padding-left:10px;">"controllerId" : "testsuite",</div>
<div style="padding-left:10px;">"objectTypes" : [ "WORKFLOW", "FILEORDERSOURCE", "JOBRESOURCE", "LOCK" ],</div>
<div style="padding-left:10px;">"folders" : [ "/JS7Demo", "/Examples.Unix" ],</div>
<div style="padding-left:10px;">"recursive" : true,</div>
<div style="padding-left:10px;">"withoutDrafts" : false,</div>
<div style="padding-left:10px;">"withoutDeployed" : false</div>
<div style="padding-left:10px;">}</div>
}</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``controllerId``</td>
<td>required, string</td>
<td>ControllerId of the controller already deployed configurations have been deployed to.</td>
<td>"controllerId" : "testsuite"</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``objectTypes``</td>
<td>required, array</td>
<td>An array defining a subset of Configuration Types the specified folders should bw filtered with. Only deployable Configuration Types are allowed.</td>
<td>"objectTypes" : [ "WORKFLOW", "FILEORDERSOURCE", "JOBRESOURCE", "LOCK" ]</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``folders``</td>
<td>required, array</td>
<td>An array of paths of folders containing the configurations to export.</td>
<td>"folders" : [ "/JS7Demo", "/Examples.Unix" ]</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``recursive``</td>
<td>optional, boolean</td>
<td>A switch to determine if the specified folders should be read recursively.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>
<tr>
<td style="padding-left:20px;">``withoutDrafts``</td>
<td>optional, boolean</td>
<td>Determines if draft configurations are excluded from export.</td>
<td>"withoutDrafts" : false</td>
<td>false</td>
</tr>
<tr>
<td style="padding-left:20px;">``withoutDeployed``</td>
<td>optional, boolean</td>
<td>Determines if already deployed configurations are excluded from export.</td>
<td>"withoutDeployed" : false</td>
<td>false</td>
</tr>
<tr>
<td>``shallowCopy``</td>
<td>required oneOf(``forSigning``, ``shallowCopy``), object</td>
<td>Object consists of an array of ``objectTypes``, an array of ``folders`` and additional booleans for information on how to filter..</td>
<td>"shallowCopy" : {
<div style="padding-left:10px;">"objectTypes" : [ "WORKFLOW", "FILEORDERSOURCE", "JOBRESOURCE", "LOCK", "WORKINGDAYSCALENDAR", "SCHEDULE" ],</div>
<div style="padding-left:10px;">"folders" : [ "/JS7Demo", "/Examples.Unix" ],</div>
<div style="padding-left:10px;">"recursive" : true,</div>
<div style="padding-left:10px;">"onlyValidObjects" : false,</div>
<div style="padding-left:10px;">"withoutDrafts" : false,</div>
<div style="padding-left:10px;">"withoutDeployed" : false,</div>
<div style="padding-left:10px;">"withoutReleased" : false</div>
}</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``objectTypes``</td>
<td>required, array</td>
<td>An array defining a subset of Configuration Types the specified folders should bw filtered with. Releaseable and deployable Configuration Types are allowed.</td>
<td>"objectTypes" : [ "WORKFLOW", "FILEORDERSOURCE", "JOBRESOURCE", "LOCK", "WORKINGDAYSCALENDAR", "SCHEDULE" ]</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``folders``</td>
<td>required, array</td>
<td>An array of paths of folders containing the configurations to export.</td>
<td>"folders" : [ "/JS7Demo", "/Examples.Unix" ]</td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``recursive``</td>
<td>optional, boolean</td>
<td>A switch to determine if the specified folders should be read recursively.</td>
<td>"recursive" : true</td>
<td>false</td>
</tr>
<tr>
<td style="padding-left:20px;">``onlyValidObjects``</td>
<td>optional, boolean</td>
<td>Determines if invalid draft configurations are excluded from export.</td>
<td>"onlyValidObjects" : false</td>
<td>false</td>
</tr>
<tr>
<td style="padding-left:20px;">``withoutDrafts``</td>
<td>optional, boolean</td>
<td>Determines if draft configurations are excluded from export.</td>
<td>"withoutDrafts" : false</td>
<td>false</td>
</tr>
<tr>
<td style="padding-left:20px;">``withoutDeployed``</td>
<td>optional, boolean</td>
<td>Determines if already deployed configurations are excluded from export.</td>
<td>"withoutDeployed" : false</td>
<td>false</td>
</tr>
<tr>
<td style="padding-left:20px;">``withoutReleased``</td>
<td>optional, boolean</td>
<td>Determines if already released configurations are excluded from export.</td>
<td>"withoutReleased" : false</td>
<td>false</td>
</tr>
<tr>
<td>``auditLog``</td>
<td>optional, object</td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``comment``</td>
<td>optional, string</td>
<td>for auditLog</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``timeSpent``</td>
<td>optional, string</td>
<td>for auditLog</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``ticketLink``</td>
<td>optional, string</td>
<td>for auditLog</td>
<td></td>
<td></td>
</tr>
