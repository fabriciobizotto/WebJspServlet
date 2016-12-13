<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
            <legend>Tabuada</legend>
            <form action="Tabuada">
                Número: <input type="text" value="<c:out value="<%= request.getParameter("numero") %>"/>" name="numero" />
                <input type="submit" value="Gerar tabuada" />
            </form>
        </fieldset>
        
        <div>
            <p>
                <c:forEach var="n" items="${tabuada}">
                    ${n}
                </c:forEach>
            </p>
        </div>
    </body>
</html>
