<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Show all users</title>
</head>
<body>
    <table border="1">
        <th>Id</th>
        <th>Password</th>
        <th>Full name</th>
        <th>Photo</th>
        <th>Email</th>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.password}</td>
                <td>${user.fullName}</td>
                <td>${user.photo}</td>
                <td>${user.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
