package week5;

import java.util.HashSet;

public class Main {

	static HashSet<Book> cataLog = new HashSet<>();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the library.");
		
		//add
		
		cataLog.add(null);
		cataLog.add(null);
		System.out.println(cataLog);
		Person author1 = new Person("Stephen king", 1947, 0, 0);
		Person author2 = new Person("Mark Twain", 0, 0, 0);
		Person author3 = new Person("Michelle Obama", 0, 0, 0);
		
		Book book1 = new Book("The shining", author1);
		Book book2 = new Book("The misterious stranger", author2);
		Book book3 = new Book("Becoming", author3);
		
		//hash set is not ordered
		
		cataLog.add(book1);
		cataLog.add(book2);
		cataLog.add(book3);
		
		
		
		
		
		
	}
	
}
