<h2>validates JSON representation of an inventory objects</h2>
<p>supported JSON:
<ul>
	<li><a href="../../../../../controller/schemas/workflow/workflow-schema.json" target="workflow">Workflow JSON schema</a></li>
	<li><a href="../../../../../controller/schemas/lock/lock-schema.json" target="jobclass">Lock JSON schema - IN PROGRESS</a></li>
	<li><a href="../../../../../controller/schemas/jobclass/jobClass-schema.json" target="jobclass">JobClass JSON schema - IN PROGRESS</a></li>
	<li><a href="../../../../../controller/schemas/junction/junction-schema.json" target="junction">Junction JSON schema - IN PROGRESS</a></li>
	<li><a href="../../../../../api/schemas/orderManagement//orders/schedule-schema.json" target="order">Schedule JSON schema</a></li>
	<li><a href="../../../../../api/schemas/calendar/calendar-schema.json" target="calendar">Calendar JSON schema</a></li>
</ul>
</p>
<p>The url parameter has to be the corresponding objectType (case insensitive)
<ul>
	<li>"WORKFLOW"</li>
    <li>"LOCK"</li>
    <li>"JOBCLASS"</li>
    <li>"JUNCTION"</li>
    <li>"SCHEDULE"</li>
    <li>"WORKINGDAYSCALENDAR"</li>
    <li>"NONWORKINGDAYSCALENDAR"</li>
</ul>
</p>