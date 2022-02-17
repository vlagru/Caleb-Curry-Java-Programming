package org.vlagru;

public class cc14StringClassStringFormatLength {

	public static void main(String[] args) {
		String y = "houmi";
		System.out.println(y.charAt(4)); // 0,1,2...
		System.out.println(y + " Vlada");
		String p = "Caleb";
		System.out.println(y + " " + p);
		System.out.println(String.format("Hello %s", p)); // String.format
		System.out.println(String.format("Whats up, %s", y));
		//String.format -vice
		System.out.println(y.length()); // delka retezce

	}

}
