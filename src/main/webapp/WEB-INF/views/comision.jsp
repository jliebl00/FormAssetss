<%@ include file="/WEB-INF/views/include.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Comision</title>
</head>
<body>
	<form:form method="post" commandName="comisions">

		<label for="cancelFee">Cancelacion </label>
		<form:input path="cancelFee" id="cancelFee" />
		<br />
		<label for="modifyFee">Modificacion </label>
		<form:input path="modifyFee" id="modifyFee" />
		<br />
		<label for="openningFee">Apertura </label>
 		<form:input path="openningFee" id="openningFee" /> 
		<br />
		<label for="studyFee">Estudio </label>
		<form:input path="studyFee" id="studyFee" />
		<br />
		<br>
		<input type="submit" value="Calculate">
	</form:form>
	<a href="<c:url value="hello.htm"/>">Home</a>

</body>
</html>