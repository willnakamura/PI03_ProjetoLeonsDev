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
                                <li id="menu_blockHome"><a href="${pageContext.request.contextPath}/home.jsp">HOME</a></li>                                
                                <li id="menu_blockCliente"><a href="${pageContext.request.contextPath}/cadastrarCliente.jsp">Cliente</a></li>                                
                                
                                <li class="current"><a href="${pageContext.request.contextPath}/reservaVoo.jsp" id="menu_blockReserva">Reserva</a></li>
                                
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

        <div class="content"><div class="ic"></div>

            <div class="container_12">
                <div class="grid_8">
                    <div class="tituloCliente">

                        <h5 class="">CONSULTAR RESERVA</h5>

                    </div>                    

                    <form class="buscaCliente" action="${pageContext.request.contextPath}/RelatorioReserva" method="post">
                        

                        <div class="row">

                            <div class="busca"><input type="text"  id="busca1" placeholder="informe o codigo de busca" name="buscaCodigo"> <button id="botoesBusca" type="submit">BUSCAR</button></div>
                        </div>
                      
                        
                    </form>

                    <form class="editCli" action="#" method="post">

                        <div id="bg"></div>
                        <table>
                            <tr>
                                
                                <th>Data Reserva</th>                                
                                <th>TickerCode</th>       
                                <th>Nome do Passageiro</th>
                                <th>Ultimo Nome do Passageiro</th>
                                <th>Data de Partida</th>
                                <th>Nº Voo</th>                                
                                <th>Hora Voo</th>
                                <th>Aeroporto Origem</th>
                                <th>Aeroporto Destino</th>
                                <th>Assento</th>
                            </tr> 
                            
                            
                                <c:forEach var="reservaConsultaRetornaVoo" items="#">    
                                    <tr>
                                        <td><input type="radio" value="#" name="selecionarRes" /></td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                    </tr>
                                </c:forEach>

                        </table>
                        
                          <div class="form-footer">

                                <button class="botoes">CANCELAR<span class="fa fa-ban"></span></button>
                                <button class="botoes" type="submit">EXCLUIR<span class="fa fa-ban"></span></button>

                         </div>

                    </form>
                </div>
                <div class="grid_3 prefix_1">
                    <h5 class="opcao">Opção</h5>
                    <ul class="list">
                        <li><a href="${pageContext.request.contextPath}/reservaPagamentoUsuario.jsp">Reserva</a></li>
                        <li  class="current"><a href="#">Consultar</a></li>

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
