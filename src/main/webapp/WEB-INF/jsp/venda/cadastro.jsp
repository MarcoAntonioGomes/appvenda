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
    <h2>Cadastro de Vendas</h2>



    <form action="/automovel/incluir" method="post">



        <div class="mb-3 mt-3">
            <label>Descrição:</label>
            <input type="text" class="form-control"  placeholder="Entre com a descrição da venda" name="descricao">
        </div>

        <div class="mb-3 mt-3">
            <label>Comprador:</label>
            <select class="form-select">
              <c:forEach var="s" items="${compradores}" >
                  <option>${s.nome}</option>
              </c:forEach>
            </select>
        </div>

        <div class="mb-3 mt-3">
            <label>Veículos:</label>

            <c:forEach var="v" items="${veiculos}">
                <div class="form-check">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input" value="">${v.nome}
                    </label>
                </div>
            </c:forEach>


        </div>



        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>

</body>
</html>