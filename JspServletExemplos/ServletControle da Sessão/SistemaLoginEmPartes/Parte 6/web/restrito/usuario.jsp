<%-- 
    Document   : index
    Created on : 02/12/2016, 10:38:14
    Author     : fabricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlet/JSP</title>
    </head>
    <body>
        <jsp:include page="/menu.jsp" />
        <p>${erros}</p>
        <form method="POST" action="Usuarios">
            <label for="id">ID:</label>
            <input type="text" readonly="readonly" name="id" value="<c:out value="${usuario.id}" />" /> <br /> 
            <label for="nome">Nome:</label>
            <input type="text" name="nome" value="<c:out value="${usuario.nome}" />" />
            <br />
            <label for="email">E-mail:</label>
            <input type="text" name="email" value="<c:out value="${usuario.email}" />" />
            <br />
            <label for="usuario">Usuário:</label>
            <input type="text" name="usuario" value="<c:out value="${usuario.usuario}" />" />
            <br />
            <label for="senha">Senha:</label>
            <input type="text" name="senha" value="" />
            <br /><br />
            <input type="submit" value="Salvar/Atualizar" />
        </form>
    </body>
</html>
