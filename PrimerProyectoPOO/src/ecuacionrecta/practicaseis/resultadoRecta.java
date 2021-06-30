package com.ecuacionrecta.practicaseis;
import java.util.Scanner;

public class resultadoRecta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double res = 0;
		
		datosRecta recta = new datosRecta(0,0,0,0);
		System.out.print("Ingresa la coordenada X1: ");
		recta.x1 = scan.nextInt();
		System.out.print("Ingresa la coordenada Y1: ");
		recta.y1 = scan.nextInt();
		System.out.print("Ingresa la coordenada X2: ");
		recta.x2 = scan.nextInt();
		System.out.print("Ingresa la coordenada Y2: ");
		recta.y2 = scan.nextInt();
		try {
			System.out.println("\nm="+ recta.calculaPendiente());
			if(recta.calculaOrdenada()>0)
				System.out.println("\nEcuación resultante ---> y = "+recta.calculaPendiente()+"x + "+recta.calculaOrdenada());
				else
				System.out.println("\nEcuación resultante ---> y = "+recta.calculaPendiente()+"x "+recta.calculaOrdenada());
			
			System.out.println("b="+ recta.calculaOrdenada());
			
			
			integral i1 = new integral (recta.getx1(),recta.getx2(),0.01,recta.getm(),recta.getb());
			
			res = i1.calculaArea();
			System.out.println("El area es: "+ res);
			
		} catch (Exception e1) {
			System.out.println("Denominador = 0");
			System.out.println("Tipo: "+ e1.toString());
		}
		
		
		
	}

}
