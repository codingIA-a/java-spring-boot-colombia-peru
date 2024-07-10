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
    <c:forEach items="${films}" var="film">
        <p><c:out value="${film.nombre}"/></p>
        <p><c:out value="${film.director}"/></p>
        <a href="/films/${film.id}">Ver detalles</a>
    </c:forEach>
</body>
</html>