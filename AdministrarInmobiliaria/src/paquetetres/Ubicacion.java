/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ubicacion implements Serializable{
    private int numeroCasa;
    private String nombreBarrio;
    private String referencia;
    
    public Ubicacion(int nC, String nB, String r){
        numeroCasa = nC;
        nombreBarrio = nB;
        referencia = r;
    }
    
    public void establecerNumeroCasa(int n){
        numeroCasa = n;
    }
    
    public void establecerNombreBarrio(String n){
        nombreBarrio = n;
    }
    
    public void establecerReferencia(String n){
        referencia = n;
    }
    
    public int obtenerNumeroCasa(){
        return numeroCasa;
    }
    
    public String obtenerNombreBarrio(){
        return nombreBarrio;
    }
    
    public String obtenerReferencia(){
        return referencia;
    }
    
    public String toString() {

        String cadena = String.format("Número de Casa:%d\nNombre Barrio:%s\n"
                + "Referencia:%s\n",
                obtenerNumeroCasa(),
                obtenerNombreBarrio(),
                obtenerReferencia());
        return cadena;
    }
    
}
