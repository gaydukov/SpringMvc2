<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form method="POST" commandName="User" action="/HelloUser">

        <form:label path="name">Name:</form:label>
        <form:input path="name" />

        <form:label path="password">Password</form:label>
        <form:input path="password" />


<footer>
    <label> <input type="checkbox" tabindex="3">Login in</label>
    <input type="submit" class="btnLogin" value="Login"/>
</footer>


</form:form>
</body>
</html>