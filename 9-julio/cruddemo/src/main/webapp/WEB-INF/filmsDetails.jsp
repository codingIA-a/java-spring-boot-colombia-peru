<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Detalles de la película</h1>
    <p>Id: ${film.id}</p>
    <p>Nombre Película: ${film.nombre}</p>
    <p>Nombre Director: ${film.director}</p>

    <form:form method="post" modelAttribute="film" action="/films/${film.id}/update">
        <input type="hidden" name="_method" value="PUT">
        <form:label path="nombre">Nombre Película</form:label>
        <form:input path="nombre"></form:input><br><br>
        <form:label path="director">Nombre Director</form:label>
        <form:input path="director"></form:input>
        <input type="submit" value="Guardar">
    </form:form>
</body>
</html>