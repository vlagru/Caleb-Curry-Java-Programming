package org.vlagru;

import java.util.Scanner;

public class cc20ComparisonAndLogicalOperators {

	public static void main(String[] args) {
		System.out.println("Kolik ti je roku?");
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Mas radsi kocky, nebo psy?"); 
		Scanner scanner2 = new Scanner(System.in);
		String jmeno = scanner.nextLine();
		
		if (input >= 18 && !"psy".equals(jmeno)) // nebere desetinna cisla
			/* >
			 * <
			 * =!
			 * <=
			 * >=
			 * &&
			 * ||
			 * !
			 * && and || nejdou dohromady
			 */
		{
			System.out.println("Muzes si podat prihlasku.");
			
		} else 
		{
			System.out.println("Je nam lito, ale nelze si podat prihlasku.");
		}
	}

}
