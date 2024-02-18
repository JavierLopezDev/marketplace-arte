<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Lista Artistas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
    h3 {
        text-align: center;
    }
</style>
<body>

<h3>- LISTA DE ARTISTAS -</h3>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Nombre</th>
        <th>Usuario</th>
        <th>Email</th>
        <th>Fecha de Nacimiento</th>
        <th>Nacionalidad</th>
        <th>Biografía</th>
        <th>Teléfono</th>
        <th>Nº Obras</th>
        <th colspan="2">Operaciones</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${artista}" var="artista">
        <tr>
            <td>${artista.nombreCompleto}</td>
            <td>${artista.usuario}</td>
            <td>${artista.email}</td>
            <td>${artista.fechaNacimiento}</td>
            <td>${artista.nacionalidad}</td>
            <td>${artista.biografia}</td>
            <td>${artista.telefono}</td>
            <td>${artista.obras.size()}</td>
            <td><a class="btn btn-primary" role="button" href="editarArtista/${artista.idArtista}">Editar</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
