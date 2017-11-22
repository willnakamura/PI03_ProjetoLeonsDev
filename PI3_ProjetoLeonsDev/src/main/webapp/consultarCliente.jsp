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
        </header>

        <div class="content"><div class="ic"></div>

            <div class="container_12">
                <div class="grid_8">
                    <div class="tituloCliente">

                        <h5 class="opcao">CONSULTAR CLIENTE </h5>

                    </div>          



                    <form class="buscaCliente" action="${pageContext.request.contextPath}/ConsultarCliente" method="post">

                        <div class="row">
                            <c:if test="${not empty requestScope.erroConsulta}">
                                <p class="error"><c:out value="${requestScope.erroConsulta}"/></p>
                            </c:if>
                        </div>

                        <div class="busca">
                            <input type="text" id="busca1" placeholder="Digite o CPF" name="buscaCliente">
                            <button id="botoesBusca" type="submit">BUSCAR</button>
                        </div>

                    </form>

                    <form class="editCli" action="${pageContext.request.contextPath}/EditarCliente" method="post">

                        <div id="bg"></div>
                        <table>
                            <tr>
                                <th></th>
                                <th>Nome</th>
                                <th>Sobrenome</th>
                                <th>cpf</th>
                                <th>Email</th>
                                <th>Celular</th>    
                                <th>Sexo</th>
                                <th>Nascimento</th>
                                <th>Estado</th>
                                <th>Cidade</th>
                                <th>Cep</th>
                                <th>Endereço</th>
                                <th style="visibility: hidden">ID</th>

                            </tr>    

                            <c:if test="${empty sessionScope.buscar}">
                                <c:forEach var="cli" items="${sessionScope.ResultClienteLista}">    
                                    <tr>
                                        <td><input type="radio" value="${cli.cpf}" name="selecionarCli" /></td>
                                        <td>${cli.nome}</td>
                                        <td>${cli.sobrenome}</td>
                                        <td>${cli.cpf}</td>
                                        <td>${cli.email}</td>
                                        <td>${cli.celular}</td>
                                        <td>${cli.genero}</td>
                                        <td>${cli.dataNascimento}</td>
                                        <td>${cli.estado}</td>
                                        <td>${cli.cidade}</td>
                                        <td>${cli.cep}</td>
                                        <td>${cli.endereco}</td>
                                        <td style="visibility: hidden">${cli.id}</td>
                                    </tr>
                                </c:forEach>
                            </c:if>

                            <c:if test="${sessionScope.buscar != null}">
                                <tr>
                                    <td><input type="radio" value="${sessionScope.ResultCli.cpf}" name="selecionarCli" /></td>
                                    <td>${sessionScope.ResultCli.nome}</td>
                                    <td>${sessionScope.ResultCli.sobrenome}</td>
                                    <td>${sessionScope.ResultCli.cpf}</td>
                                    <td>${sessionScope.ResultCli.email}</td>
                                    <td>${sessionScope.ResultCli.celular}</td>
                                    <td>${sessionScope.ResultCli.genero}</td>
                                    <td>${sessionScope.ResultCli.dataNascimento}</td>
                                    <td>${sessionScope.ResultCli.estado}</td>
                                    <td>${sessionScope.ResultCli.cidade}</td>
                                    <td>${sessionScope.ResultCli.cep}</td>
                                    <td>${sessionScope.ResultCli.endereco}</td>
                                    <td style="visibility: hidden">${sessionScope.ResultCli.id}</td>
                                </tr>
                            </c:if>


                        </table>

                        <div class="form-footer">
                            <button class="botoes" name="btnExluir" value="exluirCli">EXCLUIR<span class="fa fa-ban"></span></button>
                            <button class="botoes" name="btnEditar" value="editarCli">EDITAR<span class="fa fa-thumbs-o-up"></span></button>
                        </div>
                    </form>
                </div>


                <div class="grid_3 prefix_1">

                    <h5 class="opcao">Opção </h5>
                    <ul class="list">

                        <li><a href="${pageContext.request.contextPath}/cadastrarCliente.jsp">Cadastrar</a></li>
                        <li><a href="#">Consultar</a></li>

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
