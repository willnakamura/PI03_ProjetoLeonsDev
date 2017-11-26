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
                        <h5 class="opcao">resumo da compra</h5>
                    </div>

                    <div class="resumo">
                        <div >
                            <label class="resumo-form"> Status da Reserva: </label> 
                            <label class="resumo-form" id="result">Ativo</label>

                        </div>
                        <br>

                        <div>
                            <label class="resumo-form" id="tituloResumo">Voo de ida</label>
                        </div>
                        <br>

                        <div >
                            <label class="resumo-form">Aeroporto de Origem: </label>
                            <label class="resumo-form">${sessionScope.VooIdaReservaFinal.aeroportoPartida}</label>
                        </div>

                        <div>
                            <label class="resumo-form">Aeroporto de Destino:</label>
                            <label class="resumo-form">${sessionScope.VooIdaReservaFinal.aeroportoChegada}</label>
                        </div>

                        <div>
                            <label class="resumo-form">Data de Origem:</label>
                            <label class="resumo-form">${sessionScope.VooIdaReservaFinal.dataVoo}</label>
                        </div>
                        <!--<div>
                            <label class="resumo-form">Data de Destino:</label>
                            <label class="resumo-form">20/12/2017</label>
                        </div>-->    
                        <div>
                            <label class="resumo-form">Horário de Partida:</label>
                            <label class="resumo-form-2" id="result">${sessionScope.VooIdaReservaFinal.horaPartida}</label>

                        </div>

                        <div >
                            <label class="resumo-form">Horário de Chegada:</label>

                            <label class="resumo-form-2" id="result">${sessionScope.VooIdaReservaFinal.horaChegada}</label>   
                        </div>
                        <br>

                        <c:if test="${not empty sessionScope.VooVoltaReservaFinal}" >
                             <div>
                            <label class="resumo-form" id="tituloResumo">Voo de Volta</label>
                        </div>
                        <br>
                            
                            <div >
                                <label class="resumo-form">Aeroporto de Origem: </label>
                                <label class="resumo-form">${sessionScope.VooVoltaReservaFinal.aeroportoPartida}</label>
                            </div>

                            <div>
                                <label class="resumo-form">Aeroporto de Destino:</label>
                                <label class="resumo-form">${sessionScope.VooVoltaReservaFinal.aeroportoChegada}</label>
                            </div>

                            <div>
                                <label class="resumo-form">Data de Origem:</label>
                                <label class="resumo-form">${sessionScope.VooVoltaReservaFinal.dataVoo}</label>
                            </div>
                            <!--<div>
                                <label class="resumo-form">Data de Destino:</label>
                                <label class="resumo-form">20/12/2017</label>
                            </div>-->    
                            <div>
                                <label class="resumo-form">Horário de Partida:</label>
                                <label class="resumo-form-2" id="result">${sessionScope.VooVoltaReservaFinal.horaPartida}</label>

                            </div>

                            <div >
                                <label class="resumo-form">Horário de Chegada:</label>
                                <label class="resumo-form-2" id="result">${sessionScope.VooVoltaReservaFinal.horaChegada}</label>   
                            </div>
                            <br>
                        </c:if>



                        <div>
                            <label class="resumo-form" id="tituloResumo">Dados dos Passageiros</label>
                        </div>
                        <br>

                        <c:if test="${not empty sessionScope.Passageiro1}">
                            <div >                      
                                <label class="resumo-form">Nome: </label>  

                                <label class="resumo-form" id="result">${sessionScope.Passageiro1.nome} ${sessionScope.Passageiro1.sobrenome}</label>                                 

                            </div>

                            <div >   
                                <label class="resumo-form">Assento do voo de ida: </label> 
                                <label class="resumo-form" id="result">${sessionScope.assentoPass1}</label> 
                            </div>

                            <c:if test="${not empty sessionScope.assentoPass1Volta}">
                                <div>   
                                    <label class="resumo-form">Assento do voo de Volta: </label>
                                    <label class="resumo-form" id="result">${sessionScope.assentoPass1Volta}</label> 
                                </div>
                            </c:if>
                            <div>  
                                <label class="resumo-form">Bagagem: </label>
                                <label class="resumo-form" id="result">${sessionScope.Servico.extraBag} - R$ ${sessionScope.Servico.preco}</label>
                            </div>
                            <br>
                        </c:if>
                        <c:if test="${not empty sessionScope.Passageiro2}">
                            <div >                      
                                <label class="resumo-form">Nome: </label>  

                                <label class="resumo-form" id="result">${sessionScope.Passageiro2.nome} ${sessionScope.Passageiro2.sobrenome}</label>                                 

                            </div>

                            <div >   
                                <label class="resumo-form">Assento do voo de ida: </label> 
                                <label class="resumo-form" id="result">${sessionScope.assentoPass2}</label> 
                            </div>

                            <c:if test="${not empty sessionScope.assentoPass2Volta}">
                                <div>   
                                    <label class="resumo-form">Assento do voo de Volta: </label>
                                    <label class="resumo-form" id="result">${sessionScope.assentoPass2Volta}</label> 
                                </div>
                            </c:if>
                            <div>  
                                <label class="resumo-form">Bagagem: </label>
                                <label class="resumo-form" id="result">${sessionScope.Servico.extraBag} - R$ ${sessionScope.Servico.preco}</label>
                            </div>
                            <br>
                        </c:if>
                        <c:if test="${not empty sessionScope.Passageiro2}">
                            <div >                      
                                <label class="resumo-form">Nome: </label>  

                                <label class="resumo-form" id="result">${sessionScope.Passageiro3.nome} ${sessionScope.Passageiro3.sobrenome}</label>                                 

                            </div>

                            <div >   
                                <label class="resumo-form">Assento do voo de ida: </label> 
                                <label class="resumo-form" id="result">${sessionScope.assentoPass3}</label> 
                            </div>

                            <c:if test="${not empty sessionScope.assentoPass3Volta}">
                                <div>   
                                    <label class="resumo-form">Assento do voo de Volta: </label>
                                    <label class="resumo-form" id="result">${sessionScope.assentoPass3Volta}</label> 
                                </div>
                            </c:if>
                            <div>  
                                <label class="resumo-form">Bagagem: </label>
                                <label class="resumo-form" id="result">${sessionScope.Servico.extraBag} - R$ ${sessionScope.Servico.preco}</label>
                            </div>
                            <br>
                        </c:if>



                        <div>
                            <label class="resumo-form" id="tituloResumo">Dados do Cliente e de Pagamento</label>
                        </div>
                        <br>


                        <div>

                            <label class="resumo-form">Nome Completo do Cliente</label>
                            <label class="resumo-form" id="result">${sessionScope.ReservaFinal.cliente.nome} ${sessionScope.ReservaFinal.cliente.sobrenome}</label>


                        </div>

                        <div >
                            <label class="resumo-form">Forma de Pagamento: </label>
                            <label class="resumo-form" id="result">${sessionScope.ReservaFinal.formaPgto}</label>


                        </div>


                        <div>
                            <label class="resumo-form">Nivel do Cliente: </label>
                            <label class="resumo-form" id="result">${sessionScope.ReservaFinal.cliente.nivel}</label>


                        </div>

                        <div >

                            <label class="resumo-form">Valor Total: </label>
                            <label class="resumo-form" id="result"> R$ ${sessionScope.ReservaFinal.custoTotal}</label>

                        </div>
                            
                        <div>
                            <label class="resumo-form">Desconto: </label>
                            <label class="resumo-form" id="result">${sessionScope.desconto}</label>
                        </div>    
                            
                        <div>
                            <label class="resumo-form">Pontos: </label>
                            <label class="resumo-form" id="result">50</label>
                        </div>
                    </div>



                    <br>





                    <form class="signup" action="#" method="post">



                        <div class="form-footer">
                            <button class="botoes">HOME<span class="fa fa-ban"></span></button>
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
