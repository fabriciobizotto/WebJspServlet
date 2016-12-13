<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <div>
            <p>Fórmula: IMC = PESO / (ALTURA * ALTURA)</p>
        </div>
        <div>
            <p><%= request.getAttribute("mensagens")%></p>
        </div>
        <fieldset>
            <legend>Calcular IMC</legend>
            <form name="formulario" action="CalcularIMC">
                Peso: <input type="text" name="peso" value="<c:out value="<%= request.getParameter("peso") %>" />" />
                Altura: <input type="text" name="altura" value="<c:out value="<%= request.getParameter("altura") %>" />"  />
                <input type="submit" name="salvar" value="Calcular" />
            </form>
        </fieldset>
        <div>
            IMC: <%= request.getAttribute("imc")%>
        </div>
    </body>
</html>
