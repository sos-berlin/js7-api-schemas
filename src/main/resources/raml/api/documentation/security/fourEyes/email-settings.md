<tr><td>``jobResourceName``</td><td>optional, string</td><td>Name of a Job Resource (with smtp settings)</td><td></td><td>eMailDefault</td></tr>
<tr><td>``body``</td><td>required, string</td><td>Body of the email. The following placeholders will be replaced by the request data
<ul>
<li>${RequestDate}: Date of the approval request</li>
<li>${Title}: Title of the approval request</li>
<li>${Requestor}: Requestor of the approval request</li>
<li>${RequestURL}: URL the approval request</li>
<li>${Category}: Category of the approval request</li>
<li>${Reason}: Reason of the approval request</li>
</ul>
</td><td></td><td></td></tr>
<tr><td>``subject``</td><td>optional, string</td><td>Subject of the email. Above placeholders will be replaced too</td><td></td><td></td></tr>
<tr><td>``cc``</td><td>optional, string</td><td>Carbon copy of the email</td><td></td><td></td></tr>
<tr><td>``bcc``</td><td>optional, string</td><td>Blind carbon copy type of the email</td><td></td><td></td></tr>
<tr><td>``contentType``</td><td>optional, string</td><td>Content type of the email</td><td></td><td>text/html</td></tr>
<tr><td>``charset``</td><td>optional, string</td><td>Charset type of the email</td><td></td><td>ISO-8859-1</td></tr>
<tr><td>``encoding``</td><td>optional, string</td><td>Encoding type of the email</td><td></td><td>7bit</td></tr>
