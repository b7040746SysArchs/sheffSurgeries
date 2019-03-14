<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SHEFF SURGERIES | Advanced Prescription Search</title>
</head>
<body>
<div id="content" role="main">

  <div class="row" id="prescriptionResults">
    <h1>SEARCH FOR PRESCRIPTIONS</h1>
    <formset>
      <legend>Search For Prescriptions (Advanced)</legend>
        <table>
          <g:form action="advResults">
          <tr>
            <td>Medicene</td>
            <td><g:textField  name="medicene" /></td>
            <td>Total Cost</td>
            <td><g:textField  name="totalCost" /></td>
            <td>Days Of Supply</td>
            <td><g:textField  name="daysSupply" /></td>
          </tr>
          <tr>
            <td>Query Type:</td>
            <td><g:radioGroup name="queryType" labels="['AND', 'OR', 'NOT']" values="['and','or','not']" value='and'>
              ${it.radio}${it.label}
              </g:radioGroup>
            </td>
          </tr>
          <tr>
            <td>
              <g:submitButton name="search" value="SEARCH"/>
            </td>
          </tr>
          </g:form>
        </table>
      </formset>
  </div>

</div>
</body>
</html>
