/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.servlets;

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
@WebServlet(name = "OlaMundoServlet", urlPatterns = "/OlaMundo")
public class OlaMundoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OlaMundoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ola Mundo!!!</h1>");
            out.println("<h3>Meu nome é: " + request.getParameter("nome") + "</h3>");
            out.println("<p>Eu tenho " + request.getParameter("idade")
                    + " anos de idade e sou do sexo "
                    + request.getParameter("sexo") + "</p>");
            out.println("<a href='#' onclick='history.back()'>Voltar</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
