<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/jquery.validate.js" type="text/javascript"></script> 
		<link href="css/validate.css" type="text/css" media="screen" rel="stylesheet" />
		<!--[if lte IE 7]>
		<link href="css/validate_ie7.css" type="text/css" media="screen" rel="stylesheet" />
		<![endif]-->
	
	
	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta name="gmapkey" content="" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />


	
	<link href="style/style.css"  rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="demo.css" type="text/css" media="all" />
	


<title>Sistema de Provas</title>



</head>

<body>

<div class="container">
  <div class="header">
  <ul class="menu">
	<li><a href="#" title="Inicial">Professor</a>
            <ul>
            <li><a href="#" title="Web design">Cadastrar</a></li>            
            <li><a href="#" title="Web master">Pesquisar</a></li>
            <li><a href="#" title="SEO">Alterar</a></li>
            <li><a href="#" title="Design gr&aacute;fico">Excluir</a>
            </li>                    
        </ul>
	<li><a href="#" title="Sobre">Alunos</a>
            <ul>
            <li><a href="#" title="Web design">Cadastrar</a></li>            
            <li><a href="#" title="Web master">Pesquisar</a></li>
            <li><a href="#" title="SEO">Alterar</a></li>
            <li><a href="#" title="Design gr&aacute;fico">Excluir</a>
            </li>                    
        </ul>
	<li><a href="#" title="Servi&ccedil;os">Institui豫o</a>
    
    	<ul>
            <li><a href="#" title="Web design">Cadastrar</a></li>            
            <li><a href="#" title="Web master">Pesquisar</a></li>
            <li><a href="#" title="SEO">Alterar</a></li>
            <li><a href="#" title="Design gr&aacute;fico">Excluir</a>
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
        
                
                <li class="border0"><a href="#" title="Contato">Nivel</a>
            <ul>
            <li><a href="CadastroNivel2.jsp" title="Cadastrar Nivel">Cadastrar</a></li>            
            <li><a href="ListaNivel.do" title="Exibir Nivel Cadastradas">Pesquisar</a></li>
            <li><a href="ProcessaAlterarNivel.do" title="Alterar Nivel Cadastradas">Alterar</a></li>
            <li><a href="ProcessaNivelExcluir.do" title="Deletar Nivel">Excluir</a>
            </li>                    
        </ul>
	<li class="border0"><a href="#" title="Contato">햞ea</a>
            <ul>
            <li><a href="CadastroArea2.jsp" title="Cadastrar 햞ea">Cadastrar</a></li>            
            <li><a href="Listaarea.do" title="Exibir 햞eas Cadastradas">Pesquisar</a></li>
            <li><a href="processaalterararea.do" title="Alterar 햞eas Cadastradas">Alterar</a></li>
            <li><a href="processaareaexcluir.do" title="Deletar 햞eas">Excluir</a>
            </li>                    
        </ul>
</ul>

</div>
  <div class="sidebar1">
  <br />
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
    <!-- end .sidebar1 --></div>
  <div class="content">
  <ul class="formulario">
    <fieldset>
	   <legend>Cadastro Nivel</legend>
	    <FORM name="Cadastro_Nivel" action="CadastrarNivel.do" enctype="multipart/formdata" class="validate" method="post">
                <p>
                <label>Nivel:</label>
                <input maxlength="80" size="60" name="textTipoNivel" id="nome" class="required">
		<span>Informe o tipo do Nivel</span>
                </p>
                </br></br>

                <p></p>
                <p> <button class="button blue submit">Cadastrar</button>
                    <button class="button gray reset">Limpar</button></p>
        </FORM>
    </fieldset>

    </ul>
    <!-- end .content --></div>
  <div class="footer">
    <blockquote>
      <p>�2013 Todos os direitos reservados - Turma Sistemas Para Internet </p>
    </blockquote>
    <!-- end .footer --></div>
  <!-- end .container --></div>
</body>
</html>

