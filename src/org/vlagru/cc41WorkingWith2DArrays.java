package org.vlagru;

import java.util.Arrays;

public class cc41WorkingWith2DArrays {

	public static void main(String[] args) {
		
		/*
		int[][] znamky = new int [5][3];
		znamky[0][2] = 5;
		znamky[0][0] = 12;
		System.out.println(Arrays.deepToString(znamky));
		System.out.println(znamky[0][0]);
		*/
		
		int[][] znamky = {
				{1,2,3},
				{10,22,5,4,3,3},
				{0,0,-1}
		};
		System.out.println(znamky[1][3]);
		System.out.println(Arrays.deepToString(znamky));
	}

}
