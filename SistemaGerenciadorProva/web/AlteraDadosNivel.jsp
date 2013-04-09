<%-- 
    Document   : AlteraDadosNivel
    Created on : 25/03/2013, 10:39:45
    Author     : debora
--%>



<%@page import="dominio.Nivel"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Dados da Nivel</title>
    </head>
    <body>
        <h3>Grau do Nivel</h3>
        <% Nivel niv = (Nivel) request.getAttribute("alteranivel"); %>
        <FORM name="Altera_Nivel" action="alteranivel.do" enctype="multipart/formdata" method="post">
            <p>Facil</p><p><input maxlength="80" size="60" name="textFacil" value="<% out.println(niv.Facil()); %>"></p>
            <p>Medio</p><p><input maxlength="80" size="60" name="textMedio" value="<% out.println(niv.Medio()); %>"></p>
            <p>Dificil</p><p><input maxlength="80" size="60" name="textDificil" value="<% out.println(niv.Dificil()); %>"></p>
            
            <p><input type="submit" value="Enviar"></p>
        </FORM>
    <a href="index.jsp">Voltar</a>
    </body>
</html>
