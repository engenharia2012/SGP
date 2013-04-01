<%-- 
    Document   : ListaInstituicoesAltera
    Created on : 11/03/2013, 13:00:53
    Author     : Fernando
--%>

<%@page import="dominio.Area"%>
<%@page import="java.util.List"%>
<%@page import="dominio.Instituicao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lista de Area para Exclusão</title>
    </head>
    <body>
        <h3>Escolha a Area para Excluir</h3>
        <p>Area</p>
        <FORM name="Excluir_Area" action="excluiarea.do" method="post">
        <select name="textArea">
                    <%
                                List<Area> area = (List) request.getAttribute("listaareaexcluir");
                                for (Area cont0 : area) {
                                    out.println("<br/><option value= " + cont0.getId() + ">" + cont0.getNome() + "</option>");
                                }
                    %>
            </select>
        <p><input type="submit" value="Enviar"></p>
        </FORM>
    </body>
</html>
