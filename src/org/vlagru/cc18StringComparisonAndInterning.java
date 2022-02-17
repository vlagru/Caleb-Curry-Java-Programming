package org.vlagru;

import java.util.Scanner;

public class cc18StringComparisonAndInterning {

	public static void main(String[] args) {
		
		
		System.out.println("What is the password?");
		String userPassword = "dobrak";
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		System.out.println(userPassword.equals(guess));
		
		System.out.println(userPassword == guess);
		// funguje s primitives data types
		// nefunguje s object
		
		
		
		System.out.println("Vloz cislo od 1 do 10 vcetne: ");
		int number = 5;
		Scanner hra = new Scanner(System.in);
		int input = hra.nextInt();
		System.out.println(number == input);
		
		
	}

}
