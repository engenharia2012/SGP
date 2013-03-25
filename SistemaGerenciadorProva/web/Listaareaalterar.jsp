<%-- 
    Document   : Listaareaalterar
    Created on : 25/03/2013, 10:19:12
    Author     : Sacrario vivo
--%>

<%@page import="java.util.List"%>
<%@page import="dominio.Area"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <FORM name="Excluir_Area" action="escolhearea.do" method="post">
        <select name="textArea">
                    <%
                                List<Area> area = (List) request.getAttribute("listaareaalterar");
                                for (Area cont0 : area) {
                                    out.println("<br/><option value= " + cont0.getId() + ">" + cont0.getNome() + "</option>");
                                }
                    %>
            </select>
        <p><input type="submit" value="Enviar"></p>
        </FORM>
    </body>
</html>
