package oopAssignment;

public class WalletClass {

	public boolean hasMoney;
	public int cashAmmount;
	public String color;
	public String ownerName;
	public boolean signalProtection;
	
	public WalletClass(boolean hasMoney, int cashAmmount, String color, String ownerName) {
		super();
		this.hasMoney = hasMoney;
		this.cashAmmount = cashAmmount;
		this.color = color;
		this.ownerName = ownerName;
		
	}
	
	public void storeCash() {
		System.out.println("Feed me " + ownerName + "!");
		
	}
	
	
	public void signalProtect() {
		if (signalProtection) {
			System.out.println("Your cards are protected, fancy!");
		}
	}
	
}
