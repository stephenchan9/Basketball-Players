
import java.util.*;
import java.util.Random;

public class Player {
	private String name;
	private int height;
	private int weight;
	//Out of 10
	private int ranking;
	
	protected static int total_players;
	//Constructor
	public Player(){
		if (total_players<16)
		{
			total_players++;
			System.out.println("Player Created\n");
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
	//this will be used to calculate their scorein the priority queue.
	public static int calculateRanking(){
		Random rand= new Random();
		int random_number= (int) rand.nextInt((99-50)+1);
		return random_number;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking =ranking;
	}
	//This function will be used to generate a player with random info
	public static Player randomizePlayers()
	{
		Player a_player= new Player();
		a_player.setRanking(calculateRanking());
		return a_player;
	}
	public static void promptInfo(int height, int weight,String name)
	{
		
	}
	
	//---------MAIN------------
	public static void main(String[] args) 
	{
		//Header Info
		System.out.println("This is a Sample Program that will \nRandomly Generate Queue of 15 NBA Players\n"); 
		System.out.println("Created by Stephen Chan");
		System.out.println("Press 1 to Randomize Players or press 2 to Enter Players manually (Max of 16): ");
		
		
		//Allocates memory for 16 players
		Player[] collection= new Player[15];
		
		//Begin prompting User to make a choice
		//Creates a scanner object to read input;
		@SuppressWarnings("resource")
		Scanner user_input=new Scanner(System.in);
		int input;
		input=user_input.nextInt();
		if (input==1){
			while (total_players<16){
				collection[total_players]=randomizePlayers();
			}
			System.out.println("Successfully Created 16 players");
		}
		else if (input==2){
			while (total_players<16){
				Player a_player= new Player(); 
				//User Input Scanner
				Scanner info=new Scanner(System.in);
				int height;
				int weight;
				
				System.out.println("Enter Height:");
				height=info.nextInt();
				
				
			}
		}
	
	}
}
