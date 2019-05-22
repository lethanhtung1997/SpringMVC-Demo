<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Show user</title>
</head>
<body>
<c:choose>
    <c:when test="${user != null}">
        <table border="1">
            <th>Id</th>
            <th>Password</th>
            <th>Full name</th>
            <th>Photo</th>
            <th>Email</th>
            <tr>
                <td>${user.id}</td>
                <td>${user.password}</td>
                <td>${user.fullName}</td>
                <td>${user.photo}</td>
                <td>${user.email}</td>
            </tr>
        </table>
    </c:when>
    <c:otherwise>
        User not found
    </c:otherwise>
</c:choose>
</body>
</html>
