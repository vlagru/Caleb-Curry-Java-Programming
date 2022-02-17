package org.vlagru;

import java.util.ArrayList;

public class cc43ArrayListIntroduction {

	public static void main(String[] args) {
		/*
		ArrayList<Integer> tabulka = new ArrayList<Integer>();
		tabulka.add(5); // pridava hodnotu
		System.out.println(tabulka.get(0));
		tabulka.set(0, 10); // meni hodnotu z 5 na 10
		System.out.println(tabulka.get(0)); 
		*/
		
		ArrayList<Integer> tabulka = new ArrayList<Integer>();
		tabulka.add(22);
		System.out.println(tabulka.get(0));
		tabulka.set(0, 1);
		System.out.println(tabulka.get(0));
		// tabulka.size() --- metoda na to, kolik je tam prvku
	}

}
