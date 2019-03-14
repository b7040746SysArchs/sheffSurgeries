<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SHEFF SURGERIES | Prescription Results</title>
</head>
<body>
<div id="content" role="main">

  <div class="row" id="prescriptionResults">
    <h1 id="taglineHome">PERSCRIPTION RESULTS</h1>
    <p>
      Searched ${totalPrescriptions} records
      for items matching <em>${name}</em>
      Found <strong>${prescriptions.size()}</strong> medicene
    </p>
  </br>
    <div>
      <ul>
        <g:each var="prescription" in="${prescriptions}">
        <li><g:link controller="prescription" action="show" id="${prescription.id}">${prescription.medicene}</g:link></li></br>
        </g:each>
      </ul>
    </div>
  </br>
      <button type="button" class="btn btn-success">
      <g:link action="search">Search Again</g:link>
    </button>
  </div>

</div>
</body>
</html>
