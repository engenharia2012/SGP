<%-- 
    Document   : ErroExiste
    Created on : 28/03/2013, 14:04:03
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%String nome =(String) request.getAttribute("nome");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro</title>
    </head>
    <body>
        <h2><%=nome%> já existe!</h2>
    </body>
</html>
