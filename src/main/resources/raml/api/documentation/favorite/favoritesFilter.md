<tr><td>``favoriteIds``</td><td>optional, array[object]</td><td>Filters the response for specified favorites.
    <br/>The parameters ``types`` and ``limit`` are ignored if this parameter is defined. 
    <br/>Each favorite is identified by the following fields</td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``name``</td><td>required, string</td><td></td><td></td><td></td></tr>
    <tr><td style="padding-left:20px;">``type``</td><td>required, string</td><td>Type of the favorite. Possible value are 
<ul><li>FACET</li>
    <li>AGENT</li></ul>
</td><td></td><td></td></tr>
<tr><td>``types``</td><td>optional, array[string]</td>
<td>Filters all favorites with types such as
<ul>
<li>FACET</li>
<li>AGENT</li>
</ul>
</td><td>["FACET"]</td><td></td></tr>
<tr><td>``limit``</td><td>optional, integer</td><td>Limits the number of items in the response</td><td></td><td>-1 (= unlimited)</td></tr>
<tr><td>``withShared``</td><td>optional, boolean</td><td></td><td></td><td>false</td></tr>
<tr><td>``onlyShared``</td><td>optional, boolean</td><td></td><td></td><td>false</td></tr>
    
