<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit student</title>
</head>
<body>
    <form:form method="post" modelAttribute="student">
        <form:label path="name">Name: </form:label>
        <form:input path="name"/>
        <br>
        <form:label path="name">Score: </form:label>
        <form:input path="score"/>
        <br>
        <form:label path="major">Major: </form:label>
        <form:select path="major" items="${majors}" itemLabel="id" itemValue="name"/>
        <br>
        <form:label path="gender">Gender: </form:label>
        <form:radiobuttons path="gender" items="${genders}"/>
        <br>
        <form:label path="languages">Languages: </form:label>
        <form:checkboxes path="languages" items="${languages}"/>
        <br>
        <form:label path="hobbies">Hobbies: </form:label>
        <form:select path="hobbies" multiple="true" items="${hobbies}"/>
        <br>
        <input type="submit" value="Edit student">
    </form:form>
</body>
</html>
