package com.arreglos;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		// Los hashmaps siempre vienen en pares, llave - valor
		// declaracion
		// HashMap hashmapObjeto = new HashMap()
		HashMap<Integer, String> hashmapObjeto = new HashMap<Integer, String>();

		hashmapObjeto.put(100, "Alex");
		hashmapObjeto.put(101, "Daniel");
		hashmapObjeto.put(102, "Edgar");
		hashmapObjeto.put(104, "Daniel");
		hashmapObjeto.put(100, "Hugo");

		System.out.println(hashmapObjeto);

		hashmapObjeto.remove(102);

		System.out.println(hashmapObjeto);

		for (Map.Entry<Integer, String> variable : hashmapObjeto.entrySet())
			System.out.println(variable.getKey() + "  " + variable.getValue());

	}
}
