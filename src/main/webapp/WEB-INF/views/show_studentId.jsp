<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Student</title>
</head>
<body>
	<c:choose>
		<c:when test="${students != null}">
			<table border="1">
				<th>Id</th>
				<th>Name</th>
				<th>Mark</th>
				<tr>
					<td>${students.id}</td>
					<td>${students.name}</td>
					<td>${students.mark}</td>
				</tr>
			</table>
		</c:when>
		<c:otherwise>Student not Found !</c:otherwise>
	</c:choose>
</body>
</html>