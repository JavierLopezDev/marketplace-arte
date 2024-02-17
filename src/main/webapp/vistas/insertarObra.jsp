<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Marketplace - NFT</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
    form {
        margin-top: 0.5rem;
        margin-left: 40%;
    }
</style>
<body>
<form:form class="form-horizontal" action="insertarObra" method="post" modelAttribute="obra">
    <fieldset>

        <!-- Form Name -->
        <legend>Ajustes Artista</legend>
        <form:hidden path="idObra" value="${obra.idObra}"/>
        <form:hidden path="disponibleVenta" value="true"/>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="nomCompleto">Nombre: </label>
            <div class="col-md-4">
                <form:input id="nomCompleto" path="nombre" type="text"
                            placeholder="" class="form-control input-md" required=""/>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="correo">Descripcion:</label>
            <div class="col-md-4">
                <form:input id="correo" path="descripcion" type="text"
                            placeholder="" class="form-control input-md" required=""/>

            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="date">Imagen: </label>
            <div class="col-md-4">
                <form:input id="date" path="imagen" type="text"
                            class="form-control input-md" placeholder="URL de la Imagen"/>

            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="pais">Precio: </label>
            <div class="col-md-2">
                <form:input id="pais" path="precio" type="number" step="0.01"
                            placeholder="" class="form-control input-md"/>

            </div>
        </div>


        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="send"></label>
            <div class="col-md-4">
                <button id="send" name="send" class="btn btn-primary">Insertar</button>
            </div>
        </div>

    </fieldset>
</form:form>
</body>
</html>
