/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabricio
 */
@WebServlet(name = "CalcularIMC", urlPatterns = "/CalcularIMC")
public class CalcularIMC extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        if (req.getParameter("peso").equals("") || req.getParameter("altura").equals("")) {
            req.setAttribute("mensagens", "Informe peso e altura!");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else {
            Double peso = Double.parseDouble(req.getParameter("peso"));
            Double altura = Double.parseDouble(req.getParameter("altura"));

            Double imc = peso / (altura * altura);
            req.setAttribute("imc", imc);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}
