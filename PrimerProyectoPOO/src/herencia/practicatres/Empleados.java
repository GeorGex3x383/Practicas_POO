package com.herencia.practicatres;

public class Empleados extends Persona {
	
	private String mNumEmpleado;
	private float mSalario;
	
	Empleados(String nNombre, String mNumEmpleado, float mSalario ) {
		super(nNombre);
		this.mNumEmpleado = mNumEmpleado;
		this.mSalario = mSalario;
	}
	
	public String getmNumEmpleado() {
		return mNumEmpleado;
	}
	
	public float getmSalario() {
		return mSalario;
	}

}
