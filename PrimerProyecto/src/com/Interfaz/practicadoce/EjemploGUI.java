package com.Interfaz.practicadoce;

import javax.swing.JFrame;

public class EjemploGUI extends JFrame{
	
	public EjemploGUI() {
		super("Encuesta Encovid19");
		setBounds(0, 0, 1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelUno pan1 = new PanelUno();
		this.add(pan1);
	}

}
