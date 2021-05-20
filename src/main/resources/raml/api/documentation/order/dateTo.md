<tr><td>``dateTo``</td><td>optional, string</td><td>The value has multiple formats
<ul>
<li>Filters items ending before a date.</li>
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
