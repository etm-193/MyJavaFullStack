package athleteComparison;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Ernesto's Athlete compaison program.");
		
		
		// Data input required = String name, int win, int loss.
		Athletes athlete1 = new Athletes("Ernesto", 0, 10);
		Athletes athlete2 = new Athletes("Joelma", 30, 0);
		Athletes athlete3 = new Athletes("Alex", 30, 10);
		Athletes athlete4 = new Athletes("Sara", 20, 10);
		
	athlete1.setWinPercentage(athlete1.percentageCalc());
	athlete2.setWinPercentage(athlete2.percentageCalc());
	athlete3.setWinPercentage(athlete3.percentageCalc());
	athlete4.setWinPercentage(athlete4.percentageCalc());
	
	System.out.println(athlete1.getWinPercentage());
	System.out.println(athlete2.getWinPercentage());
	System.out.println(athlete3.getWinPercentage());
	System.out.println(athlete4.getWinPercentage());
	
	athlete1.compareTo(athlete2);
	athlete1.compareTo(athlete3);
	athlete1.compareTo(athlete4);
	
	athlete2.compareTo(athlete1);
	athlete2.compareTo(athlete3);
	athlete2.compareTo(athlete4);
	
	athlete3.compareTo(athlete1);
	athlete3.compareTo(athlete2);
	athlete3.compareTo(athlete4);
	
	athlete4.compareTo(athlete1);
	athlete4.compareTo(athlete2);
	athlete4.compareTo(athlete3);
	
	
	
		
		
	}

}


//private void normalStatsCheck(Athletes other) {
//This method runs the standard comparison between the num of races won.

//placeholder variable
//int alternate = 0;
//
//// Initial object "this." has more wins.
//String thisWins = this.athleteName + " ranks higher than " + other.athleteName + " by " + (this.numWins - other.numWins) + " races won.";
//// Initial object "other." has more wins.
//String otherWins = this.athleteName + " ranks lower than " + other.athleteName + " by " + (other.numWins - this.numWins) + " races lost.";
//// Initial object "this./other." have tied.
//String itsATie = "Both " + this.athleteName + " and " + other.athleteName +  " have " + this.numWins + " wins in their record!";
//
//if (this.numWins > other.numWins) {
//	System.out.println(thisWins);
//} else if (this.numWins < other.numWins) {
//	System.out.println(otherWins);
//} else {
//	System.out.println(itsATie);
//	//variation 1 of the alternate method
//	alternate = 1;
//	alternateStatsCheck(alternate, other);
//}	
//}


//private Object alternateStatsCheck(int alternate, Athletes other){
//	// This method runs if the requirements method's conditions point to the else statement.
//	 
//	//scenario variable place holder
//	alternate = 0;
//	
//	//Scenario case statement		
//	String caseStatement0 = "Since " + this.athleteName + " does not have the minimum number of races we will use their lap times to establish their rank.";
//	String caseStatement1 = "Let's see then who has a faster lap time!";
//	
//	//Win/loss/tie statements
//	
//	String thisWins = this.athleteName + " has a faster lap time than " + other.athleteName + "! " + this.athleteName + " ranks above " + other.athleteName + ".";
//	String otherWins = this.athleteName + " ranks lower than " + other.athleteName + " by " + (other.numWins - this.numWins) + " races lost.";
//	String itsATie = "Both " + this.athleteName + " and " + other.athleteName +  " have " + this.numWins + " wins in their record!";
//	
//	
//	if (alternate == 0) {
//		System.out.println(caseStatement0);
//	} else {
//		System.out.println(caseStatement1);
//	}
//	
//	if (this.lapTime < other.lapTime) {
//		System.out.println(this.athleteName + " has a faster lap time than " + other.athleteName);
//		return 1;
//	} else if (this.lapTime > other.lapTime){
//		System.out.println(this.athleteName + " has a greater lap time than " + other.athleteName + ", which makes " + other.athleteName + " the winner!");
//		return -1;
//	} else { 
//		System.out.println(this.athleteName + " and " + other.athleteName + " have tied on their lap time!");
//		return 0;
//	}
//	
//}
//
