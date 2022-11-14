package exceptions;

import java.util.Scanner;

public class main {
	
	public static main (String[] args) {
		
		Rectangle myRectangle = new Rectangle ();
		
​
		System.out.println(myRectangle.getLength());
		System.out.println(myRectangle.getWidth());
		
		System.out.println();
		Scanner myScanner = new Scanner (System.in);
		
		
		length = Double.parseDouble(myScanner.nextLine());
		System.out.println(" Input Lenght ");
		myRectangle.setLength (length);
		
		
		
		width = Double.parseDouble(myScanner.nextLine());
		System.out.println(" Input your width");
		myRectangle.setWidth(width);
		
		myScanner.close();
		
			
	}

}
