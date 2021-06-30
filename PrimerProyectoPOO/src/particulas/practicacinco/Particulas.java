package com.particulas.practicacinco;

public class Particulas {
	protected double m,p;
	
	public Particulas(double m, double p) {
		this.m = m;
		this.p = p;
	}
	
	public double getmasa() {
		return m;
	}
	
	public double getfactor() {
		return p;
	}
	
	public double calculaEnegia() {
		return 0.0;
	}

}
