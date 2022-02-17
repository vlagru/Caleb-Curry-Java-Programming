package org.vlagru;

import java.util.Arrays;

public class cc42IterateThrough2DStructureWithForLoop {

	public static void main(String[] args) {
		/*
		int[][] grades = {
				{1,4,5},
				{4,5,10,15,14,10,0},
				{1,2}
		};
		System.out.println(grades.length);
		System.out.println(grades[1].length);
		System.out.println(Arrays.deepToString(grades));
		
		for (int i = 0; i < grades.length; i++) {
			for (int k = 0; k < grades[i].length; k++) {
				System.out.print(grades[i][k] + " ");
			}
			System.out.println();
		}
		*/
		
		/*
	
		int[][] tabulka = {
				{1,44,88,105},
				{88,55,33,8641,100,11},
				{0,0,6,5},
				{0,1,2,23}
		};
		
		System.out.println(tabulka[3].length);
		System.out.println(Arrays.deepToString(tabulka));
		System.out.println(Arrays.toString(tabulka[0]));
		System.out.println(tabulka[1].length);
		
		for (int i = 0; i < tabulka.length; i++) {
			for (int k = 0; k < tabulka[i].length; k++) {
				System.out.print(tabulka[i][k] + ","
						+ " ");
			}
			System.out.println();
		}
		
		*/
		
		int[][] tab = {
				{1,2,3,4},
				{5,6,7,88,100},
				{0,1},
				{22,66,999,1010,54,54}
		};
		
		System.out.println(tab[3].length);
		System.out.println(tab[0].length);
		System.out.println(tab[2].length);
		System.out.println(Arrays.deepToString(tab));
		System.out.println(Arrays.toString(tab[1]));
		System.out.println(tab[0][1]);
		
		
		for (int i = 0; i < tab.length; i++) {
			for (int k = 0; k < tab[i].length; k++) {
				System.out.print(tab[i][k] + ",");
			};
			System.out.println();
		};
			
	}	

}
