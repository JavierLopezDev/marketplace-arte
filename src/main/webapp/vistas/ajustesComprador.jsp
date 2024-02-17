<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Perfil comprador</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
    form {
        margin-top: 10%;
        margin-left: 40%;
    }
</style>
<body>
<form:form class="form-horizontal" action="ajustesComprador" method="post" modelAttribute="comprador">
        <fieldset>

            <!-- Form Name -->
            <legend>Ajustes Comprador</legend>

            <form:hidden path="idComprador" value="${comprador.idComprador}"/>
            <form:hidden path="usuario" value="${comprador.usuario}"/>
            <form:hidden path="password" value="${comprador.password}"/>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="nomCompleto">Nombre: </label>
                <div class="col-md-4">
                    <form:input id="nomCompleto" path="nombreCompleto" type="text"
                                placeholder="Nombre completo" class="form-control input-md" required=""
                                value="${comprador.getNombreCompleto()}"/>

                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="correo">Email:</label>
                <div class="col-md-4">
                    <form:input id="correo" path="email" type="text"
                                placeholder="" class="form-control input-md" required=""
                                value="${comprador.getEmail()}"/>

                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="saldo">Saldo:</label>
                <div class="col-md-2">
                    <form:input id="saldo" path="saldo" type="number"
                                placeholder="" class="form-control input-md"
                                value="${comprador.getSaldo()}" />

                </div>
            </div>

            <!-- Button -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="send"></label>
                <div class="col-md-4">
                    <button id="send" name="send" class="btn btn-primary">Editar</button>
                </div>
            </div>

        </fieldset>
</form:form>
</body>
</html>
