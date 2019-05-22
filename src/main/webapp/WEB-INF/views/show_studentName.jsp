<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Student</title>
</head>
<body>
	<c:choose>
		<c:when test="${student != null}">
			<table border="1">
				<th>Id</th>
				<th>Name</th>
				<th>Mark</th>
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mark}</td>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
       Student not found
    </c:otherwise>
	</c:choose>

</body>
</html>