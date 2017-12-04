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

        <title>Reserva pagamento usuário</title>

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
                                <li id="menu_blockHome" class="current"><a href="${pageContext.request.contextPath}/homeUsuario.jsp">HOME</a></li>                                
                                <li 
id="menu_blockCliente"><a href="${pageContext.request.contextPath}/cadastrarClienteUsuario.jsp">Cliente</a></li>                                
                                
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
                        <h5 class="opcao">PAGAMENTO </h5>
                    </div>

                    <div class="card-form">
                        <form class="signup" action="${pageContext.request.contextPath}/PagamentoReserva" method="post">
                            
                            <div class="row">
                                <c:if test="${not empty requestScope.erroPagamento}">
                                    <p class="error"><c:out value="${requestScope.erroPagamento}"/></p>
                                </c:if>
                            </div>
                            
                            <div class="busca">
                                <input type="text" id="pagador" name="nomePagador" readonly="readonly" value="${sessionScope.nomePagador}">
                            </div>

                            <div class="form-body">
                                <div class="row">
                                    <select class="pagamento" name="pagamento">  
                                        <option value="Selecione">Forma de Pagamento</option>
                                        <option value="crédito">Crédito</option>
                                        <option value="Débito">Débito</option>
                                        <option value="Dinheiro">Dinheiro</option>
                                    </select>
                                </div>  

                                <div class="row">
                                    <input type="text" name="total" value="${sessionScope.custoTotal}" readonly="readonly">
                                </div>

                            </div>

                            <div class="form-footer">
                                
                                <button class="botoes" type="submit">FINALIZAR<span class="fa fa-thumbs-o-up"></span></button>

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
