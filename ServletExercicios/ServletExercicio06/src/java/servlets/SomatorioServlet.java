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

/**
 *
 * @author fabricio
 */
@WebServlet(name = "SomatorioServlet", urlPatterns = {"/exemplo/somatorio"})
public class SomatorioServlet extends HttpServlet {

    private Integer contador;

    @Override
    public void init(ServletConfig config) {
        System.out.println("Inicia o servlet");
        contador = 0;
    }

    @Override
    public void destroy() {
        System.out.println("Destroy o servlet");
        contador = null;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Integer inicio = Integer.parseInt(request.getParameter("inicio"));
        Integer fim = Integer.parseInt(request.getParameter("fim"));
        Integer somatorio = 0;
        contador++;

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
            out.println("Você utilizou o serviço " + contador + " vezes.");

            out.println("</body>");
            out.println("</html>");
        }
    }
}
