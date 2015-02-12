<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<br>

<hr>

<shiro:authenticated><h1>está autenticado</h1></shiro:authenticated>
<shiro:notAuthenticated><h1>NÃO ! está autenticado</h1></shiro:notAuthenticated>
<shiro:hasRole name="TESTE"><h2>Ta na role TESTE</h2></shiro:hasRole>
<shiro:hasRole name="TESTE1"><h2>Ta na role TESTE1</h2></shiro:hasRole>

<a href="/executateste">Executa Teste</a>
<a href="/executateste2">Executa Teste 2</a>

<br>

</body>
</html>
