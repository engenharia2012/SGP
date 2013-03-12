<%-- 
    Document   : ListaInstituicoesAltera
    Created on : 11/03/2013, 13:00:53
    Author     : Fernando
--%>

<%@page import="java.util.List"%>
<%@page import="dominio.Instituicao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lista de Instiuições para Alteração</title>
    </head>
    <body>
        <h3>Escolha a Instituição para Altera-la</h3>
        <p>Instituição</p>
        <FORM name="Alterar_Instituicao" action="escolheinstituicao.do" method="post">
        <select name="textInstituicao">
                    <%
                                List<Instituicao> instituicoes = (List) request.getAttribute("listainstituicoes");
                                for (Instituicao cont0 : instituicoes) {
                                    out.println("<br/><option value= " + cont0.getId() + ">" + cont0.getNome_fantasia() + "</option>");
                                }
                    %>
            </select>
        <p><input type="submit" value="Enviar"></p>
        </FORM>
    </body>
</html>
