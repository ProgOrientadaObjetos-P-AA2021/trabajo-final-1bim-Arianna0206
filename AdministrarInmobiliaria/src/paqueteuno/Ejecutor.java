/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Scanner;
import paquetecinco.Constructora;
import paquetecinco.EscrituraArchivoSecuencialConstructora;
import paquetecinco.LecturaArchivoSecuencialConstructora;
import paquetecuatro.Ciudad;
import paquetecuatro.EscrituraArchivoSecuencialCiudad;
import paquetecuatro.LecturaArchivoSecuencialCiudad;
import paquetedos.EscrituraArchivoSecuencialPropietario;
import paquetedos.LecturaArchivoSecuencialPropietario;
import paquetedos.Propietario;
import paqueteseis.Casa;
import paqueteseis.Departamento;
import paqueteseis.EscrituraArchivoSecuencialCasa;
import paqueteseis.EscrituraArchivoSecuencialDepar;
import paqueteseis.LecturaArchivoSecuencialCasa;
import paqueteseis.LecturaArchivoSecuencialDepar;
import paquetetres.EscrituraArchivoSecuencialUbicacion;
import paquetetres.LecturaArchivoSecuencialUbicacion;
import paquetetres.Ubicacion;

/**
 *
 * @author macbookair
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        int salir;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una opción: \n"
                    + "Ingrese 1 para propietarios\n"
                    + "Ingrese 2 para ubicaciones\n"
                    + "Ingrese 3 para ciudades\n"
                    + "Ingrese 4 para constructoras\n"
                    + "Ingrese 5 para casas\n"
                    + "Ingrese 6 para departamentos\n");
            op = entrada.nextInt();
            if (op == 1) {
                propietarios();
            } else {
                if (op == 2) {
                    ubicaciones();
                } else {
                    if (op == 3) {
                        ciudades();
                    } else {
                        if (op == 4) {
                            constructoras();
                        } else {
                            if (op == 5) {
                                casas();
                            } else {
                                if (op == 6) {
                                    departamentos();
                                } else {
                                    System.out.println("Opción incorrecta");
                                }
                            }
                        }
                    }

                }
            }
            System.out.println("Ingresar 2 para dejar de ingresar más datos ");
            salir = entrada.nextInt();
            if (salir == 2) {
                bandera = false;
            }

        }

    }

    public static void propietarios() {
        Scanner entrada = new Scanner(System.in);
        String nombreArchivo = "propietarios.data";
        String nombres;
        String apellidos;
        int identificacion;

        System.out.println("Ingrese sus nombres ");
        nombres = entrada.nextLine();
        System.out.println("Ingrese sus apellidos ");
        apellidos = entrada.nextLine();
        System.out.println("Ingrese su identificación ");
        identificacion = entrada.nextInt();

        Propietario p = new Propietario(nombres, apellidos,
                identificacion);

        EscrituraArchivoSecuencialPropietario archivo
                = new EscrituraArchivoSecuencialPropietario(nombreArchivo);

        archivo.establecerRegistro(p);

        archivo.establecerSalida();

        archivo.cerrarArchivo();

        LecturaArchivoSecuencialPropietario lectura
                = new LecturaArchivoSecuencialPropietario(nombreArchivo);
        lectura.establecerPropietarios();
        System.out.println(lectura);

    }

    public static void ubicaciones() {
        Scanner entrada = new Scanner(System.in);
        String nombreArchivo = "ubicaciones.data";
        int numeroCasa;
        String nombreBarrio;
        String referencia;

        System.out.println("Ingrese su número de casa ");
        numeroCasa = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del barrio ");
        nombreBarrio = entrada.nextLine();
        System.out.println("Ingrese la referencia ");
        referencia = entrada.nextLine();

        Ubicacion u = new Ubicacion(numeroCasa, nombreBarrio,
                referencia);

        EscrituraArchivoSecuencialUbicacion archivo
                = new EscrituraArchivoSecuencialUbicacion(nombreArchivo);

        archivo.establecerRegistro(u);

        archivo.establecerSalida();

        archivo.cerrarArchivo();

        LecturaArchivoSecuencialUbicacion lectura
                = new LecturaArchivoSecuencialUbicacion(nombreArchivo);

        lectura.establecerUbicaciones();

        System.out.println(lectura);

    }

    public static void ciudades() {
        Scanner entrada = new Scanner(System.in);
        String nombreArchivo = "ciudades.data";
        String nombreCiudad;
        String nombreProvincia;

        System.out.println("Ingrese el nombre de la ciudad");
        nombreCiudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la provincia");
        nombreProvincia = entrada.nextLine();

        Ciudad cd = new Ciudad(nombreCiudad, nombreProvincia);

        EscrituraArchivoSecuencialCiudad archivo
                = new EscrituraArchivoSecuencialCiudad(nombreArchivo);

        archivo.establecerRegistro(cd);

        archivo.establecerSalida();

        archivo.cerrarArchivo();

        LecturaArchivoSecuencialCiudad lectura
                = new LecturaArchivoSecuencialCiudad(nombreArchivo);

        lectura.establecerCiudades();

        System.out.println(lectura);

    }

    public static void constructoras() {
        Scanner entrada = new Scanner(System.in);
        String nombreArchivo = "constructora.data";
        String nombreConstructora;
        int id;

        System.out.println("Ingrese el nombre de la "
                + "constructora");
        nombreConstructora = entrada.nextLine();
        System.out.println("Ingrese el id de la empresa");
        id = entrada.nextInt();

        Constructora ct = new Constructora(
                nombreConstructora, id);

        EscrituraArchivoSecuencialConstructora archivo
                = new EscrituraArchivoSecuencialConstructora(nombreArchivo);

        archivo.establecerRegistro(ct);

        archivo.establecerSalida();

        archivo.cerrarArchivo();

        LecturaArchivoSecuencialConstructora lectura
                = new LecturaArchivoSecuencialConstructora(nombreArchivo);
        lectura.establecerConstructoras();
        System.out.println(lectura);

    }

    public static void casas() {
        Scanner entrada = new Scanner(System.in);
        String nombreArchivo = "casas.data";
        int pro;
        double precioMetro;
        int numeroMetro;
        int ubi;
        String nCiu;
        int numeroCuartos;
        int idE;

        System.out.println("Ingrese el precio por metro"
                + " cuadrado");
        precioMetro = entrada.nextDouble();

        System.out.println("Ingrese el número de metros"
                + " cuadrados");
        numeroMetro = entrada.nextInt();

        System.out.println("Ingrese el número de "
                + "cuartos");
        numeroCuartos = entrada.nextInt();
        entrada.nextLine();

        System.out.println("----------------------------------");
        System.out.println("Ingrese la identificación del propietario");
        pro = entrada.nextInt();

        LecturaArchivoSecuencialPropietario lecturaPro
                = new LecturaArchivoSecuencialPropietario("propietarios.data");
        lecturaPro.establecerPropietarios();
        lecturaPro.establecerPropietarioObjeto(pro);
        Propietario propietario = lecturaPro.obtenerPropietarioObjeto();
        if (propietario != null) {
            System.out.println(propietario);
        } else {
            System.out.println("Propietario no registrado");
        }

        System.out.println("----------------------------------");
        System.out.println("Ingrese el número de casa");
        ubi = entrada.nextInt();

        LecturaArchivoSecuencialUbicacion lecturaUbi
                = new LecturaArchivoSecuencialUbicacion("ubicaciones.data");
        lecturaUbi.establecerUbicaciones();
        lecturaUbi.establecerUbicacionObjeto(ubi);
        Ubicacion ubicacion = lecturaUbi.obtenerUbicacionObjeto();
        if (ubicacion != null) {
            System.out.println(ubicacion);
        } else {
            System.out.println("Ubicacion no registrada");
        }

        entrada.nextLine();

        System.out.println("----------------------------------");
        System.out.println("Ingrese el nombre de la ciudad");
        nCiu = entrada.nextLine();

        LecturaArchivoSecuencialCiudad lecturaCiu
                = new LecturaArchivoSecuencialCiudad("ciudades.data");
        lecturaCiu.establecerCiudades();
        lecturaCiu.establecerCiudadObjeto(nCiu);
        Ciudad ciudad = lecturaCiu.obtenerCiudadObjeto();
        if (ciudad != null) {
            System.out.println(ciudad);
        } else {
            System.out.println("Ciudad no registrada");
        }

        System.out.println("----------------------------------");
        System.out.println("Ingrese el id de la empresa");
        idE = entrada.nextInt();

        LecturaArchivoSecuencialConstructora lecturaCons
                = new LecturaArchivoSecuencialConstructora("constructora.data");
        lecturaCons.establecerConstructoras();
        lecturaCons.establecerConstructoraObjeto(idE);
        Constructora constructora = lecturaCons.obtenerConstructoraObjeto();
        if (constructora != null) {
            System.out.println(constructora);
        } else {
            System.out.println("Constructora no registrada\n");
        }

        Casa casa = new Casa(propietario, precioMetro, numeroMetro,
                numeroCuartos, ubicacion, constructora, ciudad);
        casa.establecerCostoFinal();
        System.out.println(casa);

        EscrituraArchivoSecuencialCasa archivo
                = new EscrituraArchivoSecuencialCasa(nombreArchivo);

        archivo.establecerRegistro(casa);

        archivo.establecerSalida();

        archivo.cerrarArchivo();
    }

    public static void departamentos() {
        Scanner entrada = new Scanner(System.in);
        String nombreArchivo = "departamentos.data";
        double precioMetro;
        int numeroMetro;
        double valorMensual;
        String nombreEdi;
        String ubicacionEdificio;
        int cedula;
        int numeroCasa;
        String nombreCiu;
        int idE;

        System.out.println("Ingrese el precio por "
                + "metro cuadrado");
        precioMetro = entrada.nextDouble();
        System.out.println("Ingrese el número de "
                + "metros cuadrados");
        numeroMetro = entrada.nextInt();
        System.out.println("Ingrese el valor "
                + "alícuota mensual");
        valorMensual = entrada.nextDouble();
        System.out.println("Ingrese el nombre de "
                + "edificio");
        entrada.nextLine();
        nombreEdi = entrada.nextLine();
        System.out.println("Ingrese la ubicación "
                + "del departamento en edificio");
        ubicacionEdificio = entrada.nextLine();

        System.out.println("----------------------------------");
        System.out.println("Ingrese la identificación del propietario");
        cedula = entrada.nextInt();

        LecturaArchivoSecuencialPropietario lecturaPro
                = new LecturaArchivoSecuencialPropietario("propietarios.data");
        lecturaPro.establecerPropietarios();
        lecturaPro.establecerPropietarioObjeto(cedula);
        Propietario propietario = lecturaPro.obtenerPropietarioObjeto();
        if (propietario != null) {
            System.out.println(propietario);
        } else {
            System.out.println("Propietario no registrado");
        }

        System.out.println("----------------------------------");
        System.out.println("Ingrese el número de casa");
        numeroCasa = entrada.nextInt();

        LecturaArchivoSecuencialUbicacion lecturaUbi
                = new LecturaArchivoSecuencialUbicacion("ubicaciones.data");
        lecturaUbi.establecerUbicaciones();
        lecturaUbi.establecerUbicacionObjeto(numeroCasa);
        Ubicacion ubicacion = lecturaUbi.obtenerUbicacionObjeto();
        if (ubicacion != null) {
            System.out.println(ubicacion);
        } else {
            System.out.println("Ubicacion no registrada");
        }

        System.out.println("----------------------------------");
        System.out.println("Ingrese el nombre de la ciudad");
        entrada.nextLine();
        nombreCiu = entrada.nextLine();

        LecturaArchivoSecuencialCiudad lecturaCiu
                = new LecturaArchivoSecuencialCiudad("ciudades.data");
        lecturaCiu.establecerCiudades();
        lecturaCiu.establecerCiudadObjeto(nombreCiu);
        Ciudad ciudad = lecturaCiu.obtenerCiudadObjeto();
        if (ciudad != null) {
            System.out.println(ciudad);
        } else {
            System.out.println("Ciudad no registrada");
        }

        System.out.println("----------------------------------");
        System.out.println("Ingrese el id de la empresa");
        idE = entrada.nextInt();
        entrada.nextLine();

        LecturaArchivoSecuencialConstructora lecturaCons
                = new LecturaArchivoSecuencialConstructora("constructora.data");
        lecturaCons.establecerConstructoras();
        lecturaCons.establecerConstructoraObjeto(idE);
        Constructora constructora = lecturaCons.obtenerConstructoraObjeto();
        if (constructora != null) {
            System.out.println(constructora);
        } else {
            System.out.println("Constructora no registrada\n");
        }

        Departamento d = new Departamento(nombreEdi, ubicacionEdificio,
                numeroMetro, precioMetro, valorMensual, propietario, ubicacion,
                ciudad, constructora);
        d.establecerCostoFinal();
        System.out.println(d);

        EscrituraArchivoSecuencialDepar archivo
                = new EscrituraArchivoSecuencialDepar(nombreArchivo);

        archivo.establecerRegistro(d);

        archivo.establecerSalida();

        archivo.cerrarArchivo();
    }
}
