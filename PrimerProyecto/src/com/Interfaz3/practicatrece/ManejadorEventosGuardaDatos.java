package com.Interfaz3.practicatrece;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ManejadorEventosGuardaDatos implements ActionListener{
	ArrayList <DatosPersona> arrListDatPersona = new ArrayList<DatosPersona>();
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource() == PanelDos.botonGuardar) {
			try {
				System.out.println("-------");
				int edad = Integer.parseInt(PanelUno.textField.getText());
				String genero = PanelUno.botonesG.getSelection().getActionCommand();
				String residencia = PanelUno.dropDownList.getSelectedItem().toString();
				String contagio = PanelUno.botonesCovid.getSelection().getActionCommand();
				String frecuencia = PanelDos.botonFrecuencia.getSelection().getActionCommand();
				String concentracion = PanelDos.botonConcentracion.getSelection().getActionCommand();
				
				arrListDatPersona = DatosPersona.agregarPersona(genero, edad, residencia, contagio,frecuencia, concentracion);
				
				PanelDos.etiqueta.setText("Los Datos agregados fueron: " + arrListDatPersona.get(0).getGenero() + 
						" , " + Integer.toString(arrListDatPersona.get(0).getEdad()) + 
						" , " + arrListDatPersona.get(0).getResidencia() + 
						" , " + arrListDatPersona.get(0).getContagio() +
						" , " + arrListDatPersona.get(0).getFrecuencia() +
						" , " + arrListDatPersona.get(0).getConcentracion());
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Solo numeros", "Error entrada", JOptionPane.ERROR_MESSAGE);
				System.out.println("Se genero un error");
			}
		}
	}

}
