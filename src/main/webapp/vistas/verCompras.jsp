<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Lista Compras</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
    h3 {
        text-align: center;
    }
</style>
<body>

<h3>- LISTA DE COMPRAS -</h3>

<table class="table table-striped">
    <thead>
    <%--private int idCompra;
    private String fecha;
    private double importe;

    @ManyToOne
    @JoinColumn(name = "idComprador")
    private Comprador compradorId;

    @ManyToOne
    @JoinColumn(name = "idObra")
    private Obra obraId;--%>
    <tr>
        <th>Comprador</th>
        <th>Obra</th>
        <th>Fecha</th>
        <th>Importe</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${compras}" var="compra">
        <tr>
            <td>${compra.compradorId.getNombreCompleto()}</td>
            <td>${compra.obraId.getNombre()}</td>
            <td>${compra.fecha}</td>
            <td>${compra.importe}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>