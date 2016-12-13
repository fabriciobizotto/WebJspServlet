<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date" %>
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
        
        <% String ola = request.getParameter("ola"); %>
        <% String data = new SimpleDateFormat("dd/MM/yyyy").format(new Date()); %>
        <strong><%= ola %></strong> hoje é <%= data %>
    </body>
</html>
