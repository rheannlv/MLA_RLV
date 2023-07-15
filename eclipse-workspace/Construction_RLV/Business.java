
public class Business extends Building {
	
	protected int numRentableUnits;
	
	public Business() {
		super();
		numRentableUnits = 0;
	}//end empty constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = 0;
	}//end preferred constructor

	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end get numRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end set numRentableUnits

	@Override
	public String toString() {
		return "Project Name: " + projectName + "\n" + "Address: " 
	+ completeAddress + "\n" + "Square Feet: " + totalSquareFeet + " sqft\n" 
	+ "Occupany Group: " + occupancyGroup + "\n" + "Occupancy Subgroup: " 
	+ subgroup + "\n" + "Number of rentable units: " + numRentableUnits + "\n";
	}//end toString
	
}//end class
