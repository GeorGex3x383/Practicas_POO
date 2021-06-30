package com.particulas.practicacinco;

public class Nano extends Particulas {
	private double r, pi;
	
	public Nano(double m, double p, double r, double pi) {
		super(m,p);
		this.r = r;
		this.pi = pi;
	}
	
	public double calculaEnegia() {
		return ((pi*(m/3)*p*(Math.pow(r, 2))));
	}

}
