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

        <%
            try {
                Integer numero = Integer.parseInt(request.getParameter("numero"));

                out.print("<p>Tabuada do número  " + request.getParameter("numero") + "</p>");
                for (int i = 0; i < 11; i++) {
                    out.print("<b>" + i + " x " + numero + " = " + (i * numero) + "</b>");
                    out.print("<br />");
                }
            } catch (Exception ex) {
                out.print("Erro:" + ex.getMessage());
            }

        %>
    </body>
</html>
