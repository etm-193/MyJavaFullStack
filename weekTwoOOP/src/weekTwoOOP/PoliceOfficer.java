package weekTwoOOP;

public class PoliceOfficer {
	
	//PROPERTIES
	//class variable
	//ALL objects of this class Share this variable
	//static keyword makes a variable a class variable 
	// and not to an instance varialbe
	
	public static boolean isUpstanding = true;
	
	
	//instance variables
	public boolean isCertified = true;
	public String sidearmType = "Smith & Wesson";
	public String uniformColor = "blue";
	public byte age = 35;
	
	
	//Each class has a default constructor
	public PoliceOfficer() {
		super();
	}
	
	
	//custom constructor
	public PoliceOfficer(boolean isCertified) {
		this.isCertified = isCertified;
	}
	
	//METHODS
	//instance method
	public void shoot() {
		System.out.println("Bang!");
	}
	
	public void rescueCat() {
		System.out.println("Come outta that tree, BANG!");
	}

}
