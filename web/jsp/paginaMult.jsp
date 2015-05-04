<%-- 
    Document   : mult
    Created on : 24/03/2015, 20:26:56
    Author     : stryker
--%>
<%@taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <title>Página de multiplicação</title>
    </head>
    
    <body>
        
        <h1>Multiplicar</h1>
        <div id="container">
          <mtw:form action="Operacao.multiplicar.mtw" method="post">
             Valor1: <mtw:input type="text" name="valor1" /><br><br>
             Valor2: <mtw:input type="text" name="valor2" /><br><br>
             <input type="submit" value="Calcular" />
	  </mtw:form>
          <br><br><a href="Operacao.inicio.mtw">Voltar</a>
        </div>
        
    </body>
</html>
