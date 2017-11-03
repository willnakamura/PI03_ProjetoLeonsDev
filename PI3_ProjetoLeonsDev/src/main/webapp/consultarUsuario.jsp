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

        <title>Usuario</title>

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
                                <li><a href="${pageContext.request.contextPath}/cadastrarCliente.jsp">Cliente</a></li>                                
                                <li class="current"><a href="${pageContext.request.contextPath}/cadastrarUsuario.jsp">Usuarios</a></li>
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

        <div class="content"><div class="ic"></div>

            <div class="container_12">

                <div class="grid_8">

                    <div class="tituloCliente">
                        <h5 class="opcao">CONSULTAR USUARIO </h5>
                    </div>                    

                    <form class="buscaUsuario" action="${pageContext.request.contextPath}/ConsultaUsuario" method="post">
                        <div class="busca">
                            <input type="text" id="busca1" placeholder="Digite sua busca" name="buscaUsuario">  <button id="botoesBusca" type="submit">BUSCAR</button>
                        </div>
                    </form>

                    <div id="bg"> </div>
                    <div class="box">

                        <form class="signup" action="${pageContext.request.contextPath}/EditarUsuario" method="post">
                            <BR>

                            <table>

                                <tr>
                                    <th></th>
                                    <th>Nome</th>
                                    <th>Sobrenome</th>
                                    <th>cpf</th>
                                    <th>Email</th>
                                    <th>Cargo</th>
                                    <th>Login</th>    
                                    <th style="visibility: hidden">senha</th>
                                    <th style="visibility: hidden">ID</th>
                                </tr>


                                <c:if test="${empty sessionScope.buscar}">
                                    <c:forEach items="${sessionScope.ResultUsuarioLista}" var="usu">
                                        <tr>
                                            <td><input type="radio" value="${usu.cpf}" name="selecionaUsuario"></td>
                                            <td>${usu.nome}</td>
                                            <td>${usu.sobrenome}</td>
                                            <td>${usu.cpf}</td>
                                            <td>${usu.email}</td>
                                            <td>${usu.cargo}</td>
                                            <td>${usu.login}</td>    
                                            <td style="visibility: hidden">${usu.senha}</td>
                                            <td style="visibility: hidden">${usu.id}</td>
                                        </tr>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${sessionScope.buscar != null}" >

                                    <tr>
                                        <td><input type="radio" value="${sessionScope.ResultUsuario.cpf}" name="selecionaUsuario"></td>
                                        <td>${sessionScope.ResultUsuario.nome}</td>
                                        <td>${sessionScope.ResultUsuario.sobrenome}</td>
                                        <td>${sessionScope.ResultUsuario.cpf}</td>
                                        <td>${sessionScope.ResultUsuario.email}</td>
                                        <td>${sessionScope.ResultUsuario.cargo}</td>
                                        <td>${sessionScope.ResultUsuario.login}</td>    
                                        <td style="visibility: hidden">${sessionScope.ResultUsuario.senha}</td>
                                        <td style="visibility: hidden">${sessionScope.ResultUsuario.id}</td>
                                    </tr>
                                </c:if>
                            </table>

                            <div class="form-footer">
                                <button class="botoes">EDITAR<span class="fa fa-thumbs-o-up"></span></button>

                                <form class="excluirUsu" action="${pageContext.request.contextPath}/ExcluirUsuario" method="post">
                                    <button class="botoes" type="submit" >EXCLUIR<span class="fa fa-ban"></span></button>
                                </form>
                            </div>
                        </form>
                    </div>  
                </div>

                <div class="grid_3 prefix_1">

                    <h5 class="opcao">Opção </h5>
                    <ul class="list">
                        <li><a href="${pageContext.request.contextPath}/cadastrarUsuario.jsp">Cadastrar</a></li>
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
