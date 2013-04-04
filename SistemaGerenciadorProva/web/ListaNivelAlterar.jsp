<%-- 
    Document   : ListaNivelAlterar
    Created on : 03/04/2013, 22:13:43
    Author     : debora
--%>


<%@page import="java.util.List"%>
<%@page import="dominio.Nivel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <FORM name="Excluir_Nivel" action="EscolherNivel.do" method="post">
        <select name="textNivel">
                    <%
                                List<Nivel> nivel = (List) request.getAttribute("ListaNivelAlterar");
                                for (Nivel cont0 : nivel) {
                                    out.println("<br/><option value= " + cont0.getFacil() + ">" + cont0.getDificil() + "</option>");
                                }
                    %>
            </select>
        <p><input type="submit" value="Enviar"></p>
        </FORM>
    </body>
</html>
