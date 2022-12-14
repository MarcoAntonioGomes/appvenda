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
    <p>Projeto de Gest?o de Venda de Ve?culos</p>

    <h4><a href="/motocicleta">Novo</a></h4>

    <h3>Classe: Motocicleta</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Valor</th>
            <th>Marca</th>
            <th>Cilindrada</th>
            <th>Possui Carenagem</th>
            <th>N?mero de Marchas</th>
            <th></th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="m" items="${listagem}">
            <tr>
                <td>${m.id}</td>
                <td>${m.nome}</td>
                <td>${m.valor}</td>
                <td>${m.marca}</td>
                <td>${m.cilindrada}</td>
                <td>${m.possuiCarenagem}</td>
                <td>${m.numeroDeMarchas}</td>
                <td><a href="/motocicleta/${m.id}/excluir">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</div>
</body>

</body>
</html>