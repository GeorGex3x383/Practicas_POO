package com.Interfaz3.practicatrece;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelDos extends JPanel{
	static JButton botonGuardar;
	static ButtonGroup botonFrecuencia, botonConcentracion;
	static JLabel etiqueta;

	public PanelDos() {
		this.setLayout(null);
		
		JLabel etiquetaCovid = new JLabel("En las dos ultimas semanas �Con que frecuencia ha sentido nervios?");
		etiquetaCovid.setBounds(300, 0, 500, 30);
		this.add(etiquetaCovid);
		
		JRadioButton radioCMP = new JRadioButton("Nunca", true);
		radioCMP.setBounds(100, 50, 200, 30);
		radioCMP.setActionCommand("Nunca");
		JRadioButton radioCAP = new JRadioButton("Varios d�as", false);
		radioCAP.setBounds(300, 50, 100, 30);
		radioCAP.setActionCommand("Varios D�as");
		JRadioButton radioCPP = new JRadioButton("M�s de la mitad", false);
		radioCPP.setBounds(500, 50, 200, 30);
		radioCPP.setActionCommand("M�s de la Mitad");
		JRadioButton radioCNP = new JRadioButton("Casi todos o todos los d�as", false);
		radioCNP.setBounds(700, 50, 200, 30);
		radioCNP.setActionCommand("Casi todos o todos los d�as");
		botonFrecuencia = new ButtonGroup();
		botonFrecuencia.add(radioCMP);
		botonFrecuencia.add(radioCAP);
		botonFrecuencia.add(radioCPP);
		botonFrecuencia.add(radioCNP);
		this.add(radioCMP);
		this.add(radioCAP);
		this.add(radioCPP);
		this.add(radioCNP);
		
		JLabel etiquetaCovid2 = new JLabel("En la ultima semana �Le cost� trabajo concentrarse?");
		etiquetaCovid2.setBounds(300, 100, 500, 30);
		this.add(etiquetaCovid2);
		
		JRadioButton radioRV = new JRadioButton("Rara vez o nunca (Menos de 1 d�a)", true);
		radioRV.setBounds(100, 150, 300, 30);
		radioRV.setActionCommand("1 d�a");
		JRadioButton radioPV = new JRadioButton("Pocas veces o alguna vez (1 o 2 d�as)", false);
		radioPV.setBounds(100, 190, 300, 30);
		radioPV.setActionCommand("1 o 2 d�as");
		JRadioButton radioVC = new JRadioButton("Un n�mero de veces considerable (3 o 4 d�as)", false);
		radioVC.setBounds(100, 230, 300, 30);
		radioVC.setActionCommand("3 o 4 d�as");
		JRadioButton radioTM = new JRadioButton("Todo o la mayor�a del tiempo (5 o m�s d�as)", false);
		radioTM.setBounds(100, 270, 300, 30);
		radioTM.setActionCommand("5 o m�s d�as");
		
		botonConcentracion = new ButtonGroup();
		botonConcentracion.add(radioRV);
		botonConcentracion.add(radioPV);
		botonConcentracion.add(radioVC);
		botonConcentracion.add(radioTM);
		this.add(radioRV);
		this.add(radioPV);
		this.add(radioVC);
		this.add(radioTM);
		
		botonGuardar = new JButton("Guardar");
		botonGuardar.setBounds(250, 300, 200, 30);
		this.add(botonGuardar);
		
		etiqueta = new JLabel("Datos: ");
		etiqueta.setBounds(490, 300, 800, 50);
		this.add(etiqueta);
		
	}

}
