package com.Interfaz3.practicatrece;

import java.util.ArrayList;

public class DatosPersona {
	
	private String genero;
	private int edadP;
	private String residencia;
	private String contagio;
	private String frecuencia;
	private String concentracion;
	
	public String getGenero() {
		return genero;
	}
	public int getEdad() {
		return edadP;
	}
	public String getResidencia() {
		return residencia;
	}
	public String getContagio() {
		return contagio;
	}
	public String getFrecuencia() {
		return frecuencia;
	}
	public String getConcentracion() {
		return concentracion;
	}
	
	public DatosPersona(String genero, int edadP, String residencia, String contagio, String frecuencia, String concentracion) {
		this.genero = genero;
		this.edadP = edadP;
		this.residencia = residencia;
		this.contagio = contagio;
		this.frecuencia = frecuencia;
		this.concentracion = concentracion;
	}
	
	public static ArrayList<DatosPersona> agregarPersona(String genero, int edadP, String residencia, String contagio, String frecuencia, String concentracion){
		ArrayList <DatosPersona> ArListDatosPersona = new ArrayList<DatosPersona>();
		ArListDatosPersona.add(new DatosPersona(genero, edadP, residencia, contagio, frecuencia, concentracion));
		return ArListDatosPersona;
	}

}
