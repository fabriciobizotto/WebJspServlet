/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.entidades;

/**
 *
 * @author fabricio
 */
public class Colors {

    private String colorName;
    private String hexValue;

    public Colors() {
    }

    public Colors(String colorName, String hexValue) {
        this.colorName = colorName;
        this.hexValue = hexValue;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

}
