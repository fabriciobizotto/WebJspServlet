<!--
    Imprimir números de 0 a 10
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

        <% for (int i = 0; i < 11; i++) {
                out.print("<b> i= " + i + "</b>");
                out.print("<br />");
            }
        %>
    </body>
</html>
