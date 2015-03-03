<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title></title>
</head>
<body>
<br>

<hr>

<tiles:insertDefinition name="defaultTemplate">

    <tiles:putAttribute name="header">
        <h1>Bem vindo</h1>
    </tiles:putAttribute>

    <tiles:putAttribute name="body">
        <form name="loginform" action="/materia/logar" method="post">

            <label>Email</label>

            <input type="text" id="idEmailUsuario" name="emailUsuario">

            <br>

            <label>Senha</label>

            <input type="password" id="idSenhaUsuario" name="senhaUsuario">

            <br>

            <input type="submit" value="Efetuar login">
        </form>

        <br>

        <%--<h2>Esse é o título do tiles</h2>--%>

    </tiles:putAttribute>

</tiles:insertDefinition>

</body>
</html>
