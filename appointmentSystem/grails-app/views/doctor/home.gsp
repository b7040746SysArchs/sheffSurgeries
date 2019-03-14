<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SHEFF SURGERIES | Home</title>
</head>
<body>

<div id="content" role="main">
    <section class="row colset-2-its">
        <div style="margin: 15px;">
          <h1 id="taglineHome">PRESCRIPTION ADMIN</h1>
          <button type="button" id="gLinkBtn" class="btn btn-warning">
            <g:link controller="prescription" action="create">Create New Prescription</g:link>
          </button>
          <button type="button" id="gLinkBtn" class="btn btn-warning">
            <g:link controller="prescription" action="index">View Prescriptions</g:link>
          </button>
          <button type="button" id="gLinkBtn" class="btn btn-warning">
            <g:link controller="prescription" action="search">Search Prescriptions</g:link>
          </button>
          <button type="button" id="gLinkBtn" class="btn btn-warning">
            <g:link controller="prescription" action="advSearch">Advanced Search</g:link>
          </button>
          </div>
          <div style="margin: 15px;">
            <h1 id="taglineHome">PATIENT ADMIN</h1>
            <button type="button" id="gLinkBtn" class="btn btn-warning">
              <g:link controller="patient" action="index">View Patients</g:link>
            </button>
            </div>
            <div style="margin: 15px;">
              <h1 id="taglineHome">APPOINTMENT ADMIN</h1>
              <button type="button" id="gLinkBtn" class="btn btn-warning">
                <g:link controller="appointment" action="index">View Appointments</g:link>
              </button>
              </div>

    </section>
</div>

</body>
</html>
