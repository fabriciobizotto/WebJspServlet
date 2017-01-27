<p>

    <% if (request.getSession() != null && request.getSession().getAttribute("usuarioLogado") != null) { %>
    <a href="LogoutServlet">Sair</a> |
    <a href="Usuarios?acao=listar">Lista de Usuários</a>
    <%} else {%>
    <a href="Registrar?acao=registrar">Registrar-se</a> |
    <a href="Registrar?acao=login">Login</a>
    <%}%>

</p>