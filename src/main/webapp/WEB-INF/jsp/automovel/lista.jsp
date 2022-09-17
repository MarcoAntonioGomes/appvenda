<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <p>Projeto de Gest�o de Venda de Ve�culos</p>

    <h4><a href="/automovel">Novo</a></h4>

    <h3>Classe: Automovel</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Valor</th>
            <th>Marca</th>
            <th>Quantidade de Portas</th>
            <th>Tipo</th>
            <th>Possui Airbag</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
       <c:forEach var="a" items="${listagem}">
        <tr>
            <td>${a.id}</td>
            <td>${a.nome}</td>
            <td>${a.valor}</td>
            <td>${a.marca}</td>
            <td>${a.quantidadeDePortas}</td>
            <td>${a.tipo}</td>
            <td>${a.possuiAirbag}</td>
            <td><a href="/automovel/${a.id}/excluir">excluir</a></td>
        </tr>
       </c:forEach>
        </tbody>
    </table>


</div>
</body>

</body>
</html>