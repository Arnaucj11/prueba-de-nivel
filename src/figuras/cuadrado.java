package figuras;

import java.util.Scanner;

public class cuadrado {
	//nombre
	private String nombre;
	Scanner sc = new Scanner(System.in);
		
		
	public void mostrar() {
		System.out.println("nombre del objeto: ");
		nombre = sc.next();	
		
	}
	public void area() {
		System.out.println("mida de un lado del cuadrado:");
		int l =sc.nextInt();
		double res;
		//calculo
		res=Math.pow(l, 2);
		System.out.println("la area del cuadrado con nombre " + nombre+ " es de " + res + "cm");
	}
}
