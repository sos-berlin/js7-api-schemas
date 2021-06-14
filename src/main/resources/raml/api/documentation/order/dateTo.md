<tr><td>``dateTo``</td><td>optional, string</td><td>The value has multiple formats
<ul>
<li>Filters Orders whose schedule is before a date.</li>
<li>an ISO 8601 date format with the <i>time offset</i> and milliseconds being optional, e.g.
  <ul>
    <li>YYYY-MM-DDThh:mm:ss[.s][Z (Z means +00)]</li>
    <li>YYYY-MM-DDThh:mm:ss[.s][+01:00]</li>
    <li>YYYY-MM-DDThh:mm:ss[.s][+0100]</li>
    <li>YYYY-MM-DDThh:mm:ss[.s][+01]</li>
  </ul>
</li>
<li>a format for a period relative to the current time, e.g. 6h, 12h, 1d, 1w that specifies the quantity followed by a qualifier:
  <ul>
    <li>s (seconds)</li>
    <li>m (minutes)</li>
    <li>h (hours)</li>
    <li>d (days)</li>
    <li>w (weeks)</li>
    <li>M (months)</li>
    <li>y (years)</li>
  </ul>
</li>
<li>a time offset is optional (e.g. 2d+02:00)
  <ul>
    <li>it can also be specified with the parameter ``timeZone``</li>
    <li>if ``timeZone`` is undefined then UTC is used</li>
  </ul>
</li>
<li>the value 0 indicates the current time</li>
</ul>
</td><td>1d</td><td></td></tr>
<tr><td>``timeZone``</td><td>optional, string</td><td><ul><li>If this parameter is set then it beats the time offset of absolute dates in ``dateTo``</li><li>See here the list for <a href="https://en.wikipedia.org/wiki/List_of_tz_database_time_zones" target="wiki">available time zones</a>.</li></ul></td><td>Europe/Berlin</td><td></td></tr>
<tr><td>``scheduledNever``</td><td>optional, boolean</td>
<td>Filters Orders whose schedule is "never". If this value is "true" than ``dateTo`` is ignored.</td><td></td><td>false</td></tr>
