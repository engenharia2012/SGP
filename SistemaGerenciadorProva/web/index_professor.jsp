<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/jquery.validate.js" type="text/javascript"></script> 
		<link href="css/validate.css" type="text/css" media="screen" rel="stylesheet" /><!-- ADAPTAÇÃO DE PÁGINA -->
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
            <!--<li><a href="#" title="Web design">Cadastrar</a></li> -->           
            <li><a href="#" title="Web master">Pesquisar</a></li>
            <li><a href="#" title="SEO">Alterar</a></li>
            <li><a href="#" title="Design gr&aacute;fico">Excluir</a>
            </li>                    
        </ul>
        </li>
	<!--<li><a href="#" title="Sobre">Alunos</a></li>-->
	<!--<li><a href="#" title="Servi&ccedil;os">Instituição</a>
    
    	<ul>
            <li><a href="CadastroInstituicao.jsp" title="Cadastrar Instituição">Cadastrar</a></li>            
            <li><a href="ListaInstituicoes.do" title="Pesquisar">Pesquisar</a></li>
            <li><a href="processainstituicao.do" title="Alterar Dados">Alterar</a></li>
            <li><a href="processainstituicaoexcluir.do" title="Excluir Instituição">Excluir</a>
            </li>                    
        </ul>
        
    </li>-->
	<li><a href="#" title="Porftolio">Provas</a>
		<ul>
            <li><a href="#" title="Web design">Cadastrar</a></li>            
            <li><a href="#" title="Web master">Pesquisar</a></li>
            <li><a href="#" title="SEO">Alterar</a></li>
            <li><a href="#" title="Design gr&aacute;fico">Excluir</a>
            </li>                    
        </ul>
	<li class="border0"><a href="#" title="Contato">Questões</a>
            <ul>
            <li><a href="CadastroArea2.jsp" title="Cadastrar Área">Cadastrar</a></li>            
            <li><a href="Listaarea.do" title="Exibir Áreas Cadastradas">Pesquisar</a></li>
            <li><a href="processaalterararea.do" title="Alterar Áreas Cadastradas">Alterar</a></li>
            <li><a href="processaareaexcluir.do" title="Deletar Áreas">Excluir</a>
            </li>                    
        </ul>
        
	<li class="border0"><a href="#" title="Contato">Nível</a>
            <ul>
            <li><a href="CadastroArea2.jsp" title="Cadastrar Área">Cadastrar</a></li>            
            <li><a href="Listaarea.do" title="Exibir Áreas Cadastradas">Pesquisar</a></li>
            <li><a href="processaalterararea.do" title="Alterar Áreas Cadastradas">Alterar</a></li>
            <li><a href="processaareaexcluir.do" title="Deletar Áreas">Excluir</a>
                               
        </ul>
        </li>
</div>
  <div class="sidebar1">
  <br />
  <ul class="menu_vertical">Menu do Professor</ul>
    <ul class="nav">
      <li><a href="#">Meus Dados</a></li>
      <li><a href="#">Alterar Meu Perfíl</a></li>
      <li><a href="#">Pesquisar</a></li>
      
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
      <p align="right">Seja bem vindo Professor Fulano! Para sair do sistema <a href="logout.jsp">Clique aqui!</a></p>
  <ul class="formulario">
    <fieldset>
	   <legend>Cadastro Professor</legend>
<form id="f1" class="validate" action="" method="post" >
                
                <p>
                 <label>Nome:</label>
                    <input type="text" name="nome" id="nome" class="required" minlength="5" />
                    <span>Informe seu nome completo</span>
                 </p> 
                 
                 <p>                
                    <label>Email:</label>
                    <input type="text" name="email" id="email" class="required email" />
                    <span>Campo requerido, informe um e-mail válido</span>
                </p>  
                
                <p>                
                    <label>Senha - Mínimmo 4 caracteres</label>
                    <input type="password" name="password" id="password"  class="required password" minlength="4" />
                    <span>Campo requerido, informe ao menos 4 caracteres</span>
                </p> 
                <p>
                    <label>CPF:</label>
                    <input type="text" name="cpf" id="cpf" class="required cpf" />
                    <span>Campo requerido, informe um CPF válido</span>
                </p> 
                 <p>  
                    <label>Instituição</label>
                    <select name="combo" id="combo" class="required">
                        <option value="">Selecione um item na lista</option>
                        <option value="0">Instituição AA</option>
                        <option value="1">Instituição BB</option>
                    </select>
                    <span>Selecione um item</span>
                    
                </p>    
                 <p>  
                    <label>Área</label>
                    <select name="combo" id="combo" class="required">
                        <option value="">Selecione um item na lista</option>
                        <option value="0">Área AA</option>
                        <option value="1">Área BB</option>
                    </select>
                    <span>Selecione um item</span>
                    
                </p>
               
                <p>
		    <button class="button blue submit">Cadastrar</button>
                    <button class="button gray reset">Limpar</button>
                </p>

            </form>
    </ul>
    <!-- end .content --></div>
  <div class="footer">
    <blockquote>
      <p>© 2013 Todos os direitos reservados - Turma Sistemas Para Internet </p>
    </blockquote>
    <!-- end .footer --></div>
  <!-- end .container --></div>
</body>
</html>


