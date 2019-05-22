<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Student</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/createStudent"
		method="post" modelAttribute="svForm">
		<table border="1">
			<tr>
				<td><form:label path="id">Id</form:label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="mark">Mark</form:label></td>
				<td><form:input path="mark" /></td>
			</tr>
		</table>
		<tr>
			<td><input type="submit" value="Create Student" /></td>
		</tr>
	</form:form>
</body>
</html>