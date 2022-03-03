<tr><td>``permissions``</td><td>required, array</td>
<td>An array with permissions<br/>
The permissions are devided into permissions for JOC and for controllers. There may be one section for each individuell controller.<br/>
Each permission have a path as an identifier and whether this permission is excluded or included.

<td> [
  <div style="padding-left:10px;">      
  "permissions": {
        "joc": [
          {
            "path": "sos:products:joc:administration:accounts",
            "excluded": false
          },
          {
            "path": "sos:products:joc:administration:customization",
            "excluded": false
          },...
       "controllerDefaults": [
          {
            "path": "sos:products:controller:view",
            "excluded": false
          },
       "controllers": {
          "test": [
            {
              "path": "sos:products:controller:terminate",
              "excluded": false
            },
   </div>
  ]</td>
<td></td>
</tr>

 