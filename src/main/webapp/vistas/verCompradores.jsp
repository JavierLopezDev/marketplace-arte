<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Lista Compradores</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
    h3 {
        text-align: center;
    }
</style>
<body>

<h3>- LISTA DE COMPRADORES -</h3>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Nombre</th>
        <th>Usuario</th>
        <th>Email</th>
        <th>Saldo</th>
        <th>Inventario</th>
        <th>Operaciones</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${compradores}" var="comprador">
        <tr>
            <td>${comprador.nombreCompleto}</td>
            <td>${comprador.usuario}</td>
            <td>${comprador.email}</td>
            <td>${comprador.saldo}</td>
            <td>${comprador.inventario.size()}</td>
            <td><a class="btn btn-primary" role="button" href="editarCompradores/${comprador.idComprador}">Editar</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>