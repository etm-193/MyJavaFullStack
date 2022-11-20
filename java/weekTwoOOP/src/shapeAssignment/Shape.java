package shapeAssignment;

//import java.util.Scanner;

public class Shape {

	
	//class properties
	public static boolean doesItHaveCorners;
	public static int corners;
	
	//properties
	
	public float radius;
	public float circumference;
	public float area;
	public float diameter;
	
	//constructor
	public Shape() {
		super();
	}
	
	public Shape(boolean doesItHaveCorners) {
		super();
	}
	
	public Shape(boolean doesItHaveCorners, int corners) {
		super();
	}
	
	public Shape(boolean doesItHaveCorners, float circumference, float radius, float area,  float diameter, int corners) {
		super();
		Shape.doesItHaveCorners = doesItHaveCorners;
		Shape.corners = corners;
		this.circumference = circumference;
		this.radius = radius;
		this.area = area;
		this.diameter = diameter;
		
		
	}
	
	//methods
	
		public void whatShape() {
		
//		Scanner scan = new Scanner(System.in);
		
		if (doesItHaveCorners == true && corners == 4) {
			System.out.println("You have a square type of shape");
		} else if (doesItHaveCorners == true && corners == 3) {
			System.out.println("Are you trying to triangulate this shape?");
		} else if (doesItHaveCorners == true && corners <= 2) {
			System.out.println("Ehh... if you input 1 you might have a point, if you input 2 you have a line, if you input 0 or less... then i dont know what to tell you");
		} else if (doesItHaveCorners == true && corners >= 4) { 
			System.out.println("Thats a lot of corners... I cant remember all the names");
			if (corners == 5) {
				System.out.println("But this one I do know, the love of my classmate, the pentagon!");
			} 
		} else if (doesItHaveCorners == false) {
			System.out.println("I may not know you or what your inputs mean but, You have a round shape!");
		}
		
//		scan.close();
	}
	
		
}
