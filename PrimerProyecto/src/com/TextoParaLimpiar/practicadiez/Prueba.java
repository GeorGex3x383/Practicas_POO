package com.TextoParaLimpiar.practicadiez;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Prueba {

	public static void main(String[] args) {
		//C:\Users\jemil\Downloads\textoPrueba.txt
		//C:\Users\jemil\Downloads\palbrasElimina.txt
		//String TextoParaLimpiar = "La clase String tiene\t métodos para*manipulación de cadenas,\n";
		//TextoParaLimpiar += " sin embargo se+pueden implemen7tar métodos para tare4as específicas.\n";
		//TextoParaLimpiar += "Se muestran eje34mplos? de adecuación\t de datos en la materia POO\n";
		//TextoParaLimpiar += "Saludos a todos los estudia456ntes.\n";
		
		Scanner input = new Scanner(System.in);
        System.out.print("Path y nombre del archivo con el texto: ");
		String rutaTexto = input.nextLine();
		
		//Scanner input2 = new Scanner(System.in);
        //System.out.print("Path y nombre del archivo con las palabras a Eliminar: ");
		//String rutaPalabra = input.nextLine();
		try {
			Scanner conjuntoPalabras = new Scanner(new File("C:\\Users\\jemil\\Downloads\\palbrasElimina.txt"));
			
			LectorArchivo texto = new LectorArchivo(rutaTexto);
			ArrayList<String> datos = texto.recuperaDeArchivo();
			String textoCorrecto = datos.toString();
			String[] textoCorrecto2 = textoCorrecto.split(",");
			System.out.println("Texto correcto: "+ textoCorrecto);
			for(int i=0; i<textoCorrecto.length(); i++) {
				System.out.println("Datoooooos: "+ textoCorrecto2[i]);
			}
			ArrayList<String> palabrasAEliminar = new ArrayList<String>();
			LimpiarTexto textoLimpio = new LimpiarTexto(textoCorrecto);
			//System.out.println( textoLimpio.limpiarTexto() );
			
			while(conjuntoPalabras.hasNextLine()) {
				String palabraQuitar = conjuntoPalabras.nextLine().toLowerCase();
				System.out.println("Palabras a quitar: "+ palabraQuitar);
				if(textoCorrecto.contains(palabraQuitar)) {
					palabrasAEliminar.add(palabraQuitar);
				}
			}
			//textoCorrecto2.removeAll(palabrasAEliminar);
			System.out.println("Texto sin palabras: "+ datos.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//LectorPalabras palabras = new LectorPalabras(rutaPalabra);
		
		//ArrayList<String> datos2 = palabras.recuperaDeArchivo();
		//String palabrasCorrectas = datos2.toString();
		
		
		//LimpiarPalabras palabrasLimpias = new LimpiarPalabras(palabrasCorrectas);
		
		//System.out.println( palabrasLimpias.limpiarTexto() );
		
		
		//if(textoLimpio.limpiarTexto().contains(palabrasLimpias.limpiarTexto())) {
		//	palabrasAEliminar.add(palabrasLimpias.limpiarTexto());
		//}
		
		//datos.removeAll(palabrasAEliminar);
		//System.out.println("Texto sin palabras: "+ datos.toString());
		
	}

}
