<tr><td></td><td colspan="4">The fields ``variables``, ``removeVariables``, ``startPosition`` and ``endPositions`` can only be considered if all Orders that are to be modified belong to the same Workflow</td></tr>

<tr><td>``variables``</td><td>optional, object</td><td> 
An object with key-value pairs for the order. The value can be a string, number or boolean.	
The variables that already exist will be updated with the new values.
The variables that do not exist will be added.
To remove variables use the ``removeVariables`` array.
<td><pre>"variables":{
  "myString": "stringValue",
  "myNumber": 3.14,
  "myBoolean": true
}</pre></td><td></td></tr>

<tr><td>``removeVariables``</td><td>optional, array[string]</td><td> 
Variables specified by their keys will be removed.
<td><pre>"removeVariables":{
  "myString",
  "myNumber",
  "myBoolean"
}</pre></td><td></td></tr>

<tr><td>``startPosition``</td><td>optional, array</td><td>The order starts with the first instruction per default<td>[0]</td><td></td></tr>
<tr><td>``endPositions``</td><td>optional, array[array]</td><td>The order ends on one of these positions<td>[[1]]</td><td></td></tr>
