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

        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css" type="text/css" media="all">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css" media="all">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/zerogrid.css" type="text/css" media="all">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/responsive.css" type="text/css" media="all"> 

        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.2.js" ></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/cufon-yui.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/cufon-replace.js"></script>  
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/Myriad_Pro_600.font.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/css3-mediaqueries.js"></script>

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
                                        <input type="text" class="input">-->
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
                    <div class="row headerextra">
                        <article class="col-1-3"><div class="wrap-col">
                                <div class="text">
                                    <img src="${pageContext.request.contextPath}/images/text1.jpg" alt="">
                                    <h2>The Best Offers</h2>
                                    <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore.</p>
                                    <a href="#" class="button">Read More</a>
                                </div>
                            </div></article>
                        <div class="col-1-3 col-extra"><div class="wrap-col"><img src="${pageContext.request.contextPath}/images/img.jpg" alt=""></div></div>
                        <article class="col-1-3" ><div class="wrap-col">
                                <ul class="tabs">
                                    <li><a href="#" class="active">Flight</a></li>
                                    <li><a href="#">Hotel</a></li>
                                    <li><a href="#">Car</a></li>
                                    <li class="end"><a href="#">Cruise</a></li>
                                </ul>
                                <div class="tabs_cont">
                                    <form id="form_1" action="" method="post">
                                        <div class="bg">
                                            <div class="wrapper">
                                                <div class="radio">
                                                    <input type="radio" name="name1" checked>Round trip
                                                </div>
                                                <div class="radio"><input type="radio" name="name1">One way</div>
                                            </div>
                                            <a href="#">Multiple destinations</a>
                                            <div class="wrapper"><input type="text" class="input">From</div>
                                            <div class="wrapper"><input type="text" class="input">To</div>	
                                            <div class="wrapper check_box"><input type="checkbox" checked ><a href="#">Search nearby airports</a></div>	
                                            <div class="wrapper"><input type="text" class="input input2" value="04/11/2010"  onblur="if (this.value == '')
                                                        this.value = '04/11/2010'" onfocus="if (this.value == '04/11/2010')
                                                                    this.value = ''">Depart (mm/dd/yy)</div>
                                            <div class="wrapper pad_bot1"><input type="text" class="input input2" value="04/11/2010"  onblur="if (this.value == '')
                                                        this.value = '04/11/2010'" onfocus="if (this.value == '04/11/2010')
                                                                    this.value = ''">Return  (mm/dd/yy)</div>
                                            <div class="wrapper">
                                                <div class="radio"><input type="radio" name="name2" checked>Economy cabin</div>
                                                <div class="radio end"><input type="radio" name="name2">Business</div>
                                            </div>
                                            <div class="wrapper pad_bot1">
                                                <a href="#" class="button" onclick="document.getElementById('form_1').submit()">Search</a>
                                                Audlts <select><option>1</option></select>
                                            </div>
                                        </div>							
                                    </form>
                                </div>
                            </div></article>
                    </div>
                </header>
                <!-- / header -->
                <!-- content -->
                <section id="content">
                    <article class="col-1-3"><div class="wrap-col">
                            <h3>Hot Travel</h3>
                            <div class="pad">
                                <div class="wrapper under">
                                    <figure class="left marg_right1"><img src="${pageContext.request.contextPath}/images/page1_img1.jpg" alt=""></figure>
                                    <p class="pad_bot2"><strong>Italy<br>Holidays</strong></p>
                                    <p class="pad_bot2">Lorem ipsum dolor sit amet, consect etuer adipiscing.</p>
                                    <a href="#" class="marker_1"></a>
                                </div>
                                <div class="wrapper under">
                                    <figure class="left marg_right1"><img src="${pageContext.request.contextPath}/images/page1_img2.jpg" alt=""></figure>
                                    <p class="pad_bot2"><strong>Philippines<br>Travel</strong></p>
                                    <p class="pad_bot2">Lorem ipsum dolor sit amet, consect etuer adipiscing.</p>
                                    <a href="#" class="marker_1"></a>
                                </div>
                                <div class="wrapper">
                                    <figure class="left marg_right1"><img src="${pageContext.request.contextPath}/images/page1_img3.jpg" alt=""></figure>
                                    <p class="pad_bot2"><strong>Cruise<br>Holidays</strong></p>
                                    <p class="pad_bot2">Lorem ipsum dolor sit amet, consect etuer adipiscing.</p>
                                    <a href="#" class="marker_1"></a>
                                </div>
                            </div>
                        </div></article>
                    <article class="col-2-3"><div class="wrap-col">
                            <h2>Popular Places</h2>
                            <div class="row under">
                                <div class="col-1-3"><div class="wrap-col">
                                        <figure class="left marg_right1"><img src="${pageContext.request.contextPath}/images/page1_img4.jpg" alt=""></figure>
                                    </div></div>
                                <div class="col-2-3"><div class="wrap-col">
                                        <p class="pad_bot2"><strong>Hotel du Havre</strong></p>
                                        <p class="pad_bot2">Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
                                        <p class="pad_bot2"><strong>Nemo enim ipsam voluptatem</strong> quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>
                                        <a href="#" class="marker_2"></a>
                                    </div></div>
                            </div>
                            <div class="row under">
                                <div class="col-1-3"><div class="wrap-col"><figure class="left marg_right1"><img src="${pageContext.request.contextPath}/images/page1_img5.jpg" alt=""></figure></div></div>
                                <div class="col-2-3"><div class="wrap-col">
                                        <p class="pad_bot2"><strong>Hotel Vacance</strong></p>
                                        <p class="pad_bot2">At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti.</p>
                                        <p class="pad_bot2">Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque.</p>
                                        <a href="#" class="marker_2"></a>
                                    </div></div>
                            </div>
                            <div class="row">
                                <div class="col-1-3"><div class="wrap-col">
                                        <figure class="left marg_right1"><img src="${pageContext.request.contextPath}/images/page1_img4.jpg" alt=""></figure>
                                    </div></div>
                                <div class="col-2-3"><div class="wrap-col">
                                        <p class="pad_bot2"><strong>Hotel du Havre</strong></p>
                                        <p class="pad_bot2">Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
                                        <p class="pad_bot2"><strong>Nemo enim ipsam voluptatem</strong> quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>
                                        <a href="#" class="marker_2"></a>
                                    </div></div>
                            </div>
                        </div></article>
                </section>
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
