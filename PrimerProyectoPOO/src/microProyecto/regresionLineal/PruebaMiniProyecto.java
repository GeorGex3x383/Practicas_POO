package com.microProyecto.regresionLineal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PruebaMiniProyecto {

	public static void main(String[] args) {
		
		 // Posiciones como columnas del archivo 
        final int PovPct = 1;
        final int Brth15to17 = 2;
        final int Brth18to19 = 3;
        final int ViolCrime = 4;

        // Abrir el archivo con datos para el modelado
        //path: "/Users/frags/Desktop/JavaClase/JavaTestWorkspace/MicroProyecto/src/com/microProyecto/regresionLineal/DatosNatalidadAlumnos.csv";
        Scanner input = new Scanner(System.in);
        System.out.print("Path y nombre del archivo con los datos: ");
        final String nombreArchivo = input.nextLine();

        LectorArchivo archivo = new LectorArchivo(nombreArchivo);

        // Leer archivo y conseguir valores 
        ArrayList<String> datos = archivo.leerArreglo();

        if( !datos.isEmpty() && datos.size() > 2 ){

            double[] valoresPovPct = archivo.obtenerColumnaN(datos, PovPct);
            double[] valoresBrth15to17 = archivo.obtenerColumnaN(datos, Brth15to17);
            double[] valoresBrth18to19 = archivo.obtenerColumnaN(datos, Brth18to19);
            double[] valoresViolCrime = archivo.obtenerColumnaN(datos, ViolCrime);

            if(valoresPovPct.length != 0 && valoresBrth15to17.length != 0 && valoresBrth18to19.length != 0 && valoresViolCrime.length != 0){
                //values: 11.9, 8.0, 5.7 (pedir 3 al mismo tiempo)
                double[] porcentajePobreza = new double[3];

                int j = 0;
                int validado = 0;
                while(j < 3){
                    try{
                        System.out.print("Porcentaje Pobreza: ");
                        porcentajePobreza[j] = input.nextDouble();
                        validado = 1;
                    }catch (InputMismatchException error){
                        System.out.println("No es un tipo double, vuelva a insertarlo.");
                        String basura = input.next();
                        validado = 0;
                    }
                    if( validado == 1 ){
                        j++;
                    }
                }//for

                input.close();

                // Crear Modelo con los valores 
                DecimalFormat df = new DecimalFormat("#.00");

                RegresionLineal regresionLinealBrth15to17 = new RegresionLineal(valoresPovPct, valoresBrth15to17);
                double pendienteRegresionLinealBrth15to17 = regresionLinealBrth15to17.getPendienteRegresion();
                double ordenadaRegresionLinealBrth15to17 = regresionLinealBrth15to17.getOrdenadaRegresion();
                System.out.println("El modelo de regresión lineal es: y = " + df.format(ordenadaRegresionLinealBrth15to17) + " + " + df.format(pendienteRegresionLinealBrth15to17) + "x");

                RegresionLineal regresionLinealBrth18to19 = new RegresionLineal(valoresPovPct, valoresBrth18to19);
                double pendienteRegresionLinealBrth18to19 = regresionLinealBrth18to19.getPendienteRegresion();
                double ordenadaRegresionLinealBrth18to19 = regresionLinealBrth18to19.getOrdenadaRegresion();
                System.out.println("El modelo de regresión lineal es: y = " + df.format(ordenadaRegresionLinealBrth18to19) + " + " + df.format(pendienteRegresionLinealBrth18to19) + "x");

                RegresionLineal regresionLinealViolCrime = new RegresionLineal(valoresPovPct, valoresViolCrime);
                double pendienteRegresionLinealViolCrime = regresionLinealViolCrime.getPendienteRegresion();
                double ordenadaRegresionLinealViolCrime = regresionLinealViolCrime.getOrdenadaRegresion();
                System.out.println("El modelo de regresión lineal es: y = " + df.format(ordenadaRegresionLinealViolCrime) + " + " + df.format(pendienteRegresionLinealViolCrime) + "x");

                for(int i = 0; i < 3; i++){
                    double tasaNatalidadBrth15to17 = (porcentajePobreza[i] * pendienteRegresionLinealBrth15to17) + ordenadaRegresionLinealBrth15to17;
                    System.out.println("La tasa de natalidad para un porcentaje de pobreza de " + df.format(porcentajePobreza[i]) + " es: " + df.format(tasaNatalidadBrth15to17));

                    double tasaNatalidadBrth18to19 = (porcentajePobreza[i] * pendienteRegresionLinealBrth18to19) + ordenadaRegresionLinealBrth18to19;
                    System.out.println("La tasa de natalidad para un porcentaje de pobreza de " + df.format(porcentajePobreza[i]) + " es: " + df.format(tasaNatalidadBrth18to19));

                    double tasaNatalidadViolCrime = (porcentajePobreza[i] * pendienteRegresionLinealViolCrime) + ordenadaRegresionLinealViolCrime;
                    System.out.println("La tasa de natalidad para un porcentaje de pobreza de " + df.format(porcentajePobreza[i]) + " es: " + df.format(tasaNatalidadViolCrime));
                }//for
            }//if archivo con datos no numéricos

        }else{
            System.out.println("No hay datos en el archivo o están en un formato no legible.");
        }//ifelse archivo con datos suficientes
    }

	}


