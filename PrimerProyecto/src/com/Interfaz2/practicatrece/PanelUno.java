package com.Interfaz2.practicatrece;

//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelUno extends JPanel{
	
	public PanelUno() {
		this.setLayout(null);
		
		JLabel etiqueta = new JLabel("Texto JAVIER");
		etiqueta.setBounds(50,50,100,30);
		this.add(etiqueta);
		
		//JLabel etiquetaLogo = new JLabel("iberoLogo.png");
		//etiquetaLogo.setBounds(600, 0, 100, 30);
		//this.add(etiquetaLogo);
		
		JTextField textField = new JTextField(20);
		textField.setBounds(150,50,100,30);
		this.add(textField);
		
		JButton boton = new JButton("Presionar");
		boton.setBounds(100,100,100,30);
		this.add(boton);
	}

}

