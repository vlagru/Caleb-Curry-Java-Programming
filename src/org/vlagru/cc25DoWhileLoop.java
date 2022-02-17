package org.vlagru;

import java.util.Scanner;

public class cc25DoWhileLoop {

	public static void main(String[] args) {
		// do-while loop executed at least once
		
		Scanner input = new Scanner (System.in);
		String password = "tom";
		String guess;
		
		do {
			System.out.println("Uhadni heslo: ");
			guess = input.nextLine();
			
		} while (!guess.equals(password));
		
		System.out.println("Uhadl jste heslo");
		input.close();
	}

}
