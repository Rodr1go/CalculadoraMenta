<%-- 
    Document   : soma
    Created on : 24/03/2015, 19:24:14
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
        <title>Página de soma</title>
    </head>
    <body>
        
        <mtw:if test="op" value="soma">
        <h1>Soma</h1>
        
        <div id="container">
          <mtw:form action="Operacao.resolver.mtw?op=soma">
             Valor1: <mtw:input type="text" name="valor1" /><br><br>
             Valor2: <mtw:input type="text" name="valor2" /><br><br>
             <input type="submit" value="Calcular" />
	  </mtw:form>
        </mtw:if>
             
         <mtw:if test="op" value="subtrair">
        <h1>Subtração</h1>
        
        <div id="container">
          <mtw:form action="Operacao.resolver.mtw?op=sub">
             Valor1: <mtw:input type="text" name="valor1" /><br><br>
             Valor2: <mtw:input type="text" name="valor2" /><br><br>
             <input type="submit" value="Calcular" />
	  </mtw:form>
        </mtw:if>
        
       <mtw:if test="op" value="multiplicar">
       <h1>Multiplicação</h1>     
        <div id="container">
          <mtw:form action="Operacao.resolver.mtw?op=mult">
             Valor1: <mtw:input type="text" name="valor1" /><br><br>
             Valor2: <mtw:input type="text" name="valor2" /><br><br>
             <input type="submit" value="Calcular" />
	  </mtw:form>
        </mtw:if>
        
        <mtw:if test="op" value="dividir">
        <h1>Divisão</h1>     
        <div id="container">
          <mtw:form action="Operacao.resolver.mtw?op=div">
             Valor1: <mtw:input type="text" name="valor1" /><br><br>
             Valor2: <mtw:input type="text" name="valor2" /><br><br>
             <input type="submit" value="Calcular" />
	  </mtw:form>
        </mtw:if>     
             
          <br><br><a href="Operacao.inicio.mtw">Voltar</a>
        </div>
        
    </body>
</html>
