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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabricio
 */
@WebServlet(name = "CookiesServlet", urlPatterns = {"/cookies/teste"})
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Cookie[] cookies = request.getCookies();
        String nome = request.getParameter("nome");
        Cookie cookie = new Cookie(nome, nome);
        cookie.setMaxAge(10);

        response.addCookie(cookie);

        try (PrintWriter out = response.getWriter()) {
            for (Cookie c : cookies) {
                out.println("Nome: " + c.getValue());
                out.println("<br />");
            }
        }

    }
}
