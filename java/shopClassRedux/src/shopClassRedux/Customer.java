package shopClassRedux;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import shopClassRedux.Customer.ServiceChoice;

public class Customer  extends Person {
	
	private boolean CustomerType;
	private Car carType;
	
	public Customer() {
		super();
		
	}

	public Customer(String name, LocalDate dob, String sexAtBirth, double chashAvailable) {
		super(name, dob, sexAtBirth, chashAvailable);
		// TODO Auto-generated constructor stub
	}

	enum ServiceChoice {
		pickingUp,
		droppingOff
	}
	
	public void customerType() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you picking up: Yes or no?");
	
		String choice = scan.nextLine();
		if (choice.equals(null)) {
			scan.close();
			throw new NullPointerException();
		}
		scan.close();
	abstract class temp {
		Enum<ServiceChoice> choice = ServiceChoice.pickingUp;{
		switch(choice.toString()) {}
		//this is the spot to use the switch for the enum
			}
		}
	}	
}
