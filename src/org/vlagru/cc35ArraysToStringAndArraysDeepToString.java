package org.vlagru;

import java.util.Arrays;

public class cc35ArraysToStringAndArraysDeepToString {

	public static void main(String[] args) {
		/*
		int[] znamky = {10, 20, 60, 555, 10000};
		System.out.println(Arrays.toString(znamky));
		 */
		
	 	int[] [] znamky = {{10, 8}, {6, 4, 88, 100}};
		System.out.println(Arrays.deepToString(znamky));
	}

}
