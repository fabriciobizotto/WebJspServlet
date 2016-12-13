<%@page import="java.util.List"%>
<%@page import="br.com.ifc.entidades.Contato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="adicionarContato" method="POST">
            Nome: <input type="text" name="nome"/><br/>
            Email: <input type="text" name="email"/><br/>

            <input type="submit" value="Gravar"/>
        </form>

        <table border="1">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>E-mail</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="contato" items="${contatos}" >
                    <tr>
                        <td>${contato.nome}</td>
                        <td>${contato.email}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
