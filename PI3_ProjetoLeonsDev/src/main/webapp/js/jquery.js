//var campo_nome = document.querySelector("input[name='nome'");

var nome;
var sobreNome;
var cpf;
var email;
var celular;
var dtNascimento;
var sexo;
var estado;
var cidade;
var cep;
var endereco;


this.receberDoBanco = function(){
    this.nome; //colocar função do banco
      this.sobreNome; //colocar função do banco
        this.cpf; //colocar função do banco
          this.email; //colocar função do banco
            this.celular; //colocar função do banco
              this.dtNascimento; //colocar função do banco
                this.sexo; //colocar função do banco
                  this.estado; //colocar função do banco
                    this.cidade; //colocar função do banco
                       this.cep; //colocar função do banco
                         this.endereco; //colocar função do banco
                         
 //colocar laço de repetição pra puxar os dados do banco 
}


this.criar_linha_tabela = function(){
   //criada linha da tabela 
    var linha = document.createElement("tr");
  //criação dos elementos da tabela  
    var campo_nome = document.createElement("td");
    var campo_sobreNome = document.createElement("td");
    var campo_cpf = document.createElement("td");
    var campo_email = document.createElement("td");
    var campo_celular = document.createElement("td");
    var campo_dtNascimento = document.createELement("td");
    var campo_sexo = document.createElement("td");
    var campo_estado = document.createElement("td");
    var campo_cidade = document.createElement("td");
    var campo_cep = document.createElement("td");
    var campo_endereco = document.createElement("td");
    
    //criação dos nós dos elementos 
    var texto_nome = document.createTextNode(this.nome);
    var texto_sobreNome = document.createTextNode(this.sobreNome);
    var texto_cpf = document.createTextNode(this.cpf);
    
    
}