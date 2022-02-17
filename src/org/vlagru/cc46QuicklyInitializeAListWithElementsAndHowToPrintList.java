package org.vlagru;

import java.util.Arrays;
import java.util.List;

public class cc46QuicklyInitializeAListWithElementsAndHowToPrintList {

	public static void main(String[] args) {
		
		/*
		int[] grades = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(grades));
		
		List<Integer> znamky = Arrays.asList(5, 3, 6, 8, 10);
		
		System.out.println(Arrays.toString(znamky.toArray()));
		
		System.out.println(znamky.get(0));
		System.out.println(znamky.indexOf(10));
		*/
		
		int[] znamky = {1, 2, 3, 4};
		System.out.println(Arrays.toString(znamky));
		
		List<Integer> z = Arrays.asList(5, 3, 8, 10);
		System.out.println(Arrays.toString(z.toArray()));
		
		List<Integer> seznam = Arrays.asList(1, 2, 4, 80, 22222);
		System.out.println(Arrays.toString(seznam.toArray()));
		
		int[][] listCisel = {{10, 50, 44}, {88, 66}};
		System.out.println(Arrays.deepToString(listCisel));
	}

}
