import java.util.Scanner;

public class highschoolPlayer extends Player{
	//high school makes this object different
	private String highschool;
	
	//Constructor. Increments total number of players
	highschoolPlayer(){
		System.out.println("Highschool player created\n");
	}
	//getters and setters
	public String getHighschool() {
		return highschool;
	}

	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}
	//Manual Entry of a highschool player
	public static highschoolPlayer manualHighschool()
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
		
		highschoolPlayer a_player= new highschoolPlayer();
		System.out.println("Enter high school:");
		String high_school=info.nextLine();
		
		//Sets all the Values
		a_player.setName(name);
		a_player.setHeight(height);
		a_player.setWeight(weight);
		a_player.setRanking(ranking);
		a_player.setHighschool(high_school);
		return a_player;
	}
}
