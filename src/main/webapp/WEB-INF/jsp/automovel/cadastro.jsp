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
    <h2>Cadastro de Automoveis</h2>



    <form action="/automovel/incluir" method="post">

        <c:import url="/WEB-INF/jsp/veiculo/cadastro.jsp"/>

        <div class="mb-3 mt-3">
            <label>Quantidade de Portas:</label>
            <input type="number" class="form-control"  placeholder="Entre com a quantidade de portas do veículo" name="quantidadeDePortas">
        </div>

        <div class="mb-3 mt-3">
            <label>Tipo:</label>
            <input type="text" class="form-control"  placeholder="Entre com o tipo do veículo" name="tipo">
        </div>


        <div class="form-check form-switch">
            <input class="form-check-input" type="checkbox" id="mySwitch" name="possuiAirbag" value="true" >
            <label class="form-check-label" for="mySwitch">Pussui Airbag?</label>
        </div>


        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>

</body>
</html>