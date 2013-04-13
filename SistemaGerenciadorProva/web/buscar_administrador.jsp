<%-- 
    Document   : atualizar_administrador
    Created on : 21/03/2013, 06:56:51
    Author     : Arnaldo Junior
--%>

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
  <ul class="menu">
	<li><a href="#" title="Inicial">Professor</a></li>
	<li><a href="#" title="Sobre">Alunos</a></li>
	<li><a href="#" title="Servi&ccedil;os">Administrador</a>
    	<ul>
            <li><a href="cadastrar_admin.jsp" title="Cadastrar Institui��o">Cadastrar</a></li>            
            <li><a href="buscar_administrador.jsp" title="Pesquisar">Pesquisar</a></li>
            <li><a href="atualizar_administrador.jsp" title="Alterar Dados">Alterar</a></li>
            <li><a href="deletar_administrador.jsp" title="Excluir Institui��o">Excluir</a>
            </li>                    
        </ul>
        </li>
        <li><a href="#" title="Servi&ccedil;os">Institui��o</a>
    
    	<ul>
            <li><a href="CadastroInstituicao.jsp" title="Cadastrar Institui��o">Cadastrar</a></li>            
            <li><a href="ListaInstituicoes.do" title="Pesquisar">Pesquisar</a></li>
            <li><a href="processainstituicao.do" title="Alterar Dados">Alterar</a></li>
            <li><a href="processainstituicaoexcluir.do" title="Excluir Institui��o">Excluir</a>
            </li>                    
        </ul>
        
        </li>
	<li><a href="#" title="Porftolio">Provas</a>
		<ul>
            <li><a href="#" title="Web design">Cadastrar</a></li>            
            <li><a href="#" title="Web master">Pesquisar</a></li>
            <li><a href="#" title="SEO">Alterar</a></li>
            <li><a href="#" title="Design gr&aacute;fico">Excluir</a>
            </li>                    
        </ul>
	<li class="border0"><a href="#" title="Contato">Area</a>
            <ul>
            <li><a href="CadastroArea2.jsp" title="Cadastrar �rea">Cadastrar</a></li>            
            <li><a href="Listaarea.do" title="Exibir �reas Cadastradas">Pesquisar</a></li>
            <li><a href="processaalterararea.do" title="Alterar �reas Cadastradas">Alterar</a></li>
            <li><a href="processaareaexcluir.do" title="Deletar �reas">Excluir</a>
            </li>                    
        </ul>

</div>
      <div class="sidebar1"><br />
        <ul class="menu_vertical">Professor</ul>
          <ul class="nav">
            <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Editar</a></li>
            <li><a href="#">Inserir �rea</a></li>
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
          <p align="right">Voc� n�o est� logado! - Gostaria de <a href="logout.html">Cadastrar-se</a>?</p> 
          <ul class="formulario">
<%--%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%--%>
            <fieldset >
                <legend>Buscar Administrador</legend>
                <form id="form_validacao" action="BuscarAdministrador.do" method="post">
                  <div class="rowElem"><label>Email:</label><input type="text" name="email" id="nome_al"/></div>
                  </br></br><input type="submit" value="Buscar" />
                </form>
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