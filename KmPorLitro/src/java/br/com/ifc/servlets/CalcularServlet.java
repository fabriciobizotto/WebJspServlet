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
@WebServlet(name = "calcular", urlPatterns = {"/calcular"})
public class CalcularServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double km = Double.parseDouble(request.getParameter("km"));
        double litro = Double.parseDouble(request.getParameter("litro"));

        double kmPorLitro = km / litro;

        request.setAttribute("resultado", kmPorLitro);

        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
