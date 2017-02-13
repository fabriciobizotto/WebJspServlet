/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.servlets;

import br.com.ifc.util.CarregarListaCores;
import br.com.ifc.entidades.Colors;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabricio
 */
@WebServlet(name = "ColorsServlet", urlPatterns = {"/ColorsServlet"})
public class ColorsServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            String path = "/home/fabricio/colors.json";
            List<Colors> lista = new CarregarListaCores(path).carregar();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ColorsServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Lista de cores</h1>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Nome</th>");
            out.println("<th>Hexadecimal</th>");
            out.println("<th>Cor</th>");
            out.println("</tr>");
            for (Colors cor : lista) {
                out.println("<tr>");
                out.println("<td>" + cor.getColorName() + "</td>");
                out.println("<td>" + cor.getHexValue()+ "</td>");
                out.println("<td style='background-color: " + cor.getHexValue() + "'></td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<a href='ColorsFormServlet'>Adicionar cor</a>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {
            ex.printStackTrace();
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
