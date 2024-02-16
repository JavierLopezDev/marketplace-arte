<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Lista Artistas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>

<h3>- LISTA DE ARTISTA -</h3>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Nombre</th>
        <th>Usuario</th>
        <th>Email</th>
        <th>Saldo</th>
        <th>Nº Obras</th>
        <th colspan="2">Operaciones</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${artista}" var="artist">
        <tr>
            <td>${artist.nombreCompleto}</td>
            <td>${artist.usuario}</td>
            <td>${artist.email}</td>
            <td>${artist.saldo}</td>
            <td>${artist.inventario.size()}</td>
            <td><a class="btn btn-primary" role="button" href="editar/${artist.idArtista}">Editar</a></td>
            <td><a class="btn btn-primary" role="button" href="eliminar/${artist.idArtista}">Eliminar</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
