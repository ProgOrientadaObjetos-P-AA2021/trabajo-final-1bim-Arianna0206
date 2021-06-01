/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class LecturaArchivoSecuencialDepar {

    private ObjectInputStream entrada;
    private ArrayList<Departamento> departamentos;
    private String nombreArchivo;

    public LecturaArchivoSecuencialDepar(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerDepartamentos() {
        departamentos = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Departamento registro = (Departamento) entrada.readObject();
                    departamentos.add(registro);
                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }

    public ArrayList<Departamento> obtenerDepartamentos() {
        return departamentos;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Departamentos\n";
        for (int i = 0; i < obtenerDepartamentos().size(); i++) {
            Departamento d = obtenerDepartamentos().get(i);
            cadena = String.format("%s(%d) Propietarios:\n%s\n"
                    + "Precio por metro cuadrado: %.2f\n"
                    + "Números de metros cuadrados: %d\n"
                    + "Valor alícuota mensual: %.2f\n"
                    + "Costo Final: %.2f\n"
                    + "Ubicación:\n%s\nCiudad:\n%s\nNombre del edificio: %s\n"
                    + "Ubicación del edificio: %s\nConstructora:\n%s\n", cadena,
                    i + 1,
                    d.obtenerPropietario(),
                    d.obtenerPrecioMetro(),
                    d.obtenerNumeroMetros(),
                    d.obtenerValorMensual(),
                    d.obtenerCostoFinal(),
                    d.obtenerUbicacion(),
                    d.obtenerCiudad(),
                    d.obtenerNombreEdificio(),
                    d.obtenerUbicacionEdificio(),
                    d.obtenerConstructora());

        }
        return cadena;
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}
