package day4;

public class ArraysAndLoops {

	public static void main(String[] args) {
		
		/*
		 * Arrays in java are primarily to store multiple
		 * values in a sigle values.
		 * 
		 * Note:
		 * - Fixed size. Size must be defined up front
		 * and cannot be changed.
		 * -Arrays are typed and need to be the same homogeneous
		 * (data) in terms of type.
		 * -Arrays must be continously
		 * -Arrays are 0 indexed
		 * 
		 */
		
		//Array syntax:
		// dataType[] arrayName; 
		int[] numbers;
		//this is to create space in the memory
		numbers = new int[5];
		
		System.out.println(numbers[0]);
		
		//to edit an array:
		//first item:
		numbers[0] = 1; //updating first spot of the array
		//second item:
		numbers[1] = 2;
		//third item:
		numbers[2] = 3;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[2]);
		
		System.out.println(numbers.length);
		
		/*
		 * Loops
		 * 
		 * What is a loop?
		 * 
		 * loops are just blocks of code that will
		 * continuously execute so long as their
		 * conditions is met similar to an if statement
		 * 
		 * loop process
		 * 
		 * so long as the boolean condition is true, the 
		 * block of code will be executed.
		 * 
		 * once the boolean condition finishes execution it runs again
		 * if the boolean compares to false the loop ends.
		 * 
		 * Different types of loops
		 * 
		 * while
		 * for
		 * 
		 * do-while --hardly used
		 * for-each
		 * 
		 * only an example NEVER write a while true
		 * while(true){
		 * this block of code executes
		 * 
		 * *remember to make sure there is an exit in the code
		 * or it will run forever and it will crash the program
		 * }
		 * 
		 */
		//while loop example
		int count = 0;
		while(count <= 5) {
			System.out.println(count);
			count++;
		}
		
		String[] fruits = {"apple","pear","orange","lemon","berries",}; 
		
		int index = 0;
//		while(index < fruits.length) {
//			
//			}
		
		// for loop
		
		//syntax is as follows
		//for (counter startup; condition;){}
		
		for (int i = 0; i < fruits.length;) {
			System.out.println("Thre fruit at index " + index + " is: " + fruits[index]);
			index++;
		}
		
	}
	
}
