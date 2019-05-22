<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/updateStudent" method="post" modelAttribute="svForm">
		<form:label path="name">Name: </form:label>
		<form:input path="name" />
		<br>
		<form:label path="mark">Mark: </form:label>
		<form:input path="mark" />
		<br>
		<input type= "submit" value="Edit Student"/>
		</form:form>
</body>
</html>