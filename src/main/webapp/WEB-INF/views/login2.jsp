<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
    Demo HttpServletRequest
    <form action="/login2" method="post">
       Username: <input type="text" name="username">
       <br>
       Password: <input type="text" name="password">
       <div style="color: red">
           ${errorMessage}
       </div>
       <input type="submit" value="Login">
    </form>
    Demo @RequestParam
    <form action="/login3" method="post">
        Username: <input type="text" name="username">
        <br>
        Password: <input type="text" name="password">
        <div style="color: red">
            ${errorMessage2}
        </div>
        <input type="submit" value="Login">
    </form>
    JavaBean
    <form action="/login4" method="post">
        Username: <input type="text" name="username">
        <br>
        Password: <input type="text" name="password">
        <div style="color: red">
            ${errorMessage3}
        </div>
        <input type="submit" value="Login">
    </form>
</body>
</html>
