* Folders collection in tree format are responsed that means a form such as
<pre>
    "folders": {
        "path":"/",
        "name":"",
        "folders":
        [
            {
                "path":"/sos",
                "name":"sos",
                "folders":
                [
                    {
                        "path":"/sos/housekeeping",
                        "name":"housekeeping"
                    },
                    {
                        "path":"/sos/events",
                        "name":"events"
                    }
                ]
            }
        ]
    }
</pre>
* Content of the folders collection depends on ``folders`` parameter
* If ``types`` parameter is specified then any folder that don't have subfolders or Controller objects from the ``types`` parameter are omit
