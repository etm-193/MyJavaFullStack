package shopClassRedux;

public class Main {
	
	/*
	 * Welcome to Ernesto's car rental program,
	 * 
	 * As you can see this class is a "Shop" Object that inherits
	 * its main traits from the .super() "shop".  That way this 
	 * project will be implementing re-usability.
	 * 
	 */
	
	public static void main(String[] args){
		
		CarRentalBusiness myRentalCo = new CarRentalBusiness();
		
		myRentalCo.setShopName("Ernesto's Car Rental");
		myRentalCo.setShopType("A Car Rental Shop.");
		myRentalCo.setShopBank(25000.0);
		myRentalCo.setHasInventory(true);
		
		
		//test 1
		System.out.println(myRentalCo.toString());
		
		
	}

}
