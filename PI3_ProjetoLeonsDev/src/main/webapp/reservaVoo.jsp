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

        <title>Voo</title>

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
        <script src="${pageContext.request.contextPath}/js/esconderData.js"></script>

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
                                <li><a href="${pageContext.request.contextPath}/cadastrarUsuario.jsp">Usuário</a></li>

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
            <form>
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
                        <h5 class="opcao">VOO</h5>
                    </div>

                    <div class="card-form">
                        <form class="signup" action="${pageContext.request.contextPath}/VooReserva" method="post">

                            <div class="row">
                                <c:if test="${not empty requestScope.erroTelaVoo}">
                                    <p class="error"><c:out value="${requestScope.erroTelaVoo}"/></p>
                                </c:if>
                            </div>
                            
                            <div class="row">
                                <!--<input type="text" name="origem-voo" placeholder="Aeroporto de Origem" />-->

                                <select class="aeroportoFormat" name="origemVoo">
                                    <option>Selecione o aeroporto de origem</option>
                                    <c:forEach items="${sessionScope.ListaAeroportos}" var="aeroportos">
                                        <option>${aeroportos}</option>
                                    </c:forEach>
                                </select>
                            </div> 
                            <div class="row">
                                <!--<input type="text" name="destino-voo" placeholder="Aeroporto de Destino" />-->
                                <select class="aeroportoFormat" name="destinoVoo">
                                    <option>Selecione o aeroporto de destino</option>
                                    <c:forEach items="${sessionScope.ListaAeroportos}" var="aeroportos">
                                        <option>${aeroportos}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="row">
                                <input  type="radio" id="IdaeVolta" onclick="mostrar()" value="0" name="opcao" />
                                <label >Ida e Volta</label>
                                <input  type="radio" id="SoIda" onclick="ocultar()" value="1" name="opcao"/>
                                <label >Só Ida</label>
                            </div>
                            <br><br>                           

                            


                            <div class="row" >

                                <input type="date"  name="data-ida-voo" max="2999-12-31" id="dataidavoo"  class="dataidavoo" />
                                
                                <input type="date" id="ocultarData" max="2999-12-31" name="data-volta-voo" class="datavoltavoo"/>
                                
                            </div>
                            <div class="row">                       

                                <select id="formatar"  name="qtdpax">
                                    <option>Quantidade de Passageiros</option>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                </select>
                                
                                <select id="formatar" class="bagagem" name="bagagem-voo">
                                    <option value="0Kg">Selecione Bagagem</option>
                                    <option value="5Kg">5kg - R$ 20,90</option>
                                    <option value="10Kg">10kg - R$ 39,90 </option>
                                    <option value="20Kg">20kg - R$ 79,90</option>
                                </select>

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
            });
        </script>
    </body>
</html>
