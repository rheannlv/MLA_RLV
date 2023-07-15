
public class Apartment extends Residential {
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvaliable;
	
	public Apartment() {
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0; //square footage
		parkingAvaliable = false;
	}//end empty constructor
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvaliable = false;
	}//end preferred constructor
	
	public void draw() {
		System.out.println("Drawing Code for Apartment");
	}//end draw method
	
	public String displayData() {
		return toString();
	}//end displayData method

	//Setters and Getters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvaliable() {
		return parkingAvaliable;
	}

	public void setParkingAvaliable(boolean parkingAvaliable) {
		this.parkingAvaliable = parkingAvaliable;
	}
	//end Setters and Getters

	@Override
	public String toString() {
		return "Project Name: " + projectName + "\n" + "Address: " + completeAddress + "\n" + "Square Feet: " 
	+ totalSquareFeet + " sqft\n" + "Occupany Group: " + occupancyGroup + "\n" + "Occupancy Subgroup: " + subgroup + "\n" 
	+ "Number of Bedrooms: " + numBedrooms + "\n" + "Number of Bathroom: " + numBathrooms + "\n" + "Laundry Room: " + laundryRoom + "\n" 
	+ "Number of rentable units: " + numRentableUnits + "\n" + "Average unit size: " + avgUnitSize + " sqft\n" + "Parking Avalability: " 
	+ parkingAvaliable + "\n";
	}//end toString
	
	
	
}//end class
