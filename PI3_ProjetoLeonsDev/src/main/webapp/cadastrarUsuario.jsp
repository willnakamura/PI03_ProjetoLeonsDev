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
                                <li class="current"><a href="${pageContext.request.contextPath}/cadastrarUsuario.jsp">Usuario</a></li>
                                <li><a href="${pageContext.request.contextPath}/reservaVoo.jsp">Reserva</a></li>
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
        </header>
        <!--==============================Content=================================-->
        <div class="content"><div class="ic"></div>

            <div class="container_12">

                <div class="grid_8">

                    <div class="tituloCliente">
                        <h5 class="opcao">USUARIO</h5>
                    </div>

                    <div class="card-form">
                        <form class="signup" action="${pageContext.request.contextPath}/cadastro-usuario" method="post">
                            <div class="row">
                                <c:if test="${not empty requestScope.sucessCadastro}">
                                    <p class="sucess"><c:out value="${requestScope.sucessCadastro}"/></p>
                                </c:if>
                            </div>

                            <div class="row">
                                <c:if test="${not empty requestScope.erroCadastro}">
                                    <p class="error"><c:out value="${requestScope.erroCadastro}"/></p>
                                </c:if>
                            </div>

                            <div class="form-body">
                                <div class="row">
                                    <input type="text" value="${requestScope.usuRepreenche.nome}" placeholder="Nome*" name="nome-usua">
                                    <input type="text" value="${requestScope.usuRepreenche.sobrenome}" placeholder="Sobrenome*" name="sobreNome-usua">
                                </div>  
                                <div class="row">
                                    <input type="number" value="${requestScope.usuRepreenche.cpf}" placeholder="cpf*" name="cpf-usua">

                                    <select id="format-slc-usua" name="cargo-usua">
                                        <c:choose>
                                            <c:when test="${not empty requestScope.usuRepreenche.cargo}">
                                                <option value="${requestScope.usuRepreenche.cargo}">${requestScope.usuRepreenche.cargo}</option>
                                            </c:when>

                                            <c:otherwise>
                                                <option value="Selecione o cargo">Selecione o cargo</option>
                                            </c:otherwise>
                                        </c:choose>
                                        <option value="Gerente">Gerente</option>
                                        <option value="Vendedor">Vendedor</option>

                                    </select>
                                </div>
                                <div class="row">
                                    <input type="text" value="${requestScope.usuRepreenche.email}" placeholder="Email*" name="email-usua">
                                </div>
                                <div class="row">
                                    <input type="text" value="${requestScope.usuRepreenche.login}" placeholder="Login*" name="login-usua">
                                    <input type="text" value="${requestScope.usuRepreenche.senha}" placeholder="Senha*" name="senha-usua"> 
                                </div>  


                                <div class="form-footer">
                                    <button class="botoes">CANCELAR<span class="fa fa-ban"></span></button>
                                    <button class="botoes" type="submit">SALVAR<span class="fa fa-thumbs-o-up"></span></button>
                                </div>

                            </div>
                        </form>

                    </div>





                </div>



                <div class="grid_3 prefix_1">
                    <h5 class="opcao">Opção </h5>
                    <ul class="list">
                        <li><a href="#">Cadastrar</a></li>
                        <li><a href="${pageContext.request.contextPath}/consultarUsuario.jsp">Consultar</a></li>


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
