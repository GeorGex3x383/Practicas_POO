package com.Interfaz.practicadoce;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelUno extends JPanel{
	
	public PanelUno() {
		this.setLayout(null);
		
		JLabel etiqueta = new JLabel("¿Cuál es su edad?");
		etiqueta.setBounds(50,50,200,30);
		this.add(etiqueta);
		
		JLabel etiquetaLogo = new JLabel(new ImageIcon("C:\\Users\\jemil\\Pictures\\iberoLogo3.png"));
		etiquetaLogo.setBounds(700,0,200,200);
		this.add(etiquetaLogo);
		
		JTextField textField = new JTextField(20);
		textField.setBounds(170,50,150,30);
		this.add(textField);
		
		JLabel etiquetaGen = new JLabel("¿Usted es?");
		etiquetaGen.setBounds(50,130,100,30);
		this.add(etiquetaGen);
		
		JRadioButton radioH = new JRadioButton("Hombre", true);
		radioH.setBounds(150, 130, 100, 30);
		JRadioButton radioM = new JRadioButton("Mujer", false);
		radioM.setBounds(300, 130, 100, 30);
		JRadioButton radioO = new JRadioButton("Otro", false);
		radioO.setBounds(450, 130, 100, 30);
		ButtonGroup botones = new ButtonGroup();
		botones.add(radioH);
		botones.add(radioM);
		botones.add(radioO);
		this.add(radioH);
		this.add(radioM);
		this.add(radioO);
		
		JLabel etiquetaEstado = new JLabel("¿En que estado de la republica reside?");
		etiquetaEstado.setBounds(50,200,300,30);
		this.add(etiquetaEstado);
		
		JComboBox<String> dropDownList = new JComboBox<String>();
		dropDownList.setBounds(300, 200, 150, 30);
		dropDownList.addItem("Jalisco");
		dropDownList.addItem("Veracruz");
		dropDownList.addItem("Puebla");
		dropDownList.addItem("CDMX");
		dropDownList.addItem("Oaxaca");
		dropDownList.addItem("Sonora");
		this.add(dropDownList);
		
		JLabel etiquetaCovid = new JLabel("¿Que tan probable es que se contagie de COVID?");
		etiquetaCovid.setBounds(350, 300, 500, 30);
		this.add(etiquetaCovid);
		
		JRadioButton radioCMP = new JRadioButton("Muy probable", true);
		radioCMP.setBounds(100, 350, 200, 30);
		JRadioButton radioCAP = new JRadioButton("Algo probale", false);
		radioCAP.setBounds(300, 350, 100, 30);
		JRadioButton radioCPP = new JRadioButton("Poco probable", false);
		radioCPP.setBounds(500, 350, 200, 30);
		JRadioButton radioCNP = new JRadioButton("Nada probable", false);
		radioCNP.setBounds(700, 350, 200, 30);
		ButtonGroup botonesCovid = new ButtonGroup();
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
