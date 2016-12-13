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
@WebServlet(name = "CalculadoraServlet", urlPatterns = {"/calculadora"})
public class CalculadoraServlet extends HttpServlet {

    private static final String SOMA_OPERATION = "soma";
    private static final String MENOS_OPERATION = "sub";
    private static final String MULTIPLICACAO_OPERATION = "mult";
    private static final String DIVISAO_OPERATION = "div";

    private static final String NUMERO1_PARAMETRO = "n1";
    private static final String NUMERO2_PARAMETRO = "n2";
    private static final String OPERACAO_PARAMETRO = "operacao";

    /**
     * http://localhost:8080/CalculadoraServlet/calculadora?n1=10&n2=2&operacao=soma
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);

        double operand1 = Double.valueOf(request.getParameter(NUMERO1_PARAMETRO));
        double operand2 = Double.valueOf(request.getParameter(NUMERO2_PARAMETRO));
        String operation = request.getParameter(OPERACAO_PARAMETRO);

        String resultado = calcular(operand1, operand2, operation);

        response.getWriter().println("<h1>" + resultado + "</h1>");
    }

    private String calcular(double operand1, double operand2, String operation) {
        String result = String.valueOf(operand1) + " "
                + operation + " " + String.valueOf(operand2) + " = ";
        switch (operation) {
            case SOMA_OPERATION:
                result += String.valueOf(operand1 + operand2);
                break;
            case MENOS_OPERATION:
                result += String.valueOf(operand1 - operand2);
                break;
            case MULTIPLICACAO_OPERATION:
                result += String.valueOf(operand1 * operand2);
                break;
            case DIVISAO_OPERATION:
                result += String.valueOf(operand1 / operand2);
                break;
            default:
                result += "unknown";
        }
        return result;
    }
}
