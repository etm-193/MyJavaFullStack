package shapeAssignment;

public class Main {

	public static void main(String[] args) {
		
		
	
// values = bool corners, float circumference, radius, area, diameter, # corners 
		Shape square = new Shape(true, 0, 0, 10, 0, 4);
		
		square.whatShape();
		
		Shape pentagon = new Shape(true, 0, 0, 10, 0, 5);
		
		pentagon.whatShape();
		
		Circle circleOne = new Circle();
		
		Pentagon pentagonOne = new Pentagon();

		
		circleOne.calcArea(0);
		
		pentagonOne.calcApothem();
		
	}
}
