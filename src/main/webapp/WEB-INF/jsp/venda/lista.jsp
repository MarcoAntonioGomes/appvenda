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

    <h3>Classe: Venda</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Descrição</th>
            <th>Data</th>
            <th>A vista</th>
            <th>Comprador</th>
            <th>Veículos</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="v" items="${listagem}">
            <tr>
                <td>${v.id}</td>
                <td>${v.descricao}</td>
                <td>${v.data}</td>
                <td>${v.avista}</td>
                <td>${v.comprador.nome}</td>
                <td>${v.veiculos.size()}</td>
                <td><a href="/venda/${v.id}/excluir">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</div>
</body>

</body>
</html>