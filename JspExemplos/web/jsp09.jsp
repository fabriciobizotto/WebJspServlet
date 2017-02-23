<!--
    Faça a mesma coisa do exercício anterior, 
    porém agora o valor será recebido através de um formulário.
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
        <% request.setCharacterEncoding("UTF-8");%>

        <form action="jsp09.jsp" method="GET">
            Nome: <input type="text" name="numero" 
                         value="<%= request.getParameter("numero")%>" />
            <input type="submit" value="Calcular tabuada" />
        </form>

        <% if (request.getParameter("numero") != null) {

                Integer numero = Integer.parseInt(
                        request.getParameter("numero")
                );

                out.print("<p>Tabuada do número  " 
                        + request.getParameter("numero") + "</p>");
                for (int i = 0; i < 11; i++) {
                    out.print("<b>" + i + " x " 
                            + numero + " = " + (i * numero) + "</b>");
                    out.print("<br />");
                }

            } else {
                out.print("Informe um número válido como parâmetro!");
            }
        %>

    </body>
</html>
