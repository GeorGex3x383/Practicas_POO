package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.DatosGrafica;
import modelo.LectorArchivo;
import modelo.LimpiarTexto;
import vista.BarChart;
import vista.EjemploGUI;
import vista.PanelUno;

//En esta clase se llevan a cabo las interacciones de los botones y las actualizaciones que se deben realizar al utilizarlos
public class ControladorInterfaz implements ActionListener{
	EjemploGUI vistaFrame;
	ArrayList<String> listaArchivo = new ArrayList<String>();
	ArrayList<String> listaPalabras = new ArrayList<String>();
	ArrayList<DatosGrafica> arrListDatGrafica = new ArrayList<DatosGrafica>();
	
	//Constructor de la clase 
	public ControladorInterfaz(EjemploGUI vistaFrame) {
		this.vistaFrame = vistaFrame;
		PanelUno.botonArchivo.addActionListener(this);
		PanelUno.botonPalabras.addActionListener(this);
		PanelUno.botonGraficar.addActionListener(this);
	}
	
public void actionPerformed(ActionEvent evento) {
		
	//Eventos que se controlan al oprimir el boton para leer el archivo de tweets
		if(evento.getSource() == PanelUno.botonArchivo) {
			try {
				//Con esta clase se lee el archivo de tweets
				LectorArchivo archivo = new LectorArchivo("C:\\Users\\jemil\\Downloads\\vaccination_tweets_ClasePOOLimpiarFinal.csv");
				listaArchivo = archivo.recuperaDeArchivo();
				//Con esta clase se limpia el archivo leído
				LimpiarTexto LP = new LimpiarTexto();
				String[] arregloArchivo = listaArchivo.toArray(new String[1]);
				for(int i=0; i<arregloArchivo.length; i++) {
					arregloArchivo[i] = LP.limpiarTexto(arregloArchivo[i]);
					//System.out.println(arregloArchivo[i]);
				}
				
				//Con esta variable actualizamos los datos que se leyeron del archivo
				arrListDatGrafica = DatosGrafica.agregarDatos(listaArchivo, null, arregloArchivo, null, null);
				
				//Se le avisa al usuario que se logró la función deseada
				JOptionPane.showMessageDialog(null, "Se cargo el archivo de Tweets...","Actualización archivo CSV" , JOptionPane.INFORMATION_MESSAGE);
			//Se cuida posibles excepciones 
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Solo numeros", "Error entrada", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		//Eventos que se controlan al oprimir el boton para leer el archivo de palabras
		if(evento.getSource() == PanelUno.botonPalabras) {
			try {
				//Con esta clase se lee el archivo de tweets
				LectorArchivo archivoPalabras = new LectorArchivo("C:\\Users\\jemil\\Downloads\\textoProyecto.txt");
				listaPalabras = archivoPalabras.recuperaDeArchivo();
				String[] arregloPalabras = listaPalabras.toArray(new String[1]);
				//Con esta clase se limpia el archivo leído
				LimpiarTexto LP = new LimpiarTexto();
				for(int i=0; i<arregloPalabras.length; i++) {
					arregloPalabras[i] = LP.limpiarTexto(arregloPalabras[i]);
					//System.out.println(arregloPalabras[i]);
				}
				
				//En este arreglo se guardan las cantidades de palabras que se encuentran en el archivo
				int[] arregloContador = new int[arregloPalabras.length];
				for(int i=0; i<arregloPalabras.length; i++) {
					arregloContador[i] = 0;
				}
				
				//Se verifica cuantas veces se encuentran las palabras deseadas en el texto y se cuentan
				for(int i=0; i<arregloPalabras.length; i++) {
					for(int j=0; j<arrListDatGrafica.get(0).getArregloArchivo().length; j++) {
						//System.out.println("Texto :" + arregloTemporalTexto[i] + " Palabra:" + arregloTemporalPalabras[j]);
						if(arrListDatGrafica.get(0).getArregloArchivo()[j].contains(arregloPalabras[i])) {
							arregloContador[i] += 1;
							//System.out.println("Texto :" + arregloTemporalTexto[j] + " Palabra:" + arregloTemporalPalabras[i]);
						}
					}
				}
				//Con esta variable actualizamos los datos que se leyeron del archivo de palabras
				arrListDatGrafica = DatosGrafica.agregarDatos(null, listaPalabras, null, arregloPalabras, arregloContador);
				//Se le avisa al usuario que se logró la función deseada
				JOptionPane.showMessageDialog(null, "Se cargo el archivo de Palabras","Actualización archivo palabras" , JOptionPane.INFORMATION_MESSAGE);
			//Se cuida posibles excepciones
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Primero se debe cargar el archivo de tweets", "Error al comparar palabras", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		//Eventos que se controlan al oprimir el boton para graficar los datos
		if(evento.getSource() == PanelUno.botonGraficar) {
			try {
				//Se mandan los datos para graficarlos 
				BarChart demo = new BarChart("Grafica tweets", arrListDatGrafica.get(0).getArregloPalabras(), arrListDatGrafica.get(0).getArregloContador());
				demo.pack();
				demo.setVisible(true);		
			//Eventos que se controlan al oprimir el boton para leer el archivo de palabras
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "No se han cargado los dos archivos", "Error para graficar", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}
