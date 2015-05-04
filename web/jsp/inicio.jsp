<%-- 
    Document   : index
    Created on : 24/03/2015, 18:25:21
    Author     : stryker
--%>

<%@taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<mtw:requiresAuthentication redir="true" />
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <title>Calculadora Mentawai</title>
    </head>
    <body>
        
        <h1>Calculadora</h1>
          
        <div id="container">
	  <ul>
            <li><a href="Operacao.efetuar.mtw?op=soma">Somar</a></li>
            <li><a href="Operacao.efetuar.mtw?op=sub">Subtrair</a></li>
            <li><a href="Operacao.efetuar.mtw?op=mult">Multiplicação</a></li>
            <li><a href="Operacao.efetuar.mtw?op=div">Divisão</a></li>
            
            <br><br><li><a href="LogoutAction.execute.mtw">Sair</a></li>
          </ul>
        </div>
           
    </body>
</html>
