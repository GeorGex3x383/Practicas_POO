package modelo;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Con esta clase se leen los datos que se encuentran en un archivo
public class LectorArchivo {
	
	String rutaArchivo;
	ArrayList<String> listaDatos = new ArrayList<String>();
	
	public LectorArchivo(String rutaArchivo){
		this.rutaArchivo = rutaArchivo;
	}
	
	public ArrayList<String> recuperaDeArchivo() {
		try {
			//Con esta linea podemos leer cualquier caracter que se encuentre en el archivo
			Scanner Archivo = new Scanner(new File(rutaArchivo),"UTF-8");
			
			while (Archivo.hasNext()) {
				listaDatos.add(Archivo.nextLine());
			}
			Archivo.close();
		} catch (FileNotFoundException ex) {
			ex.toString();
			System.out.println("No se encontró el archivo");
			System.exit(0);
		}
		return listaDatos;
	}
}