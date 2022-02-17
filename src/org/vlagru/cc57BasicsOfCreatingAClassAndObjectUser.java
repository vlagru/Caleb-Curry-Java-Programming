package org.vlagru;

public class cc57BasicsOfCreatingAClassAndObjectUser {
	
	/*
	public String firstName;
	public String lastName;
	public Integer vek;
	public Integer rokNarozeni;
	
	public void jmenoAPrijmeni () {
		System.out.println(firstName + " " + lastName);
		//System.out.println(vek + ", " + rokNarozeni);
	} 
	
	public void stariUzivatele () {
		System.out.println(vek + ", " + rokNarozeni);
	}
	*/
	
	/*
	public String jmenoSlecny;
	public String prijmeniSlecny;
	
	public void coDelaSlecna() {
		System.out.println(jmenoSlecny + " " + prijmeniSlecny + " mi da svoje telefonni cislo.");
	}
	*/
	
	public String pocetZarezu;
	public String penizeNaUcte;
	
	public void coVsechnoMaBouracek(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Bouracek zklatil " + pocetZarezu + " lehkych dam a ma na konte " + penizeNaUcte + " pesos.");
		}
	}
}
