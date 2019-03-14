<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="headAndFooter.css"/>
    <asset:stylesheet src="application.css"/>
    <g:layoutHead/>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" id="headerNav" role="navigation">
    <asset:image id="logoHeader" src="logoThin.png" />
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" aria-expanded="false" style="height: 0.8px;" id="navbarContent">
        <ul class="nav navbar-nav ml-auto">
            <g:pageProperty name="page.nav"/>
        </ul>
    </div>
<g:loginToggle />
</nav>
<g:dateAndTime />
<g:test />
<g:layoutBody/>

<div class="footer row" id="footerContainer" role="contentinfo">
      <div class="col-sm-6" id="footerBlurb">
          <asset:image src="support.svg" />
          <strong><p class="footerTitle">SOFTWARE SUPPORT</p></strong>
      </div>
      <div class="col-sm-6" id="footerBlurb">
              <asset:image src="password.svg" />
          <strong><p class="footerTitle">CHANGE PASSWORD</p></strong>
      </div>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
