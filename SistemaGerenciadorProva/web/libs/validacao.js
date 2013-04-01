$(document).ready(function(){
   $('#form_validacao').validate({
      rules:{
         // O campo Nome é de preenchimento obrigatório (required) 
         //e tamanho mínimo de 2 caracteres
	nome:{
	   required: true,
	   minlength: 2
	},
	// O campo Email é de preenchimento obrigatório (required) 
        // e o email precisa ser válido
	email: {
	   required: true,
	   email: true
	},
	// O campo numid, é de preenchimento obrigatório (required)
	numid: {
	   required: true,
	   digits: true
	
	},
	inst: {
	   required: true
	
	},
	// O campo quantidade, é de preenchimento obrigatório (required)
	quantidade: {
	   required: true,
	   digits: true
	
	},
	// O campo Time, é de preenchimento obrigatório (required)
	time: {
	   required: true
	},
	
	cpf: {
	   required: true,
	   minlength: 11,
	   digits: true
	},
	area: {
	   required: true
	},
	// O campo Observação, é de preenchimento obrigatório (required)
	// 3 é o mínimo e 10 é o máximo de caracteres que podem ser digitados
	//obs: {
	//   required: true,
	//   minlength: 3,
	//   maxlength: 20
	//},
	// O campo Senha é de preenchimento obrigatório (required)
	senha: {
	   required: true
	},
	// O campo Confirma Senha é de preenchimento obrigatório (required) 
	// e deve ser igual ao campo Senha (equalTo)
	repete_senha:{
	   required: true,
	   equalTo: "#senha"
	},
	// O campo Termo é de preenchimento obrigatório (required) 
	termo: "required"
      },
	 
	  
	  
	  
	  
	  
      // Aqui fica as mensagens de erro das regras acima,
      // que serão apresentadas caso alguma regra seja desobedecida
      messages:{
		  
		  	  inst:{
	   required: "O campo instituição é obrigatório."
	},	 
		  
		  area:{
	   required: "O campo area é obrigatório."
	},	 
		  
		  
	  cpf:{
	   required: "O campo CPF é obrigatório.",
	   minlength: "O campo CPF deve conter 11 dígitos.",
	   digits: "Informe apenas números."
	},	  
		  
    nome:{
	   required: "O campo Nome é obrigatório.",
	   minlength: "O campo Nome deve conter no mínimo 3 caracteres."
	},
	email:{
	   required: "O campo Email é obrigatório.",
	   email: "O campo Email deve conter um email válido."
	},
	time:{
	   required: "É necessário selecionar o seu time favorito."
	},
	numid:{
	   required: "É necessário informar o ID do produto.",
	   digits: "Informe apenas números."
	
	},
	quantidade:{
	   required: "É necessário informar a quantidade.",
	   digits: "Informe apenas números."
	
	},
	valor:{
	   required: "É necessário informar o valor do produto."
	},
	//obs:{
	//   required: "O campo Observação é obrigatório.",
	//   minlength: "O campo Observação deve conter no mínimo 3 caracteres.",
	 //  maxlength: "O campo Observação deve conter no máximo 20 caracteres."
	//},
	senha: {
	   required: "O campo Senha é obrigatório."
	},
	repete_senha:{
	   required: "O campo Confirma Senha é obrigatório.",
	   equalTo: "O campo Confirma Senha deve ser idêntico ao campo Senha."
	},
	termo: "É necessário aceitar os termos de uso."
      }
 
   });
});