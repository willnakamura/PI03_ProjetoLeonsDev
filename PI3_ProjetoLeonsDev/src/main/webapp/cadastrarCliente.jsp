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
                                <li><a href="${pageContext.request.contextPath}/home.jsp">HOME</a></li>                                
                                <li class="current"><a href="${pageContext.request.contextPath}/cadastrarCliente.jsp">Cliente</a></li>                                
                                <li><a href="${pageContext.request.contextPath}/cadastrarUsuario.jsp">Usuarios</a></li>
                                <li><a href="index-3.html">BLOG</a></li>
                                <li><a href="index-4.html">CONTACTS</a></li>
                            </ul>
                        </nav>
                        <div class="clear"></div>
                    </div>
                </div>
                <div class="grid_12">
                    <h1>
                        <a href="index.jsp">
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

                    <div class="tituloCliente">
                        <h5 class="opcao">CADASTRAR CLIENTE </h5>
                    </div>

                    <div class="card-form">
                        <form class="signup" action="${pageContext.request.contextPath}/cadastro-cliente" method="post">
                            <BR>

                            <div class="form-body">
                                <div class="row">
                                    <input type="text" placeholder="Nome*" name="nome-cli">
                                    <input type="text" placeholder="Sobrenome*" name="sobreNome-cli">
                                </div>  
                                <div class="row">
                                    <input type="number" placeholder="cpf*" name="cpf-cli">
                                </div>
                                <div class="row">
                                    <input type="text" placeholder="Email*" name="email-cli">
                                </div>
                                <div class="row">
                                    <input type="number" placeholder="()Celular*" name="celular-cli">       
                                </div>

                                <div class="row">
                                    <select class="sexo" name="sexo-cli">
                                        <option value="SelecioneSexo">Selecione</option>
                                        <option value="Masculino">Masculino</option>
                                        <option value="Feminino">Feminino</option>                               

                                    </select>

                                    <input type="date" placeholder="" name="dtNasc-cli">   

                                </div>

                                <div class="row">


                                    <select class="estado" name="estado-cli">           
                                        <option value="selecione">Estado</option>
                                        <option value="AC">AC</option>
                                        <option value="AL">AL</option>  
                                        <option value="AP">AP</option> 
                                        <option value="AM">AM</option> 
                                        <option value="BA">BA</option> 
                                        <option value="CE">CE</option>
                                        <option value="DF">DF</option> 
                                        <option value="ES">ES</option> 
                                        <option value="GO">GO</option> 
                                        <option value="MA">MA</option> 
                                        <option value="MT">MT</option> 
                                        <option value="MS">MS</option>
                                        <option value="MG">MG</option> 
                                        <option value="PA">PA</option> 
                                        <option value="PB">PB</option> 
                                        <option value="PR">PR</option>
                                        <option value="PE">PE</option> 
                                        <option value="PI">PI</option> 
                                        <option value="RJ">RJ</option> 
                                        <option value="RN">RN</option> 
                                        <option value="RS">RS</option> 
                                        <option value="RO">RO</option> 
                                        <option value="RR">RR</option> 
                                        <option value="SC">SC</option> 
                                        <option value="SP">SP</option> 
                                        <option value="SE">SE</option> 
                                        <option value="TO">TO</option>                                
                                    </select>
                                    <input type="text" placeholder="Cidade*" name="cidade-cli">
                                </div>

                                <div class="row">
                                    <input type="number" placeholder="CEP*" name="cep-cli">
                                </div>
                                <div class="row">
                                    <input type="text" placeholder="Endereço" name="end-cli">
                                </div>

                            </div>

                            <div class="form-footer">

                                <button class="botoes">CANCELAR<span class="fa fa-ban"></span></button>
                                <button class="botoes" type="submit">SALVAR<span class="fa fa-thumbs-o-up"></span></button>

                            </div>
                        </form>

                    </div>
                </div>
                <div class="grid_3 prefix_1">
                    <h5 class="opcao">Opção </h5>
                    <ul class="list">
                        <li><a href="#">Cadastrar</a></li>
                        <li><a href="${pageContext.request.contextPath}/consultarCliente.jsp">Consultar</a></li>


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
