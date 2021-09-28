package figuras;

import java.util.Scanner;

public class circulos {
	//nombre
	private String nombre;
	private int r;
	Scanner sc = new Scanner(System.in);
		
		
		
	public void mostrar() {
		System.out.println("nombre del objeto: ");
		nombre = sc.next();	
		
	}
	
	public void area() {
		System.out.println("radio del circulo: ");
		r = sc.nextInt();
		double res;
		//aqui el calculo
		res=3.14*Math.pow(r, 2);
		System.out.println("la area del circulo con nombre " +nombre + " es de " + res +"cm");
	}
}
