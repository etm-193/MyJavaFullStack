package com.skillstorm;

public class Operators {

	public static void main(String[] args) {
		/*
		 Operators
		 An operator is something that does an operation
		 
		 mathematical operators:
		 
		 --addition (2+2 == 4)
		 --subtraction (2-2 == 0)
		 --multiplication(2*2 == 4)
		 --division(2/2 == 0)
		 --modulo (returns the remainder of a division operation  2%2 == 0)
		 --Assignment operator (Assigns the value on the right to the variable [=] )
		 += adds the value on the right to the variable on the left then assigns the new value to the variable
		 -= subtracts the value on the right to the variable on the left then assigns the new value to the variable
		 /= divides the value on the right to the variable on the left then assigns the new value to the variable
		 *= multiplies the value on the right to the variable on the left then assigns the new value to the variable
		 %= modulo the value on the right to the variable on the left then assigns the new value to the variable
		 
		 increment operators 
		 ++ increases the value by 1
		 --
		 
		 
		 boolean operators
		 asks a true or false question, returns the answer as a bool
		 
		 
		 Single boolean question
		 == Logical equals
		 < less than
		 > greater than
		 <= less or equal to 
		 >= greater than or equal to
		 ! NOT, reverses the truth of whatever follows it (can be used with all operators such as not equals != )
		 
		 Comparison boolean statements 
		 | bitwise OR processes both statements to see if they are true regardless of 
		 whether the first one already gives you your answer
		 & bitwise AND
		 || logical OR, is either the value on the right true or the value on the left true
		 && logical AND, are both values on the left and right true
		 !|| NOR returns true if neither value is true
		 !&& NAND returns true only if atleast one value is false
		 ^ XOR, excluseive or, returns true Only if One is true but not both
		 !^XNOR, exclusive Nor, returns true only if one is false but not both
		 
		 
		 		 
		 		 
		 		 
		 *
		 */
		
		
		// If else statements Allow  us to execute code Only if certain conditions are met
		
		boolean myBoolean = true;
		int myIntOne = 4;
		//best practice syntax:
		if (myBoolean == true) {
			//code that will execute only if IF is true
			System.out.println("It's true!");
		} else {
			System.out.println("It's false!");
		}
		
		if ((myIntOne = 5) == 5) {
			//code that will execute only if IF is true
			System.out.println("It's true! " + myIntOne + " Is the new Value!");
			//^ concactination example
		} else {
			System.out.println("It's false!");
		}
		
		//exam example ^^^^^^^^^^^^^^^^^^^^^^^^
		
		//checking connditions one by one
		int myInt = 4;
		
		if (myInt == 4) {
			System.out.println("Spot on!");
		} else if (myInt > 4) {
			System.out.println("Too big...");
		} else {
			System.out.println("Too small");
		}
		
		int myAge = 29;
		
		if(myAge >= 18) {
			
			if (myAge >= 21) {
				System.out.println("To the bar!");
			} else {
				System.out.println("At least I can vote...");
			}
		} else {
			System.out.println("Enjoy your youth while you can...");
		}
		
		//checking conditions all at once
		
		String myName = "Tito";
		String myLastName = "Torres";
		// A string is an array of chars.
		if (myName == "Larry"  && (myAge == 20 || myLastName == "Torres")) {
			System.out.println("Everything checks out!");
		} else {
			System.out.println("Sorry fella...");
		}
		

		//Post office example
		
		/*
		 * if size and weight
		 * if international vs national
		 * if shape
		 * if delivery time 
		 */
		Object myPackage = new Object();
		int weight = 30;
		int length = 25;
		int deliveryTime = 4;
		String destination = "Florida";
		boolean isInternational = false;
		String shape = "Square";
		
		
		if (myPackage != null) {
			
			if (weight > 50) {
				System.out.println("Package is too heavy; freight shipping required");
				
			} else {
				System.out.println("Weight: " + weight + "- Weight is good for standard shiping.");
				if (length > 25) {
					System.out.println("Package is too long.");
				} else {
					System.out.println("Good length, proceed to Destination.");
					if (!isInternational) {
						System.out.println("Destination:" + destination + ", esteimated delivery time is:" + deliveryTime + " Days.");
						if (shape != "Square") {
							System.out.println("Package too oblong, repack.");
						} else {
							System.out.println("Proceede to ship.");
						}
					}
				}
			}
			
		} 
		
		
		
	}
}
