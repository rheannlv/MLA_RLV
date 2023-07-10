
public class BasketballTeam extends SportsTeam {
	
	private int fieldGoals, fieldGoalsAttempted;
	private int freeThrows, freeThrowsAttempted;
	
	public BasketballTeam() {
		
		super();
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}//end empty constructor 
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super (teamName, teamMascot, headCoach);
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	}//end preferred constructor
	
	public double fieldGoalPrecentage() {
		return fieldGoals/fieldGoalsAttempted; 
	}// end fieldGoal%
	
	public double freeThrowPrecentage() {
		return freeThrows/freeThrowsAttempted;
	}//end freeThrow%
	
	public double[] getStats() {
		double [] gS = {super.getWinPercentage(), fieldGoalPrecentage(), freeThrowPrecentage()};
		
		return gS; 
	}//end getStats
	
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted){
		super.wins = wins; 
		super.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted; 
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
	}//end setStats
	
	public int getFieldGoals() {
		return fieldGoals;
	}

	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}

	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}

	public int getFreeThrows() {
		return freeThrows;
	}

	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}

	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}

	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}

	@Override
	public String toString() {
		return "BasketballTeam [fieldGoals=" + fieldGoals + ", fieldGoalsAttempted=" + fieldGoalsAttempted
				+ ", freeThrows=" + freeThrows + ", freeThrowsAttempted=" + freeThrowsAttempted + ", teamName="
				+ teamName + ", teamMascot=" + teamMascot + ", headCoach=" + headCoach + ", wins=" + wins + ", losses="
				+ losses + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}// end class
