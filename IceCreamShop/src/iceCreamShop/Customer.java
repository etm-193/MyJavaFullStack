package iceCreamShop;

public class Customer extends Person{
	
	private double cashOnHand;
	private boolean hasAllergies;
	
	public Customer(String name, double cashOnHand, boolean hasAllergies) {
		super(name);
		this.cashOnHand = cashOnHand;
		this.hasAllergies = hasAllergies;
	}
	
	//methods
	
	public void getInLine() {
		
	}
	
	
	//getAndSet
	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public boolean isHasAllergies() {
		return hasAllergies;
	}

	public void setHasAllergies(boolean hasAllergies) {
		this.hasAllergies = hasAllergies;
	}

	public static String toString(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
