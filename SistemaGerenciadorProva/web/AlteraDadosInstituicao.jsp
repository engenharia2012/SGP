<%-- 
    Document   : AlterarDadosInstituicao
    Created on : 11/03/2013, 13:14:20
    Author     : Fernando
--%>

<%@page import="dominio.Instituicao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Dados da Instituicação</title>
    </head>
    <body>
        <h3>Dados da Instituicação</h3>
        <% Instituicao inst = (Instituicao) request.getAttribute("alterainstituicao"); %>
        <FORM name="Altera_Instituicao" action="alterainstituicao.do" enctype="multipart/formdata" method="post">
            <p>Id</p><p><input maxlength="60" size="60" name="textId" value="<%out.println(inst.getId());%>" readonly="true"></p>
            <p>Nome</p><p><input maxlength="80" size="60" name="textNomeFantasia" value="<% out.println(inst.getNome_fantasia()); %>"></p>
            <p>Endereço</p><p><input maxlength="120" size="60" name="textEndereco" value="<% out.println(inst.getEndereco()); %>" ></p>
            <p>Telefone</p><p><input maxlength="80" size="60" name="textTelefone" value="<% out.println(inst.getTelefone()); %>"></p>
            <p>Razão Social</p><p><input maxlength="80" size="60" name="textRazaoSocial" value="<% out.println(inst.getRazao_social()); %>"></p>
            <p>CNPJ</p><p><input maxlength="18" size="60" name="textCNPJ" value="<% out.println(inst.getCnpj()); %>"></p>
            <p>Logomarca da Instiuição</p><p><input type="file" name="file" size="60" accept="image/*" value="<%out.println(inst.getLogo()); %>"/></p>
            <p><input type="submit" value="Enviar"></p>
        </FORM>
    <a href="index.jsp">Voltar</a>
    </body>
</html>
