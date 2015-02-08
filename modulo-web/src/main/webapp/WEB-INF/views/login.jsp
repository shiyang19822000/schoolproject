<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title></title>
</head>
<body>
<br>

<hr>

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

</body>
</html>
