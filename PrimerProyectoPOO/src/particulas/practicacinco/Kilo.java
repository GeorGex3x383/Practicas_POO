package com.particulas.practicacinco;

public class Kilo extends Particulas {
	private double f, pi;
	
	public Kilo(double m, double p, double f, double pi) {
		super(m,p);
		this.f = f;
		this.pi = pi;
	}
	
	public double calculaEnegia() {
		return ((pi*(Math.sqrt(m))*(p/3)*(Math.pow(f, 2))));
	}

}
