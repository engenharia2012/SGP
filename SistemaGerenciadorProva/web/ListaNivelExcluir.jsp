<%-- 
    Document   : ListaNivelExcluir
    Created on : 25/03/2013, 10:30:22
    Author     : debora
--%>

<%@page import="java.util.List"%>
<%@page import="dominio.Nivel"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lista de Exclusão Tipo de Nivel</title>
    </head>
    <body>
        <h3>Escolha o Nivel para Excluir</h3>
        <p>Tipo Nivel</p>
        <FORM name="Excluir_Nivel" action="excluinivel.do" method="post">
        <select name="textNivel">
                    <%
                                List<Nivel> nivel = (List) request.getAttribute("listanivelexcluir");
                                for (Nivel cont0 : nivel) {
                                    out.println("<br/><option value= " + cont0.getId() + ">" + cont0.getFacil() + "</option>");
                                   
                    %>
            </select>
        <p><input type="submit" value="Enviar"></p>
        </FORM>
    </body>
</html>
