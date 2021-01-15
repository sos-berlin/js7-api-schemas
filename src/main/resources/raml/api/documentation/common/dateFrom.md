<tr><td>``dateFrom``</td><td>optional, string</td><td>The value has multiple formats
<ul>
<li>a format for a date in ISO 8601 format where the <i>time offset</i> and milliseconds are optional, e.g.
  <ul>
    <li>YYYY-MM-DDThh:mm:ss[.s][Z (Z means +00)]</li>
    <li>YYYY-MM-DDThh:mm:ss[.s][+01:00]</li>
    <li>YYYY-MM-DDThh:mm:ss[.s][+0100]</li>
    <li>YYYY-MM-DDThh:mm:ss[.s][+01]</li>
  </ul>
</li>
<li>a format for a time period in relative to the current time, e.g. 6h, 12h, 1d, 1w can specify in addition with a time offset 0 or digits followed by a letter are expected where the letter has to be:
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
    <li>it can be also specify with the parameter ``timeZone``</li>
    <li>if ``timeZone`` undefined then UTC is used</li>
  </ul>
</li>
<li>the value 0 means the current time</li>
<li>Returns only collection items younger than this date.</li>
</ul>
</td><td>1d</td><td></td></tr>
