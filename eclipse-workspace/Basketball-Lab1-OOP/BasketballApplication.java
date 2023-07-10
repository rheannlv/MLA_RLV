
public class BasketballApplication {

	public static void main(String[] args) {
		
		BasketballTeam team1 = new BasketballTeam("Barbie's Favorite", "LoliPops", "Shay Mitchell");
		System.out.println(team1.toString());
		
		team1.setStats(1, 4, 8, 10, 2, 13); 
		System.out.println(team1.toString()); 

		
		

	}

}
