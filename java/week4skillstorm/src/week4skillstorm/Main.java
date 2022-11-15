package week4skillstorm;

public class Main {
	/*
	Create a class, Programmer, that describes a real-life programmer. The Programmer class should have 
	the ability to learn and forget programming languages in addition to having unique properties such as the person's name
	 and the company they work for. The class should have its data encapsulated and the languages that a person knows should be stored in 
	 an ArrayList of Strings and should not allow entry of a null value.

	Requirements:

	Defines properties such as languages, name, and the company the Programmer works for
	Have the data be full encapsulated via private fields and public getters and setters
	Have the ability to create multiple Programmer objects and have their data be independent of one another
	Possess the ability to learn and forget programming languages at will through publicly accessible methods on the Programmer class
	Prevent the addition of null entities to the programming languages array list
	Bonus Challenge:

	Override the toString method to allow the printing of a Programmer object
	*/
	public static void main(String[] args) {
		Programmer programmerOne = new Programmer();
		programmerOne.setName("Ernesto");
		programmerOne.learnLang("Java");
		System.out.println(programmerOne.getName());
		programmerOne.knows();
		programmerOne.forgetLang(0);
		programmerOne.setAge(29);
		System.out.println(programmerOne.getAge());
		programmerOne.learnLang("A bit of Python");
		programmerOne.learnLang("A bit of Java");
		programmerOne.knows();
		
		Programmer programmerTwo = new Programmer();
		
		programmerTwo.setName("Joelma");
		programmerTwo.learnLang("Portugese");
		System.out.println(programmerTwo.getName());
		programmerTwo.setAge(29);
		System.out.println(programmerTwo.getAge());
		programmerTwo.learnLang("Spanish");
		programmerTwo.learnLang("English");
		programmerTwo.learnLang("Italian");
		programmerTwo.knows();
		
		System.out.println("In case you were wondering " + programmerOne.getName() + " is married to " + programmerTwo.getName());
		System.out.println("And while " + programmerTwo.getName() + " doesn't know programming languages, she knows: ");
		programmerTwo.knows();

		
		System.out.println("Bonus challenge!");
		
		Programmer progThree = new Programmer("DummyBot", 0, "my laptop company");
		
		System.out.println(progThree.getName());

	}

}
