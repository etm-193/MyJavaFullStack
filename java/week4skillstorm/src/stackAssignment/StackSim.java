package stackAssignment;

import java.util.Scanner;

public class StackSim  {
	
	//Array type to store non-primitive data
	private Object[] array = new Object[10];

	
//	getters and setters
	public Object[] getArray() {
		return array;
	};

	public void setArray(Object[] array) {
		this.array = array;
	};
	
		
	//push method
	
	public void pushTo() {
		//this method needs to add elements to the array and keep adding at the end.  ex: elememt 1, add element2, add element3
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the values you wish to store: ");
		
		//	For loop
		for(int i = 9; i < 10; i++) {
				array[i] = scan.next();
				System.out.println();
				for(int e = 0; e < 10; e++) {
				if (array[e] == null) {
					array[e] = array[i];
					}
				}
				System.out.println();
				
			} 
		scan.close();
		}
	
		
	
	//pop method
	
	public void popOut() {
		
	};
	
	//peek method
	
	public void peekIn() {
		
		for(int i = 9; i < 10; i++) {
			
			System.out.println(array[i]);
				
			}
		}
	
	//size method
	
	public int checkSize() {
		int size = 0;
		return size;
	}
	
	//isEmpty method
	
	//exceptions
	
	//max capacity exception method

	//overide toString method
	

}
