package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
//Clase en la que se crea el panel con distintos objetos
public class PanelUno extends JPanel{
	public static JButton botonArchivo, botonPalabras, botonGraficar;
	
	public PanelUno() {
		this.setLayout(null);
		
		//Etiqueta que contiene el logo de la UIA con sus propiedades
		JLabel etiquetaLogo = new JLabel(new ImageIcon("C:\\Users\\jemil\\Pictures\\iberoLogo3.png"));
		etiquetaLogo.setBounds(300,100,200,200);
		this.add(etiquetaLogo);
		
		//Boton con el que se consiguen los tweets y sus propiedades
		botonArchivo = new JButton("Cargar Archivo");
		botonArchivo.setBounds(50, 330, 200, 30);
		getBackground();
		botonArchivo.setBackground(Color.cyan);
		getBackground();
		botonArchivo.setForeground(Color.black);
		botonArchivo.setFocusPainted(false);
		botonArchivo.setFont(new Font("Tahoma", Font.ITALIC, 12));
		this.add(botonArchivo);
		
		//Boton con el que se consiguen las palabras que se desean buscar y sus propiedades
		botonPalabras = new JButton("Cargar Base Palabras");
		botonPalabras.setBounds(300, 330, 200, 30);
		getBackground();
		botonPalabras.setBackground(Color.cyan);
		getBackground();
		botonPalabras.setForeground(Color.black);
		botonPalabras.setFocusPainted(false);
		botonPalabras.setFont(new Font("Tahoma", Font.ITALIC, 12));
		this.add(botonPalabras);
		
		//Boton con el que se grafican los datos cargados y sus propiedades
		botonGraficar = new JButton("Graficar");
		botonGraficar.setBounds(550, 330, 200, 30);
		getBackground();
		botonGraficar.setBackground(Color.cyan);
		getBackground();
		botonGraficar.setForeground(Color.black);
		botonGraficar.setFocusPainted(false);
		botonGraficar.setFont(new Font("Tahoma", Font.ITALIC, 12));
		this.add(botonGraficar);
		
		//Etiqueta que contiene el logo de la compañia con sus propiedades
		JLabel etiquetaLogoC = new JLabel(new ImageIcon("C:\\Users\\jemil\\Pictures\\cromitLogo.png"));
		etiquetaLogoC.setBounds(680,400,200,200);
		this.add(etiquetaLogoC);
		
	}

}

