
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
	public int calculateRanking(){
		Random rand= new Random();
		int random_number= (int) rand.nextInt((99-50)+1);
		return random_number;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking() {
		this.ranking = calculateRanking();
	}
	
	public static void main(String[] args) 
	{
		//Set info
		System.out.println("This is a Sample Program that will \n Randomly Generate Queue of 15 NBA Players\n"); 
		
	}
}
