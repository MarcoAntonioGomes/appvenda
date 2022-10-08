<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <h2>Cadastro de Motocicletas</h2>



    <form action="/motocicleta/incluir" method="post">

        <c:import url="/WEB-INF/jsp/veiculo/cadastro.jsp"/>

        <div class="mb-3 mt-3">
            <label>Cilindrada:</label>
            <input type="number" class="form-control"  placeholder="Entre com as cilindradas da moto" name="cilindrada">
        </div>

        <div class="mb-3 mt-3">
            <label>Número de Marchas:</label>
            <input type="number" class="form-control"  placeholder="Entre com o número de marchas da moto" name="numeroDeMarchas">
        </div>


        <div class="form-check form-switch">
            <input class="form-check-input" type="checkbox" id="mySwitch" name="possuiCarenagem" value="true" >
            <label class="form-check-label" for="mySwitch">Pussui Carenagem?</label>
        </div>


        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>

</body>
</html>