package figuras;

import java.util.Scanner;

public class triangulo {
	
	//nombre
	private String nombre;
	Scanner sc = new Scanner(System.in);
	
	
	public void mostrar() {
		System.out.println("nombre del objeto: ");
		nombre = sc.next();	
		
	}
	
	public void area() {
		System.out.println("base del triangulo: ");
		int bas = sc.nextInt();
		System.out.println("altura del triangulo: ");
		int alt = sc.nextInt();
		//calculo
		double res;
		res = bas*alt/2;
		System.out.println("la area del triangulo con nombre " + nombre+ " es de "+ res+ "cm");
	}

}
