package com.constrYmetodo;

public class DemoMetodos {

	int x = 10;
	int y = 20;

	/*
	  void suma() {
	  
		  System.out.println(x + y); 
	  
	  }
	 */

	
	/*  int suma() {
	  
	  
	  return (x +y); 
	  }*/
	 

	int suma(int a, int b) {

		//int c = a +b;
		//return c;
		
		return a+b;
	}

	public static void main(String[] args) {

		DemoMetodos objetoCalculo = new DemoMetodos();

		//objetoCalculo.suma();
		
		//int suma = objetoCalculo.suma();
		int resultado = objetoCalculo.suma(9, 7);
		System.out.println(resultado);
		
		System.out.println(objetoCalculo.suma(5, 8));
		// System.out.println(suma+ 20);
	}

}
