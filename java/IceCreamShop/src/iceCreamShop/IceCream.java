package iceCreamShop;

import java.util.HashMap;

public class IceCream {
	
	private HashMap<String,Integer> flavors = new HashMap<>(20);
	private boolean inInventory;
	private int inventory;
	
	public IceCream() {
		super();
	}

	public IceCream(HashMap<String, Integer> flavors, boolean inInventory, int inventory) {
		super();
		this.flavors = flavors;
		this.inInventory = inInventory;
		this.inventory = inventory;
	}

	//methods
	
	public void addToFlavorList(String flavor, int inventoryQty) {
		flavors.put(flavor, inventoryQty);
		//test code
		System.out.println(flavors);
	}
	
	public void removeFromFlavorList() {}
	
	
	public boolean isAvailable() {
		return inInventory;}
	
	//getAndSet
	public String[] getFlavors() {
		return flavors;
	}

	public void setFlavors(String[] flavors) {
		this.flavors = flavors;
	}

	public boolean isInInventory() {
		return inInventory;
	}

	public void setInInventory(boolean inInventory) {
		this.inInventory = inInventory;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	
	
	
}
