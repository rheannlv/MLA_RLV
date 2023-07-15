
public class Mall extends Business {
	
	private int numRentedUnits = 0;
	private double medianUnitSize = 0.0;
	private int numParkingSpaces = 0;
	
	public Mall() {
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}//end empty constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
	}//end preferred constructor
	
	public void draw () {
		System.out.println("Drawing Code for Mall");
	}//end draw method
	
	public String displayData() {
		return toString();
	}//end displayData method
	
	//Setters and Getters

	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
	//end setters and getters

	@Override
	public String toString() {
		return "Project Name: " + projectName + "\n" + "Address: " + completeAddress + "\n" 
	+ "Square Feet: " + totalSquareFeet + " sqft\n" + "Occupany Group: " + occupancyGroup + "\n" 
	+ "Occupancy Subgroup: " + subgroup + "\n" + "Number of rented units: " + numRentedUnits 
	+ "\n" + "Median Unit Size: " + medianUnitSize + "\n" + "Number of parking spaces: " 
	+ numParkingSpaces + "\n";
	}//end toString
	
	
	

}//end class
