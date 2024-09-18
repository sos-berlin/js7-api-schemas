<tr>
<td>``names``</td>
<td>optional, array</td>
<td>An array of names (string) of changes to receive information for.</td>
<td>"names" : ["myFirstChange"]
}</td>
<td></td>
</tr>
<tr>
<td>``states``</td>
<td>optional, integer</td>
<td>The states to filter the results. If no states are set all states will be considered.</td>
<td>"states" : [0,1]</td>
<td></td>
</tr>
<tr>
<td>``owner``</td>
<td>optional, string</td>
<td>Filter for the owner of the given change.</td>
<td></td>
<td></td>
</tr>
        "lastPublishedBy": {
<tr>
<td>``lastPublishedBy``</td>
<td>optional, string</td>
<td>Filter for the account the change was last published by.</td>
<td></td>
<td></td>
</tr>
<tr>
<td>``created``</td>
<td>optional, object</td>
<td>filter for changes being created in the specified timespan.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``from``</td>
<td>required, string</td>
<td>allowed formats are:<ul><li>ISO format yyyy-mm-dd HH:MM[:SS]</li><li>now</li><li>now + HH:MM[:SS]</li><li>now + SECONDS</li></ul></td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``to``</td>
<td>required, string</td>
<td>allowed formats are:<ul><li>ISO format yyyy-mm-dd HH:MM[:SS]</li><li>now</li><li>now + HH:MM[:SS]</li><li>now + SECONDS</li></ul></td>
<td></td>
<td></td>
</tr>
<tr>
<td>``modified``</td>
<td>optional, object</td>
<td>filter for changes being modified in the specified timespan.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``from``</td>
<td>required, string</td>
<td>allowed formats are:<ul><li>ISO format yyyy-mm-dd HH:MM[:SS]</li><li>now</li><li>now + HH:MM[:SS]</li><li>now + SECONDS</li></ul></td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``to``</td>
<td>required, string</td>
<td>allowed formats are:<ul><li>ISO format yyyy-mm-dd HH:MM[:SS]</li><li>now</li><li>now + HH:MM[:SS]</li><li>now + SECONDS</li></ul></td>
<td></td>
<td></td>
</tr>
<tr>
<td>``closed``</td>
<td>optional, object</td>
<td>filter for changes being modified in the specified timespan.</td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``from``</td>
<td>required, string</td>
<td>allowed formats are:<ul><li>ISO format yyyy-mm-dd HH:MM[:SS]</li><li>now</li><li>now + HH:MM[:SS]</li><li>now + SECONDS</li></ul></td>
<td></td>
<td></td>
</tr>
<tr>
<td style="padding-left:20px;">``to``</td>
<td>required, string</td>
<td>allowed formats are:<ul><li>ISO format yyyy-mm-dd HH:MM[:SS]</li><li>now</li><li>now + HH:MM[:SS]</li><li>now + SECONDS</li></ul></td>
<td></td>
<td></td>
</tr>
<tr>
<td>``details``</td>
<td>optional, boolean</td>
<td>A switch to receive additional details about items assigned to the change.</td>
<td></td>
<td>false</td>
</tr>
