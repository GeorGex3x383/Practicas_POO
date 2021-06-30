package com.Interfaz3.practicatrece;


import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelUno extends JPanel{
	static JTextField textField;
	static ButtonGroup botonesG, botonesCovid;
	static JComboBox<String> dropDownList;
	
	public PanelUno() {
		this.setLayout(null);
		
		JLabel etiqueta = new JLabel("¿Cuál es su edad?");
		etiqueta.setBounds(50,50,110,20);
		this.add(etiqueta);
		
		JLabel etiquetaLogo = new JLabel(new ImageIcon("C:\\Users\\jemil\\Pictures\\iberoLogo3.png"));
		etiquetaLogo.setBounds(700,0,200,200);
		this.add(etiquetaLogo);
		
		textField = new JTextField(20);
		textField.setBounds(170,50,90,20);
		textField.setBackground(new Color(250,250,250));
		this.add(textField);
		
		JLabel etiquetaGen = new JLabel("¿Usted es?");
		etiquetaGen.setBounds(50,130,90,20);
		this.add(etiquetaGen);
		
		JRadioButton radioH = new JRadioButton("Hombre", true);
		radioH.setBounds(150, 130, 90, 20);
		radioH.setActionCommand("Hombre");
		JRadioButton radioM = new JRadioButton("Mujer", false);
		radioM.setBounds(300, 130, 90, 20);
		radioM.setActionCommand("Mujer");
		JRadioButton radioO = new JRadioButton("Otro", false);
		radioO.setBounds(450, 130, 90, 20);
		radioO.setActionCommand("Otro");
		botonesG = new ButtonGroup();
		botonesG.add(radioH);
		botonesG.add(radioM);
		botonesG.add(radioO);
		this.add(radioH);
		this.add(radioM);
		this.add(radioO);
		
		JLabel etiquetaEstado = new JLabel("¿En que estado de la republica reside?");
		etiquetaEstado.setBounds(50,200,250,20);
		this.add(etiquetaEstado);
		
		dropDownList = new JComboBox<String>();
		dropDownList.setBounds(300, 200, 110, 20);
		dropDownList.addItem("Jalisco");
		dropDownList.addItem("Veracruz");
		dropDownList.addItem("Puebla");
		dropDownList.addItem("CDMX");
		dropDownList.addItem("Oaxaca");
		dropDownList.addItem("Sonora");
		this.add(dropDownList);
		
		JLabel etiquetaCovid = new JLabel("¿Que tan probable es que se contagie de COVID?");
		etiquetaCovid.setBounds(350, 250, 500, 30);
		this.add(etiquetaCovid);
		
		JRadioButton radioCMP = new JRadioButton("Muy probable", true);
		radioCMP.setBounds(100, 300, 200, 30);
		radioCMP.setActionCommand("MP");
		JRadioButton radioCAP = new JRadioButton("Algo probale", false);
		radioCAP.setBounds(300, 300, 100, 30);
		radioCAP.setActionCommand("AP");
		JRadioButton radioCPP = new JRadioButton("Poco probable", false);
		radioCPP.setBounds(500, 300, 200, 30);
		radioCPP.setActionCommand("PP");
		JRadioButton radioCNP = new JRadioButton("Nada probable", false);
		radioCNP.setBounds(700, 300, 200, 30);
		radioCNP.setActionCommand("NP");
		botonesCovid = new ButtonGroup();
		botonesCovid.add(radioCMP);
		botonesCovid.add(radioCAP);
		botonesCovid.add(radioCPP);
		botonesCovid.add(radioCNP);
		this.add(radioCMP);
		this.add(radioCAP);
		this.add(radioCPP);
		this.add(radioCNP);
		
	}

}

