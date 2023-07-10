//import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active; 
	private String intelligenceType;
	
	public NonPlayerCharacter() {
		super();
		active = false; 
		intelligenceType = "AVERAGE"; 
		
	}//end empty constructor
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		super(id, personality);
		this.active = active;
		this.intelligenceType = intelligenceType;
		
	}//end preferred constructor
	
	public String reportStructure(){
		
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("UniqueID: "+getUniqueID()+"\n");
		sb.append("Personality: "+getPersonality()+"\n");
		sb.append("==================================\n");
		sb.append("Active: " + isActive()+"\n");
		sb.append("Intelligence: " +getIntelligenceType()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}//end reportStructure
	
	public String introduce() {
		StringBuilder sb2 = new StringBuilder ();
		sb2.append("Hello, my name is " + getUniqueID()+"\n");
		
		return sb2.toString();
	}//end introduce method
	
	public String exclaim() {
		String [] strR = {"Dag Gummit\n", "Doggone it\n", "Holy cow\n", "Jeez\n", "Well cheese and cracker\n"};
		Random r = new Random();
		int randomId = r.nextInt(4);
		
		return strR[randomId];
		
	}//end exclaim method
	
	public boolean isActive() {
		return active;
	}//end booleanActive
	
	public void setActive(boolean active) {
		this.active = active;
	}//end setActive
	
	public String getIntelligenceType() {
		return intelligenceType;
	}//end getIntell
	
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}//end setIntell

	@Override
	public String toString() {
		return "NonPlayerCharacter [active=" + active + ", intelligenceType=" + intelligenceType + ", uniqueID="
				+ uniqueID + ", personality=" + personality + "]\n" + "\n" + introduce() + "\n" + exclaim(); 
		
				
	}//end toString

	
	
	
	
	
	
	
	
	

}//end class
