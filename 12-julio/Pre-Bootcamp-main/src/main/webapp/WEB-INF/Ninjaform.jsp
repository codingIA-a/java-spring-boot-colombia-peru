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
    <h1>New Ninja</h1>
    <form:form action="/ninjas/new" modelAttribute="ninjas" method="POST">
        <form:label path="name">First Name:</form:label>
        <form:input path="name" type="text"></form:input>
        <form:errors path="name" style="color: red;"></form:errors>
        <br><br>
        
        <form:label path="lastname">Last Name:</form:label>
        <form:input path="lastname" type="text"></form:input>
        <form:errors path="lastname" style="color: red;"></form:errors>
        <br><br>
        
        <form:label path="age">Age:</form:label>
        <form:input path="age" type="number"></form:input>
        <form:errors path="age" style="color: red;"></form:errors>
        <br><br>
        
        <form:label path="dojos">Dojo:</form:label>
        <form:select path="dojos.id">   
        <form:options items="${dojos}" itemValue="id" itemLabel="name" />
        </form:select>
        <form:errors path="dojos.id" style="color: red;" />
        <br><br> 

        <input type="submit" value="guardar">
    </form:form>
</body>
</html>