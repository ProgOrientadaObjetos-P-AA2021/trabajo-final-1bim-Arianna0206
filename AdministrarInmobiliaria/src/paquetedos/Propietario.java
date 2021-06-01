/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Propietario implements Serializable {

    private String nombres;
    private String apellidos;
    private int identificacion;

    public Propietario(String n, String a, int i) {
        nombres = n;
        apellidos = a;
        identificacion = i;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerApellidos(String n) {
        apellidos = n;
    }

    public void establecerIdentificacion(int n) {
        identificacion = n;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public int obtenerIdentificacion() {
        return identificacion;
    }

    public String toString() {

        String cadena = String.format("Nombre:%s\nApellido:%s\n"
                + "Identificación:%d\n",
                obtenerNombres(),
                obtenerApellidos(),
                obtenerIdentificacion());
        return cadena;
    }

}
