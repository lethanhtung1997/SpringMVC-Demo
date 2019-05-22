<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Student</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/getStudentById" method="post">
		ID: <input type="text" name="studentId" /> <input type="submit"
			value="Delete student" />
	</form>
</body>
</html>