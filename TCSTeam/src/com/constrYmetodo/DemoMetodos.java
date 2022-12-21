package com.constrYmetodo;

public class DemoMetodos {

	int x = 10;
	int y = 20;

/*	void suma() {

		System.out.println(x + y);
	}*/
	
	/*int suma() {
		
		
		return (x +y);
	}*/
	
	int suma(int a, int b) {
		
		return a +b;
	}

	public static void main(String[] args) {
		
		DemoMetodos objetoCalculo = new DemoMetodos();

		//int suma = objetoCalculo.suma();
		System.out.println(objetoCalculo.suma(5,8));
		//System.out.println(suma+ 20);
	}

}
