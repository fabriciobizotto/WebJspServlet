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
import javax.servlet.http.HttpSession;

/**
 *
 * @author fabricio
 */
@WebServlet(name = "ContadorServlet", urlPatterns = {"/contador"})
public class ContadorServlet extends HttpServlet {

    private static int contadorGlobal = 0;  //Variável da aplicação (existe equanto a aplicação existir)
    private Integer contadorUsuario = 0;    //Variável da sessão (existe equanto a sessão existir)

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        contadorGlobal++;

        HttpSession sessao = request.getSession();
        sessao.setMaxInactiveInterval(5);;
        contadorUsuario = (Integer) sessao.getAttribute("contador");

        if (contadorUsuario == null) {
            contadorUsuario = 0;
        } else {
            ++contadorUsuario;
        }
        sessao.setAttribute("contador", contadorUsuario);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Contador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet requisições globais: " + contadorGlobal + "</h1>");
            out.println("<h1>Servlet requisições usuário: " + contadorUsuario + "</h1>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }
}
