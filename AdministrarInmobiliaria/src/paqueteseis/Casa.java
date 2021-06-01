/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

import java.io.Serializable;
import paquetecinco.Constructora;
import paquetecuatro.Ciudad;
import paquetedos.Propietario;
import paquetetres.Ubicacion;

/**
 *
 * @author reroes
 */
public class Casa implements Serializable{
    private Propietario propietario;
    private double precioMetro;
    private int numeroMetros;
    private double costoFinal;
    private Ubicacion ubicacion;
    private Ciudad ciudad;
    private int numeroCuartos;
    private Constructora constructora;
    
    public Casa( Propietario p,double pM, int nM, int nC, Ubicacion u,
            Constructora ct, Ciudad c){
        propietario = p;
        precioMetro = pM;
        numeroMetros = nM;
        numeroCuartos = nC;
        ubicacion = u;
        ciudad = c;
        constructora = ct;
        
    }
    
    public void establecerPropietario(Propietario n){
        propietario = n;
    }
    
    public void establecerPrecioMetro(double n){
        precioMetro = n;
    }
    
    public void establecerNumeroMetros(int n){
        numeroMetros = n;
    }
    
    public void establecerCostoFinal(){
        costoFinal = precioMetro * numeroMetros;
    }
    
    public void establecerUbicacion(Ubicacion n){
        ubicacion = n;
    }
    
    public void establecerCiudad(Ciudad n){
        ciudad = n;
    }
    
    public void establecerNumeroCuartos(int n){
        numeroCuartos = n;
    }
    
    public void establecerConstructora(Constructora n){
        constructora = n;
    }
    
    public Propietario obtenerPropietario(){
        return propietario;
    }
    
    public double obtenerPrecioMetro(){
        return precioMetro;
    }
    
    public int obtenerNumeroMetros(){
        return numeroMetros;
    }
    
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    
    public Ubicacion obtenerUbicacion(){
        return ubicacion;
    }
    
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerNumeroCuartos(){
        return numeroCuartos;
    }
    
    public Constructora obtenerConstructora(){
        return constructora;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("La Casa tiene : \n"
                + "Propietario tiene como :  \n"
                + "\tNombres: %s\n\tApellidos: %s\n"
                + "\tIdentificacion: %d\nPrecio por metro cuadrado: %.2f\n"
                + "Número de metros cuadrados: %d\nCosto Final: %.2f\n"
                + "Ubicación tiene como : \n"
                + "\tNombre del Barrio: %s\n\tReferencia: %s\n"
                + "Ciudad tiene como : \n"
                + "\tNombre ciudad: %s\n\tNombre provincia: %s\n"
                + "Número de cuartos: %d\nConstructora tiene como : \n"
                + "\tNombre constructora: %s\n\tId de la empresa: %d\n",
                obtenerPropietario().obtenerNombres(),
                obtenerPropietario().obtenerApellidos(),
                obtenerPropietario().obtenerIdentificacion(),
                obtenerPrecioMetro(),
                obtenerNumeroMetros(),
                obtenerCostoFinal(),
                obtenerUbicacion().obtenerNombreBarrio(),
                obtenerUbicacion().obtenerReferencia(),
                obtenerCiudad().obtenerNombreCiudad(),
                obtenerCiudad().obtenerNombreProvincia(),
                obtenerNumeroCuartos(),
                obtenerConstructora().obtenerNombreConstructora(),
                obtenerConstructora().obtenerId()
                );
      return cadena;  
    }
}
