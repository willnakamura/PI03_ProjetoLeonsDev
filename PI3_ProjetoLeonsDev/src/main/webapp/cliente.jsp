<%-- 
    Document   : cliente
    Created on : 17/10/2017, 20:46:33
    Author     : Nakamura-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>

        <title>Cliente</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.ico">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/camera.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/form.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.css">
     



        <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-migrate-1.2.1.js"></script>
        <script src="${pageContext.request.contextPath}/js/script.js"></script>
        <script src="${pageContext.request.contextPath}/js/superfish.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.ui.totop.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.equalheights.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.mobilemenu.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.easing.1.3.js"></script>

        <script>
            $(document).ready(function () {
                $().UItoTop({easingType: 'easeOutQuart'});
            });
        </script>

    </head>
    <body>
        <!--==============================header=================================-->
        <header>
            <div class="container_12">
                <div class="grid_12">
                    <div class="menu_block">
                        <nav class="horizontal-nav full-width horizontalNav-notprocessed">
                            <ul class="sf-menu">
                                <li><a href="${pageContext.request.contextPath}/index.html">HOME</a></li>
                                <li class="current"><a href="${pageContext.request.contextPath}/cliente.jsp">Cliente</a></li>
                                <li><a href="index-2.html">SPECIAL OFFERS</a></li>
                                <li><a href="index-3.html">BLOG</a></li>
                                <li><a href="index-4.html">CONTACTS</a></li>
                            </ul>
                        </nav>
                        <div class="clear"></div>
                    </div>
                </div>
                <div class="grid_12">
                    <h1>
                        <a href="index.html">
                            <img src="${pageContext.request.contextPath}/images/logo.png" alt="Your Happy Family">
                        </a>
                    </h1>
                </div>

            </div>
        </header>
        <!--==============================Content=================================-->
        <div class="content"><div class="ic"></div>

            <div class="container_12">
                <div class="grid_8">

                 <div class="formulario_Cadastrar">
                
                <form action="${pageContext.request.contextPath}/cadastro-cliente" method="post" class="form_cadastrar">
                <h5>Cadastro de clientes</h5>

                <label for="nome"  class="label-cadastro-nome">Nome</label>                 
                <input type="text" id="regula-generated-96048"  name="nome" value="nomeCliente" class="input-cadastro-name"/> 
                <label for="sobreNome"  class="label-cadastro-sobreNome">Sobre nome</label>
                <input type="text"  name="sobreNome" value="sobreNome" class="input-cadastro-sobreName"/> 
                
                </br></br>
                <label for="cpf" class="label cadastro cpf">CPF</label>
                <input type="text" name="cpf" value="cpfCliente" class="input-cpf"/>
                <br>
                <br>
                     <label for="email" class="label-cadastro-email">E-mail</label>
                <input type="text" name="emailCliente" value="email" class="input-cadastro-email"/>
                <br><br>
                 <label for="cliente" class="label-cadastro-telefone">celular</label>
                <input type="text" name="celular" value="celular" class="input-cadastro-celular"/>
                <br><br>
                <label for="dtnascimento" class="label-cadastro-DataNasci">Data de Nascimento</label>
                <input type="date" id="dp1508535680021" name="dataNascimentoCliente" class="input-cadastro-dtnascimento"/>
                </br></br>
               
               <label for="sexo" class="label-cadastro-sexo">Sexo</label>
                <input type="text" name="sexo" value="sexo" class="input-cadastro-sexo"/>
              <br><br>
              <label for="estado" class="label-cadastro-estado">Estado</label>
                <input type="text" name="estadoCliente" value="estado" class="input-cadastro-endereco"/>
                <br><br>
                <label for="cidade" class="label-cadastro-cidade">Cidade</label>
                <input type="text" name="cidadeCliente" value="cidade" class="input-cadastro-cidade"/>
                <br><br>
                   <label for="cep" class="label-cadastro-cep">CEP</label>
                <input type="number" name="cep" value="cep" class="input-cadastro-cep"/>
                <br><br>
                <label for="endereco" class="label-cadastro-endereco">Endereço</label>
                <input type="text" name="enderecoCliente" value="endereco" class="input-cadastro-endereco"/>
                
                </br></br>

                </br></br>
                <div>
                  
                    <button> Cadastrar </button>
                </div>
                
            </form>
                <div class="formulario_consulta">
                    </div>
                
                     
            </div>
                                    
               </div>
                
                
                
                <div class="grid_3 prefix_1">
                    
                    <h5 class="opcao">Opção </h5>
                    <ul class="list">
                        <li><a href="#">Cadastrar</a></li>
                        <li><a href="#">Consultar</a></li>
                                                  
                       
                    </ul>
                </div>
                
                </div>
               

        </div>
        <!--==============================footer=================================-->
        <footer>
            <div class="container_12">
                <div class="grid_12">
                    <div class="socials">
                        <a href="#" class="fa fa-facebook"></a>
                        <a href="#" class="fa fa-google-plus"></a>
                    </div>
                    <div class="copy">
                        Your Trip (c) 2017 | <a href="#">Privacy Policy</a>
                    </div>
                </div>
            </div>
        </footer>
        <script>
            $(function () {
                $('#bookingForm').bookingForm({
                    ownerEmail: '#'
                });
            })
        </script>
    </body>
</html>
