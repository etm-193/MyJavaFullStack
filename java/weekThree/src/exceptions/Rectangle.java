package exceptions;


​
import java.util.Scanner;
​
public class Rectangle {
	
	private  double length;
	private  double width;
	
	public Rectangle () {
		super ();
	}
	
	public Rectangle (double length, double width) {
		super ();
	}
​
	
				// Getters and Setters 
		public double getLength() {
			return length;
				}
​
		public void setLength(double length2) {
					
			if (length <= 0) {
			throw new ArithmeticException (" Something is wrong ");
			}
			this.length = length;
			}
​
		public double getWidth() {
			return width;
			}
​
		public void setWidth(double width2) {
				
			if (width <=0) {
			throw new ArithmeticException (" Try Again Game Over ");
			}
			this.width = width;
					
			}
			
		
}
	
	
	/*
	 * What is an exception
	 * something un expected that happens that interrupts the normal flow of the code
	 * 
	 * 
	 * the three types of exceptions
	 * 
	 * errors - outside of your application something goes wrong
	 * 
	 * compile time exception
	 * 
	 * runtime exception
	 * 
	 * 
	 * categories:
	 * 
	 * checked
	 * 
	 * unchecked 
	 * 
	 * the purpose of exeptions
	 * 
	 * to communicate to the user identify the specific problem and what went wrong.
	 * 
	 * throw is when you are activelly throwing an exception
	 * 
	 * throws is then you're declaring that method.
	 * 
	 * 
	 * the purspose of handeling exeptions:
	 * to breake the program softly when something unexpected happens that your code
	 * isnt written to handle
	 * 
	 * 
	 * 
	 * 
	 * public void myMethod() throws AritmethicException{} - mainly for checked exceptions
	 * you can also declare un checked exceptions
	 * the complier doesn't care about this would just be for the user
	 * 
	 * purpose is so every time you call the method you know you should put it in a try-catch block
	 * to stop the code compiling until you ad a handler or declare it to warn your user
	 * 
	 * 
	 * 
	 * multiple cathcblock:
	 * 
	 * try{
	 * } catch(someException | someOtherexception ) {
	 * }
	 * 
	 * 
	 * the order needs to go from the most specific to the 
	 * least specific because of the isa relationship betweeen exceptions
	 * 
	 * if the is a re;ationship evaluates to true then it stops looking through the catch.
	 * 
	 * 
	 */
	

