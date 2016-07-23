//Built by Stephen Chan

import java.util.*;
import java.util.Random;

public class Player {
	private String name;
	private int height;
	private int weight;
	private int ranking;
	
	protected static int total_players=0;
	//Constructor
	public Player(){
		if (total_players<16)
		{
			total_players++;
		}
		else
		{
			System.out.println("Max Player limit reached <15\n");
		}
	}
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//this will be used to calculate their score in the priority queue.
	public static int calculateRanking(){
		Random rand= new Random();
		int random_number= (int) rand.nextInt((99-50)+1);
		return random_number;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking=ranking;
	}
	
	//This function will be used to generate a player with random info
	public static Player randomizePlayers()
	{
		Player a_player= new Player();
		a_player.setRanking(calculateRanking());
		return a_player;
	}
	
	
	//---------MAIN------------
	public static void main(String[] args) 
	{
		//Header Info
		System.out.println("This is a Sample Program that will \nRandomly Generate Queue of 15 NBA Players\n"); 
		System.out.println("Created by Stephen Chan");
		System.out.println("Press 1 to Randomize Players or press 2 to Enter Players manually (Max of 16): ");
		
		
		//Allocates memory for 16 players
		Object[] collection= new Object[16];
		
		//Begin prompting User to make a choice
		//Creates a scanner object to read input;
		@SuppressWarnings("resource")
		Scanner user_input=new Scanner(System.in);
		int input;
		input=user_input.nextInt();
		if (input==1)
		{
			for (int i=0;i<16;i++){
				collection[i]=randomizePlayers();
			}
			System.out.println("Successfully Created 16 players");
		}
		else if (input==2)
		{
			while (total_players<16){
				int choice;
				Scanner info= new Scanner(System.in);
				System.out.println("Enter 1 for College, 2 for International, 3 for HighSchool: ");
				choice=info.nextInt();
				if (choice==1){
					collegePlayer a_player= new collegePlayer();
					a_player.manualCollege();
					collection[total_players]=a_player;
				}
			}
		}
	}
}

