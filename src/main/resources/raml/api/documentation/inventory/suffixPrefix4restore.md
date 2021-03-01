<tr><td>``suffix``</td><td>optional, string<td>
<ul>
<li>Restored objects are given new names.</li>
<li>A ``suffix`` or ``prefix`` can be specified for objects to be restored.
	<ul>
	<li>If a ``suffix`` is specified then a ``prefix`` will be ignored</li>
    <li>A leading dash is added to a ``suffix`` programmatically</li>
    <li>A ``prefix`` is programmatically followed by a dash at the end</li> 
	<li>If ``suffix`` and ``prefix`` are empty, then a ``suffix``="-restored&lt;integer&gt;" is used, where _&lt;integer&gt;_ is the 
	smallest natural number that ensures the uniqueness of the names of the restored objects.</li>
	</ul>
</li>
</ul>
</td><td></td><td></td></tr>
<tr><td>``prefix``</td><td>optional, string<td></td><td></td><td></td></tr>