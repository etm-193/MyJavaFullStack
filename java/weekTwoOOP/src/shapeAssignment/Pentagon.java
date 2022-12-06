package shapeAssignment;

public class Pentagon extends Shape {
	
	
	//Variables
	
//		public float radius;
//		public float circumference;
		public float area;
		public float perimeter;
		public float aSide;
		public float lenght;
//		public float diameter;
		
		float userChoice = 0;
//		float userInputRadius;
//		float userInputCircumference;
		
		//default constructor
		public Pentagon() {
			super();
		}
		
		//Custom constructor
		public Pentagon(float area, float perimeter, float aSide, float lenght) {
			super(doesItHaveCorners, corners);
			this.area = area;
			this.perimeter = perimeter;
			this.aSide = aSide; //apothem
			this.lenght = lenght;
		}
		
		//methods
		
		public float calcArea() {
			
			if (perimeter == 0) {
				perimeter = 5 * lenght;
			} else if (lenght == 0) {
				
				lenght = 10;
				System.out.println("I set your lenght to 10 and now we math!");
			} else if (perimeter == 0 && lenght == 0) {
				System.out.println("Come on now Johny...You got to give me something to work with!");
				perimeter = 10;
				lenght = 5;
				System.out.println("I set your lenght to 5 and your perimeter to 10 now we math!");
			}
			float pentagonArea = 1 / 2 * perimeter * lenght;
					
			area = pentagonArea;
			System.out.println("The area of your pentagon is "+ area);
			return area;
			
		}
		
		public float calcPerimeter() {
			
			if (lenght == 0) {
				System.out.println("No clue as to the lenght of your pentagon's sides?");
				System.out.println("Well there is a complicated formula, I'm sure, but let's just say its 5");
				lenght = 5;
			}
				
			
			perimeter = 5 * lenght;
			System.out.println("Your perimeter is:" + 5);
			return perimeter;
			
		}
		
		public void calcApothem() {
			System.out.println("ehhh... this is shamefull, my creator did not know how to interpret the formula for the apothem of a pentagon, curse you pentagon!!");
			System.out.println("Ill just set your apothem to 5, hows that?");
			aSide = 5;
			
		}

}
