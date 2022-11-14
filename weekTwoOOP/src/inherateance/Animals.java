package inherateance;

public class Animals {

	//properties that all animals have
	
	// the final keyword makes it so you cannot extend from a class
	
	public boolean hasLegs;
	public String diet;
	public String color;
	
	
	//Constructor
	public Animals() {
		super();
	}
	
	public Animals(boolean hasLegs, String color, String diet) {
		this.hasLegs = hasLegs;
		this.color = color;
		this.diet = diet;
	}
	
	//methods that all animals have
	
	public void move() {
		System.out.println("I am an Animal, and I just went foward");
	}
	
	public void speak() {
		System.out.println("Generic Animal Noise");
	}
	
	public void eat() {
		
	}
	
}
