/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabricio
 */
@WebServlet(name = "AloMundoServlet", urlPatterns = {"/exercicio/alomundo"})
public class AloMundoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AloMundoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AloMundoServlet at " + request.getContextPath() + "</h1>");
            for (int i = 0; i < 100; i++) {
                out.print(i);
                out.print(", ");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

}
