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

    <c:set var="ativaBotao"  value="" />
    <c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Cadastro de Vendas</h2>



    <form action="/venda/incluir" method="post">



        <div class="mb-3 mt-3">
            <label>Descrição:</label>
            <input type="text" class="form-control"  placeholder="Entre com a descrição da venda" name="descricao">
        </div>

        <div class="mb-3 mt-3">
            <c:if test="${not empty compradores}">
                <label>Comprador:</label>
                <select name="comprador" class="form-select">
                  <c:forEach var="c" items="${compradores}" >
                      <option value="${c.id}">${c.nome}</option>
                  </c:forEach>
                </select>
            </c:if>
            <c:if test="${empty compradores}">
                <label>Não existem compradores cadastrados:</label>
                <c:set var="ativaBotao" value="disabled"></c:set>
            </c:if>
        </div>

        <div class="mb-3 mt-3">
            <c:if test="${not empty veiculos}">
            <label>Veículos:</label>
                <c:forEach var="v" items="${veiculos}">
                    <div class="form-check">
                        <label class="form-check-label">
                            <input type="checkbox" class="form-check-input" name="veiculos" value="${v.id}">${v.nome}
                        </label>
                    </div>
                </c:forEach>
            </c:if>
            <c:if test="${empty veiculos}">
                <label>Não exitem veículos cadatrados</label>
                <c:set var="ativaBotao" value="disabled"></c:set>
            </c:if>
        </div>



        <button ${ativaBotao} type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>

</body>
</html>