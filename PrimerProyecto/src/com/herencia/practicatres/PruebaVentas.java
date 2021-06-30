package com.herencia.practicatres;

public class PruebaVentas {

	public static void main(String[] args) {
		
		Ventas venta1 = new Ventas ("Claudia","SO347", (float) 10000, (float) 1000);
		Gerente gerente1 = new Gerente ("Eduardo", "S9774", (float) 20000, (float) 3000);
		Secretaria secretaria1 = new Secretaria ("Letty", "S5001",(float) 7000, 3);
		
		System.out.println("El empleado de ventas " + venta1.getNnombre() + " con numero de empleado: " +
		venta1.getmNumEmpleado() + " recibe un pago de " + venta1.getPago());
		System.out.println("El pago se compone de:");
		System.out.println("Sueldo base: " + venta1.getmSalario());
		System.out.println("Comision: " + venta1.getmComision());
		
		System.out.println("El gerente " + gerente1.getNnombre() + " con numero de empleado: " +
				gerente1.getmNumEmpleado() + " recibe un pago de " + gerente1.getPago());
		System.out.println("El pago se compone de:");
		System.out.println("Sueldo base: " + gerente1.getmSalario());
		System.out.println("Bono: " + gerente1.getmBono());
		
		System.out.println("La secretaria " + secretaria1.getNnombre() + " con numero de empleado: " +
				secretaria1.getmNumEmpleado() + " tiene un salario de " + secretaria1.getmSalario());
		
		venta1.tomarOrden();

	}

}
