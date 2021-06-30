package com.herencia.practicatres;

public class Secretaria extends Empleados{
	
private int mNumActividades;
	
	Secretaria(String nNombre, String mNumEmpleado, float mSalario, int mNumActividades) {
		super(nNombre,mNumEmpleado, mSalario);
		this.mNumActividades = mNumActividades;
	}
	
	public float getmNumActividades() {
		return mNumActividades;
	}
	

}
