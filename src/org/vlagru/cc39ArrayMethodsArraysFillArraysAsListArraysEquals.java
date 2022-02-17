package org.vlagru;

import java.util.Arrays;

public class cc39ArrayMethodsArraysFillArraysAsListArraysEquals {

	public static void main(String[] args) {
		int[] x = {1, 4, 6, 2, 88};
		int[] y = {1, 4, 6, 2, 88};
		int[] o = {2, 6, 8, 8, 10};
		String[] p = new String[5];
		
		//pole jsou si rovna
		if (Arrays.equals(x, y)) {
			System.out.println("It is equal!!!");
		}

		//vkladani cisel do poli	
		Arrays.fill(o, 72);
		System.out.println(Arrays.toString(o));
		
		//znaky namisto cisel
		Arrays.fill(p, "kolo");
		System.out.println(Arrays.toString(p));
		
		//lists
		//List<String> testing = Arrays.asList(znamky);
	}

}
