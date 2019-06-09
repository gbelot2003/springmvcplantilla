<%@ page contentType="text/html; charset = UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Costumer!!</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<i>LLene los espacios con asteriscos</i>
	<form:form modelAttribute="customer" action="store">
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
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>