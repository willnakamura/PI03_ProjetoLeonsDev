<%-- 
    Document   : AssentoEspecial
    Created on : 10/10/2017, 21:39:02
    Author     : mariana.protiroti
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
                        
                        <h1><a href="index.html" id="logo">Around the World</a></h1>
                        
                        <div class="right">
                            <div class="wrapper">
                                <form id="search" action="" method="post">
                                    <div class="bg">
                                        <input type="submit" class="submit" value="">
                                        <input type="text" class="input">
                                    </div>
                                </form>
                            </div>
                            <div class="wrapper">
                                <nav>
                                    <ul id="top_nav">
                                        <li><a href="#">Register</a></li>
                                        <li><a href="#">Log In</a></li>
                                        <li><a href="#">Help</a></li>
                                    </ul>
                                </nav>
                            </div>	
                        </div>
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
                <div class="AssentoEspecial">    
                    <h3><div class="titulos"><label>Cadastrar Assento Especial</label></div></h3>    
                    
                    <label class="fileira">Fileira: </label>
                    <input type="text" name="fileira" value="q_fileira"/>
                    </br></br>
                    <label for="Preco">Preço: </label>
                    <input type="text" name="Preco" value="q_Preco"/>
                    </br></br>
                    <label for="Nr_voo">Número do Voo: </label>
                    <input type="text" name="Nr_voo" value="q_Nr_voo"/>
                    </br></br>
                    <label for="Aeroporto_Partida">Aeroporto de Origem: </label>
                    <input type="text" name="Aeroporto_Partida" value="q_Aeroporto_Partida"/>
                    </br></br>
                    <label for="Aeroporto_Chegada">Aeroporto de Destino: </label>
                    <input type="text" name="Aeroporto_Chegada" value="q_Aeroporto_Chegada"/>
                    </br></br>
                    <button for="submit">Cadastrar</button>
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
