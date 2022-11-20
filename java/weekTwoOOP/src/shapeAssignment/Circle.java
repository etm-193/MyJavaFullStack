package shapeAssignment;

import java.util.Scanner;

public class Circle extends Shape{

	/*
	 * package assignmentCircles;

 * Create a class, Circle, that describes and performs the 
 * capabilities of a real-life circle. These circles should store 
 * pertinent data and be able to perform operations such as calculating 
 * the diameter, circumference, and area.

Requirements:

Contains useful methods calculating a circle's diameter, circumference, and area
Be able to create a Circle object by either providing a 
radius, or, if none is provided, creates a circle with some 
default radius instead
Have the ability to create multiple Circle objects and have 
their data be independent of one another

Bonus Challenge:

Create a method that compares one Circle object with another and 
determine whether they're equal or not

 */
	
	//Variables
	
	public float radius = 0;
	public float circumference = 0;
	public float area = 0;
	public float diameter = 0;
	
	float userChoice = 0;
	float userInputRadius;
	float userInputCircumference;
	
//	float diameterCalc = (float) (circumference / 3.14);
//	float diameterOnlyRad = (float) (2 * radius);
//	float diameterOnlyArea = (float) (Math.sqrt(area / 3.14)*2);
	
	//default constructor
	
	public Circle() {
		super();
	}
	
	//Custom constructor
	public Circle(float radius, float circumference, float area, float diameter) {
		super(doesItHaveCorners);
		this.radius = radius;
		this.circumference = circumference;
		this.area = area;
		this.diameter = diameter;
		
		
	}
		

	//methods
	float calcRadius(float userInputCircumference) {
		float radius = (float)(userInputCircumference / (2 * 3.14));
		System.out.println("The radius of your circle is: " + radius );
		return radius;
	}
	
	float calcArea(float userInputRadius) {
		float area = (float) (Math.pow(userInputRadius, 2) * 3.14);
		System.out.println("The area of your circle is: " + area );
		return area;
	}
	
	float calcCircum(int userInputRadius) {
		float circumference = (float) (2 * 3.14 * userInputRadius);
		System.out.println("The circumference of your circle is: " + circumference );
		return circumference;
	}
	
	 float calcDiam (int userChoice) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What data do you have?");
		System.out.println("Enter 1 for Cirumference");
		System.out.println("Enter 2 for Radius");
		System.out.println("Enter 3 for Area");
		System.out.println("Enter 4 for if you have none");
		float userData = scanner.nextFloat();
		System.out.println("You chose: " +userData);
		scanner.close();
		if (userData == 1) {
			
			System.out.println("Please input the circumference.");
			float userInput = scanner.nextFloat();
			float circumference = userInput;
			float diameter = (float) (circumference / 3.14);
			System.out.println(diameter);
			
		} else if (userData == 2) {
			
			System.out.println("Please input the radius.");
			float userInput = scanner.nextFloat();
			float radius = userInput;
			float diameter = (float) (2 * radius);
			System.out.println(diameter);
			
		} else if (userData == 3) {
			
			System.out.println("Please input the Area.");
			float userInput = scanner.nextFloat();
			float area = userInput;
			float diameter = (float) (Math.sqrt(area / 3.14)*2);
			System.out.println(diameter);
			
		} else {
			//This would be = to a default value.
			System.out.println("No data? No problem!");
			System.out.println("Let's assign your circle a radius of 10.");
			float radius = 10;
			float diameter = (float) (2 * radius);
			System.out.println("Multiply by 2 your radius and your diameter is: " + diameter);
			
			
		}
		
		
		scanner.close();
		System.out.println("");
		return  diameter;
		
	 
	}
	//Test code
//	public static void main(String[] args) {
//		
//		calcDiam(0);
//		
//	}
	
}


//switch statements

/*
 * 
 * it is a logic gate with more than two possible outcomes
 * a switch statemen takes a non boolean condition.
 *-- you cannot use a boolean as the switch conditiion
 *-- can have as many outcomes as you set up in code
 *
 *syntax
 *
 *	switch (variable to switch on){
 *		case optionOne:
 *			do this code
 *			break;
 *		default: //this is like the else
 *			some default code
 *			break;
 *}
 *
 * the problem is the whole code will be executed
 * unless the "break;" keyword. this will prevent the code
 * from going past the scope of the ":" and the break;
 * 
 * you cannot have cases that have the same value
 * 
 * break can be used in while loops
 * 
 * int counter = 0;
 * while (counter<100){
 * 	counter++;
 * 	if (counter == 5)
 * 		break;
 * 
 * 
 * check up on continue for loops
 * }
 * 
 */

