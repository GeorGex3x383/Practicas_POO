package com.RecuperaDatos.practicaocho;

public class RegresionLineal2 {
	
	private double[] valx;
	private double[] valy;
	
	
	RegresionLineal2(double[] valx, double[] valy){
		this.valx=valx;
		this.valy=valy;
	}
	
	public double[] getValx() {
		
		return valx;
	}
	
	public double[] getValy() {
		
		return valy;
	}
	
	
	public double promediox() {
		
		double suma=0;
		
		for (int i =0; i< valx.length; i++ ) {
			suma += valx[i];
			
		}
		 
		return suma/valx.length;
	}
	
	public double promedioy() {
		
		double suma1=0;
		//suma=0;
		
		for (int i =0; i< valy.length; i++ ) {
			suma1 += valy[i];
		}
		return suma1/valy.length;
	}
	
	public double hacerCovarianza() {
		
		double b1=0;
		double promx= promediox();
		double promy= promedioy();
		
		for (int i =0; i< valy.length; i++ ) {
			
			b1 += (valx[i] - promx)*(valy[i] - promy);
		}
		return b1;
	}
	
public double hacerVarianza() {
	
	double b2=0;
	double promx= promediox();
		
		for (int i =0; i< valx.length; i++ ) {
			
			b2 += Math.pow((valx[i] - promx),2);
		}
		return b2;
	}
	
public double porcentajeError() {
	
	double b3=0;
	double promy= promedioy();
	double total;
	
	for (int i =0; i< valy.length; i++ ) {
		
		b3 += (Math.pow((valy[i] - promy),2));
	}
	
	total=b3/(valy.length-1);
	return Math.sqrt(total);
}

}
