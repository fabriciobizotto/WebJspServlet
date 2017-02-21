/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fabricio
 */
@WebServlet(name = "SomatorioServlet", urlPatterns = {"/exemplo/somatorio"})
public class SomatorioServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getServletName());
    }
    
    @Override
    public void destroy() {
        System.out.println("Destroi o servlet");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Integer inicio = Integer.parseInt(request.getParameter("inicio"));
        Integer fim = Integer.parseInt(request.getParameter("fim"));
        Integer somatorio = 0;

        HttpSession session = request.getSession();
        if (session.getAttribute("contador") == null) {
            session.setAttribute("contador", 1);
        } else {
            session.setAttribute("contador", Integer.parseInt(session.getAttribute("contador").toString()) + 1);
        }

        for (int i = inicio; i <= fim; i++) {
            somatorio += i;
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SomatorioServlet</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("O somatório de " + inicio + " a " + fim + " é " + somatorio);
            out.println("<br />");
            out.println("Você utilizou o serviço " + session.getAttribute("contador") + " vezes.");

            out.println("</body>");
            out.println("</html>");
        }
    }
}
