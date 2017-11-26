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
                                <li id="menu_blockHome"><a href="${pageContext.request.contextPath}/homeUsuario.jsp">HOME</a></li>                                
                                <li id="menu_blockCliente"><a href="${pageContext.request.contextPath}/cadastrarClienteUsuario.jsp">Cliente</a></li>                                
                                
                                <li class="current"><a href="${pageContext.request.contextPath}/reservaVooUsuario.jsp" 
id="menu_blockReserva" >Reserva</a></li>
                               
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
                        <div >
                            <label class="resumo-form" id="tituloResumo">Voo</label>


                        </div>
                        <br>

                        <div >
                            <label class="resumo-form">Aeroporto de Origem:</label>
                            <label class="resumo-form">Congonhas</label>
                             
                            
                           
                        </div>

                        <div>
                            <label class="resumo-form">Aeroporto de Destino:</label>
                             <label class="resumo-form">Alagoinhas</label>
                         

                        </div>
                        <div>
                            <label class="resumo-form">Data de Origem:</label>
                            <label class="resumo-form">11/12/2017</label>
                            </div>
                        <div>
                            <label class="resumo-form">Data de Destino:</label>
                            <label class="resumo-form">20/12/2017</label>
                            </div>    
                        
                        <div >
                            <label class="resumo-form">Horário de ida:</label>
                            <label class="resumo-form-2" id="result">11:30</label>

                        </div>

                        <div >
                            <label class="resumo-form">Horário de volta:</label>

                            <label class="resumo-form-2" id="result">13:00</label>   
                        </div>
                        <br>
                        <div>
                            <label class="resumo-form" id="tituloResumo">Dados dos Passageiros</label>

                        </div>
                        <br>

                        <div >                      

                            <label class="resumo-form">Nome: </label>  

                            <label class="resumo-form" id="result">Joaquim Barbosa Filho</label>                                 

                        </div>

                        <div >   
                            <label class="resumo-form">Assentos de Origem: </label> 
                            <label class="resumo-form" id="result">E06</label> 
                        </div>
                        <div >   
                            <label class="resumo-form">Assentos de Destino: </label>
                            <label class="resumo-form" id="result">B01</label> 
                        </div>
                        <div >  
                            <label class="resumo-form">Bagagem: </label>
                            <label class="resumo-form" id="result">5kg - R$ 20,90</label>
                        </div>
                        <br>
                         

                        <div >                      

                            <label class="resumo-form">Nome: </label>  

                            <label class="resumo-form" id="result">Stefano Santos Teixeira</label>                                 

                        </div>

                        <div >   
                            <label class="resumo-form">Assentos de Origem: </label> 
                            <label class="resumo-form" id="result">C25</label> 
                        </div>
                        <div >   
                            <label class="resumo-form">Assentos de Destino: </label>
                            <label class="resumo-form" id="result">H01</label> 
                        </div>
                        <div >  
                            <label class="resumo-form">Bagagem: </label>
                            <label class="resumo-form" id="result">20kg - R$ 79,90</label>
                        </div>
                        
                        <br>

                        <div>
                            <label class="resumo-form" id="tituloResumo">Dados de Pagamento</label>


                        </div>
                        <br>


                        <div>

                            <label class="resumo-form">Nome Completo do Pagante:</label>
                            <label class="resumo-form" id="result">Clebeson Vieira Lima</label>


                        </div>

                        <div >
                            <label class="resumo-form">Forma de Pagamento: </label>
                              <label class="resumo-form" id="result">Boleto bancário</label>


                        </div>


                        <div>
                            <label class="resumo-form">Nivel da Milhagem: </label>
                             <label class="resumo-form" id="result">Cliente Pombo </label>


                        </div>

                        <div >

                            <label class="resumo-form">Valor Total: </label>
                            <label class="resumo-form" id="result"> R$ 400,00</label>

                        </div>

                        <div >

                            <label class="resumo-form">Pontos: </label>
                            <label class="resumo-form" id="result">50</label>

                        </div>
                    </div>



                    <br>





                    <form class="signup" action="#" method="post">
                        
                        
                       
                        <div class="form-footer">

                            <button class="botoes">VOLTAR<span class="fa fa-ban"></span></button>
                            


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
