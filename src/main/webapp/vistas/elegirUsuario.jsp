<%--
  Created by IntelliJ IDEA.
  User: alumno
  Date: 9/2/24
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Marketplace - NFT</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
    body {
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: row;
    }

    #divbody {
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
    }

    h1 {
        text-align: center;
    }

    h2 {
        text-align: center;
    }

    ul {
        list-style-type: none;
        margin: 0;
        padding: 0;
        overflow: hidden;

    }

    li {
        float: left;
        margin-right: 1rem;
    }

    li a {
        display: block;
        background-color: #333;
        color: white;
        border-radius: 10px;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        width: 150px;
    }

    li a:hover {
        background-color: #111;
    }
</style>

<body>
<div id="divbody">
    <h1>Elige tu usuario:</h1>
    <div style="display: flex; justify-content: center; align-items: center; flex-direction: column">
        <ul>
            <li><a href="loginAdmin">Admin</a></li>
            <li><a href="loginArtista">Artista</a></li>
            <li><a href="loginComprador">Comprador</a></li>
        </ul>
    </div>
</div>

<footer style="position: absolute; bottom: 0; width: 100%;">
    <p>© 2023 Marketplace - NFT. Todos los derechos reservados.</p>
</footer>
</body>
</html>
