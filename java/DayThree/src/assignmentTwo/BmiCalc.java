package assignmentTwo;

import java.util.Scanner;

public class BmiCalc {
	/*
	 * BMI Calculator
	 * 
	 * This BMI Calculator will take input 
	 * for the variables height and weight
	 * then it will conduct the appropriate
	 * calculations to provide the results.
	 * 
	 * to calculate feet into meters divide by 3.281
	 * to calculate lbs into kgs divide by 2.205
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your weight in lbs: ");
		double weightInLbs = scanner.nextDouble();
		double weightInKgs = weightInLbs / 2.205;
		//test code
//		System.out.println(weightInKgs);
		System.out.println("Please enter your Height in feet: (ex. 5'4 as 5.4)");
		double heightInFt = scanner.nextDouble();
		double heightInMtrs = heightInFt / 3.281;
		scanner.close();
		//test code
//		System.out.println(heightInMtrs);
		double bmi = weightInKgs / (heightInMtrs * heightInMtrs);
		//test code
//		System.out.println(bmi);
		
//		Results logic section:
		
		if (bmi < 18.5) {
			System.out.println("Your BMI is " + bmi + ", You are underweight.");
		} else if(bmi <= 25) {
			System.out.println("Your BMI is " + bmi + ", Your weight is normal.");
		} else  if(bmi <= 30) {
			System.out.println("Your BMI is " + bmi + ", You are slightly overweight.");
		} else if(bmi <= 35) {
			System.out.println("Your BMI is " + bmi + ", You are obese.");
		} else {
			System.out.println("Your BMI is " + bmi + ", You are clinically obese.");
		}
		
	}
		
}
