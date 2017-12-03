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

        <title>Editar cliente</title>

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
        <script src="${pageContext.request.contextPath}/js/limitarCampos.js"></script>

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
                                <li><a href="${pageContext.request.contextPath}/relatorioReserva.jsp">Relátorio</a></li>
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
        <div class="content"><div class="ic"></div>

            <div class="container_12">

                <div class="grid_8">

                    <div class="tituloCliente">
                        <h5>EDITAR CLIENTE </h5>
                    </div>

                    <div class="box">                           

                        <form class="signup" action="${pageContext.request.contextPath}/AtualizarCliente" method="post">
                            <BR>

                            <div class="form-body">
                                
                                <div class="row">
                                    <input style="visibility: hidden" type="text" placeholder="id" name="id-cli" value="${sessionScope.cliente.id}">
                                </div> 
                                <div class="row">
                                    <input type="text" placeholder="Nome*" name="nome-cli" value="${sessionScope.cliente.nome}" >
                                    <input type="text" placeholder="Sobrenome*" name="sobrenome-cli" value="${sessionScope.cliente.sobrenome}">
                                </div>  
                                <div class="row">
                                    <input type="number" placeholder="cpf*" id="validadorCpf" onkeydown="limita(this);" onkeyup="limita(this);" name="cpf-cli" value="${sessionScope.cliente.cpf}">
                                </div>
                                <div class="row">
                                    <input type="text" placeholder="Email*" name="email-cli" value="${sessionScope.cliente.email}">
                                </div>
                                <div class="row">
                                    <input type="number" placeholder="()Celular*" name="celular-cli" value="${sessionScope.cliente.celular}">       
                                </div>

                                <div class="row">
                                    <select class="sexo" name="sexo-cli">
                                        <option value="${sessionScope.cliente.genero}">${sessionScope.cliente.genero}</option>
                                        <option value="Masculino">Masculino</option>
                                        <option value="Feminino">Feminino</option>
                                    </select>

                                    <input type="date" placeholder="" max="2999-12-31" name="dtNasc-cli" value="${sessionScope.cliente.dataNascimento}">   

                                </div>

                                <div class="row">


                                    <select class="estado" name="estado-cli">           
                                        <option value="${sessionScope.cliente.estado}">${sessionScope.cliente.estado}</option>
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
                                    <input type="text" placeholder="Cidade*" name="cidade-cli" value="${sessionScope.cliente.cidade}">
                                </div>

                                <div class="row">
                                    <input type="number" placeholder="CEP*" name="cep-cli" value="${sessionScope.cliente.cep}">
                                </div>
                                <div class="row">
                                    <input type="text" placeholder="Endereço" name="end-cli" value="${sessionScope.cliente.estado}">
                                </div>
                                
                                <div class="row">
                                    <c:if test="${not empty requestScope.erroAtualizar}">
                                        <p class="error"><c:out value="${requestScope.erroAtualizar}"/></p>
                                    </c:if>
                                </div>

                            </div>

                            <div class="form-footer">

                                <button class="botoes"><a href="${pageContext.request.contextPath}/consultarCliente.jsp">CANCELAR</a><span class="fa fa-ban"></span></button>

                                <button class="botoes" type="submit">SALVAR<span class="fa fa-thumbs-o-up"></span></button>

                            </div>
                        </form>
                    </div>  
                </div>
                <div class="grid_3 prefix_1">
                    <h5 class="opcao">Opção </h5>
                    <ul class="list">
                        <li><a href="${pageContext.request.contextPath}/cadastrarCliente.jsp">Cadastrar</a></li>
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
