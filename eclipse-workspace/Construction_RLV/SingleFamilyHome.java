
public class SingleFamilyHome extends Residential {
	
	private boolean garage; 
	
	public SingleFamilyHome() {
		super();
		garage = false;
	}//end empty constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.garage = false;
	}//end preferred constructor
	
	public void draw() {
		System.out.println("Drawing Code for Single Family Home");
	}//end draw method
	
	public String displayData() {
		return toString();
	}//end displayData method
	
	//Getters and setters
	
	public boolean isGarage() {
		return garage;
	}//end getGarage

	public void setGarage(boolean garage) {
		this.garage = garage;
		
		if (garage == false) {
			System.out.println("N");
		}
			else { System.out.println("Y");
			}
		}//end setGarage
	
	//End getters and setters
	

	@Override
	public String toString() {
		return "Project Name: " + projectName + "\n" + "Address: " + completeAddress + "\n" + "Square Feet: " + totalSquareFeet 
		+ " sqft\n" + "Occupany Group: " + occupancyGroup + "\n" + "Occupancy Subgroup: " + subgroup + "\n" + "Number of Bedrooms: " 
		+ numBedrooms + "\n" + "Number of Bathroom: " + numBathrooms + "\n" + "Laundry Room: " + laundryRoom + "\n" 
		+ "Garage: " + garage + "\n";
	}//end toString
	

}//end class
