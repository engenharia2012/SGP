<%-- 
    Document   : sucesso_alterar
    Created on : 12/03/2013, 07:53:52
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Sucesso</title>
    </head>
    <% String nome = (String) request.getAttribute("nome"); %>
    <body>
        <h3><%=nome%> Foi alterado com sucesso!</h3>
    </body>
</html>
