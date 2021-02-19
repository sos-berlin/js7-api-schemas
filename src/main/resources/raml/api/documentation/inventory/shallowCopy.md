<tr><td>``shallowCopy``</td><td>optional, boolean<td>
<ul>
	<li>_Shallow Copy_ (this parameter is true)</li>
	<ul>
		<li>References to existing objects are retained.</li>
		<ul>
			<li>For objects that do not contain references, copying should be omitted, 
			e.g. for _Locks_, because with _Shallow Copy_ no copied _Workflow_ would reference the copied _Lock_.</li>
		</ul>
		<li>Therefore: _Shallow Copy_ copies objects that contain references, currently _Workflows_, _Schedules_.</li>
		<ul>
			<li>If a single object is copied, then a copy is always made, even for objects that do not contain references.</li>
			<li>If folders are copied, then objects are not copied unless they contain references.</li>
		</ul>
	</ul>
	<li>_Deep Copy_ (this parameter is false)</li>
	<ul>
		<li>All objects are copied, without exception.</li>
		<li>All existing references to objects are updated with regard to the copied objects.</li>
		<ul>
			<li>If, for example, a workflow references a _Lock_ that is not itself the object of the copy operation, the previous reference is retained.</li>
			<li>If, on the other hand, the referenced _Lock_ is also copied, then the reference in the _Workflow_ is updated.</li>
		</ul>
	</ul>
</ul>
</td><td></td><td>false</td></tr>
