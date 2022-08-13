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



    <h3>Classe: Motocicleta</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Valor</th>
            <th>Marca</th>
            <th>Cilindrada</th>
            <th>Possui Carenagem</th>
            <th>Número de Marchas</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>CB300</td>
            <td>R$ 30 000</td>
            <td>Honda</td>
            <td>300</td>
            <td>Sim</td>
            <td>5</td>
        </tr>
        <tr>
            <td>Titan</td>
            <td>R$ 10 000</td>
            <td>Honda</td>
            <td>250</td>
            <td>Não</td>
            <td>4</td>
        </tr>
        <tr>
            <td>Z400</td>
            <td>R$ 23 000</td>
            <td>Kawasaki</td>
            <td>400</td>
            <td>Sim</td>
            <td>5</td>
        </tr>
        </tbody>
    </table>


</div>
</body>

</body>
</html>