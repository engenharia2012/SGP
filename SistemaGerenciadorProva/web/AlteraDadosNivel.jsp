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
        <% Nivel nivel = (Nivel) request.getAttribute("AlterraNivel"); %>
        <FORM name="Altera_Nivel" action="AlterarNivel.do" enctype="multipart/formdata" method="post">
            <p>TipoNivel</p><p><input maxlength="80" size="60" name="textTipoNivel" value="<% out.println(nivel.getTipoNivel()); %>"></p>            
            <p><input type="submit" value="Enviar"></p>
        </FORM>
    <a href="index.jsp">Voltar</a>
    </body>
</html>
