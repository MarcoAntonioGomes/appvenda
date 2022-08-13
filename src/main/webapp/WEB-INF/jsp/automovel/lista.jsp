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



    <h3>Classe: Automovel</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Valor</th>
            <th>Marca</th>
            <th>Quantidade de Portas</th>
            <th>Tipo</th>
            <th>Possui Airbag</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Strada</td>
            <td>R$ 50 000</td>
            <td>Fiat</td>
            <td>2</td>
            <td>Caminhonete</td>
            <td>Não </td>
        </tr>
        <tr>
            <td>A4</td>
            <td>R$ 400 000</td>
            <td>Audi</td>
            <td>4</td>
            <td>Esportivo</td>
            <td>Sim </td>
        </tr>
        <tr>
            <td>Gol</td>
            <td>R$ 30 000</td>
            <td>Volkswagen</td>
            <td>4</td>
            <td>Comum</td>
            <td>Não</td>
        </tr>
        </tbody>
    </table>


</div>
</body>

</body>
</html>