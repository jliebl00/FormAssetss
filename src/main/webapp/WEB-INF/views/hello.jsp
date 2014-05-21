<%@ include file="/WEB-INF/views/include.jsp"%>
<html>
<head>
<title>Ulebank</title>
</head>
<body>
	<h1>
		Comisiones 
	</h1>
	<p> Total credito
 		<c:out value="${model.totalLoan}" /> 
	</p>
	<p> Comision modificacion
 		<c:out value="${model.modifyFee}" /> 
	</p>
	<p> 
	    Comision cancelacion
 		<c:out value="${model.cancelFee}" /> 
	</p>
	<p>
		Comision apertura
 		<c:out value="${model.openningFee}" /> 
	</p>
	<p>
		Comision estudio
 		<c:out value="${model.studyFee}" /> 
	</p>
	
	

	<br>
	<a href="<c:url value="comision.htm"/>">Ver las comisiones</a>
	<br>
</body>
</html>