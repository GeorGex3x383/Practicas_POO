package com.microProyecto.regresionLineal;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorArchivo {
	
	final String path;

    public LectorArchivo(String path){
        this.path = path;
    }

    public ArrayList<String> leerArreglo(){

        ArrayList<String> listaDatos = new ArrayList<String>();
        try{
            Scanner ArchivoCVS = new Scanner(new File(this.path));

            while (ArchivoCVS.hasNext()){
                listaDatos.add(ArchivoCVS.nextLine());
            }

            ArchivoCVS.close();
        }catch (FileNotFoundException ex){
            ex.toString();
            System.out.println("No se encontró el archivo.");
        }

        return listaDatos;
    }

    public double[] obtenerColumnaN(ArrayList<String> datos, int columna){
        String[] arregloTemporal = datos.toArray(new String[1]);

        String[][] separarFilas = new String[arregloTemporal.length][];

        for(int i = 0; i < arregloTemporal.length; i++){
            separarFilas[i] = arregloTemporal[i].split(",");
        }

        int longitud = separarFilas.length;
        double[] columnaDatos = new double[longitud-1];

        for(int i = 0; i<longitud-1; i++){
            try{
                columnaDatos[i] = Double.parseDouble(separarFilas[i+1][columna]);
            }catch(NumberFormatException numError){
                System.out.println("El valor " + (separarFilas[i+1][columna]) + " en la posición " + (i+1) + "," + (columna) + " del archivo de ruta " + this.path + " no es un dato válido.");
                double[] vacio = {};
                columnaDatos = vacio;
                break;
            }
        }

        return columnaDatos;
    }

}

