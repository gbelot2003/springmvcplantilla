<%@ page contentType="text/html; charset = UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Costumer!!</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

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
	<form:form modelAttribute="costumer" action="store" ccsClass="form-group">
		<div class="form-group">
			First Name(*):
			<form:input path="firstName"  cssClass="form-control"/>
			<form:errors path="firstName" cssClass="has-error error" />
		</div>
		
		<div style="margin:0 0 0 10px">
			Last Name(*):
			<form:input path="lastName" cssClass="form-control" />
			<form:errors path="lastName" cssClass="has-error error" />
		</div>
		
		<div style="margin:0 0 0 10px">
			Free passer: <form:input path="freePass" cssClass="form-control" />		
			<form:errors path="freePass" cssClass="has-error error" />
		</div>
		<div style="margin:0 0 0 10px">
			Postal Code: <form:input path="postalCode" cssClass="form-control" />
			<form:errors path="postalCode" cssClass="has-error error" />
			<hr />
		</div>
		
		
		<input type="submit" class="btn btn-primary" value="submit" />
	</form:form>

</body>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</html>