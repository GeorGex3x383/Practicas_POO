package com.Interfaz3.practicatrece;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class EjemploGUI extends JFrame{
	
	public EjemploGUI() {
		super("Encuesta COVID19");
		setBounds(0, 0, 1300, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(2,1));
		
		PanelUno pan1 = new PanelUno();
		this.add(pan1);
		
		PanelDos pan2 = new PanelDos();
		this.add(pan2);
		
		ManejadorEventosGuardaDatos eventosP = new ManejadorEventosGuardaDatos();
		PanelDos.botonGuardar.addActionListener(eventosP);
	}

}

