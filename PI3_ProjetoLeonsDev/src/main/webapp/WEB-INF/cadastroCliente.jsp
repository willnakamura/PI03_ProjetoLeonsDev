<%-- 
    Document   : Cliente
    Created on : 03/10/2017, 20:14:45
    Author     : Nakamura-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Cliente</title>
    </head>
    <body>
        <div class="cadastro-cliente">
            <form action="${pageContext.request.contextPath}/cadastro-cliente" method="post">
                <h3>Cadastro de clientes</h3>

                <label for="nome"  class="label cadastro nome">Nome Completo</label>
                <input type="text" name="nome" value="nome" class="input cadastro name"/>               
                </br></br>
                <label for="cpf" class="label cadastro cpf">CPF</label>
                <input type="text" name="cpf" value="cpf" class="input-cpf"/>
                </br></br>
                <label for="dtnascimento" class="label cadastro DataNasci">Data de Nascimento</label>
                <input type="date" name="dataNascimento" class="input cadastro dtnascimento"/>
                </br></br>
                <label for="endereco" class="label cadastro endereco">Endereço</label>
                <input type="text" name="endereco" value="endereco" class="input cadastro endereco"/>
                </br></br>
                <label for="telefone" class="label cadastro telefone">Telefone</label>
                <input type="text" name="telefone" value="telefone" class="input cadastro telefone"/>
                </br></br>
                <label for="email" class="label cadastro email">E-mail</label>
                <input type="text" name="email" value="email" class="input cadastro email"/>
                </br></br>

                </br></br>
                <div>
                    <button> Voltar </button>
                    <button> Cadastrar </button>
                </div>
            </form>
        </div>
    </body>
</html>