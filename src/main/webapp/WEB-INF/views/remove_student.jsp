<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove Student</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/removeStudent" method="post">
		Id: <input type="text" name="studentId" /> <input type="submit"
			value="Delete student" />
	</form>

</body>
</html>