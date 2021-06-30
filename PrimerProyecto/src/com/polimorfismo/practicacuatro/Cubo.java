package com.polimorfismo.practicacuatro;

public class Cubo extends FiguraGeometrica{
	
	private double a;
	
	public Cubo(String nombre, double a) {
		super(nombre);
		this.a = a;
	}
	
	public double CalculaArea() {
		return Math.pow(a, 2);
	}
	
	public double CalculaVolumen() {
		return Math.pow(a, 3);
	}

}
