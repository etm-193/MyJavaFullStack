package shopClassRedux;

import java.time.LocalDate;

public class Employee extends Person{
	
private double cashInRegister;
	
	public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

	public Employee(String name, LocalDate dob, String sexAtBirth, double chashAvailable) {
		super(name, dob, sexAtBirth, chashAvailable);
		this.cashInRegister = getCashInRegister();
	// TODO Auto-generated constructor stub
}

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
