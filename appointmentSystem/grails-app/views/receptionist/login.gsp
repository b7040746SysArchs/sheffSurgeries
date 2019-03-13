<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SHEFF SURGERIES | Reception Login</title>
</head>
<body style="margin-bottom: 35px;">
<div id="recepLoginForm">

  <g:if test="${flash.message}">
   <div class="message">${flash.message}</div>
   </g:if>
<a style="float: right;" href='${createLink(url:'/')}'><button id="btnHomepage" class="btn btn-secondary">GO BACK</button></a>
   <g:form action="validate">
   <h1 style="text-align:center; font-size: 30px;" id="taglineHome">RECEPTION LOGIN</h1>
 <input type="hidden" placeholder="Username" name="cName" value="${cName}">
 <input type="hidden" placeholder="Password" name="aName" value="${aName}">
 <table>
   <tr class="prop">
     <td class="name">
       <label id="loginLabel" for="username">User Name:</label>
     </td>
     <td class="value">
       <input type="text" id="username" name="username" value="">
     </td></tr>
   <tr class="prop">
     <td class="name">
       <label id="loginLabel" for="password">Password:</label>
     </td>
     <td class="value">
       <input type="password" id="password" name="password" value="">
     </td></tr>
   <tr><td></td>
     <td>
       <input class="btn btn-success" type="submit" id="btnHomepage" value="LOGIN"/>
     </td></tr>
 </table>
</g:form>
</body>
</html>



</div>

</body>
</html>
