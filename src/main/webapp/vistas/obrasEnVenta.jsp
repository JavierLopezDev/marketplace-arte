<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tienda NFTs</title>
</head>
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
  .title {
    font-size: 24px;
    font-weight: bold;
    margin-bottom: 10px;
    display: flex;
    align-items: center;
    justify-content: center;
  }
  .saldo {
    font-weight: bold;
    position: absolute;
    top: 26px;
    right: 30px;
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
</style>
<body>
  <div class="profile-container">
    <h1 class="title">Tienda NFT</h1>
    <p class="saldo">Saldo: ${comprador.getSaldo()}€</p>

    <div class="artwork">
      <c:forEach items="${obras}" var="obra">
        <div class="obra">
          <h2 class="artwork-name">${obra.getNombre()}</0></h2>
          <img class="artwork-image" src="${obra.getImagen()}" alt="Imagen Obra">
          <p class="artwork-description">${obra.getDescripcion()}</p>
          <p class="artwork-price">Precio: ${obra.getPrecio()}€</p>
          <form action="comprarObra">
            <input type="hidden" name="idObra" value="${obra.getIdObra()}">
            <input type="hidden" name="idComprador" value="${comprador.getIdComprador()}">
            <button type="submit" class="settings-button">Comprar</button>
          </form>
        </div>
      </c:forEach>
    </div>

  </div>
</body>
</html>
