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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_1.css">





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
                    <div class="menu_block" id="menu_block">
                        <nav class="horizontal-nav full-width horizontalNav-notprocessed">
                            <ul class="sf-menu" id="menu_blockul">
                                <li class="current" id="menu_blockHome"><a href="${pageContext.request.contextPath}/homeUsuario.jsp">HOME</a></li>                                
                                <li id="menu_blockCliente"><a href="${pageContext.request.contextPath}/cadastrarUsuaroUsuario.jsp">Cliente</a></li>                                
                              
                                 <li class="current"><a href="${pageContext.request.contextPath}/reservaVooUsuario.jsp" id="menu_blockReserva">Reserva</a></li>
                               
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
        <div class="content">

            <div class="container_12">

                <div class="grid_8">

                    <div class="tituloCliente">
                        <h5 class="opcao">CADASTRO DE PASSAGEIRO ${sessionScope.nPassPag} </h5>
                    </div>

                    <div class="card-form">
                        <form class="signup" action="${pageContext.request.contextPath}/PassageirosReserva" method="post">
                             <div class="row">
                                <c:if test="${not empty requestScope.erroPassageiro}">
                                    <p class="error"><c:out value="${requestScope.erroPassageiro}"/></p>
                                </c:if>
                            </div>

                            <div class="form-body">
                                <div class="row">
                                    <input type="text" placeholder="Nome*" name="nome-pass-selecionar">
                                    <input type="text" placeholder="Sobrenome*" name="sobreNome-pass-selecionar">
                                </div>
                                
                                <div class="row">
                                    <input type="number" placeholder="cpf*" id="validadorCpf" onkeydown="limita(this);" onkeyup="limita(this);"  name="cpf-pass-selecionar">
                                    <input type="date" max="2999-12-31" placeholder="" name="dtNasc-pass-selecionar"> 
                                </div>

                                <div class="row">
                                    <input type="text" placeholder="Email*" name="email-pass-selecionar">     
                                </div>
                                
                                <div class="row">
                                    <select class="assentos" name="assentosPassageiro">           
                                        <option value="selecione">Selecione o assento!</option>
                                        <c:forEach items="${sessionScope.assentosLista}" var="a">
                                            <option>${a.nAssento} - R$ ${a.preco}</option>                                            
                                        </c:forEach>
                                    </select>
                                </div>
                               
                            </div>
                             
                            <div class="imagem">
                                <label class="txtDescricao">assentos das fileiras 1, 2, 3 e 4 custam R$30. Exceto para clientes Pelicano e Águia </label>
                                <br><br>
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
