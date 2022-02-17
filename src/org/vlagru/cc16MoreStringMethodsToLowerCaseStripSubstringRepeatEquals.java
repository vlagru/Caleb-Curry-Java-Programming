package org.vlagru;

import java.util.Scanner;

public class cc16MoreStringMethodsToLowerCaseStripSubstringRepeatEquals {

	public static void main(String[] args) {
		String s = "  Jihlavanka, voni hezky.  \n";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.strip()); // odstrani bile znaky, pro user input
		System.out.println(s.stripLeading()); // WS na zacatku pouze
		System.out.println(s.substring(9, 12)); // zobrazi od do
		System.out.println(s.repeat(10));
		
		//password
		String password = "let me in";
		System.out.println("What is the password?");
		
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		System.out.println(password.equals(guess));
	}

}
