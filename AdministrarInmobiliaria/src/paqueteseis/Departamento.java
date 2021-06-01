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
public class Departamento implements Serializable{
    private Propietario propietario;
    private double precioMetro;
    private int numeroMetros;
    private double valorMensual;
    private double costoFinal;
    private Ubicacion ubicacion;
    private Ciudad ciudad;
    private String nombreEdificio;
    private String ubicacionEdificio;
    private Constructora constructora;
    
    public Departamento( String nE, String uE, int nM, double pM, double vM,
            Propietario p, Ubicacion u, Ciudad c, Constructora ct){
        precioMetro = pM;
        numeroMetros = nM;
        valorMensual = vM;
        nombreEdificio = nE;
        ubicacionEdificio = uE;
        propietario = p;
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
    
    public void establecerValorMensual(double n){
        valorMensual = n;
    }
    
    public void establecerCostoFinal(){
        costoFinal = ((numeroMetros * precioMetro) + (valorMensual * 12));
    }
    
    public void establecerUbicacion(Ubicacion n){
        ubicacion = n;
    }
    
    public void establecerCiudad(Ciudad n){
        ciudad = n;
    }
    
    public void establecerNombreEdificio(String n){
        nombreEdificio = n;
    }
    
    public void establecerUbicacionEdificio(String n){
        ubicacionEdificio = n;
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
    
    public double obtenerValorMensual(){
        return valorMensual;
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
    
    public String obtenerNombreEdificio(){
        return nombreEdificio;
    }
    
    public String obtenerUbicacionEdificio(){
        return ubicacionEdificio;
    }
    
    public Constructora obtenerConstructora(){
        return constructora;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Un departamento posee características "
                + "como: \n"
                + "Propietario tiene como: \n"
                + "\tNombres: %s\n\tApellidos: %s\n\tIdentificación: %s\n"
                + "Precio por metro cuadrado: %.2f\n"
                + "Número de metros cuadrados: %d\n"
                + "Valor alícuota mensual: %.2f\n"
                + "Costo Final: %.2f\n"
                + "Ubicación tiene como: \n"
                + "\tNúmero de casa: %d\n\tNombre del barrio: %s\n\t"
                + "Referencia: %s\n"
                + "Ciudad tiene como: \n"
                + "\tNombre ciudad: %s\n\tNombre provincia: %s\n"
                + "Nombre de edificio: %s\n"
                + "Ubicación del departamento: %s\n"
                + "Costructora tiene como: \n"
                + "\tNombre constructora: %s\n\tId: %d\n",
                obtenerPropietario().obtenerNombres(),
                obtenerPropietario().obtenerApellidos(),
                obtenerPropietario().obtenerIdentificacion(),
                obtenerPrecioMetro(),
                obtenerNumeroMetros(),
                obtenerValorMensual(),
                obtenerCostoFinal(),
                obtenerUbicacion().obtenerNumeroCasa(),
                obtenerUbicacion().obtenerNombreBarrio(),
                obtenerUbicacion().obtenerReferencia(),
                obtenerCiudad().obtenerNombreCiudad(),
                obtenerCiudad().obtenerNombreProvincia(),
                obtenerNombreEdificio(),
                obtenerUbicacionEdificio(),
                obtenerConstructora().obtenerNombreConstructora(),
                obtenerConstructora().obtenerId());
        return cadena;
    } 
}
