package athleteComparison;



public class Athletes implements Comparable<Athletes>{
	
	private String athleteName;
	private double numWins;
	private double numLoss;
	private double careerRaceTotal;
	private double winPercentage;

	//constructor
	
	public Athletes(String athleteName, int numWins, int numLoss) {
		super();
		this.athleteName = athleteName;
		this.numWins = numWins;
		this.numLoss = numLoss;
	}
	
	public Athletes(String athleteName, int numWins, int numLoss, int careerRaceTotal, double winPercentage) {
		super();
		this.athleteName = athleteName;
		this.numWins = numWins;
		this.numLoss = numLoss;
		this.careerRaceTotal = careerRaceTotal;
		this.winPercentage = winPercentage;
	}
	
	// methods
	
	public double raceTotal() {
		double raceTotal = (numWins + numLoss);
		setCareerRaceTotal(raceTotal);
		return raceTotal;
	}

//	!= working logic:
//	public int calcWinTotal() {
//		int winTotal = numWins - numLoss;
//		return winTotal;
//	}
//	
	public double percentageCalc() {
		double careerWinsPercentage = numWins / (numWins + numLoss);
		winPercentage = careerWinsPercentage;
		setWinPercentage(winPercentage);
		return winPercentage;
	}
	
	public Object requirements(Athletes other) {
		//This method checks if an athlete obj meets the minimum race total, if not it ranks the winner on the alternate stat. (bonus)
		Object winner;
		System.out.println(this.athleteName + " has a total of " + this.raceTotal() + " races in their career.");
		System.out.println(other.athleteName + " has a total of " + other.raceTotal() + " races in their career.");
		if (this.raceTotal() >= 30 && other.raceTotal() >= 30) {
			winner = normalStatsCheck(other);
		} else {
			int alternate = 0;
			winner = alternateStatsCheck(alternate, other);
		}
		System.out.println(winner);
		return winner;
	}
	
	
	private Object normalStatsCheck(Athletes other) {
		//This method runs the standard comparison between the num of races won.
//		
		//placeholder variable
		Object winner = 0;
		int alternate = 0;
		
		// Initial object "this." win % higher..
		String thisWins = this.athleteName + " ranks higher than " + other.athleteName + ".";
		// Initial object "other."  win % higher.
		String otherWins = this.athleteName + " ranks lower than " + other.athleteName + ". " ;
		// Initial object "this./other." win % have tied.
		String itsATie = "Both " + this.athleteName + " and " + other.athleteName +  " have " + this.winPercentage + "% win rate!";
		
		this.winPercentage = this.percentageCalc();
		other.winPercentage = other.percentageCalc();
		
		System.out.println(this.winPercentage);
		System.out.println(other.winPercentage);
		
		
		if (this.winPercentage > other.winPercentage) {
			winner = 1;
			System.out.println(thisWins);
		} else if (this.winPercentage < other.winPercentage) {
			winner = -1;
			System.out.println(otherWins);
		} else {
			System.out.println(itsATie);
		//variation 1 of the alternate method
			alternate = 1;
			winner = alternateStatsCheck(alternate, other);
			
		}	
		return winner;
	}
	
	private Object alternateStatsCheck(int alternate, Athletes other){
	// This method runs if the requirements method's conditions point to the else statement.
	 
	//scenario variable place holder
	int alternatePlaceHold = alternate;
	int winner = 0;
	
	//Scenario case statement		
	String caseStatement0 = "Since " + this.athleteName + " does not have the minimum number of races we will use their total number of wins to establish their rank.";
	String caseStatement1 = "Since both athletes have the same win percentage rage. Let's see then who has a faster lap time!";
//	
	//Win/loss/tie statements
	
	String thisWinsAlt = this.athleteName + " has won more races than " + other.athleteName + "! " + this.athleteName + " ranks above " + other.athleteName + ".";
	String otherWinsAlt = other.athleteName + " has won more races than " + this.athleteName + "! " + other.athleteName + " ranks above " + this.athleteName + ".";
	String itsATieAlt = "Both " + this.athleteName + " and " + other.athleteName +  " have " + this.numWins + " wins in their record!";
	
	
	if (alternatePlaceHold == 0
			
			) {
		System.out.println(caseStatement0);
	} else {
		System.out.println(caseStatement1);
	}
	
	if (this.numWins > other.numWins) {
		System.out.println(thisWinsAlt);
		winner = 1;
	} else if (this.numWins < other.numWins){
		System.out.println(otherWinsAlt);
		winner = -1;
	} else { 
		System.out.println(itsATieAlt);
		winner = 0;
	}
	return winner;
	
}

	public boolean equals(Athletes other) {
	        return this.winPercentage == other.winPercentage;
	        
	    }
	 
	 //compare to method
	public int compareTo(Athletes other) {
		
		//if athlete other. is then it would throw the exception
		if (other == null) { 
			throw new NullPointerException(); 
			}
			
			requirements(other);	
			return (int) 0;
			
		}
	
	//Setters and getters
	
	public String getAthleteName() {
		return athleteName;
	
	}
	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}
	public double getNumWins() {
		return numWins;
	}
	public void setNumWins(int numWins) {
		this.numWins = numWins;
	}
	public double getNumLoss() {
		return numLoss;
	}
	public void setNumLoss(int numLoss) {
		this.numLoss = numLoss;
	}

	public double getCareerRaceTotal() {
		return careerRaceTotal;
	}

	public void setCareerRaceTotal(double careerRaceTotal) {
		this.careerRaceTotal = careerRaceTotal;
	}

	public double getWinPercentage() {
		return winPercentage;
	}

	public void setWinPercentage(double winPercentage) {
		this.winPercentage = winPercentage;
	}

	

	
	
}
