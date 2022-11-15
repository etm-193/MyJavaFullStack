package week5;

import java.util.Objects;

public class Person {
	
	private String name;
	private int birthYr;
	private int birthMo;
	private int birthDy;
	final String dob = ("The author's date of birth is: " + birthDy +" / "+ birthMo+" / "+ birthYr+" .");
	
	//constructors
	
	public Person() {
		super();
	}
	
	
	public Person(String name, int birthYr, int birthMo, int birthDy) {
		super();
		this.name = name;
		this.birthYr = birthYr;
		this.birthMo = birthMo;
		this.birthDy = birthDy;
	}
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYr() {
		return birthYr;
	}
	public void setBirthYr(int birthYr) {
		this.birthYr = birthYr;
	}
	public int getBirthMo() {
		return birthMo;
	}
	public void setBirthMo(int birthMo) {
		this.birthMo = birthMo;
	}
	public int getBirthDy() {
		return birthDy;
	}
	public void setBirthDy(int birthDy) {
		this.birthDy = birthDy;
	}
	
	
	//String toString
	@Override
	public String toString() {
		return "Person [name = " + name + ", birthYr = " + birthYr + ", birthMo = " + birthMo + ", birthDy = " + birthDy + "]";
	}

	//hash codes & equals methods

	@Override
	public int hashCode() {
		return Objects.hash(birthDy, birthMo, birthYr, name, dob);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return birthDy == other.birthDy && birthMo == other.birthMo && birthYr == other.birthYr
				&& Objects.equals(name, other.name);
	} 
	
	
	
}
