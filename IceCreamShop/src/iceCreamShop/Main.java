package iceCreamShop;

public class Main {

	public static void main(String[] args) {


		Shop iceCreamShop = new Shop("Ernesto's Ice Creamery", 1000.0);
		
		//shop inventory
		
		
		//welcome statement
		System.out.println("Welcome to" + iceCreamShop.getShopName() +" !");
		//customer instantiated and gets in line
		
		iceCreamShop.setCustomerLine(null);
		
		iceCreamShop.customerGetsInLine("Joelma");
//		costumer1.getInLine();
		
		

	}

}
