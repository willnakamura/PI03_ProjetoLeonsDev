<%-- 
    Document   : index
    Created on : 10/10/2017, 18:35:39
    Author     : Nakamura-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/login.css" type="text/css" media="all"> 
        <script type="text/javascript" src="js/login.js" ></script>

        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <div class="login-container">
                <div id="output"></div>
                <div class="avatar">
                    <img src="images/logoIndex.jpg" id="centro" />
                    
                </div>
                <div class="form-box">
                    <form action="${pageContext.request.contextPath}/login" method="post">
                        <input name="user" type="text" placeholder="username">
                        <input type="password" placeholder="password" name="password">
                        
                        <!-- Comando "if" que realiza a exibição da mensagem de erro  -->
                        <c:if test="${not empty erroLogin}">
                            <p class="erroLogin"><c:out value="${erroLogin}"/></p>
                        </c:if>
                            
                        <button class="btn btn-info btn-block login" type="submit" value="Enviar">Login</button>
                    </form>
                </div>
            </div>

        </div>
    </body>
</html>
