package main;

import java.util.Scanner;

import figuras.circulos;
import figuras.cuadrado;
import figuras.rectangulo;
import figuras.triangulo;

public class main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		menu();
	}
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int num;
		

		
		System.out.println("1- triangulo \n2- cuadrado \n3- rectangulo \n4- circulo");
		switch(num = sc.nextInt()) {
			case 1: triangulo tr = new triangulo();
					tr.mostrar();
					tr.area();
					break;
			case 2: cuadrado cu = new cuadrado();
					cu.mostrar();
					cu.area();
					break;
			case 3: rectangulo re = new rectangulo();
					re.mostrar();
					re.area();
					break;
			case 4: circulos ci = new circulos();
					ci.mostrar();
					ci.area();
					break;
		}
	}

}
