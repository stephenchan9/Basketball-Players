import java.util.Scanner;

public class internationalPlayer extends Player {
	private String club_team;
	
	//Constructor
	internationalPlayer(){
		System.out.println("International player created\n");
	}

	public String getClub_team() {
		return club_team;
	}

	public void setClub_team(String club_team) {
		this.club_team = club_team;
	}
	public static internationalPlayer manualInternational()
	{
		//Variables
		Scanner info=new Scanner(System.in);
		String name;
		int height;
		int weight;
		int ranking;
		
		//Prompts
		System.out.println("Enter Name:");
		name=info.nextLine();
		System.out.println("Enter Height:");
		height=info.nextInt();
		System.out.println("Enter Weight:");
		weight=info.nextInt();
		System.out.println("Enter Ranking (50-100):");
		ranking=info.nextInt();
		
		//Creation of player
		internationalPlayer a_player= new internationalPlayer();
		System.out.println("Enter club team:");
		String club_team=info.nextLine();
		
		//Sets all the Values
		a_player.setName(name);
		a_player.setHeight(height);
		a_player.setWeight(weight);
		a_player.setRanking(ranking);
		a_player.setClub_team(club_team);
		return a_player;
	}
	
}
