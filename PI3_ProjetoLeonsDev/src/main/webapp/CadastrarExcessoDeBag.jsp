<%-- 
    Document   : index
    Created on : 10/10/2017, 17:35:20
    Author     : Nakamura-PC
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
                        <nav id="menu">
                            <ul>
                                <li><a href="home.jsp" class="nav1">Home</a></li>
                                <li><a href="#" class="nav2">Clientes </a>
                                    <ul>
                                      <li><a href="CadastraCliente.jsp" class="nav22" id="submenu-clientes-consulta">Cadastra </a></li>
                                        <li><a href="ConsultarCliente.jsp" class="nav22" id="submenu-clientes-consulta">Consulta </a></li>
                                    </ul>
                                </li>
                                
                                <li><a href="#" class="nav3">Usuarios</a>
                                    <ul>
                                        <li><a href="CadastrarUsuario.jsp" class="nav33" id="submenu-usuarios-cadastrar">Cadastrar  </a></li>
                                        <li><a href="ConsultarUsuario.jsp" class="nav33" id="submenu-usuarios-consulta">Consultar  </a></li>
                                    </ul>
                                </li>                                
                                
                                <li><a href="#" class="nav4">Serv. Bordo</a>
                                    <ul>
                                                  <li><a href="ServBordo.jsp" class="nav44" id="submenu-servBordo-cadastrar">Cadastrar</a></li>
                                                <li><a href="ConsultarServicoBordo.jsp" class="nav44" id="submenu-servBordo-consulta">Consultar</a></li>
                                            </ul>
                                </li>
                                    <li><a href="#" class="nav5">Excesso de Bag</a>
                                    <ul>
                                               
                                                <li><a href="ConsultarExecessoDeBag" class="nav55" id="submenu-excessoBag-cadastrar">Consultar</a></li>
                                            </ul>
                                    </li>
                                        <li><a href="#" class="nav6">Assentos</a>
                                        <ul>
                                                <li><a href="#" class="nav66" id="submenu-Assentos-cadastrar">Cadastrar</a></li>
                                                <li><a href="#" class="nav66" id="submenu-Assentos-consultar">Consultar</a></li>
                                            </ul>
                                        </li>
                                   
                                </li>
                                
                                <li ><a href="#" class="nav7">Reserva</a>
                                    <ul>
                                       <li><a href="#" class="nav77" id="subdosubmenu-Reserva-Consultar" >Cadastrar Reservas </a></li>
                                        <li><a href="#" class="nav77" id="subdosubmenu-FazerReserva-Consultar" >Consultar Reservas </a></li>
                                    </ul>
                                </li>
                                
                                 <li ><a href="#" class="nav8" >Voos e tarifas</a>
                                    <ul>
                                      <li><a href="#" class="nav88" id="subdosubmenu-VooETarifas-Consultar">Consultar Voos e Tarifas </a></li>
                                    </ul>
                                </li>
                                
                                  <li><a href="#" class="nav8" >Relatorio</a></li>
                                
                                
                            </ul>
                        </nav>
                    </nav>
                   
                   <div class="conteudo"> 
                   
                <h5>Cadastro de Execesso de Bag</h5>

                <label for="nomeResponsavel"  class="label-cadastro-nomeResponsavel">Responsavel</label>
                <input type="text"  name="nomeresponsavel" value="nomeExcessoBag" class="input-cadastro-name"/>               
                </br></br>
                <label for="pesoExcessoBag" class="label-cadastro-Peso ">Peso</label>
                <input type="number" name="pesoExcessoBag" value="pesoExcessoBag" class="input-cpf"/>
                </br></br>
                <label for="qtdPaxExcessoBag" class="label-cadastro-qtdPax">Quantidade por Pax</label>
                <input type="number" name="qtdPaxExcessoBag" class="input-cadastro-qtdPaxExcessoBag"/>
                   
                </br></br>
                <div>
                    <button> Voltar </button>
                    <button> Cadastrar </button>
                </div>
                
            </form>
                </div>    
                    
                </header>
                <!-- / header -->
                <!-- content -->
                
                <!-- / content -->
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
