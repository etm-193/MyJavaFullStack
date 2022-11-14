package shopClassRedux;

import java.util.HashMap;
import java.util.Objects;

public class Shop {
	
	//properties
	private String shopName;
	private String shopType;
	private double shopBank;
	private boolean hasInventory;
	private HashMap<String, Object> inventory;

	
	//Shop constructors
	public Shop() {
		super();
	}
	
	public Shop(String shopName, String shopType, double shopBank, boolean hasInventory,
			HashMap<String, Object> inventory) {
		super();
		this.shopName = shopName;
		this.shopType = shopType;
		this.shopBank = shopBank;
		this.hasInventory = hasInventory;
		this.inventory = inventory;
	}

	
	//methods
	public double bankDeposit(double amountToAdd) {
		double deposit = this.getShopBank() + amountToAdd;
		this.setShopBank(deposit);
		return shopBank;
	}

	public void checkBalance() {
		System.out.println("Your current balance is: $" + shopBank);
	}
	
	
	
	//Gets and sets
	public String getShopName() {
		return shopName;
	}

	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	
	public String getShopType() {
		return shopType;
	}

	
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	
	public double getShopBank() {
		return shopBank;
	}

	
	public void setShopBank(double shopBank) {
		this.shopBank = shopBank;
	}

	
	public boolean isHasInventory() {
		return hasInventory;
	}

	
	public void setHasInventory(boolean hasInventory) {
		this.hasInventory = hasInventory;
	}

	
	public HashMap<String, Object> getInventory() {
		return inventory;
	}
	

	public void setInventory(HashMap<String, Object> inventory) {
		this.inventory = inventory;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(hasInventory, inventory, shopBank, shopName, shopType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		return hasInventory == other.hasInventory && Objects.equals(inventory, other.inventory)
				&& Double.doubleToLongBits(shopBank) == Double.doubleToLongBits(other.shopBank)
				&& Objects.equals(shopName, other.shopName) && Objects.equals(shopType, other.shopType);
	}

	@Override
	public String toString() {
		return "Shop [shopName=" + shopName + ", shopType=" + shopType + ", shopBank=" + shopBank + ", hasInventory="
				+ hasInventory + ", inventory=" + inventory + "]";
	}
	
	
	
	
}
