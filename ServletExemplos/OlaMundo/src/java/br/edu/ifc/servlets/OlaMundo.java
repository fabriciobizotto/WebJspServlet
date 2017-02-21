package br.edu.ifc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OlaMundo",
        urlPatterns = "/ifc/OlaMundo")
public class OlaMundo extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>OlaMundo</title>");
        out.println("</head>");
        out.println();
        out.println("<body>");
        out.println("<h1>Ola Mundo!!!</h1>");

        out.println("Meu nome é "
                + request.getParameter("nome"));

        out.println("</body>");
        out.println("</html>");
    }

}
