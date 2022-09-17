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
    <h2>Cadastro de Caminhões</h2>



    <form action="/caminhao/incluir" method="post">

        <c:import url="/WEB-INF/jsp/veiculo/cadastro.jsp"/>

        <div class="mb-3 mt-3">
            <label>Capacidade de Transporte em Kg:</label>
            <input type="number" class="form-control"  placeholder="Entre com a capacidade de transporte do caminhão" name="capacidadeDeTransporte">
        </div>

        <div class="mb-3 mt-3">
            <label>Tipo de carroceria:</label>
            <input type="text" class="form-control"  placeholder="Entre com o tipo de carroceria" name="tipoCarroceria">
        </div>


        <div class="mb-3 mt-3">
            <label>Torque:</label>
            <input type="number" class="form-control"  placeholder="Entre com o torque do caminhão" name="torque">
        </div>


        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>

</body>
</html>