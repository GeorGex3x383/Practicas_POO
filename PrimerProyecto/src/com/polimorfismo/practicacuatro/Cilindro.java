package com.polimorfismo.practicacuatro;

public class Cilindro extends FiguraGeometrica{
	double AB;
	private float AH, R, h, pi;
	
	public Cilindro(String nombre, float R,float h,float pi) {
		super(nombre);
		this.R = R;
		this.h = h;
		this.pi = pi;
	}
	public float CalculaArea() {
		AB = (pi*(Math.pow(R, 2)));
		AH = (2*pi*R*h);
		return (float) (2*AB+AH);
	}
	public float CalculaVolumen() {
		return (float) (AB*h);
	}

}
