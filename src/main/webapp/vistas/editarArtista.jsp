<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Editar Artista</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
    form {
        margin-top: 0.5rem;
        margin-left: 40%;
    }
</style>
<body>
<form:form class="form-horizontal" action="../editarArtista" method="post" modelAttribute="artista">
        <fieldset>

            <!-- Form Name -->
            <legend>Editar Artista</legend>
            <form:hidden path="idArtista" value="${artista.idArtista}"/>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="user">Usuario:</label>
                <div class="col-md-4">
                    <form:input id="user" path="usuario" type="text"
                               placeholder="" class="form-control input-md" required=""
                                value="${artista.usuario}"/>

                </div>
            </div>

            <!-- Password input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="passwd">Password: </label>
                <div class="col-md-4">
                    <form:input id="passwd" path="password" type="password"
                                placeholder="" class="form-control input-md" required=""
                                value="${artista.password}"/>

                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="nomCompleto">Nombre: </label>
                <div class="col-md-4">
                    <form:input id="nomCompleto" path="nombreCompleto" type="text"
                                placeholder="Nombre completo" class="form-control input-md" required=""
                                value="${artista.nombreCompleto}"/>

                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="correo">Email:</label>
                <div class="col-md-4">
                    <form:input id="correo" path="email" type="text"
                                placeholder="" class="form-control input-md" required=""
                                value="${artista.email}"/>

                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="date">Fecha Nacimiento</label>
                <div class="col-md-2">
                    <form:input id="date" path="fechaNacimiento" type="text"
                                placeholder="Ej: 05/05/2005" class="form-control input-md"
                                value="${artista.fechaNacimiento}"/>

                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="pais">Nacionalidad</label>
                <div class="col-md-4">
                    <form:input id="pais" path="nacionalidad" type="text"
                                placeholder="" class="form-control input-md"
                                value="${artista.nacionalidad}"/>

                </div>
            </div>

            <!-- Textarea -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="descripcion">Biografia:</label>
                <div class="col-md-4">
                    <form:textarea class="form-control" id="descripcion" path="biografia" rows="3"
                                   value="${artista.biografia}"/>
                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="tlf">Telefono:</label>
                <div class="col-md-4">
                    <form:input id="tlf" path="telefono" type="text"
                                placeholder="Ej: 111223344" class="form-control input-md"
                                value="${artista.telefono}"/>

                </div>
            </div>

            <!-- Button -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="send"></label>
                <div class="col-md-4">
                    <button id="send" name="send" class="btn btn-primary">Enviar</button>
                </div>
            </div>

        </fieldset>
</form:form>
</body>
</html>
