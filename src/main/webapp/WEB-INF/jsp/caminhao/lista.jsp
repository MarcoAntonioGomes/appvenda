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
                <a class="nav-link" href="/caminhao/lista">Caminhão</a>
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
    <p>Projeto de Gestão de Venda de Veículos</p>



    <h3>Classe: Caminhão</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Valor</th>
            <th>Marca</th>
            <th>Capacidade de Transporte</th>
            <th>Tipo de Carroceria</th>
            <th>Torque</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Vertis</td>
            <td>R$ 200 000</td>
            <td>Iveco</td>
            <td>13000</td>
            <td>Bau</td>
            <td>500 </td>
        </tr>
        <tr>
            <td>Truck</td>
            <td>R$ 400 000</td>
            <td>Ford</td>
            <td>10000</td>
            <td>Prancha</td>
            <td>600 </td>
        </tr>
        <tr>
            <td>Toco</td>
            <td>R$ 200 0000</td>
            <td>Scania</td>
            <td>10000</td>
            <td>Bau</td>
            <td>350</td>
        </tr>
        </tbody>
    </table>


</div>
</body>

</body>
</html>