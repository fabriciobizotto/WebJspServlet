/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.util;

import br.com.ifc.entidades.Colors;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author fabricio
 */
public class CarregarListaCores {

    private String caminho;
    private Gson gson;

    public CarregarListaCores(String caminho) {
        this.caminho = caminho;
        gson = new Gson();
    }

    public List<Colors> carregar() throws Exception {
        List<Colors> lista = gson.fromJson(new FileReader(new File(caminho)), new TypeToken<List<Colors>>() {
        }.getType());
        return lista;
    }

}
