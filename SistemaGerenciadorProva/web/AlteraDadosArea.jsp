<%-- 
    Document   : AlterarDadosInstituicao
    Created on : 11/03/2013, 13:14:20
    Author     : Fernando
--%>

<%@page import="dominio.Area"%>
<%@page import="dominio.Instituicao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Dados da Area</title>
    </head>
    <body>
        <h3>Dados da Area</h3>
        <% Area area = (Area) request.getAttribute("alteraarea"); %>
        <FORM name="Altera_Area" action="alteraarea.do" enctype="multipart/formdata" method="post">
            <p>Id</p><p><input maxlength="60" size="60" name="textId" value="<%out.println(area.getId());%>" readonly="true"></p>
            <p>Nome</p><p><input maxlength="80" size="60" name="textNomeArea" value="<% out.println(area.getNome()); %>"></p>
            
            <p><input type="submit" value="Enviar"></p>
        </FORM>
    <a href="index.jsp">Voltar</a>
    </body>
</html>
