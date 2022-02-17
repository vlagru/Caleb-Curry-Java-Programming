package org.vlagru;

import java.util.Scanner;

public class cc24IntroToLoopsWhileLoops {

	public static void main(String[] args) {
		/* icu
		 * 
		 * initialization
		 * comparison, condition
		 * update
		 */
/*
		int i = 0; // initialization
		while (i < 10) // comparison
		{
			System.out.println("Hello\t".repeat(10));
			i++; // update
		}
*/		

/*		int i = 0;
		while (i < 10) 
		{
			System.out.println("Zmrde!!!".repeat(i));
			i++;
			}
*/			
		
/*		int i = 0;
		while (i < 15) 
		{
			System.out.println("iterace " + i);
			
			i++;
		}
*/		
/*		int i = 0;
		while (i < 10) 
		{
			System.out.println(("let's go ".toUpperCase().repeat(i)) + i);
			i++;
		}
*/
		System.out.println("What is the password?");
		String password = "chlebovnicka";
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		while (!input.equals(password)) 
		{
			System.out.println("What is the password?");
			input = scanner.nextLine();
		} System.out.println("Congrats!!!");
		scanner.close();
	} 

}
