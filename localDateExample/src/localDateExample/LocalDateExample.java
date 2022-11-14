package localDateExample;

import java.time.LocalDate;

public class LocalDateExample {
	
	public static void main(String[] args) {
		
		LocalDate todaysDate = LocalDate.now();
		LocalDate customDate = LocalDate.of(1993, 1, 9);
		
	    LocalDate yesterday = todaysDate.minusDays(1);    
	    LocalDate tomorrow = yesterday.plusDays(2);  
	    
	    System.out.println("Today is: " + todaysDate);
	    System.out.println("DOB is: " + customDate);
	    System.out.println("Yesterday was: " + yesterday);
	    System.out.println("Tomorrow will be: " + tomorrow);
		
	}
}
