<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType= "text/HTML; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Holaa</h1>
    <form:form action="/dojos/new" modelAttribute="dojos" method="POST">
        <form:label path="name">Nombre Dojo:</form:label>
        <form:input path="name" type="text"></form:input>
        <form:errors path="name" style="color: red;"></form:errors>
        <br><br>
        <input type="submit" value="submit">
    </form:form>
</body>
</html>