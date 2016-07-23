import java.util.Scanner;

public class collegePlayer extends Player{
	private String college;
	
	collegePlayer(){
		System.out.println("College player created\n");
	}
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	public void manualCollege()
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
		System.out.println("Enter college: ");
		String college=info.nextLine();
		
		//Sets all the Values
		this.setName(name);
		this.setHeight(height);
		this.setWeight(weight);
		this.setRanking(ranking);
		this.setCollege(college);
	}
}
