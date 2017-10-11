<%-- 
    Document   : index
    Created on : 10/10/2017, 17:35:20
    Author     : Nakamura-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>

        <title>Home</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/zerogrid.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/responsive.css" type="text/css" media="all"> 

        <script type="text/javascript" src="js/jquery-1.4.2.js" ></script>
        <script type="text/javascript" src="js/cufon-yui.js"></script>
        <script type="text/javascript" src="js/cufon-replace.js"></script>  
        <script type="text/javascript" src="js/Myriad_Pro_600.font.js"></script>
        <script type="text/javascript" src="js/css3-mediaqueries.js"></script>

    </head>

    <body id="page1">
        <div class="extra">
            <div class="main zerogrid">
                <!-- header -->
                <header>
                    <div class="row">
                          <!-- INICIO PARTE DO LOGO -->
                        <h1><a href="index.html" id="logo">Around the World</a></h1>
                         <!-- FINAL PARTE DO LOGO -->
                        
                    </div>
                    <nav class="row">
                        <ul id="menu">
                            <li><a href="index.html" class="nav1">Home</a></li>
                            <li><a href="About.html" class="nav2">About Us </a></li>
                            <li><a href="Tours.html" class="nav3">Our Tours</a></li>
                            <li><a href="Destinations.html" class="nav4">Destinations</a></li>
                            <li class="end"><a href="contact.html" class="nav5">Contacts</a></li>
                           
                        </ul>
                    </nav>
                    
                    
                    <form action="${pageContext.request.contextPath}/cadastro-cliente" method="post">
                <h5>Cadastro de clientes</h5>

                <label for="nome"  class="label cadastro nome">Nome Completo</label>
                <input type="text" name="nome" value="nome" class="input cadastro name"/>               
                </br></br>
                <label for="cpf" class="label cadastro cpf">CPF</label>
                <input type="text" name="cpf" value="cpf" class="input-cpf"/>
                </br></br>
                <label for="dtnascimento" class="label cadastro DataNasci">Data de Nascimento</label>
                <input type="date" name="dataNascimento" class="input cadastro dtnascimento"/>
                </br></br>
                <label for="endereco" class="label cadastro endereco">Endereço</label>
                <input type="text" name="endereco" value="endereco" class="input cadastro endereco"/>
                </br></br>
                <label for="telefone" class="label cadastro telefone">Telefone</label>
                <input type="text" name="telefone" value="telefone" class="input cadastro telefone"/>
                </br></br>
                <label for="email" class="label cadastro email">E-mail</label>
                <input type="text" name="email" value="email" class="input cadastro email"/>
                </br></br>

                </br></br>
                <div>
                    <button> Voltar </button>
                    <button> Cadastrar </button>
                </div>
            </form>
                    
                    
                </header>
                <!-- / header -->
                <!-- content -->
                
                <!-- / content -->
            </div>
            <div class="block"></div>
        </div>
        <div class="body1">
            <div class="main">
                <!-- footer -->
                <footer>
                    Designed by <a rel="nofollow" href="http://www.abc.com/" target="_blank">TemplateMonster</a> & <a href="https://www.zerotheme.com/" title="free website templates">ZEROTHEME</a>
                </footer>
                <!-- / footer -->
            </div>
        </div>
        <script type="text/javascript"> Cufon.now();</script>
    </body>
</html>
