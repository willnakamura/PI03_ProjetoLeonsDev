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

        <title>consultar usuario</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.ico">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

        
        
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
                               <li class="current"><a href="${pageContext.request.contextPath}/home.jsp">HOME</a></li>                                
                                <li><a href="${pageContext.request.contextPath}/cliente-cadastrar.jsp">Cliente</a></li>                                
                                <li><a href="${pageContext.request.contextPath}/usuario-cadastrar.jps">Usuários</a></li>
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
 
        <div class="content"><div class="ic"></div>

            <div class="container_12">
                
                <div class="grid_8">
                    
                        <div class="tituloCliente">
                        <h5 class="opcao">CONSULTAR USUARIO </h5>
                       </div>                    
                    
                    <div class="busca"><input type="text" id="busca1" placeholder="Digite sua busca" name="buscaCliente">  <button id="botoesBusca">BUSCAR</button></div>
                     
                    <div id="bg"> </div>
                        <div class="box">
                         <div id="tituloClienteConsultar" >
                        <h5>EDITAR USUARIO </h5>
                       </div>  
                            
                              <form class="signup" action="${pageContext.request.contextPath}/usuario-cliente">
                            <BR>

                            <div class="form-body">
                                <div class="row">
                                    <input type="text" placeholder="Nome*" name="nome-usua">
                                    <input type="text" placeholder="Sobrenome*" name="sobreNome-usua">
                                </div>  
                                <div class="row">
                                    <input type="number" placeholder="cpf*" name="cpf-usua">
                                     <input type="text" placeholder="Cargo" name="cargo-usua">
                                </div>
                                <div class="row">
                                    <input type="text" placeholder="Email*" name="email-usua">
                                </div>
                                <div class="row">
                                    <input type="text" placeholder="Login*" name="login-usua">
                                     <input type="text" placeholder="Senha*" name="senha-usua"> 
                                </div>                              
                             
                            </div>
                            
                              <div class="form-footer">

                                <button class="botoes"><a href="usuario-consultar.jsp">CANCELAR</a><span class="fa fa-ban"></span></button>
                                
                                <button class="botoes" type="submit">SALVAR<span class="fa fa-thumbs-o-up"></span></button>

                            </div>
                        </form>
                         </div>  
                    
                    
                    
                    
                    
                    <table>
                        <tr>
                            <th></th>
                            <th>Nome</th>
                            <th>Sobre Nome</th>
                            <th>cpf</th>
                            <th>Email</th>
                            <th>Cargo</th>
                            <th>Login</th>    
                            <th>senha</th>
                            
                        </tr>
                        <tr>
                            <td><input class="radio" type="radio" name="cliente" value="cliente">&nbsp;&nbsp;&nbsp;</td> 
                            <td>Pedro</td>
                            <td>Lucas dos Santos Cruz</td>
                            <td>445.706.958-25</td>
                            <td>pedrolucas11@live.com</td>
                            <td>Analista de Sistemas Pleno </td>
                             <td>pcruz</td>
                            <td>senac123</td>                            
                        </tr>


                    </table>

                    <div class="form-footer">
                        <button class="botoes"><a href="${pageContext.request.contextPath}/usuario-cliente">CANCELAR<span class="fa fa-ban"></span></button>
                        <button class="botoes"><a href="#bg">EDITAR</a><span class="fa fa-thumbs-o-up"></span></button>

                    </div>
                
                    </div>


                <div class="grid_3 prefix_1">

                    <h5 class="opcao">Opção </h5>
                    <ul class="list">
                        <li><a href="usuario-cadastrar.jsp">Cadastrar</a></li>
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
