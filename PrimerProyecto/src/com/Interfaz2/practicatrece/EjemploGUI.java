package com.Interfaz2.practicatrece;

import javax.swing.JFrame;

import com.Interfaz.practicadoce.PanelUno;

public class EjemploGUI extends JFrame{
	
	public EjemploGUI() {
		super("Encuesta Encovid19");
		setBounds(0, 0, 700, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelUno pan1 = new PanelUno();
		this.add(pan1);
	}

}