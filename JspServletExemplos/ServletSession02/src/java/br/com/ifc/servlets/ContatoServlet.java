/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.servlets;

import br.com.ifc.entidades.Contato;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabricio
 */
@WebServlet(name = "ContatoServlet", urlPatterns = {"/adicionarContato"})
public class ContatoServlet extends HttpServlet {

    private List<Contato> contatos = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        contatos = new ArrayList<>();
    }

    @Override
    public void destroy() {
        super.destroy();
        contatos = null;
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");

        Contato contato = new Contato(nome, email);

        //Pega os contatos da sessão, caso existam
        contatos = (List<Contato>) request.getSession().getAttribute("contatos");

        //Se não existir nenhum contato na sessão então inicializa a lista
        if (contatos == null) {
            contatos = new ArrayList<>();
        }
        //Adiciona o contato na lista
        contatos.add(contato);
        //Adiciona os contatos na sessão
        request.getSession().setAttribute("contatos", contatos);
        //Retorna a tela principal
        request.getRequestDispatcher("index.jsp").forward(request, response);
        //destroy o servlet
        destroy();
    }

}
