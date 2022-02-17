package org.vlagru;

public class cc27NestedBlocksNestedIf {

	public static void main(String[] args) {
		boolean additionalLogging = false; //true a vypise se...
		for (int i = 9; i <= 15; i++) {
			
			System.out.println(i);
			
			if (i == 12) {
				
				if (additionalLogging == true) {
					
					System.out.println("12 je ok cislo...");
				}	
				
			}
			
		}
		
	}

}
