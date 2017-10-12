<%-- 
    Document   : FazerReserva
    Created on : Oct 12, 2017, 2:30:02 PM
    Author     : mahperola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>

        <title>Home</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/zerogrid.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/responsive.css" type="text/css" media="all"> 

        <script type="text/javascript" src="js/jquery-1.4.2.js" ></script>
        <script type="text/javascript" src="js/cufon-yui.js"></script>
        <script type="text/javascript" src="js/cufon-replace.js"></script>  
        <script type="text/javascript" src="js/Myriad_Pro_600.font.js"></script>
        <script type="text/javascript" src="js/css3-mediaqueries.js"></script>

    </head>

    <body id="page1">
        <div class="extra">
            <div class="main zerogrid">
                <!-- header -->
                <header>
                    <div class="row">
                          <!-- INICIO PARTE DO LOGO -->
                        <h1><a href="index.html" id="logo">Around the World</a></h1>
                         <!-- FINAL PARTE DO LOGO -->
                        
                    </div>
                    <nav class="row">
                        <ul id="menu">
                            <li><a href="index.html" class="nav1">Home</a></li>
                            <li><a href="About.html" class="nav2">About Us </a></li>
                            <li><a href="Tours.html" class="nav3">Our Tours</a></li>
                            <li><a href="Destinations.html" class="nav4">Destinations</a></li>
                            <li class="end"><a href="contact.html" class="nav5">Contacts</a></li>
                           
                        </ul>
                    </nav>
                    <div class="FazerReserva">
                        <h3><label>Fazer Reservas</label></h3>
                        
                        <label for="Aeroporto_Partida">Aeroporto de Origem: </label>
                        <input type="text" name="Aeroporto_Partida" value="q_Aeroporto_Partida"/>
                        <label for="Aeroporto_Chegada">Aeroporto de Destino: </label>
                        <input type="text" name="Aeroporto_Chegada" value="q_Aeroporto_Chegada"/>
                        </br></br></br>
                        <input id="iv" type="radio" value="q_destino" name="destino"/>
                        <label for="iv">Ida e Volta</label>
                        <input id="vi" type="radio" value="q_origem" name="origem"/>
                        <label for="vi">Só Ida ou Volta</label>
                        </br></br></br>
                        <label for="Data_Criado">Data Ida: </label>
                        <input type="date" name="Data_Criado" value="q_Data_Criado"/>
                        <label for="Data_Alterado">Data Volta: </label>
                        <input type="date" name="Data_Alterado" value="q_Data_Alterado"/>
                        </br></br></br>
                        <label for="passageiro">Quantidade de Passageiros: </label>
                        <input type="number" name="passageiro" value="q_passageiro"/>
                        </br></br></br>
                        <label>Formas de Pagamento: </label>
                        <input id="credito" type="radio" value="q_Forma_Pgto" name="Forma_Pgto"/>
                        <label for="credito">Cartão de Crédito</label>
                        <input id="debito" type="radio" value="q_Forma_Pgto" name="Forma_Pgto"/>
                        <label for="debito">Cartão de Débito</label>
                        <input id="dinheiro" type="radio" value="q_Forma_Pgto" name="Forma_Pgto"/>
                        <label for="dinheiro">Dinheiro</label>
                        </br></br></br>
                        <label for="Custo_Total">Valor Total: </label>
                        <input type="text" name="Custo_Total" value="q_Custo_Total"/>
                        </br></br></br>
                        <button for="save">Salvar</button>
                        <button for="back">Voltar</button>
                               
                        
                    </div>    
                    
                    
                </header>
             
            </div>
            <div class="block"></div>
        </div>
        <div class="body1">
            <div class="main">
                <!-- footer -->
                <footer>
                    Designed by <a rel="nofollow" href="http://www.abc.com/" target="_blank">TemplateMonster</a> & <a href="https://www.zerotheme.com/" title="free website templates">ZEROTHEME</a>
                </footer>
                <!-- / footer -->
            </div>
        </div>
        <script type="text/javascript"> Cufon.now();</script>
    </body>
</html>

