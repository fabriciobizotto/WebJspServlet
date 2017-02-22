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
@WebServlet(name = "EnviarDados", urlPatterns = {"/EnviarDados"})
public class EnviarDados extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Confirmação</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Confirmação das informações</h1>");
            out.println("<form action='Confirmacao' method='POST'>");
            out.println("Nome: " + request.getParameter("nome") + "<br />");
            out.println("E-mail: " + request.getParameter("email") + "<br />");
            out.println("<br />");
            out.println("<input type='submit' value='Sim' name='sim' />");
            out.println("<input type='submit' value='Não' name='nao' />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");

            request.getSession().setAttribute("nome", request.getParameter("nome"));
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
