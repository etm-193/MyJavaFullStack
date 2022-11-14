package com.skillstorm;

//import statement
import java.util.Scanner; //imports Scanner from java.util


public class Input {

	public static void main(String[] args) {
		
		/*
		 * There are 3 system channels in Java:
		 * 
		 * 1. System.out -- system output. this is standard output to display to the console
		 * 2. System.in  -- system input.  takes user input
		 * 3. System.err -- system error.  similar to output used to display error message
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String firstName = scanner.nextLine();
		System.out.println("Please Enter your last name: ");
		String lastName = scanner.nextLine();
		
		
		
		System.out.println("Your name is set to: " + firstName +" "+ lastName);
		System.out.println("Is this correct? y / n");
		String correct = scanner.nextLine();
		//test code
		System.out.println(correct);
		//good test
		char correctName = correct.charAt(0);
		
		char varYes = 'y';
		char varNo = 'n';
		
		if (correctName == varYes && correctName != varNo) {
			System.out.println("Please, set your password: ");
			String newPassword = scanner.nextLine();
			
//			Nested if statement for password
			System.out.println("Please confirm your password: ");
			if (newPassword != scanner.nextLine()) {
				System.out.println("Your password has been set.");
				scanner.close();
				
				// this code currently does not fully work. 
				// I need to loop through the array of characters
				// in the string then compare each to the scan.
				
				
			} else {
				System.out.println("Your password does not match. Please try again.");
			}
		
		} else {
			//good place for a loop.
			System.out.println("Please try again.");
			
			
		} 
		
		
	}
	
}
