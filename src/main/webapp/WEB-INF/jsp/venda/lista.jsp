<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppVendas</title>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-light navbar-light">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link active" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/automovel/lista">Automovel</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/caminhao/lista">Caminh�o</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/motocicleta/lista">Motocicleta</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/veiculo/lista">Veiculo</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/comprador/lista">Comprador</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/venda/lista">Venda</a>
            </li>
        </ul>
    </div>
</nav>

<div class="container mt-3">
    <h2>AppVendas</h2>
    <p>Projeto de Gest�o de Venda de Ve�culos</p>

    <h3>Classe: Venda</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Descri��o</th>
            <th>Data</th>
            <th>A vista</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Venda de Automovel</td>
            <td>08/08/2022</td>
            <td>Sim</td>
        </tr>
        <tr>
            <td>Venda de Caminh�o</td>
            <td>08/08/2022</td>
            <td>N�o</td>
        </tr>
        <tr>
            <td>Venda de Motocicleta</td>
            <td>08/08/2022</td>
            <td>Sim</td>
        </tr>
        </tbody>
    </table>


</div>
</body>

</body>
</html>