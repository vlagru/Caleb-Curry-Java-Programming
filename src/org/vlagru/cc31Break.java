package org.vlagru;

public class cc31Break {

	public static void main(String[] args) {
		for (int i = 9; i >= 0; i--) {
			for (int k = i; k >= 0; k--) {
				
					if (k == 5) {
						break;
					}
				System.out.print(k + " ");	
			}
			System.out.println();
		} 

	}

}				
