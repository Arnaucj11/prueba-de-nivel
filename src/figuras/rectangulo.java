package figuras;

import java.util.Scanner;

public class rectangulo {
	//nombre
	private String nombre;
	Scanner sc = new Scanner(System.in);
		
		
		
	public void mostrar() {
		System.out.println("nombre del objeto: ");
		nombre = sc.next();	
		
	}
	
	public void area() {
		System.out.println("altura del rectangulo: ");
		int alt = sc.nextInt();
		System.out.println("longitud del rectangulo: ");
		int lon = sc.nextInt();
		//calculo 
		double res;
		res = alt * lon;
		System.out.println("la area del rectangulo con nombre " + nombre + " es de " +res +"cm");
	}

}
