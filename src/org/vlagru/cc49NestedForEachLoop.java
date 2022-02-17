package org.vlagru;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cc49NestedForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
		allGrades.add(Arrays.asList(5, 8, 7, 10, 23));
		allGrades.add(Arrays.asList(100, 444, 858, 3698));
		allGrades.add(Arrays.asList(40, 50));
		
		for (List<Integer> grades : allGrades) {
			for (int grade : grades) {
				System.out.print(grade + ", ");
			}
			System.out.println();
		}
		*/
		
		/*
		List<List<Integer>> listy = new ArrayList<List<Integer>>();
		listy.add(Arrays.asList(1, 2, 3));
		listy.add(Arrays.asList(4, 5, 6));
		listy.add(Arrays.asList(12, 55, 89, 78));
		
		for (List<Integer> list : listy) {
			for (int l : list) {
				System.out.print(l + " ");
			}
			System.out.println();
		}	
		*/
		
		// Kolekce : sorteni listu podle poradni nahoru - sort - nebo dolu - reverse -
		List<Integer> list = Arrays.asList(1, 5, 2, 8, 10, 10);
		Collections.sort(list);
		Collections.reverse(list);
		
		for (int i : list) {
			System.out.print(i + ", ");
		}
		
	}

}
