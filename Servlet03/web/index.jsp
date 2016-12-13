<%-- 
    Document   : index
    Created on : 01/12/2016, 16:23:49
    Author     : fabricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
            <form method="GET" action="OlaMundoServlet">
                Nome: <input type="text" name="nome" />
                Idade: <input type="text" name="idade" />
                <input type="radio" id="cbox1" value="M" name="sexo">
                <label for="cbox1"> Masculino</label>
                <input type="radio" id="cbox2" value="F" name="sexo">
                <label for="cbox2">Feminino</label>
                <input type="submit" value="Clique aqui" />
            </form>
        </fieldset>
    </body>
</html>
