package com.constrYmetodo;

public class ThisPalabraClave {

	int a, b; // Variables de instancia o variables de clase

	void getValores(int a, int b) {

		//a = a;  //No se puede diferenciar entre variables de clase con las de metodo
		//b = b;
		
		this.a = a;
		this.b = b;

	}

	void muestraValores() {
		
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {

		ThisPalabraClave objetoThis = new ThisPalabraClave();
		objetoThis.getValores(10, 20);
		objetoThis.muestraValores();
	}

}
