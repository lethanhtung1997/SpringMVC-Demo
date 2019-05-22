<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete user</title>
</head>
<body>
    <form action="/deleteUser" method="post">
        Id: <input type="text" name="userId">
        <input type="submit" value="Delete user">
    </form>
</body>
</html>
