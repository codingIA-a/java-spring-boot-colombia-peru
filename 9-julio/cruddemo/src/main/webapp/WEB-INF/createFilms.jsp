<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form:form action="/films/create" modelAttribute="film" method="post">
        <form:label path="nombre" >Nombre Película:</form:label>
        <form:input path="nombre" type="text"></form:input>
        <form:errors path="nombre" style="color: red;"/>
        <!---->
        <br><br>
        <form:label path="director" >Director </form:label>
        <form:input path="director" type="text"></form:input>
        <form:errors path="director" style="color: red;"/>
        
        <br><br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>