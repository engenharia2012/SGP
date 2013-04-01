<%-- 
    Document   : CadastroInstituicao
    Created on : 01/03/2013, 13:45:33
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
         <script src="js/jquery.min.js" type="text/javascript"></script>
         <script src="js/jquery.validate.js" type="text/javascript"></script> 
		<link href="css/validate.css" type="text/css" media="screen" rel="stylesheet" />
		<!--[if lte IE 7]>
		<link href="css/validate_ie7.css" type="text/css" media="screen" rel="stylesheet" />
		<![endif]-->
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta name="gmapkey" content="" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
        
        <link href="style/style.css"  rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="demo.css" type="text/css" media="all" />
        
        <title>Cadastro da Instituição</title>
    </head>
    <body>
        <div class="container">
            <div class="header">
                <ul class="menu">
                    <li><a href="#" title="Inicial">Professor</a></li>
                    <li><a href="#" title="Sobre">Alunos</a></li>
                    <li><a href="#" title="Servi&ccedil;os">Instituição</a>
                        <ul>
                            <li><a href="CadastroInstituicao.jsp" title="Cadastrar Instituição">Cadastrar</a></li>            
                            <li><a href="ListaInstituicoes.do" title="Pesquisar">Pesquisar</a></li>
                            <li><a href="processainstituicao.do" title="Alterar Dados">Alterar</a></li>
                            <li><a href="processainstituicaoexcluir.do" title="Excluir Instituição">Excluir</a></li>                    
                        </ul>
                    </li>
                    <li><a href="#" title="Porftolio">Provas</a>
                        <ul>
                            <li><a href="#" title="Web design">Cadastrar</a></li>            
                            <li><a href="#" title="Web master">Pesquisar</a></li>
                            <li><a href="#" title="SEO">Alterar</a></li>
                            <li><a href="#" title="Design gr&aacute;fico">Excluir</a></li>                    
                        </ul>
                    </li>
                    <li class="border0"><a href="#" title="Contato">Area</a>
                        <ul>
                            <li><a href="CadastroArea2.jsp" title="Cadastrar Área">Cadastrar</a></li>            
                            <li><a href="Listaarea.do" title="Exibir Áreas Cadastradas">Pesquisar</a></li>
                            <li><a href="processaalterararea.do" title="Alterar Áreas Cadastradas">Alterar</a></li>
                            <li><a href="processaareaexcluir.do" title="Deletar Áreas">Excluir</a></li>                    
                        </ul>
                    </li>
                </ul>
            </div>
  <div class="sidebar1">
    <br/>
    <ul class="menu_vertical">Menu Vertical</ul>
      <ul class="nav">
        <li><a href="#">Menu 1</a></li>
        <li><a href="#">Link two</a></li>
        <li><a href="#">Menu 2</a></li>
        <li><a href="#">Link four</a></li>
      </ul>
      <p>&nbsp;</p>
      <ul class="menu_vertical">Menu Vertical 2</ul>
      <ul class="nav">
        <li><a href="#">Menu 1</a></li>
        <li><a href="#">Link two</a></li>
        <li><a href="#">Menu 2</a></li>
        <li><a href="#">Link four</a></li>
      </ul>
      <p>&nbsp;</p>
    <!-- end .sidebar1 -->
  </div>
  <div class="content">
    <ul class="formulario">
        <fieldset>
	   <legend>Dados Cadastrais da Instiuição</legend>
           <form id="f1" class="validate" name="Cadastro_Instituicao" action="cadastrainstituicao.do" enctype="multipart/formdata" method="post">
            <p>
                <label>Nome:</label>
                <input maxlength="80" id="nome" class="required" size="60" name="textNomeFantasia">
                <span>Informe o nome fantasia da instituição</span>
            </p>
            <p>
                <label>Endereço:</label>
                <input maxlength="120" id="nome" class="required" size="60" name="textEndereco">
                <span>Informe o endereço da instituição</span>
            </p>
            <p>
                <label>Telefone:</label>
                <input id="nome" class="required" maxlength="80" size="60" name="textTelefone">
                <span>Informe um telefone válido</span>
            </p>
            <p>
                <label>Razão Social:</label>
                <input id="nome" class="required" maxlength="80" size="60" name="textRazaoSocial">
                <span>Informe a razão social da instituição</span>
            </p>
            <p>
                <label>CNPJ:</label>
                <input maxlength="18" id="cpf" class="required" size="60" name="textCNPJ">
                <span>Informe um CNPJ válido</span>
            </p>
            <p>
                <label>Logomarca da Instiuição:</label>
                <input type="file" id="nome" class="required" name="file" size="60" accept="image/*"/>
                <span>Informe um figura válida</span>
            </p>
            <button class="button blue submit">Cadastrar</button>
            <button class="button gray reset">Limpar</button>
        </form>
    </ul>   
    <!-- end .content -->
  </div>
    <div class="footer">
        <blockquote>
          <p>© 2013 Todos os direitos reservados - Turma Sistemas Para Internet </p>
        </blockquote>
    <!-- end .footer -->
    </div>
  <!-- end .container -->
        </div>
    </body>
</html>
