<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<html>
<head>
    <title></title>
</head>
<body>
<br>
<shiro:hasRole name="materia:inserir">
    <p><a href="/materia/novamateria">Nova materia</a></p>
</shiro:hasRole>

<%--<h1><s:message code="teste.teste"/></h1>--%>

<hr>

<%--<div id="idDivMateria" hidden="true">--%>
    <c:if test="${not empty materia}">
        <form action="/materia/salvarmateria" method="post">
            <label>Nome materia</label>

            <input type="hidden" id="idMateria" name="idMateria" value="${materia.idMateria}">

            <c:choose>
                <c:when test="${materia.nomeMateria == null}">
                    <input type="text" id="idNomeMateria" name="nomeMateria">
                </c:when>
                <c:otherwise>
                    <input type="text" id="idNomeMateria" name="nomeMateria" value="${materia.nomeMateria}">
                </c:otherwise>
            </c:choose>

            <input type="submit" value="Salvar matéria">
        </form>
    </c:if>
<%--</div>--%>

<br>
    <c:if test="${not empty materias}">

        <table>
            <tr>
                <th>Id</th>
                <td>Nome matéria</td>
                <td>Ações</td>
            </tr>

                <c:forEach var="materiaItem" items="${materias}">
                    <tr>
                        <td>${materiaItem.idMateria}</td>
                        <td>${materiaItem.nomeMateria}</td>
                        <td><a href="/materia/alterarmateria/${materiaItem.idMateria}">Alterar</a></td>
                    </tr>
                </c:forEach>

        </table>

    </c:if>
</body>
</html>
