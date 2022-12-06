package indepenentSchoolProgram;

import java.util.Scanner;

//This is a school program for tracking student data.

/*
 * This program will take user input for:
 * 
 * Student Names
 * Student GPA
 * Student Age
 * Student Grade
 * Student honors
 * Student Scholarship
 * 
 */

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Student Tracker");
		
		Student no1 = new Student("Mimi", 12, 3.7);
		Student no2 = new Student("Kyoko", 12, 3.9);
		
		System.out.println(no1.equals(no2));
		
		System.out.println("Compare to Returns::" + no1.compareTo(no2));
		
//		int result = no1.compareTo(no2);
//		
//		if(result < 0) {
//		    System.out.println(no1.getName() + " comes before " + no2.getName());
//		} else if (result > 0) {
//		    System.out.println(no2.getName() + " comes before " + no1.getName());
//		} else {
//		    System.out.println(no1.getName() + " is equal to " + no2.getName());
//		}
		
		
	}

}
