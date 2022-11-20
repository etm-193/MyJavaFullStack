package shopClassRedux;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Car {
	
	private HashMap<String, String> makeModel;
		//because the model is unique it will be the key element and the make will be the value.
	private ArrayList<String> type;
//	private boolean isNew;  //code to be used if it were a dealership.
	private int pricePerDay;
	private int year;//for tracking purposes
	private boolean isGassoline;
	
	//Constructors
	public Car() {
		super();
	}
	
	public Car(HashMap<String, String> makeModel, ArrayList<String> type, int pricePerDay, int year,
			boolean isGassoline) {
		super();
		this.makeModel = makeModel;
		this.type = type;
		this.pricePerDay = pricePerDay;
		this.year = year;
		this.isGassoline = isGassoline;
	}

	//carMethods
	
	public void carAlarm() {
		System.out.println("BEEP BEEP BEEP BEEP BEEP!!!");
		this.lockDoors();
	}
	
	public void lockDoors() {
		System.out.println("Doors Lock*");
	}
	
	public boolean startCar() {
		Scanner scan = new Scanner(System.in);
		boolean startCar = false;
		String inIgnition = "yes";
		System.out.println("Are the keys in the ignition?");
		String keys = scan.nextLine();
		
		scan.close();
		if (keys.isEmpty()||keys == null) {
			throw new NullPointerException();
		} else if (keys.equalsIgnoreCase(inIgnition)) {
			startCar = true;	
		} else {
			startCar = false;
		}
		
		return startCar;
	}
	
//	public 
	
	
	//gets and sets
	public HashMap<String, String> getMakeModel() {
		return makeModel;
	}

	public void setMakeModel(HashMap<String, String> makeModel) {
		this.makeModel = makeModel;
	}

	public ArrayList<String> getType() {
		return type;
	}

	public void setType(ArrayList<String> type) {
		this.type = type;
	}

	public int getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public double getMiles() {
		return year;
	}

	public void setMiles(int year) {
		this.year = year;
	}

	public boolean isGassoline() {
		return isGassoline;
	}

	public void setGassoline(boolean isGassoline) {
		this.isGassoline = isGassoline;
	}
	
	//hash, equals, to string
	
	@Override
	public int hashCode() {
		return Objects.hash(isGassoline, makeModel, year, pricePerDay, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return isGassoline == other.isGassoline && Objects.equals(makeModel, other.makeModel)
				&& Double.doubleToLongBits(year) == Double.doubleToLongBits(other.year)
				&& pricePerDay == other.pricePerDay && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Car [makeModel=" + makeModel + ", type=" + type + ", pricePerDay=" + pricePerDay + ", Year=" + year
				+ ", isGassoline=" + isGassoline + "]";
	}
	
	
	
	
}
