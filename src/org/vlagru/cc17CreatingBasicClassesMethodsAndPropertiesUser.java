package org.vlagru;

public class cc17CreatingBasicClassesMethodsAndPropertiesUser {
	//members - methods and properties
	
	public String firstName;
	public String lastName;
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public Integer bodies;
	public Integer bullets;
	
	public Integer total() {
		return bodies + bullets; 
	}
	
	public Double workingHours;
	public Double sleepingHours;
	
	public Double hours() {
		return workingHours + sleepingHours;
	}
	
}
