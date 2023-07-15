
public class BuildingApplication {

	public static void main(String[] args) {
		
		Building bldg = new Building("Vera Corp", "246 Industrial drive | Floyds Knobs, IN | 12345", 5550, "Business", "B");
		bldg.draw();
		System.out.println();
		bldg.displayData(); //all of my displayData methods return their respective toStrings
		//bldg.toString();
		
		bldg.getCompleteAddress();
		bldg.getOccupancyGroup();
		bldg.getProjectName();
		bldg.getSubgroup();
		bldg.getTotalSquareFeet();
		
		//bldg.setCompleteAddress(null);
		//bldg.setOccupancyGroup(null);
		//bldg.setProjectName(null);
		//bldg.setSubgroup(null);
		//bldg.setTotalSquareFeet(0);
		System.out.println(bldg);
		System.out.println();
		
		Business bz1 = new Business ("Yummi Energy Drinks", "1200 Rapid drive | Houston, TX | 12345", 20345 ,"Business", "B");
		bz1.setNumRentableUnits(3);
		bz1.getNumRentableUnits();
		System.out.println(bz1.toString());
		System.out.println();
		
		Mall m1 = new Mall ("Two Bears Mall", "21 Grizzly street | Aurora, CO | 12345", 70000, "Business", "B");
		m1.draw();
		System.out.println();
		m1.displayData();
		//m1.toString();
		m1.setMedianUnitSize(1010);
		m1.setNumParkingSpaces(425);
		m1.setNumRentedUnits(210);
		
		//m1.getNumRentedUnits();
		//m1.getMedianUnitSize();
		//m1.getNumParkingSpaces();
		System.out.println(m1);
		
		Residential r = new Residential("Veteran's Housing and Mortgage", "422 Eagle's way | Fort Campbell, KY | 12345", 1345.0, "Residential", "R-4");
		r.getNumBathrooms();
		r.getNumBedrooms();
		r.isLaundryRoom();
		
		r.setNumBathrooms(2);
		r.setNumBedrooms(0);
		r.setLaundryRoom(true);
		System.out.println(r.toString());
		System.out.println();
		
		SingleFamilyHome vH1 = new SingleFamilyHome("The Vera's Home", "270 Memory Lane | Apex, NC | 12345", 2345.0, "Residential", "R-1");
		vH1.draw();
		System.out.println();
		//vH1.displayData();
		vH1.setGarage(true);
		vH1.setNumBathrooms(3);
		vH1.setNumBedrooms(4);
		vH1.setLaundryRoom(true);
		
		System.out.println(vH1); 
		System.out.println();

		Apartment apt123 = new Apartment("Kirkwood Apartments", "834 South Park way | Sanford, FL | 12345", 1265.75, "Residential", "R-2");
		apt123.draw();
		System.out.println();
		apt123.displayData();
		
		apt123.setAvgUnitSize(1200);
		apt123.setLaundryRoom(true);
		apt123.setNumBathrooms(2);
		apt123.setNumBedrooms(2);
		apt123.setNumRentableUnits(57);
		apt123.setParkingAvaliable(true);
		
		apt123.getAvgUnitSize();
		apt123.getNumRentableUnits();
		apt123.isParkingAvaliable();
		
		System.out.println(apt123.toString());
		System.out.println();
		
	}//end main

}//end class
