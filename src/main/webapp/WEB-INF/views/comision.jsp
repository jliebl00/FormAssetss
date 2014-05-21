<%@ include file="/WEB-INF/views/include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Comision</title>
</head>
<body>
<form:form method="post" commandName="comisions">
  
  <label for="nameInput">Cancelacion </label>
      <form:input path="name" id="cancelFee" />
  <br/>
  <label for="nameInput">Modificacion </label>
      <form:input path="name" id="modifyfee" />
  <br/>
  <label for="nameInput">Apertura </label>
      <form:input path="name" id="oppeningfee" />
  <br/>
  <label for="nameInput">Estudio </label>
      <form:input path="name" id="studyfee" />
    <br/>
  <br>
  <input type="submit" value="Calculate">
</form:form>
<a href="<c:url value="hello.htm"/>">Home</a>

</body>
</html>