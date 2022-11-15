package weekTwoOOP;

public class ObjectOrientedProgramming {

	public static void main(String[] args) {
		
		PoliceOfficer policeOfficerOne = new PoliceOfficer();
		PoliceOfficer policeOfficerTwo = new PoliceOfficer();
		System.out.println(policeOfficerOne);
		System.out.println(policeOfficerTwo);
		System.out.println(policeOfficerOne.isCertified);
		
		
		
	}
	
}


/*
 * As opposed to procedural or functional programming
 * 
 * intent is to create and include real-world objects 
 * in programming.
 * 
 * -- allows us to create
 * 
 * 
 * 
 * 
 * 
 * 4 pillars of oop
 * 
 * encapsulation
 * abstraction
 * inheritance
 * polymorphism
 * 
 * encapsulation
 * 
 * two parts
 * 
 * class binding = wrapping properties and methods
 * into a class
 * what features does this object have
 * what can every object in this class do?
 * 2 is acces control = how/when/by whom/ by what can we
 * alter the properties or use the methods
 * 
 * abstraction
 * 
 * hiding the details of implementation from the user
 * a user can be a real life person or another class 
 * or peice of code the user does not care HOW the code 
 * works only that it works abstract classes and interfaces
 * are common usages
 * 
 * 
 * inheritance
 * 
 * simplyfying code through modularity/reusability
 * 
 * a class has properties and methods
 * a class that inherits the first class may have additional
 * properties and methods
 * we don't recode the first class and methods in the second class
 * if it is inherited
 * 
 * polymorphism = many forms
 * 
 * methods can have multiple forms within a class or within 
 * an inheritance tree
 * Overloading = within the same class, the same method can take
 * in parameters
 * Overriding within an inheritance tree, a sub class can 
 * have the same method name/parameters with different 
 * functionality.
 * 
 * A supper class is followed by sub classes
 * 
 */