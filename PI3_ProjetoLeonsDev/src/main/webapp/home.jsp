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
        <meta charset="utf-8">
        <meta name="format-detection" content="telephone=no" />

        <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.ico">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico" />

        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/camera.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.carousel.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-migrate-1.2.1.js"></script>
        <script src="${pageContext.request.contextPath}/js/script.js"></script>
        <script src="${pageContext.request.contextPath}/js/superfish.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.ui.totop.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.equalheights.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.mobilemenu.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.easing.1.3.js"></script>
        <script src="${pageContext.request.contextPath}/js/owl.carousel.js"></script>
        <script src="${pageContext.request.contextPath}/js/camera.js"></script>
        <!--[if (gt IE 9)|!(IE)]><!-->
        <script src="${pageContext.request.contextPath}/js/jquery.mobile.customized.min.js"></script>
        <script>
            $(document).ready(function () {
                jQuery('#camera_wrap').camera({
                    loader: false,
                    pagination: false,
                    minHeight: '444',
                    thumbnails: false,
                    height: '48.375%',
                    caption: true,
                    navigation: true,
                    fx: 'mosaic'
                });
                /*carousel*/
                var owl = $("#owl");
                owl.owlCarousel({
                    items: 2, //10 items above 1000px browser width
                    itemsDesktop: [995, 2], //5 items between 1000px and 901px
                    itemsDesktopSmall: [767, 2], // betweem 900px and 601px
                    itemsTablet: [700, 2], //2 items between 600 and 0
                    itemsMobile: [479, 1], // itemsMobile disabled - inherit from itemsTablet option
                    navigation: true,
                    pagination: false
                });
                $().UItoTop({easingType: 'easeOutQuart'});
            });
        </script>
    </head>

    <body class="page1" id="top">
        <!--==============================header=================================-->
        <header>
            <div class="container_12">
                <div class="grid_12">
                    <div class="menu_block">
                        <nav class="horizontal-nav full-width horizontalNav-notprocessed">
                            <ul class="sf-menu">

                                <li class="current"><a href="${pageContext.request.contextPath}/home.jsp">HOME</a></li>                                
                                <li><a href="${pageContext.request.contextPath}/cadastrarCliente.jsp">Cliente</a></li>                                
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
        <div class="slider_wrapper">
            <div id="camera_wrap" class="">
                <div data-src="${pageContext.request.contextPath}/images/slide.jpg">
                    <div class="caption fadeIn">
                        <h2>LONDON</h2>

                    </div>
                </div>
                <div data-src="${pageContext.request.contextPath}/images/slide1.jpg">
                    <div class="caption fadeIn">
                        <h2>Maldives</h2>


                    </div>
                </div>
                <div data-src="${pageContext.request.contextPath}/images/slide2.jpg">
                    <div class="caption fadeIn">
                        <h2>Venice</h2>

                    </div>
                </div>
            </div>
        </div>

        <!--==============================Content=================================-->

        <div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - February 10, 2014!</div>
            <div class="container_12">

                <div class="grid_12">
                    <h3 class="head1">CLASSIFICAÇÃO DE CLIENTES</h3>
                </div>
                <div class="grid_4">
                    <div class="block1">
                        <time datetime="2014-01-01"><span>PO</span></time>
                        <div class="extra_wrapper">
                            <div class="text1 col1"><a href="#">POMBO</a></div>
                            Essa é a categoria inicial do programa de fidelidade mais justo do país! Basta voar e acumular!
                        </div>
                    </div>
                </div>
                <div class="grid_4">
                    <div class="block1">
                        <time datetime="2014-01-01"><span>PE</span></time>
                        <div class="extra_wrapper">
                            <div class="text1 col1"><a href="#">PELICANO</a></div>
                            Voar, voar; subir, subir. Após acumular 5 mil milhas voadas, você se torna um pelicano com benefícios inigualáveis.
                        </div>
                    </div>
                </div>

                <div class="grid_4">
                    <div class="block1">
                        <time datetime="2014-01-01"><span>AG</span></time>
                        <div class="extra_wrapper">
                            <div class="text1 col1"><a href="#">ÁGUIA</a></div>
                            De Pelicano para Águia! Aqui você é boss. Apenas 10 mil milhas para subir.
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
                        Astec CIA áerea (c) 2017 | <a href="#">Privacy Policy</a>
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
            $(function () {
                $('#bookingForm input, #bookingForm textarea').placeholder();
            });
        </script>
    </body>
</html>
