<tr><td>``variables``</td><td>optional, object</td>	
<td>Variables can only be set for resumimg a single order that position is not at the beginning of its workflow's scope.<br/>
Otherwise an error is raised.<br/>
It change the returned variables of the previous jobs.<br/>
An object with key-value pairs. The value can be a string, number or boolean<td>	
<pre>"variables": {
      "myString": "stringValue",
      "myNumber": 3.14,
      "myBoolean": true
    }</pre></td><td></td></tr>