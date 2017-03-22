<!--
    Imprimir nome e idade recebidas via parâmetro
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

        <% String nome = request.getParameter("nome"); %>
        <% String idade = request.getParameter("idade");%>
        <p>Meu nome é <strong><%= nome%></strong> e eu tenho <strong><%= idade%></strong> anos de idade.</p>
    </body>
</html>
