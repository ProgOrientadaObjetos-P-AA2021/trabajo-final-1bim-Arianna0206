/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ciudad implements Serializable {

    private String nombreCiudad;
    private String nombreProvincia;

    public Ciudad(String nC, String nP) {
        nombreCiudad = nC;
        nombreProvincia = nP;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerNombreProvincia(String n) {
        nombreProvincia = n;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerNombreProvincia() {
        return nombreProvincia;
    }

    public String toString() {

        String cadena = String.format("Nombre de ciudad:%s\n"
                + "Nombre de provincia:%s\n",
                obtenerNombreCiudad(),
                obtenerNombreProvincia());
        return cadena;
    }

}
