<tr>
<td>``validUntil``</td>
<td>optional, date</td>
<td>Expiration Date of the Certificate</td>
<td>2024-12-31T12:00:00Z</td>
<td></td>
</tr>
<tr>
<td>``keyAlgorithm``</td>
<td>required, string</td>
<td>Type of the Key Algorithm: PGP, RSA or ECDSA</td>
<td>
  <div style="padding-left:10px;">{</div>
  <div style="padding-left:15px;">"keyAlgorithm" : "ECDSA"</div>
  <div style="padding-left:10px;">}</div>
</td>
<td>ECDSA</td>
</tr>
<tr>
<td>``dn``</td>
<td>optional, string</td>
<td>Distinguished Name (DN) for the keys certificate.</td>
<td>CN=MyTestAccountName, OU=Development, O=SOS-Berlin, ST=Berlin, L=Berlin, C=DE</td>
<td></td>
</tr>
<tr valign="top">
<td>``useSslCa``</td>
<td>optional, boolean</td>
<td>In general the published CA certificate for the <i>Signature Key Management</i> is used for signature validation only. 
This property determines if the CA in the <i>SSL Key Management</i>, which is used to generate auth keys and certificates, should also be used for the key and certificate generation in the <i>Signature Key Management</i>. 
<ul><li>If set to true:</li><ul><li>Requires that a CA is already configured for the <i>SSL Key Management</i>.</li><li>Creates a private key for the account and a <i>CA signed</i> certificate.</li>
<li>Replaces an already uploaded CA certificate for signature validation in the <i>Signature Key Management</i> with the certificate of the existing <i>SSL Key Management</i> CA.</li></ul>
<li>If set to false:</li><ul><li>The CA in the <i>Signature Key Management</i> will be used for signature validation only.</li><li>Creates a private key for the account and a <i>self signed</i> certificate.</li>
</td>
<td></td>
<td>false</td>
</tr>

