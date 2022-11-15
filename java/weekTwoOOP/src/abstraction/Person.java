package abstraction;

public abstract class Person {

	//class variables can be static, final
	public static boolean alive = true;
	
	//instance variable
	public String name;
	
	//constructors
	
	
	//methods
	
	//non abstract methods
	public static void aliveCheck() {
		System.out.println();
	}
	
	public String getName() {
		return this.name;
	}
	
	//abstract method
	public abstract void declareJob();
	public abstract void growUp();
	
	
}
