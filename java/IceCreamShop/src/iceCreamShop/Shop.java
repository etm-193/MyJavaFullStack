package iceCreamShop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Shop {
	
	
	private String shopName;
//	private String shopType; //for later implementation
	private double shopFunds;
//	private boolean employees; //for later implementation
//	private int numEmployee;// for later implementation
	private Queue<Customer> customerLine = new LinkedList<>();
	private ArrayList<IceCream> flavors;
	
	
	//constructors
	
	public Shop(String shopName, double shopFunds) {
		super();
		this.shopName = shopName;
		this.shopFunds = shopFunds;
	}
	
	
	public Shop(String shopName, double shopFunds, Queue<Customer> customerLine, ArrayList<IceCream> flavors) {
		super();
		this.shopName = shopName;
		this.shopFunds = shopFunds;
		this.customerLine = customerLine;
		this.flavors = flavors;
	}
	
	//methods
	//add Customer that adds to queue, throw exception when attempting to service a customer from an empty queue - found in Customer class
	



	public boolean customerGetsInLine(Customer customer) {
		if (customer == null) {
			throw new IllegalArgumentException("There is no one here? Ghosts!");
		}
		Customer customerName = customer;
		return customerLine.add(customerName);
		
	}
	
	


//	public void nextInLine(Customer customer) {
//		if(customerLine.isEmpty()) { 
//			throw new IllegalArgumentException("There is no one here?!");
//			}
//		Customer nextCustomer = customerLine.poll();
////		nextCustomer.orderIceCream();
//		
//	}
//	
//	public Customer orderIceCream(int flavor) {
//		IceCream choice = flavors.get((int) flavor);
//		Customer selection = flavors(choice);	
//	
//	}
	


	//getters and setters
	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public double getShopFunds() {
		return shopFunds;
	}
	public void setShopFunds(double shopFunds) {
		this.shopFunds = shopFunds;
	}



	public Queue<Customer> getCustomerLine() {
		return customerLine;
	}



	public Object setCustomerLine(Queue<Customer> customerLine) {
		return this.customerLine = customerLine;
		 
	}



	public ArrayList<IceCream> getFlavors() {
		return flavors;
	}
	
	public boolean removeFlavor(IceCream flavor) {
		if (!flavors.remove(flavor)) {
			throw new IllegalArgumentException(" We don't have that one. How about chocolate?");
		}
		return flavors.remove(flavor);
	}


	public boolean addFlavor (IceCream flavor) {
		if (flavor == null ) { 
			throw new IllegalArgumentException(" What flavor is that? ");
		}
		if (flavors.contains(flavor) ) {
			throw new IllegalArgumentException(" No, No, No more of that flavor ! ");
		}
		 return flavors.add(flavor);
		 }

	public void setFlavors(ArrayList<IceCream> flavors) {
		this.flavors = flavors;
	}


	public void customerGetsInLine(java.lang.String string) {
		// TODO Auto-generated method stub
		
	}

	
	
	//string to string

}
