package edu.sbcc.cs105;

import java.time.LocalDate;

public class Program {

	/**
	 * Entry point to start the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
				
		// I need to track the number of people so I can display it in a report later
		int numPeople = Person.getNumberOfPeople();  // this is a comment

		/*
			This is a multiline
			comment 
		*/
		System.out.println("There are " + numPeople + " people");

		// Construct a new person		
		Person someOne = new Person();

		// Set up test person so I can verify age calcuation is correct
		LocalDate birthDate = LocalDate.of(2000, 01, 15);

		
		someOne.setBirthDate(birthDate);
		int age = someOne.getAge();


		System.out.println("Name of new person? " + someOne.getPrintName());

		// Print out number of people - This is equivalent to putting it a variable and passing the variable - substitution
		System.out.println("There are " + Person.getNumberOfPeople() + " people");

		// Pass values to method (function) that modifies internal statue
		someOne.setFirstName("Joe");
		someOne.setLastName("Gaucho");

		// Get print name, put in variable called name, and then print variable		
		String name = someOne.getPrintName();
		System.out.println(name);
		
		// Same thing as above except we cut out the middle man (the intermediate variable)
		System.out.println(someOne.getPrintName());
		
			
		// Call a local static function that prints out name Last, First
		// Method is static because main is static. It means we don't need an instanc of a class
		printMailName(someOne);
		
		Person p2 = new Person("Jane", "Gaucho");
		printMailName(p2);
	}
	
	/**
	 * Prints the name of the person in Last, First format
	 * @param person
	 */
	
	public static void printMailName(Person person){
		System.out.println(person.getFirstName() + " " + person.getLastName());
	}

}
