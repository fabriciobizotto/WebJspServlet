<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3><%= "A média do aluno "
                + request.getParameter("nome") + " foi de: "
                + request.getAttribute("media")%></h3>
        <p><a href="index.jsp">Página inicial</a></p>
    </body>
</html>
