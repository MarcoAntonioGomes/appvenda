<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppVendas</title>
</head>
<body>

    <c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>AppVendas</h2>
    <p>Projeto de Gestão de Venda de Veículos</p>

    <h4><a href="/caminhao">Novo</a></h4>

    <h3>Classe: Caminhão</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Valor</th>
            <th>Marca</th>
            <th>Capacidade de Transporte</th>
            <th>Tipo de Carroceria</th>
            <th>Torque</th>
            <th></th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="c" items="${listagem}">
        <tr>
            <td>${c.id}</td>
            <td>${c.nome}</td>
            <td>${c.valor}</td>
            <td>${c.marca}</td>
            <td>${c.capacidadeDeTransporte}</td>
            <td>${c.tipoCarroceria}</td>
            <td>${c.torque}</td>
            <td><a href="/caminhao/${c.id}/excluir">excluir</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>


</div>
</body>

</body>
</html>