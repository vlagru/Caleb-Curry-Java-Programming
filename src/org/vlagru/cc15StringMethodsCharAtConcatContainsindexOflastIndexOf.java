package org.vlagru;

public class cc15StringMethodsCharAtConcatContainsindexOflastIndexOf {

	public static void main(String[] args) {
		String y = "nnnaaaaammmmmmm...my oh pot my chicken pot pie";
		System.out.println(y.charAt(3));
		System.out.println(y.charAt(0));
		System.out.println(y.concat(" Haha...")); // nebo
		String s = y + " Haha haha..."; 
		System.out.println(s.contains("chicken"));
		System.out.println(s.contains("haha"));
		System.out.println(s.contains("hovno"));
		System.out.println(s.indexOf("my"));
		System.out.println(s.indexOf("my", 3));
		System.out.println(s.indexOf("pot", 9));
		System.out.println(s.indexOf("my", s.indexOf("my") + 1));
		System.out.println(s.lastIndexOf("my"));
	}			
}
