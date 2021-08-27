<tr><td>``calendars``</td><td>optional, array</td><td>Collection of WorkingDaysCalendar objects (Calendar path, restrictions and period)</td><td></td>
<td><pre>
[{
	"calendarPath": "/test/eachFriday",
	"includes": {
		"monthdays": [{
			"weeklyDays": [{
				"day": 5,
				"weekOfMonth": 1
			}]
		}]
	},
	"periods": [{
		"singleStart": "00:00:00",
		"whenHoliday": "SUPPRESS"
	}]
}]</pre></td></tr>
