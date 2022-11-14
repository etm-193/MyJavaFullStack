package shopClassRedux;

import java.util.HashMap;
import java.util.Queue;


/*
 * Welcome to Ernesto's car rental program,
 * 
 * As you can see this class is a "Shop" Object that inherits
 * its main traits from the .super() "shop".  That way this 
 * project will be implementing re-usability.
 * 
 */


public class CarRentalBusiness extends Shop {
	
	private Queue<Customer> customersLine;

	public CarRentalBusiness() {
		super();
		
	}

	public CarRentalBusiness(String shopName, String shopType, double shopBank, boolean hasInventory,
			HashMap<String, Object> inventory) {
		super(shopName, shopType, shopBank, hasInventory, inventory);
		this.setCustomersLine(customersLine);
	}

	public Queue<Customer> getCustomersLine() {
		return customersLine;
	}

	public void setCustomersLine(Queue<Customer> customersLine) {
		this.customersLine = customersLine;
	}
	
	
	
	
	
	
}
