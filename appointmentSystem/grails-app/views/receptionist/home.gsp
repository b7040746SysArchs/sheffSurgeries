<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SHEFF SURGERIES | Home</title>
</head>
<body onload="getTodaysAppointments()">

<div id="content" role="main">
  <h1 id="taglineHome" style="text-align: center; font-size: 35px">RECEPTION DASHBOARD</h1>
    <section class="row colset-2-its">
        <div style="margin: 15px;">
          <h1 id="taglineHome">DOCTOR ADMIN</h1>
          <button type="button" id="gLinkBtn" class="btn btn-warning">
            <g:link controller="doctor" action="create">Add Doctor</g:link>
          </button>
          <button type="button" id="gLinkBtn" class="btn btn-warning">
            <g:link controller="doctor" action="index">View Doctors</g:link>
          </button>
          </div>
          <div style="margin: 15px;">
            <h1 id="taglineHome">NURSE ADMIN</h1>
            <button type="button" id="gLinkBtn" class="btn btn-warning">
              <g:link controller="nurse" action="create">Add Nurse</g:link>
            </button>
            <button type="button" id="gLinkBtn" class="btn btn-warning">
              <g:link controller="nurse" action="index">View Nurses</g:link>
            </button>
            </div>
            <div style="margin: 15px;">
              <h1 id="taglineHome">PATIENT ADMIN</h1>
              <button type="button" id="gLinkBtn" class="btn btn-warning">
                <g:link controller="patient" action="create">Add Patient</g:link>
              </button>
              <button type="button" id="gLinkBtn" class="btn btn-warning">
                <g:link controller="patient" action="index">View Patients</g:link>
              </button>
              <button type="button" id="gLinkBtn" class="btn btn-warning">
                <g:link controller="patient" action="advSearch">Advanced Patient Search</g:link>
              </button>
              </div>
              <div style="margin: 15px;">
                <h1 id="taglineHome">RECEPTIONIST ADMIN</h1>
                <button type="button" id="gLinkBtn" class="btn btn-warning">
                  <g:link controller="receptionist" action="create">Add Receptionist</g:link>
                </button>
                <button type="button" id="gLinkBtn" class="btn btn-warning">
                  <g:link controller="receptionist" action="index">View Receptionists</g:link>
                </button>
                </div>
                </br><h1 id="taglineHome" style="text-align: center; font-size: 35px">DOCTOR CONTACT DETAILS</h1>
                <div id="injectDoctorInformation"></div>

    </section>
</div>



<g:javascript>
  let appointments = document.getElementById("injectDoctorInformation");
  if(appointments){
    let Url = "http://localhost:8080/doctor/doctorDetailsJSON"
    fetch(Url)
    .then(res => res.json())
    .then(data => {
      let doctorsDetails = data.doctorsDetails.doctors

        for(let index = 0; index < doctorsDetails.length; index++){
          tempDOM = document.createElement("P")
          tempDOM.setAttribute("id", `${index}_Doctor`)
          tempDOM.innerHTML = doctorsDetails[index].full_name + " | " + doctorsDetails[index].doctor_email + " | " + doctorsDetails[index].doctor_phone
          appointments.appendChild(tempDOM)
        }
    })
    .catch(err => {
      console.log(err)
    })
  }
</g:javascript>





</body>
</html>
