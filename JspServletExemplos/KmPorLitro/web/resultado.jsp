<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultados obtidos</h1>
        <p>
            Foram percorridos <%= request.getParameter("km")%>
            quilômetros com <%= request.getParameter("litro")%> litros.
        </p>
        <p>
            <strong>
                Resultado: <%= request.getAttribute("resultado")%> quilômetros por litro.
            </strong>
        </p>
        <input type="button" value="Volar" onclick="history.back()" />
    </body>
</html>
