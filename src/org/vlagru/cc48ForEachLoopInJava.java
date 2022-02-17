package org.vlagru;

import java.util.Arrays;
import java.util.List;

public class cc48ForEachLoopInJava {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (int l : list) { // for each loop, zjednoduseni iteraci
			System.out.print(l + " ");
		}
	}

}
