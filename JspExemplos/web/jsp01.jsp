<!--
    Imprimir olá mundo com JSP
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
        <% String ola = "Olá Mundo!"; %>
        <strong><%= ola %></strong>
    </body>
</html>
