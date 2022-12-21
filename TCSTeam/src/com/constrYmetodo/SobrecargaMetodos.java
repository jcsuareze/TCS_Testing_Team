package com.constrYmetodo;

public class SobrecargaMetodos {
	
	
	void suma(int a, int b) {

		System.out.println("Invoca metodo int - int " + (a + b));
	}

	void suma(int a, double b) {

		System.out.println("Invoca metodo int - int " + (a + b));
	}

	void suma(double a, int b) {

		System.out.println("Invoca metodo int - int " + (a + b));
	}

	void suma(int a, int b, int c) {

		System.out.println("Invoca metodo int - int " + (a + b + c));
	}

	public static void main(String[] args) {
		
		SobrecargaMetodos objeto = new SobrecargaMetodos();
		
		objeto.suma(10, 20);
		objeto.suma(10, 20.5);
		objeto.suma(10.5, 20);
		objeto.suma(10, 20,30);

	}

}
