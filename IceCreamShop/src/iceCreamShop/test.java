package iceCreamShop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class test {
	// The properties to make our IceCreamShop work:
	private String name;
	private double income;
	// Here is the Queue for all my customers that are coming to the Ice Cream Shop
	private Queue<Customer> customerInLine = new LinkedList<>();
	// Here I create a list of all the flavors in the store using arraylist as my stack for flavors.
	private ArrayList<IceCream> flavors;
	
	// Building the constructor for the IceCreamShop.
	
	public IceCreamShop () {
		
	}
	
	public IceCreamShop ( String name, ArrayList<IceCream> flavors) {
		this.name = name;
		this.flavors = new ArrayList <> (flavors);
	}
	
	// Here we are going to write all the methods to create  to my Ice Cream Shop: 
	
	//Write the method, serviceCustomer that takes the Customer at the front of the list, adds the cost of their ice cream 
	// to the total earnings, and then removes them from the queue. 
	public double  serviceCustomer(Customer customer ) {
		if ( customerInLine.isEmpty()) {
			throw new IllegalArgumentException(" There is NOT Customer in the Line !! ");
		}
		Customer currentCustomer = customerInLine.poll();
		if (currentCustomer.getIceCream() == null ) {
			throw new IllegalArgumentException(" Customer without Ice Cream ");
		}
		if (!flavors.contains (currentCustomer.getIceCream())) {
			throw new IllegalArgumentException(" This flavor is not in the stored sorry !!");
		}
		return income += currentCustomer.getIceCream().getPrice();
	}
	
	//Write the method, addCustomer that adds a Customer to the IceCreamShop's queue:
	
	public boolean  addCustomer(Customer customer) {
		if (customer  == null ) {
			throw new IllegalArgumentException(" No customer in the list " );
			}
		return customerInLine.add (customer);
		
}

	// Write the method, addFlavor that adds an IceCream flavor to the list of available IceCream flavors
	public boolean addFlavor (IceCream flavor) {
		if (flavor == null ) { 
			throw new IllegalArgumentException(" Flavor doesn't exist !! ");
		}
		if (flavors.contains(flavor) ) {
			throw new IllegalArgumentException(" That flavor already exist !! ");
		}
		 return flavors.add(flavor);
	}
	
	// Write the method, removeFlavor that removes an IceCream flavor to the list of available IceCream flavors
	public boolean removeFlavor(IceCream flavor) {
		if (!flavors.remove(flavor)) {
			throw new IllegalArgumentException(" That favor is not in the list. Sorry try again ! ");
		}
		return flavors.remove(flavor);
	}

	@Override
	public String toString() {
		return "IceCreamShop [name=" + name + ", gainMoney=" + income + ", customerIn=" + customerInLine
				+ ", flavors=" + flavors + "]";
	}
	
	

}


