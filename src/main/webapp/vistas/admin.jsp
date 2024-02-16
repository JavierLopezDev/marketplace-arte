<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Marketplace - NFT</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>

<head>
    <title>GESTION DE VIDEOJUEGOS</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            margin: 0;
            padding: 0;
        }

        .container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }

        .form-container h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        .form-container form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .form-container button {
            margin-top: 10px;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }

        .form-container button:hover {
            background-color: #0056b3;
        }

        .button-container {
            display: flex;
            justify-content: space-evenly;
            align-items: center;
            flex-direction: row;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="form-container">
        <h1>BIENVENIDO ${admin.usuario.toUpperCase()}</h1>
        <div class="button-container">
            <form action="verArtistas">
                <button type="submit">Artistas</button>
            </form>
            <form action="verCompradores">
                <button type="submit">Compradores</button>
            </form>
            <form action="verCompras">
                <button type="submit">Compras</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
