<%@ page contentType="text/html; charset = UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Costumer!!</title>
<style type="text/css">
div{
	margin: 0 0 0 10px;
}
.error {
	color: red;
	font-size: 10;
}
</style>
</head>
<body>
	<i>LLene los espacios con asteriscos</i>
	<form:form modelAttribute="costumer" action="store">
		<div>
			First Name(*):
			<form:input path="firstName" />
			<form:errors path="firstName" cssClass="error" />
		</div>
		
		<div>
			Last Name(*):
			<form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
		</div>
		
		<div>
			Free passer: <form:input path="freePass" />		
			<form:errors path="freePass" cssClass="error" />
		</div>
	
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>