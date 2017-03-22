<!--
    Calcular a tabuada mas o resultado será impresso em outra página
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        <% request.setCharacterEncoding("UTF-8"); %>
        
        <form action="jsp10_resultado.jsp" method="GET">
            Nome: <input type="text" name="numero" 
                         value="<%= request.getParameter("numero") %>" />
            <input type="submit" value="Calcular tabuada" />
        </form>        
    </body>
</html>
