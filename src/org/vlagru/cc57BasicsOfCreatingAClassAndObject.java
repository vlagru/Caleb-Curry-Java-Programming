package org.vlagru;

public class cc57BasicsOfCreatingAClassAndObject {

	public static void main(String[] args) {
		
		/*
		User user = new User(); // to za rovnatkem je konstruktor, se zavorkami
		user.firstName = "Vladimir";
		user.lastName = "Grulich";
		user.vek = 35;
		user.rokNarozeni = 1986;
		
		//System.out.println(user.firstName + " " + user.lastName);
		
		user.jmenoAPrijmeni();
		user.stariUzivatele();
		*/
		
		/*
		User kundicka = new User(); // konstruktor to se zavorkou
		kundicka.jmenoKundicky = "Amelie";
		kundicka.prijmeniKundicky = "z Montmartu";
		
		kundicka.coDelaSlecna();
		*/
		
		cc57BasicsOfCreatingAClassAndObjectUser bouracek = new cc57BasicsOfCreatingAClassAndObjectUser(); // konstruktor
		bouracek.pocetZarezu = "sto jedna";
		bouracek.penizeNaUcte = "deset milionu";
		
		bouracek.coVsechnoMaBouracek(10);
	}

}
