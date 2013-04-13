<%-- 
    Document   : administrador_atualizado
    Created on : 21/03/2013, 09:01:22
    Author     : Arnaldo Junior
--%>

<%@page import="dominio.Administrador"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>Sistema de Provas</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="Content-Script-Type" content="text/javascript" />
    <meta http-equiv="Content-Style-Type" content="text/css" />

    <script language="javascript" type="text/javascript" src="libs/jquery.validate.min.js"></script>
    <script language="javascript" type="text/javascript" src="libs/validacao.js"></script>
    <link href="style/style.css"  rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="libs/jqtransformplugin/jqtransform.css" type="text/css" media="all" />
	
    <script type="text/javascript" src="libs/requiered/jquery.js" ></script>
    <script type="text/javascript" src="libs/jqtransformplugin/jquery.jqtransform.js" ></script>
    <script language="javascript">
      $(function(){
        $('form').jqTransform({imgPath:'libs/jqtransformplugin/img/'});
      });
    </script>
  </head>

  <body>
    <div class="container">
      <div class="header">
        </div>
      <div class="sidebar1"><br />
        <ul class="menu_vertical">Professor</ul>
          <ul class="nav">
            <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Editar</a></li>
            <li><a href="#">Inserir Área</a></li>
          </ul><p>&nbsp;</p>
          <ul class="menu_vertical">Menu Vertical 2</ul>
          <ul class="nav">
            <li><a href="#">Menu 1</a></li>
            <li><a href="#">Link two</a></li>
            <li><a href="#">Menu 2</a></li>
            <li><a href="#">Link four</a></li>
          </ul><p>&nbsp;</p>
        </div><!-- end .sidebar1 -->
        <div class="content">
          <p align="right">Você não está logado! - Gostaria de <a href="logout.html">Cadastrar-se</a>?</p> 
          <ul class="formulario">
<%--%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%--%>
            <%
                Administrador admin = (Administrador) request.getAttribute("admin");
            %>
            <fieldset >
                <legend>Administrador Alterado</legend>
                </br><h2><% out.print(admin.getNome()); %> é o novo administrador do sistema.</h2>
                </br><a href="login.jsp">Retornar à tela de login.</a>
            </fieldset>
<%--%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%--%>            
         </ul><!-- end .content -->
       </div>
       <div class="footer">
         <blockquote>
           <p>© 2013 Todos os direitos reservados - Turma Sistemas Para Internet </p>
         </blockquote>
       </div><!-- end .footer -->
     </div><!-- end .container -->
   </body>
</html>