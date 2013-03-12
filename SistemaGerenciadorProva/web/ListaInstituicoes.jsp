<%-- 
    Document   : ListaInsticuicoesCadastradas
    Created on : 08/03/2013, 13:32:03
    Author     : Fernando
--%>

<%@page import="dominio.Instituicao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lista Institui��es Cadastradas</title>
    </head>
    <body>
        <h3>Lista de Institui��es</h3>
        <%
        List<Instituicao> instituicoes = (List) request.getAttribute("todasinstituicoes");
        if(instituicoes.isEmpty())out.println("<h1> N�o existe Institui��es cadastradas!</h1>");
               else{
                     for (Instituicao cont : instituicoes) {
                        out.println("<br/>Nome: " + cont.getNome_fantasia());
                        out.println("<br/>CNPJ:" + cont.getCnpj());
                        out.println("<br/>Raz�o Social:" + cont.getRazao_social());
                        out.println("<br/>Endere�o:" + cont.getEndereco());
                        out.println("<br/>Telefone:" + cont.getTelefone());
                        out.println("<br/>LogoMarca:" + cont.getLogo());
                        out.println("<br/><br/>");
                    }
               }
        %>
    <a href="index.jsp">Voltar</a>
    </body>
</html>
