package iceCreamShop;

public class Employee extends Person{
	
	private double cashInRegister;
	
	public Employee(String name, double cashInRegister) {
		super(name);
		this.setCashInRegister(cashInRegister);
	}
	
	//methods to service customer
	
	public void nextCustomer() {}
	
	public void takeCustomerOrder() {}
	
	public double processPayment() {
		return cashInRegister;}
	
	public void prepareOrder() {}

	public double getCashInRegister() {
		return cashInRegister;
	}

	public void setCashInRegister(double cashInRegister) {
		this.cashInRegister = cashInRegister;
	}
	
	
	
}
