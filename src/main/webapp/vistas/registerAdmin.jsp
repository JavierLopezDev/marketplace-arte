<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Marketplace - NFT</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
    form {
        margin-top: 10%;
        margin-left: 40%;
    }
</style>
<body>
<form:form class="form-horizontal" action="comprobarRegistroAdmin" method="post" modelAttribute="recibirRegisroAdmin">
    <fieldset>

        <!-- Form Name -->
        <legend style="margin-left: 6rem;">Log In</legend>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="user">Usuario: </label>
            <div class="col-md-4">
                <form:input id="user" path="usuario" placeholder="Introduce el usuario"
                            class="form-control input-md" required="" />
            </div>
        </div>

        <!-- Password input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="passwordinput">Contraseña</label>
            <div class="col-md-4">
                <form:input id="passwordinput" path="password" placeholder="Introduce la contraseña"
                            type = "password" class="form-control input-md" required=""/>
            </div>
        </div>

        <!-- Button -->
        <div class="form-group" style="margin-left: 5rem;">
            <label class="col-md-4 control-label" for="singlebutton"></label>
            <div class="col-md-4">
                <button id="singlebutton" name="singlebutton" class="btn btn-success">Inicia sesion</button>
            </div>
        </div>

    </fieldset>
</form:form>
</body>
</html>
