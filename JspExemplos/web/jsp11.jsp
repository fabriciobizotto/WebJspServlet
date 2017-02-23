<!--
    Vamos trabalhar agora com informações da sessão do usuário.
    Faremos um contador de visitas nesta página
-->
<%@page import="java.util.Date"%>
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
            Date criadaEm = criadaEm = new Date(session.getCreationTime());;
            Date ultimoAcesso = ultimoAcesso = new Date(session.getLastAccessedTime());;
            Integer contadorVisitas = 0;
            String contadorVisitasChave = "contadorVisitas";
            String usuarioId = "IFC";
            String usuarioIdChave = "usuarioId";

            if (session.isNew()) {
                session.setAttribute(contadorVisitasChave, contadorVisitas);
            }
            session.setAttribute(usuarioIdChave, usuarioId);

            contadorVisitas = (Integer) session.getAttribute(contadorVisitasChave);

            if (contadorVisitas == null) {
                contadorVisitas = 0;
            } else {
                contadorVisitas = contadorVisitas + 1;
            }

            usuarioId = (String) session.getAttribute(usuarioIdChave);
            session.setAttribute(contadorVisitasChave, contadorVisitas);

        %>

        <table border='1'>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Criada em</th>
                    <th>Último acesso</th>
                    <th>ID do usuário</th>
                    <th>Visitas</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= session.getId()%></td>
                    <td><%= criadaEm%></td>
                    <td><%= ultimoAcesso%></td>
                    <td><%= usuarioId%></td>
                    <td><%= contadorVisitas%></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
