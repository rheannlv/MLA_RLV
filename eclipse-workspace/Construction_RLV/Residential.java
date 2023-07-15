
public class Residential extends Building {
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false; 
	}//end empty constructor
	
	public Residential (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup ) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBathrooms = 0;
		this.numBedrooms = 0;
		this.laundryRoom = false;
	}//end preferred constructor
	
	//Getters and Setters

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	//end Getters and Setters

	@Override
	public String toString() {
		
		return "Project Name: " + projectName + "\n" + "Address: " 
	+ completeAddress + "\n" + "Square Feet: " + totalSquareFeet 
	+ " sqft\n" + "Occupany Group: " + occupancyGroup + "\n" 
	+ "Occupancy Subgroup: " + subgroup + "\n" + "Number of Bedrooms: "
	+ numBedrooms + "\n" + "Number of Bathrooms: " + numBathrooms 
	+ "\n" + "Laundry Room: " + laundryRoom + "\n";
	}//end toString

	
}//end class
