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

        <title>Resumo da Compra</title>

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
                        <h5 class="opcao">resumo da compra</h5>
                    </div>


                    <div class="card-form">
                        <form class="buscaCli" action="#" method="#">
                            <div class="busca"><input type="text" id="busca1ResumoCompra" placeholder="Localizador" name="locazador"> <button id="botoesBusca" type="submit">BUSCAR</button>
                            </div>

                        </form>
                    </div>

                    <br><br>


                    <div class="card-form">



                        <form class="signup" action="#" method="post">

                            <div class="row">
                                <input class="status" type="text" name="statusReserva" placeholder="Status da Reserva" readonly="readonly"/>

                            </div>
                            <br><br>
                            <div class="row">
                                <label >Dados do Voo</label>


                            </div>

                            <br>

                            <div class="row">
                                <input type="text" name="origem-voo" placeholder="Aeroporto de Origem" readonly="readonly"/>
                                <input type="text"  name="dataOrigem" placeholder="Data de Origem" readonly="readonly"/>

                            </div> 
                            <div class="row">
                                <input type="text" name="destino-voo" placeholder="Aeroporto de Destino" readonly="readonly"/>
                                <input type="text"  name="dataDestino" placeholder="Data de Destino" readonly="readonly"/>

                            </div>

                            <br>                           

                            <div class="row">
                                <label >Horário de ida&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>

                                <label >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Horário de volta</label>
                            </div>


                            <div class="row">

                                <input type="text"  name="data-ida-voo" placeholder="11:30" readonly="readonly"/>
                                <input type="text"  name="data-volta-voo" placeholder="13:00" readonly="readonly"/>    
                            </div>
                            <br>
                            <br>
                            <div class="row">
                                <label >Dados dos Passageiros</label>


                            </div>

                            <div class="row">                       

                                <table class="tabelaResumo">
                                    <tr>

                                        <th>Nome</th>                                
                                        <th>Assentos de Origem</th>       
                                        <th>Assentos de Destino</th>
                                        <th>Bagagem</th>

                                    </tr>    
                                    <tr>
                                        <td>Felipe</td>
                                        <td>E12</td>
                                        <td>B7</td>
                                        <td>5kg - R$ 20,90</td>
                                    </tr>



                                </table>

                            </div>
                            <br><br>
                            <div class="row">
                                <label >Dados dos Passageiros</label>


                            </div>

                            <br>
                            <div class="row">

                                <input type="text"  name="nomePagante" placeholder="Nome Completo do Pagante" readonly="readonly"/>


                            </div>

                            <div class="row">
                                <input type="text"  name="formaPagamento" placeholder="FormadePagamento" readonly="readonly"/>
                                <input type="text"  name="valorTotal" placeholder="Valor Total" readonly="readonly"/>


                            </div>

                            <div class="row">
                                <input type="text"  name="nivelMilhagem" placeholder="Nivel da Milhagem" readonly="readonly"/>
                                <input type="text"  name="pontos" placeholder="Pontos" readonly="readonly"/>

                            </div>
                            <br>



                            <div class="form-footer">

                                <button class="botoes">VOLTAR<span class="fa fa-ban"></span></button>
                                <button class="botoes" type="submit">FINALIZAR<span class="fa fa-thumbs-o-up"></span></button>


                            </div>

                        </form>
                    </div>
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
