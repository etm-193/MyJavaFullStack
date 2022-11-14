package week5;

import java.util.Objects;

public class Book {
	
	//hash code practice
	
	private String title;
	private Person author;
	
	//Constructor
	
	public Book() {
		super();
	}
	
	public Book(String title, Person author) {
		super();
		this.title = title;
		this.author = author;
		
	}
	
	//getters and setters
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Person getAuthor() {
		return author;
	}
	
	public void setAuthor(Person author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [Title = " + title + "\nAuthor = " + author + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}
	
	

}
