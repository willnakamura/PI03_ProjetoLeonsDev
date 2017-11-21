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

        <title>Passageiros</title>

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
                                <li><a href="${pageContext.request.contextPath}/usuario-cadastrar.jps">Usuário</a></li>
                                 <li class="current"><a href="${pageContext.request.contextPath}/reservaVoo.jsp">Reserva</a></li>
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
        <div class="content">

            <div class="container_12">

                <div class="grid_8">

                    <div class="tituloCliente">
                        <h5 class="opcao">SELECIONAR PASSAGEIROS</h5>
                    </div>

                    <div class="card-form">
                        <form class="signup" action="${pageContext.request.contextPath}/PassageirosReserva" method="post">
                            <BR>

                            <div class="form-body">
                                <div class="row">
                                    <input type="text" placeholder="Nome*" name="nome-pass-selecionar">
                                    <input type="text" placeholder="Sobrenome*" name="sobreNome-pass-selecionar">
                                </div>
                                
                                <div class="row">
                                    <input type="number" placeholder="cpf*" name="cpf-pass-selecionar">
                                    <input type="date" placeholder="" name="dtNasc-pass-selecionar"> 
                                </div>

                                <div class="row">
                                    <input type="text" placeholder="Email*" name="email-pass-selecionar">     
                                </div>
                                
                                <div class="row">
                                    <select class="assentos" name="assentosPassageiro">           
                                        <option value="selecione">Selecione seu assento!</option>
                                        <c:forEach items="${sessionScope.assentosLista}" var="a">
                                            <option>${a}</option>                                            
                                        </c:forEach>
                                    </select>
                                </div>

                            </div>

                            <div class="imagem">
                                <img id="imagemMapa" src="${pageContext.request.contextPath}/images/mapa.png" >
                            </div>

                            <div class="form-footer">

                                <button class="botoes">VOLTAR<span class="fa fa-ban"></span></button>
                                <button class="botoes" type="submit">PROXIMO<span class="fa fa-thumbs-o-up"></span></button>

                            </div> 
                        </form>

                    </div>
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
