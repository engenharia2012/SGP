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
        <title>Cadastro da Area</title>
    </head>
    <body>
        <h3>Dados Cadastrais da Area</h3>
        <FORM name="Cadastro_Area" action="cadastraarea.do" enctype="multipart/formdata" method="post">
        <p>Nome</p><p><input maxlength="80" size="60" name="textNomeArea"></p>
        
        <p><input type="submit" value="Enviar"></p>
        </FORM>
    </body>
</html>
