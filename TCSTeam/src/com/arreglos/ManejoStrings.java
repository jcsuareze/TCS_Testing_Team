package com.arreglos;

public class ManejoStrings {

	public static void main(String[] args) {

		String s = "Equipo";
		String s1 = " TCS";

		System.out.println(s.length());

		// Concatenar
		System.out.println(s.concat(s1));

		// Recortar

		String valor1 = "     Hola     ";

		System.out.println("Antes de usar trim: " + valor1);
		System.out.println("Despues de usar trim: "+ valor1.trim());
		
		String valor2 = "Bienvenidos";
		System.out.println(valor2.charAt(4));
		
		System.out.println("Contiene Bien " + valor2.contains("Bien"));
		System.out.println("Contiene Bien venidos " + valor2.contains("Bien venidos"));
		
		System.out.println("Es  igual a Bienvenidos? " + valor2.equals("Bienvenidos"));
		System.out.println("Es  igual a Bienvenidos? " + valor2.equals("bienvenidos"));
		
		System.out.println("Es  igual a Bienvenidos? " + valor2.equalsIgnoreCase("Bienvenidos"));
		System.out.println("Es  igual a Bienvenidos? " + valor2.equalsIgnoreCase("bienvenidos"));
		
		
		String fraseMotivacional = "El amor no existe";
		
		System.out.println("Remplazo de caracteres " + fraseMotivacional.replace('o', 'i'));
		System.out.println("Remplazo de caracteres " + fraseMotivacional.replace("no", "si"));
		
		System.out.println("Regresa el substring " + fraseMotivacional.substring(3, 16));
		
		String mayusYMinus= "MAYUSCULAS y minusculas EN ESTA frase";
		
		System.out.println("Remplazo de caracteres a mayusculas " + mayusYMinus.toUpperCase());
		System.out.println("Remplazo de caracteres a mayusculas " + mayusYMinus.toLowerCase());
		
		
		
		
		
		
		

	}

}
