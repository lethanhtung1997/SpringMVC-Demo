<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Employee</title>
</head>
<body>
	<form:form action="/createEmployee" method="post"
		modelAttribute="employeeForm">
		<form:label path="name">Name:</form:label>
		<form:input path="name" />
		<br>
		<form:label path="gender">Gender:</form:label>
		<form:radiobutton path="gender" items="${genders}" />
		<br>
		<form:label path="homeTown">HomeTown:</form:label>
		<form:input path="homeTown" />
		<br>
		<form:label path="id">Company:</form:label>
		<form:select path="id" items="${companies}" />
		<br>
		<input type="submit" value="Create Company" />
	</form:form>


</body>
</html>