<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SHEFF SURGERIES | Advanced Results</title>
</head>
<body>
<div id="content" role="main">

  <div class="row" id="prescriptionResults">
    <h1 id="taglineHome">ADVANCED PERSCRIPTION RESULTS</h1>
    <p>
    Searched for Prescriptions matching <em>${term}</em>
    Found <strong>${prescriptions.size()}</strong> Prescriptions
    </p>
    <ul>
      <g:each var="prescription" in="${prescriptions}">
      <li>
        <g:link controller="prescription" action="show" id="${prescription.id}">${prescription.medicene}</g:link>
      </li>
      </g:each>
    </ul>
    <g:link action="advSearch"> Search Again</g:link>
  </div>

</div>
</body>
</html>
