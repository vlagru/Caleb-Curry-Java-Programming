package org.vlagru;

import java.util.Arrays;
import java.util.List;

public class cc47ForLoopsWithListsAndHowToModifyEachElement {

	public static void main(String[] args) {
		
		/*
		List<Integer> list = Arrays.asList(1, 5, 8, 9);
		// System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i) * 3);
			System.out.print(list.get(i) + " ");
		}
		*/
		
		List<Integer> list = Arrays.asList(5, 1, 2, 6, 8);
		
		//System.out.print(list.size());
		
		
		
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i) -1);
			System.out.print(list.get(i) + " ");
		}
		
	}

}
