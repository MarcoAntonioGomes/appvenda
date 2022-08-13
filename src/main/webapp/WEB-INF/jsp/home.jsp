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

    <h3>Classe: Venda</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>descricao</td>
            <td>String</td>
            <td>Descrição da venda</td>
        </tr>
        <tr>
            <td>data</td>
            <td>LocalDateTime</td>
            <td>Data de realização da venda</td>
        </tr>
        <tr>
            <td>avista</td>
            <td>boolean</td>
            <td>Indicativo se a compra é a vista ou não</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Comprador</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome do comprador</td>
        </tr>
        <tr>
            <td>cpf</td>
            <td>String</td>
            <td>CPF do comprador</td>
        </tr>
        <tr>
            <td>email</td>
            <td>String</td>
            <td>email do comprador</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Veiculo</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome do veiculo</td>
        </tr>
        <tr>
            <td>valor</td>
            <td>float</td>
            <td>Valor do veiculo</td>
        </tr>
        <tr>
            <td>marca</td>
            <td>String</td>
            <td>Marca do veiculo</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Motocicleta</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>cilindrada</td>
            <td>float</td>
            <td>Valor das cilindradas da moto</td>
        </tr>
        <tr>
            <td>possuiCarenagem</td>
            <td>boolean</td>
            <td>Indicativo se a moto possui carenagem</td>
        </tr>
        <tr>
            <td>numeroDeMarchas</td>
            <td>int</td>
            <td>Número de marchas que a moto possui</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Automovel</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>quantidadeDePortas</td>
            <td>int</td>
            <td>Quantidade de portas do automovel </td>
        </tr>
        <tr>
            <td>tipo</td>
            <td>String</td>
            <td>Tipo do automovel. Ex: Caminhonete, Carro...</td>
        </tr>
        <tr>
            <td>possuiAirbag</td>
            <td>boolean</td>
            <td>Indicativo se o carro possui airbag</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Caminhao</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>capacidadeDeTransporte</td>
            <td>float</td>
            <td>Capacidade de transpote do caminhão em KG</td>
        </tr>
        <tr>
            <td>tipoCarroceria</td>
            <td>String</td>
            <td>Tipo de carroceria do caminhão. Ex: Bau</td>
        </tr>
        <tr>
            <td>torque</td>
            <td>float</td>
            <td>Torque do caminhão em mkgf</td>
        </tr>
        </tbody>
    </table>
</div>
</body>

</body>
</html>