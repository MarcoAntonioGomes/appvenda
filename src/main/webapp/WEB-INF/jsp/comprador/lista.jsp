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
    <p>Projeto de Gest�o de Venda de Ve�culos</p>


    <h3>Classe: Comprador</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>CPF</th>
            <th>Email</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="c" items="${listagem}">
            <tr>
                <td>${c.id}</td>
                <td>${c.nome}</td>
                <td>${c.cpf}</td>
                <td>${c.email}</td>
                <td><a href="/comprador/${c.id}/excluir">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</div>
</body>

</body>
</html>