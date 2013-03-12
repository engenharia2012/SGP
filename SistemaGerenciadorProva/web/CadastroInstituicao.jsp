<%-- 
    Document   : CadastroInstituicao
    Created on : 01/03/2013, 13:45:33
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastro da Instituição</title>
    </head>
    <body>
        <h3>Dados Cadastrais da Instiuição</h3>
        <FORM name="Cadastro_Instituicao" action="cadastrainstituicao.do" enctype="multipart/formdata" method="post">
        <p>Nome</p><p><input maxlength="80" size="60" name="textNomeFantasia"></p>
        <p>Endereço</p><p><input maxlength="120" size="60" name="textEndereco"></p>
        <p>Telefone</p><p><input maxlength="80" size="60" name="textTelefone"></p>
        <p>Razão Social</p><p><input maxlength="80" size="60" name="textRazaoSocial"></p>
        <p>CNPJ</p><p><input maxlength="18" size="60" name="textCNPJ"></p>
        <p>Logomarca da Instiuição</p><p><input type="file" name="file" size="60" accept="image/*"/></p>
        <p><input type="submit" value="Enviar"></p>
        </FORM>
    </body>
</html>
