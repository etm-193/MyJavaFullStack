package inherateance;

//to inherit from another class, we use the
//extends keyword


public class Dog extends Animals {

	//Dog class has inherited all properties
	//and methods of animals
	
	public String ownerName;
	public boolean isVaxed;
	public byte legNum;
	
	public Dog() {
		super();
	}
	
	public Dog(String ownerName, boolean isVaxed,byte legNum) {
		super();
		this.ownerName = ownerName;
		this.isVaxed = isVaxed;
		this.legNum = legNum;
		
	}
	
	public Dog(boolean hasLegs, String color, String diet, String ownerName, boolean isVaxed,byte legNum) {
		
	}
	
}
