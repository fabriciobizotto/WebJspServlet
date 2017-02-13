/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.servlets;

import br.com.ifc.entidades.Colors;
import br.com.ifc.util.CarregarListaCores;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
@WebServlet(name = "ColorsAddServlet", urlPatterns = {"/ColorsAddServlet"})
public class ColorsAddServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String colorName = request.getParameter("colorName");
        String hexValue = request.getParameter("hexValue");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ColorsServlet</title>");
            out.println("</head>");
            out.println("<body>");

            if (colorName.equals("") || hexValue.equals("")) {
                out.print("<p>Não foi possível adicionar a cor. Preencha todos os campos.</p>");
            } else {

                Gson gson = new Gson();
                String path = "/home/fabricio/colors.json";
                File file = new File(path);

                List<Colors> lista = new CarregarListaCores(path).carregar();
                lista.add(new Colors(colorName, hexValue));

                
//                try (FileWriter writer = new FileWriter(file)) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    bw.write(gson.toJson(lista));
                    bw.flush();
                    bw.close();
                }

                out.print("<p>A cor foi adicionada com sucesso.</p>");
            }

            out.print("<p><a href='ColorsServlet'>Lista de cores</a></p>");

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
