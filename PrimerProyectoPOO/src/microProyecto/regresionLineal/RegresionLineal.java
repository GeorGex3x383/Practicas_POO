package com.microProyecto.regresionLineal;

public class RegresionLineal {
	
	 private double x[];
	    private double y[];

	    public RegresionLineal(double x[], double y[]){
	        this.x = x.clone();
	        this.y = y.clone();
	    }

	    public double getPromedioX() throws Exception{
	        double promedio = 0;
	        if(this.x.length == 0){
	            throw new ArithmeticException("Error PromedioX");
	        }else{
	            for(int i = 0; i<this.x.length; i++){
	                promedio += this.x[i]/this.x.length;
	            }
	        }
	        return promedio;
	    }

	    public double getPromedioY() throws Exception{
	        double promedio = 0;
	        if(this.y.length == 0){
	            throw new ArithmeticException("Error PromedioX");
	        }else{
	            for(int i = 0; i<this.y.length; i++){
	                promedio += this.y[i]/this.y.length;
	            }
	        }
	        return promedio;
	    }

	    public double getCovarianza(){
	        double cteX = 0;
	        double cteY = 0;
	        double covarianza = 0;

	        try{
	            cteX = this.getPromedioX();
	            cteY = this.getPromedioY();
	        }catch (Exception e){
	        }

	        for(int i = 0; (i < this.x.length && i < this.y.length); i++){
	            covarianza += (this.x[i]-cteX) * (this.y[i]-cteY);
	        }

	        return covarianza;
	    }

	    public double getVarianza(){
	        double cteX = 0;
	        double varianza = 0;

	        try{
	            cteX = this.getPromedioX();
	        }catch (Exception e){
	        }

	        for(int i = 0; i < this.x.length; i++){
	            varianza += (this.x[i]-cteX) * (this.x[i]-cteX);
	        }
	        
	        return varianza;
	    }

	    public double getVariacionError(){
	        double cteY = 0;
	        double variacionError = 0;

	        try{
	            cteY = this.getPromedioY();
	        }catch (Exception e){
	        }

	        for(int i = 0; i < this.y.length; i++){
	            variacionError += ((this.y[i]-cteY) * (this.y[i]-cteY))/(this.y.length-1);
	        }
	        variacionError = Math.sqrt(variacionError);
	        
	        return variacionError;
	    }

	    public double getPendienteRegresion(){
	        return (this.getCovarianza())/(this.getVarianza());
	    }

	    public double getOrdenadaRegresion(){
	        double cteX = 0;
	        double cteY = 0;
	        double ordenadaRegresion = 0;

	        try{
	            cteX = this.getPromedioX();
	            cteY = this.getPromedioY();
	        }catch (Exception e){
	        }

	        ordenadaRegresion = cteY - (this.getPendienteRegresion() * cteX); 

	        return ordenadaRegresion;
	    }

}
