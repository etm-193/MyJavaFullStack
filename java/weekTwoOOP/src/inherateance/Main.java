package inherateance;

public class Main {

	public static void main(String[] args) {
		Animals animalOne = new Animals(true, "Black", "Omnivore");
		
		System.out.println(animalOne.hasLegs + " " + animalOne.color + " " + animalOne.diet);
		
		animalOne.move();
		animalOne.speak();
		animalOne.eat();
		
		System.out.println();
		
		Dog dogOne = new Dog();
		
		dogOne.eat();
		
		
		
	}
	
	//covariance - enables us to group objects together that are
	//from the same source.
}
