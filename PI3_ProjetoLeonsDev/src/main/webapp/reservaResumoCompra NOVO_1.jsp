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
        </header>
        <!--==============================Content=================================-->
        <div class="content">

            <div class="container_12">

                <div class="grid_8">

                    <div class="tituloCliente">
                        <h5 class="opcao">resumo da compra</h5>
                    </div>



                    <br>


                    <div class="card-form">



                        <form class="signup" action="#" method="post">

                            <div class="row">
                                <label class="resumo-form"> Status da Reserva: </label>

                            </div>

                            <br>

                            <div class="row">
                                <label class="resumo-form">Voo</label>


                            </div>

                      

                            <div class="row">
                                <label class="resumo-form">Aeroporto de Origem:</label>
                                <label class="resumo-form-2">Data de Origem:</label>

                            </div> 
                            <div class="row">
                                <label class="resumo-form">Aeroporto de Destino:</label>
                                <label class="resumo-form-2">Data de Destino:</label>

                            </div>

                            <br>                           

                            <div class="row">
                                <label class="resumo-form">Horário de ida:</label>
                                <label class="resumo-form-2">11:30</label>

                            </div>


                            <div class="row">
                                <label class="resumo-form">Horário de volta</label>

                                <label class="resumo-form-2">13:00</label>   
                            </div>
                            <br>
                            <br>
                            <div class="row">
                                <label class="resumo-form">Dados dos Passageiros</label>

                            </div>

                            <div class="row">                      

                                <label class="resumo-form">Nome: </label>                                

                            </div>

                            <div class="row">   
                                <label class="resumo-form">Assentos de Origem: </label>    
                            </div>
                            <div class="row">   
                                <label class="resumo-form">Assentos de Destino: </label>
                            </div>
                            <div class="row">  
                                <label class="resumo-form">Bagagem: </label>
                            </div>




                            <br><br>
                            <div class="row">
                                <label class="resumo-form">Dados de Pagamento</label>


                            </div>

                            
                            <div class="row">

                                <label class="resumo-form">Nome Completo do Pagante:</label>


                            </div>

                            <div class="row">
                                <label class="resumo-form">Forma de Pagamento: </label>
                              

                            </div>
                            

                            <div class="row">
                                <label class="resumo-form">Nivel da Milhagem: </label>
                                

                            </div>
                            
                             <div class="row">
                                
                                <label class="resumo-form">Valor Total: </label>

                            </div>
                            
                              <div class="row">
                               
                                <label class="resumo-form">Pontos: </label>

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
