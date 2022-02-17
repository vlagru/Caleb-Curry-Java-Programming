package org.vlagru;

import java.util.ArrayList;
import java.util.List;

public class cc45WorkingWithListsListMethods {

	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<Integer>();
		
		grades.add(5);
		grades.add(10);
		grades.add(254);
		grades.add(1, 150); // na index 1 da danne cislo a puvodni posune o index dale
		grades.add(0, 4);	
		//grades.add(1, 7);	
		
		/*// pokud list NENI prazdny, vymaze ho. Kdyz je list smazany, zobrazi se 'Prazdne!'
		if (!grades.isEmpty()) {
			grades.clear();
		};
		
		if (grades.isEmpty()) {
			System.out.println("Prazdne!");
		};
		*/
		
		/*// vymaze vsechny indexy '0', a pak, az vse prazdne, zobrazi 'Prazdne!'
		while (!grades.isEmpty()) {
			System.out.println(grades.remove(0));
		};
		if (grades.isEmpty()) {
			System.out.println("Prazdne!");
		};
		*/
		
		/*
		if (!grades.isEmpty()) {
			grades.remove(0); // pokud list prazdny, smaze 4 a nahradi 5
		}; System.out.println(grades.get(0));
		*/
		
		/*
		if (!grades.isEmpty()) { // pokud je list prazdny
			System.out.println(grades.get(0));
		};
		*/
		
		/*
		System.out.println(grades.get(1)); // vypise cislo podle indexu
		System.out.println(grades.get(0));
		System.out.println(grades.get(2));
		System.out.println(grades.get(3));
		System.out.println(grades.indexOf(10)); // vypise index cisla
		System.out.println(grades.indexOf(150));
		System.out.println(grades.indexOf(4));
		System.out.println(grades.contains(150));
		System.out.println(grades.contains(2));
		System.out.println(grades.contains(0));
		*/
	}

}
