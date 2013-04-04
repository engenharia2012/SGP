<%-- 
    Document   : ListaNivel
    Created on : 25/03/2013, 10:20:49
    Author     : debora
--%>

<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="dominio.Nivel"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lista de Nivel</title>
    </head>
    <body>
        <h3>Escolha Tipos de Nivel</h3>
        <p>NIVEL</p>
        <FORM name="Alterar_Nivel" action="EscolherNivel.do" method="post">
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
