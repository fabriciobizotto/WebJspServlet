/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabricio
 */
@WebServlet(name = "Confirmacao", urlPatterns = {"/Confirmacao"})
public class Confirmacao extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
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
            out.println("<h3>Prezado " + request.getSession().getAttribute("nome") + "</h3>");
            if (request.getParameter("sim") != null) {
                out.println("<p>Sua inscrição foi confirmada com sucesso!</p>");
            }else{
                out.println("<p>Sua inscrição foi cancelada!</p>");
            }

            out.println("</body>");
            out.println("</html>");
        }
        for (Map.Entry<String, String[]> entry : request.getParameterMap().entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
