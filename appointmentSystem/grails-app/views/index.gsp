<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SHEFF SURGERIES | Welcome</title>
</head>
<body>

<div id="content" role="main" class="homepageLoginContainer">
    <section class="row colset-12-its">
        <h1 id="taglineHome">Dedicated To Providing Exceptional Healthcare</h1>
        <div class="row">
          <div class="col-sm-3" id="btnContainerHomepage">
            <a href='${createLink(controller:'receptionist', action:'login')}'><button id="btnHomepage" class="btn btn-warning">RECEPTION LOGIN</button></a>
            <a href='${createLink(controller:'doctor', action:'login')}'><button id="btnHomepage" class="btn btn-warning">DOCTOR LOGIN</button></a>
          </div>
          <div class="col-sm-9">
          <asset:image style="width:75%; border-radius:15px;" src="doctors.jpg" />
        </div>
        </div>
    </section>
</div>

</body>
</html>
