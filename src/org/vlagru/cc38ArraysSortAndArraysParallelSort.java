package org.vlagru;

import java.util.Arrays;

public class cc38ArraysSortAndArraysParallelSort {

	public static void main(String[] args) {
		int[] znamky = {6, 5, 1, 7};
		Arrays.sort(znamky);
		Arrays.parallelSort(znamky);
		System.out.println(Arrays.toString(znamky));

	}

}
