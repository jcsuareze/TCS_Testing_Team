package com.arreglos;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		//Un ArrayList no puede contener primitivos,  solo objetos
		
		ArrayList list = new ArrayList();
		
		
		list.add("Irving");
		list.add(100);
		list.add('A');
		list.add("Amaury");
		
		//System.out.println(list.size());
		
		list.remove(2);
		//System.out.println(list.size());
		
		//list.add(list);
		
		for(Object valores: list)
			System.out.println(valores);
		
		
		//Los valores al eliminar un indice, se recorren ,no lo deja vacio
		
		//añadir valores con indice
		list.add(2,"Hugo");
		for(Object valores: list)
			System.out.println(valores);
	}

}
