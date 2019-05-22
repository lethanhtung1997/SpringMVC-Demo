<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Student By Name</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/getStudentByName" method="post">
		Name: <input type="text" name="studentName" /> <input type="submit"
			value="Get Student By Name" />
	</form>
</body>
</html>