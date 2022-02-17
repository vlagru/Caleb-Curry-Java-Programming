package org.vlagru;

import java.util.Scanner;

public class cc19IfElseIfElse {

	public static void main(String[] args) {
		
		//!!!!!!!!!!!!!!!!!lze prez object String, i prestoze zadavam cisla!!!!!!!!!!!!!!, pres int ani Int to neslo...
		
		System.out.println("Vlozte cele cislo od 1 do 3:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		if ("1".equals(input)) 
		{
			System.out.println("Moudrost neni dar, pico, ziskava se.\n");
			return;
		} else if ("2".equals(input)) // to co mezi uvozovka bere pouze, samotna 2 nestaci
		{
			System.out.println("Kdo jinemu jamu kopa, sam do ni pada.\n");
		} else if ("3".equals(input)) 
		{
			System.out.println("Sul nad zlato.\n");
		}else 
		{
			System.out.println(("\t\tkonec\n".toUpperCase()).repeat(20));
		}
		
		
		
		
		
		//String password = "dobrak";
		System.out.println("What is the password?");
		Scanner scanner2 = new Scanner(System.in);
		String input2 = scanner2.nextLine();
		//System.out.println(password.equals(input));
		if (("Dobrak".toLowerCase()).equals(input2)) 
		{
			System.out.println("OK, I am gonna let you in...");
			//return; ukonci se, lze i bez else
		} else if (("bila kralovna".toUpperCase()).equals(input2)) // ELSE IF + dalsi argument 
		{
			System.out.println("OK, the 2nd password is correct...");
		} else if (("havran".toUpperCase()).equals(input2)) // pozor na zavorky, kdyz na toUpperCase
		{
			System.out.println("Heslo s velkymi pismeny je OK");
		} else // bez argumentu
		{
			System.out.println(("Not allowed to be let in...\n".toUpperCase()).repeat(100));
		}
		
		
		
	} 

}
