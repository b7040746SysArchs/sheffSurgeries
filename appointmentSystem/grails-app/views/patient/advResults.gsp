<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SHEFF SURGERIES | Advanced Results</title>
</head>
<body>
<div id="content" role="main">

  <div class="row" id="prescriptionResults">
    <h1 id="taglineHome">ADVANCED PATIENT RESULTS</h1>
    <p>
    Searched for patients matching <em>${term}</em>
    Found <strong>${patients.size()}</strong> Patients
    </p>
    <ul>
      <g:each var="patient" in="${patients}">
      <li>
        <g:link controller="patient" action="show" id="${patient.id}">${patient.patientName}</g:link>
      </li>
      </g:each>
    </ul>
    <g:link action="advSearch"> Search Again</g:link>
  </div>

</div>
</body>
</html>
