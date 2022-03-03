<tr><td>``folders``</td><td>required, array</td>
<td>An array with folders that can be accessed.<br/>
The folders are "joc" folders or "controllers" folders.
Each folder defines the folder and whether it is recursiv.
 <td> [
  <div style="padding-left:10px;"> "folders": {
        "joc": [
          {
            "folder": "/test",
            "recursive": true,
          }
        ],
        "controllers": {
          "test": [
            {
              "folder": "/Defaults",
              "recursive": true
            },
            {
              "folder": "/EmptyFolder",
              "recursive": true
            }
          ]
        }
      }</div>
  ]</td>
<td></td>
</tr>

 