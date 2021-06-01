/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Constructora implements Serializable {

    private String nombreConstructora;
    private int id;

    public Constructora(String nC, int i) {
        nombreConstructora = nC;
        id = i;
    }

    public void establecerNombreConstructora(String n) {
        nombreConstructora = n;
    }

    public void establecerId(int n) {
        id = n;
    }

    public String obtenerNombreConstructora() {
        return nombreConstructora;
    }

    public int obtenerId() {
        return id;
    }

    public String toString() {

        String cadena = String.format("Nombre Constructora:%s\n"
                + "Id de la empresa:%d\n",
                obtenerNombreConstructora(),
                obtenerId());
        return cadena;
    }
}
