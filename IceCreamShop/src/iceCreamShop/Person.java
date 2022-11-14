package iceCreamShop;

public class Person {
	//properties
	private String name;
	//constructors
	public Person() {
		super();
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}
	//getAndSet
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
