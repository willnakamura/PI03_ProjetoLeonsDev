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

        <title>Editar Usuario</title>

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
        <script src="${pageContext.request.contextPath}/js/limitarCampos.js"></script>

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
                                <li class="current"><a href="${pageContext.request.contextPath}/cadastrarUsuario.jsp">Usuario</a></li>
                                <li><a href="${pageContext.request.contextPath}/reserVoo.jsp">Reserva</a></li>
                                <li><a href="${pageContext.request.contextPath}/relatorioReserva.jsp">Relatório</a></li>
                            </ul>
                        </nav>
                        <div class="clear"></div>
                    </div>
                </div>
               <div class="grid_12">
                   <div id="logo">
                        <a  href="#">
                            <img src="${pageContext.request.contextPath}/images/logo.png" alt="Your Happy Family">
                        </a>
                    </div>
                </div>

            </div>
             <form action="${pageContext.request.contextPath}/Logout" method="post">
                <div class="form-footer" id="logout">

                    <button class="botoesLogout" type="submit">logout</button>

                </div>
            </form>
                        
        </header>
        <!--==============================Content=================================-->
        <div class="content"><div class="ic"></div>

            <div class="container_12">

                <div class="grid_8">

                    <div class="tituloCliente">
                        <h5 class="opcao">EDITAR USUARIO </h5>
                    </div>
                    
                    <div class="box">
                                                    
                        <form class="signup" action="${pageContext.request.contextPath}/AtualizarUsuario" method="post">
                            <BR>

                            <div class="form-body">
                                <div class="row">
                                    <input style="visibility: hidden" type="text" placeholder="id*" name="id-usua" value="${sessionScope.usuario.id}">
                                </div>  
                                
                                <div class="row">
                                    <input type="text" placeholder="Nome*" name="nome-usua" value="${sessionScope.usuario.nome}">
                                    <input type="text" placeholder="Sobrenome*" name="sobrenome-usua" value="${sessionScope.usuario.sobrenome}">
                                </div>  
                                <div class="row">
                                    <input type="number" id="validadorCpf" placeholder="cpf*"  id="validadorCpf" onkeydown="limita(this);" onkeyup="limita(this);" name="cpf-usua" value="${sessionScope.usuario.cpf}">
                                 <select id="format-slc-usua" name="cargo-usua">
                                    <option >Selecione o cargo</option>
                                    <option >Gerente</option>
                                    <option >Vendedor</option>
                                                                       
                                </select>
                                </div>
                                <div class="row">
                                    <input type="text" placeholder="Email*" name="email-usua" value="${sessionScope.usuario.email}">
                                </div>
                                <div class="row">
                                    <input type="text" placeholder="Login*" name="login-usua"  value="${sessionScope.usuario.login}">
                                     <input type="text" placeholder="Senha*" name="senha-usua" value="${sessionScope.usuario.senha}"> 
                                </div>   
                                
                                <div class="row">
                                    <c:if test="${not empty requestScope.erroAtualizar}">
                                        <p class="error"><c:out value="${requestScope.erroAtualizar}"/></p>
                                    </c:if>
                                </div>
                             
                            </div>
                            
                              <div class="form-footer">

                                <button class="botoes"><a href="${pageContext.request.contextPath}/consultarUsuario.jsp">CANCELAR</a><span class="fa fa-ban"></span></button>

                                <button class="botoes" type="submit">SALVAR<span class="fa fa-thumbs-o-up"></span></button>

                            </div>
                        </form>
                         </div>  


                </div>



                <div class="grid_3 prefix_1">
                    <h5 class="opcao">Opção </h5>
                    <ul class="list">
                        <li><a href="#">Cadastrar</a></li>
                        <li><a href="consultarUsuario.jsp">Consultar</a></li>


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
