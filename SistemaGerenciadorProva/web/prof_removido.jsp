<%-- 
    Document   : prof_removido
    Created on : 31/03/2013, 15:53:27
    Author     : jose
--%>

<%@page import="dominio.Professor"%>
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
        <ul class="menu"><%--menu top--%>
	  <li><a href="#" title="Inicial">Professor</a>
            <ul>
              <li><a href="#" title="Web design">Cadastrar</a></li>            
              <li><a href="#" title="SEO">Edita</a></li>
              <li><a href="#" title="Design gr&aacute;fico">Excluir</a></li>
              <li><a href="#" title="Design gr&aacute;fico">Listar</a></li>
            </ul>
          </li>
	  <li><a href="#" title="Sobre">Quest�o</a>
            <ul>
              <li><a href="#" title="Web design">Cadastrar</a></li>            
              <li><a href="#" title="SEO">Revisar</a></li>
              <li><a href="#" title="Design gr&aacute;fico">Excluir</a></li>                    
            </ul>
          </li>
	  <li><a href="#" title="Servi&ccedil;os">Institui��o</a>
       	    <ul>
              <li><a href="#" title="Web design">Cadastrar</a></li>            
            </ul>  
          </li>
	  <li><a href="#" title="Porftolio">Provas</a>
            <ul>
              <li><a href="#" title="Web design">Gerar</a></li>            
            </ul>
	  <li class="border0"><a href="#" title="Contato">Area</a></li>                
        </ul><%--and menu top--%>
      </div>
      <div class="sidebar1"><br />
        <ul class="menu_vertical">Professor</ul>
          <ul class="nav">
            <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Editar</a></li>
            <li><a href="#">Excluir</a></li>
            <li><a href="#">Listar</a></li>
          </ul><p>&nbsp;</p>
          <ul class="menu_vertical">Atividades</ul>
          <ul class="nav">
            <li><a href="#">Cadastrar Quet�o</a></li>
            <li><a href="#">Revisar Quest�o</a></li>
            <li><a href="#">Gerar Prova</a></li>
          </ul><p>&nbsp;</p>
        </div><!-- end .sidebar1 -->
        <div class="content">
          <p align="right">Seja bem vindo, <font color="red">Fulano </font> | Gostaria de:<a href="logout.html">Alterar Perfil</a> | <a href="logout.html">Sair do sistema</a></p> 
          <ul class="formulario">
<%--%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%--%>            
            <fieldset >
              <legend>Remo��o de Professo</legend>
              <form id="form_validacao" action="" method="post">
                  <%Professor p = (Professor) request.getAttribute("prof_del");
                  if(p.getNome().equals("n�o existe!")){%>
                    <div class="rowElem"><label>Professor N�o Existe!!!</label></div>
                  <%}else{%>
                    <div class="rowElem"><label>Professor <%System.out.print(p.getNome());%> Removido com sucesso!!!</label></div>
                  <%}%>
                  </div><br /><br />
                <input type="submit" value="Atualizar" />
              </form>
              <a href='prof_inicial.jsp'>Voltar a pagina inicial</a>  
            </fieldset>
<%--%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%--%>            
         </ul><!-- end .content -->
       </div>
       <div class="footer">
         <blockquote>
           <p>� 2013 Todos os direitos reservados - Turma Sistemas Para Internet </p>
         </blockquote>
       </div><!-- end .footer -->
     </div><!-- end .container -->
   </body>
</html>
