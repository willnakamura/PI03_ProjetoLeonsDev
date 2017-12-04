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

        <title>Cadastrar Cliente</title>

        <meta http-equiv="Content-Type" content="charset=UTF-8"/>
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
        <script src="${pageContext.request.contextPath}/js/limitarCampos.js"></script>
        <script src="${pageContext.request.contextPath}/js/limitarCamposOitoDigitos.js"></script>
         <script src="${pageContext.request.contextPath}/js/limitarCamposOnze.js"></script>

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
                                <li class="current"><a href="${pageContext.request.contextPath}/cadastrarCliente.jsp">Cliente</a></li>                                
                                <li><a href="${pageContext.request.contextPath}/cadastrarUsuario.jsp">Usuario</a></li>
                                <li><a href="${pageContext.request.contextPath}/reservaVoo.jsp">Reserva</a></li>
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
                        <h5 class="opcao">CADASTRAR CLIENTE </h5>
                    </div>

                    <div class="card-form">
                        <form class="signup"  action="${pageContext.request.contextPath}/cadastro-cliente" method="post">
                            <div class="row">
                                <c:if test="${not empty requestScope.sucessCadastro}">
                                    <p class="sucess"><c:out value="${requestScope.sucessCadastro}"/></p>
                                </c:if>
                            </div>

                            <div class="row">
                                <c:if test="${not empty requestScope.erroCadastro}">
                                    <p class="error"><c:out value="${requestScope.erroCadastro}"/></p>
                                </c:if>
                            </div>

                            <div class="form-body">
                                <div class="row">
                                    <input type="text" placeholder="Nome*" value="${requestScope.cliRepreenche.nome}" name="nome-cli">
                                    <input type="text" placeholder="Sobrenome*" value="${requestScope.cliRepreenche.sobrenome}" name="sobreNome-cli">
                                </div>  
                                <div class="row">
                                    <input type="number" placeholder="cpf*" id="validadorCpf" onkeydown="limita(this);" onkeyup="limita(this);" value="${requestScope.cliRepreenche.cpf}" name="cpf-cli"/>
                                </div>
                                <div class="row">
                                    <input type="text" placeholder="Email*" value="${requestScope.cliRepreenche.email}" name="email-cli">
                                </div>
                                <div class="row">
                                    <input type="number" placeholder="Inisira o Celular com DD" value="${requestScope.cliRepreenche.celular}"  onkeydown="limitaOnzeDigitos(this);" onkeyup="limitaOnzeDigitos(this);" name="celular-cli">       
                                </div>

                                <div class="row">
                                    <select class="sexo" name="sexo-cli">

                                        <c:choose>
                                            <c:when test="${not empty requestScope.cliRepreenche.genero}">
                                                <option value="${requestScope.cliRepreenche.genero}">${requestScope.cliRepreenche.genero}</option>
                                            </c:when>

                                            <c:otherwise>
                                                <option value="SelecioneSexo">Selecione</option>
                                            </c:otherwise>
                                        </c:choose>

                                        <option value="Masculino">Masculino</option>
                                        <option value="Feminino">Feminino</option>                               

                                    </select>
                                    
                                   
                                    <input type="date" value="${requestScope.cliRepreenche.dataNascimento}" id="dataCadsClient" max="2999-12-31" placeholder="" name="dtNasc-cli">   

                                </div>

                                <div class="row" >


                                    <select class="estado" name="estado-cli">

                                        <c:choose>
                                            <c:when test="${not empty requestScope.cliRepreenche.estado}">
                                                <option value="${requestScope.cliRepreenche.estado}">${requestScope.cliRepreenche.estado}</option>
                                            </c:when>

                                            <c:otherwise>
                                                <option value="selecione">Selecione</option>
                                            </c:otherwise>
                                        </c:choose>

                                        <option value="selecione">Estado</option>
                                        <option value="AC">AC</option>
                                        <option value="AL">AL</option>  
                                        <option value="AP">AP</option> 
                                        <option value="AM">AM</option> 
                                        <option value="BA">BA</option> 
                                        <option value="CE">CE</option>
                                        <option value="DF">DF</option> 
                                        <option value="ES">ES</option> 
                                        <option value="GO">GO</option> 
                                        <option value="MA">MA</option> 
                                        <option value="MT">MT</option> 
                                        <option value="MS">MS</option>
                                        <option value="MG">MG</option> 
                                        <option value="PA">PA</option> 
                                        <option value="PB">PB</option> 
                                        <option value="PR">PR</option>
                                        <option value="PE">PE</option> 
                                        <option value="PI">PI</option> 
                                        <option value="RJ">RJ</option> 
                                        <option value="RN">RN</option> 
                                        <option value="RS">RS</option> 
                                        <option value="RO">RO</option> 
                                        <option value="RR">RR</option> 
                                        <option value="SC">SC</option> 
                                        <option value="SP">SP</option> 
                                        <option value="SE">SE</option> 
                                        <option value="TO">TO</option>                                
                                    </select>
                                    <input type="text" placeholder="Cidade*" value="${requestScope.cliRepreenche.cidade}" name="cidade-cli">
                                </div>

                                <div class="row">
                                    <input type="number" placeholder="CEP*" value="${requestScope.cliRepreenche.cep}" onkeydown="limitaOitoDigitos(this);" onkeyup="limitaOitoDigitos(this);" name="cep-cli">
                                </div>
                                <div class="row">
                                    <input type="text" placeholder="Endereço*" value="${requestScope.cliRepreenche.endereco}" name="end-cli">
                                </div>



                            </div>

                            <div class="form-footer">

                             
                                <button class="botoes" type="submit">SALVAR<span class="fa fa-thumbs-o-up"></span></button>

                            </div>
                        </form>

                    </div>
                </div>
                <div class="grid_3 prefix_1">
                    <h5 class="opcao">Opção </h5>
                    <ul class="list">
                        <li><a href="#">Cadastrar</a></li>
                        <li><a href="${pageContext.request.contextPath}/consultarCliente.jsp">Consultar</a></li>


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
