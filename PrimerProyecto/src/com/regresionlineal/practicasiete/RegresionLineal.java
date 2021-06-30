package com.regresionlineal.practicasiete;

public class RegresionLineal {
	public double promediox;
	public double promedioy;
	private double[] valoresx;
	private double[] valoresy;
	
	public double covarianza;
	public double varianza;
	public double b1;
	public double b;
	public double porcentajeError;
	public double porcentajePobreza;
	public double tasaNatalidad;
	
	public RegresionLineal(double[] valoresx, double[] valoresy, double covarianza, double varianza, double b1, double b, double porcentajeError, double porcentajePobreza){
		this.valoresx = valoresx;
		this.valoresy = valoresy;
		this.covarianza = covarianza;
		this.varianza = varianza;
		this.b1 = b1;
		this.b = b;
		this.porcentajeError = porcentajeError;
		this.porcentajePobreza = porcentajePobreza;
	}

	public double promediox(){
		for(int i=0; i<valoresx.length; i++) {
			promediox += valoresx[i];
		}
		promediox = promediox/valoresx.length;
		return promediox;
	}
	
	public double promedioy(){
		for(int i=0; i<valoresy.length; i++) {
			promedioy += valoresy[i];
		}
		promedioy = promedioy/valoresy.length;
		return promedioy;
	}
	
	public double calculaCovarianza() {
		for(int i=0; i<valoresx.length; i++) {
			covarianza += ((valoresx[i]-promediox)*(valoresy[i]-promedioy));
		}
		return covarianza;
	}
	
	public double calculaVarianza() {
		for(int i=0; i<valoresx.length; i++) {
			varianza += ((valoresx[i]-promediox)*(valoresx[i]-promediox));
		}
		return varianza;
	}
	
	public double calcularB1() {
		b1 = (calculaCovarianza()/calculaVarianza());
		return b1;
	}
	
	public double calcularB() {
		b = (promedioy) - (calcularB1()*promediox);
		return b;
	}
	
	public double calcularPorcentajeError() {
		for(int i=0; i<valoresy.length; i++) {
			porcentajeError += ((valoresy[i]-promedioy)*(valoresy[i]-promedioy));
		}
		porcentajeError = (porcentajeError / ((valoresy.length) - 1));
		return Math.sqrt(porcentajeError);
	}
	
	public double calcularTasaNatalidad() {
		tasaNatalidad = ((calcularB1()* porcentajePobreza)+calcularB());
		return tasaNatalidad;
	}

}

