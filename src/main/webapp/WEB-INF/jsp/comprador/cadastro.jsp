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
    <h2>Cadastro de Compradores</h2>



    <form action="/comprador/incluir" method="post">

        <div class="mb-3 mt-3">
            <label>Nome:</label>
            <input type="text" class="form-control"  placeholder="Entre com seu nome" name="nome">
        </div>

        <div class="mb-3 mt-3">
            <label>CPF:</label>
            <input type="text" class="form-control"  placeholder="Entre com seu cpf" name="cpf">
        </div>

        <div class="mb-3 mt-3">
            <label>Email:</label>
            <input type="email" class="form-control"  placeholder="Entre com seu email" name="email">
        </div>

        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>

</body>
</html>