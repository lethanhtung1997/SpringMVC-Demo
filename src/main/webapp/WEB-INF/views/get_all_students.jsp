<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Students</title>
</head>
<body>
	<table border="1">
		<th>Id</th>
		<th>Name</th>
		<th>Mark</th>
		<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.mark}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>