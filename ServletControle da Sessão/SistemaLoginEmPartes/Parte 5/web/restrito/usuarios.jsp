<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="/menu.jsp" />
        <h1>Lista de Usuários</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>E-mail</th>
                    <th>Usuário</th>
                    <th>Senha</th>
                    <th colspan="2">Ações</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="u" items="${usuarios}">
                    <tr>
                        <td>${u.id}</td>
                        <td>${u.nome}</td>
                        <td>${u.email}</td>
                        <td>${u.usuario}</td>
                        <td>${u.senha}</td>
                        <td><a href="Usuarios?acao=editar&id=<c:out value="${u.id}"/>">Editar</a></td>
                        <td><a href="Usuarios?acao=deletar&id=<c:out value="${u.id}"/>">Remover</a></td>
                    </tr>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
