package org.vlagru;

public class cc17CreatingBasicClassesMethodsAndProperties {

	public static void main(String[] args) {
		 cc17CreatingBasicClassesMethodsAndPropertiesUser user = new cc17CreatingBasicClassesMethodsAndPropertiesUser();
		 user.firstName = "Caleb";
		 user.lastName = "Curry";
		 System.out.println(user.getFullName());
		 
		 user.bodies = 10;
		 user.bullets = 15;
		 System.out.println(user.total());
		 
		 user.workingHours = 6.3;
		 user.sleepingHours = 8.2;
		 System.out.println(user.hours());
		 

	}

}
