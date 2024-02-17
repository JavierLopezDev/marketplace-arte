<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Perfil de Artista</title>
    <style>
        /* Estilos generales */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f2f2;
        }
        /* Contenedor principal */
        .profile-container {
            padding: 20px;
        }
        /* Estilos para el logo */
        .profile-logo {
            border-radius: 50%;
            width: 100px;
            height: 100px;
            margin-right: 20px;
        }
        /* Estilos para el nombre del artista */
        .artist-name {
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 10px;
        }
        /* Estilos para la obra */
        .artwork {
            margin-top: 20px;
            display: flex;
            flex-direction: row;
            align-items: center;
            justify-content: center;
            flex-wrap: wrap;
        }
        /* Estilos para el nombre de la obra */
        .artwork-name {
            font-size: 20px;
            font-weight: bold;
            margin-bottom: 5px;
        }
        /* Estilos para la foto de la obra */
        .artwork-image {
            max-width: 100%;
            border-radius: 5px;
            margin-bottom: 5px;
        }
        /* Estilos para la descripción de la obra */
        .artwork-description {
            margin-bottom: 5px;
        }
        /* Estilos para el precio de la obra */
        .artwork-price {
            font-weight: bold;
        }
        /* Estilos para el botón de ajustes */
        .settings-button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }
        .obra {
            width: 200px;
            height: 500px;
            padding: 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            text-align: center;
            border-radius: 25px;
            border: 2px solid black;
            margin: 20px;
        }
        .addObra {
            display: flex;
            flex-direction: row;
            align-items: center;
            justify-content: center;
            text-align: center;
        }
    </style>
</head>
<body>

<div class="profile-container">
    <div style="display: flex; align-items: center; justify-content: space-between; flex-direction: row">
        <div style="display: flex; align-items: center; flex-direction: row">
            <img class="profile-logo" src="https://ceslava.s3-accelerate.amazonaws.com/2016/04/mistery-man-gravatar-wordpress-avatar-persona-misteriosa-510x510.png" alt="Logo del Artista">
            <h1 class="artist-name">${artista.getNombreCompleto()}</h1>
        </div>
        <form action="ajustesArtista">
            <input type="hidden" name="idArtista" value="${artista.getIdArtista()}">
            <button type="submit" class="settings-button">Ajustes</button>
        </form>
    </div>

    <form action="insertarObra" class="addObra">
        <button type="submit" class="settings-button" >Añadir Obra</button>
    </form>

    <div class="artwork">
        <c:forEach items="${artista.getObras()}" var="obra">
            <div class="obra">
                <h2 class="artwork-name">${obra.getNombre()}</0></h2>
                <img class="artwork-image" src="${obra.getImagen()}" alt="Imagen Obra">
                <p class="artwork-description">${obra.getDescripcion()}</p>
                <p class="artwork-price">Precio: ${obra.getPrecio()}€</p>
                <c:if test="${!obra.isDisponibleVenta()}">
                    <p class="artwork-status">Comprador: ${obra.getComprador().getUsuario()}</p>
                </c:if>
                <c:if test="${obra.isDisponibleVenta()}">
                    <p class="artwork-status">Disponible</p>
                    <form action="modificarObra">
                        <input type="hidden" name="idObra" value="${obra.getIdObra()}">
                        <button type="submit" class="settings-button">Modificar</button>
                    </form>
                </c:if>
            </div>
        </c:forEach>
    </div>
</div>

</body>
</html>
