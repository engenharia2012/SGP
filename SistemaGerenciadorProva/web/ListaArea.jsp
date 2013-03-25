<%-- 
    Document   : ListaArea
    Created on : 25/03/2013, 10:46:13
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
        
        <h3>Lista Area</h3>
        <%
        List<Area> areas = (List) request.getAttribute("todasareas");
        if(areas.isEmpty())out.println("<h1> Não existe Area cadastradas!</h1>");
               else{
                     for (Area cont : areas) {
                        out.println("<br/>Nome: " + cont.getNome());
                       
                        out.println("<br/><br/>");
                    }
               }
        %>
    <a href="index.jsp">Voltar</a>
    </body>
</html>
