package com.polimorfismo.practicacuatro;

public class Esfera extends FiguraGeometrica {
	private float R, pi;
	
	public Esfera(String nombre, float R, float pi) {
		super(nombre);
		this.R = R;
		this.pi = pi;
	}
	
	public double CalcularArea() {
		return (4*pi*(Math.pow(R, 2)));
	}
	
	public double CalculaVolumen() {
		return ((4*pi*(Math.pow(R, 3)))/4);
	}

}

