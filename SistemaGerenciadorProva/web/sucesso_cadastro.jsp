<%-- 
    Document   : sucesso_cadastro
    Created on : 14/02/2013, 14:34:42
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%String nome =(String) request.getAttribute("nome");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Realizado com Sucesso</title>
    </head>
    <body>
        <h2><%=nome%> foi cadastrado(a) com sucesso!</h2>
    </body>
</html>
