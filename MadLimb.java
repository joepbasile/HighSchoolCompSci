package Intro;

import java.util.Scanner; 

//Joseph Basile
//Block H
//Date
//Description:Create a mad limb where you fill in key words or numbers
//

public class MadLimb
{

	Scanner scan = new Scanner(System.in);
	String name;
	String place;
	String transportation;
	double num1;
	int num2;
	int num3;
	String clothing;
	char symbol;
	String adj1;
	String adj2;
	int num4;
	String word1;
	String word2;
	
	//This method will introduce the mad limb and the instructions
	public void intro()
	{
		System.out.println("Welcome to my madlimb.  I tell you to give me a word or number to complete a " +
				"story.  Ready to begin?  Good, lets get started.");
	}
	
	//This will ask for words or numbers to fill in blanks in the story 
	public void input()
	{
		System.out.println("Give me a male name.");
		name = scan.nextLine();
		
		System.out.println("Give me a mode of transportation.");
		transportation = scan.nextLine();
		
		System.out.println("give me a name of a place.");
		place = scan.nextLine();
		
		System.out.println("Give me a number with a decimal.");
		num1 = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Give me a positive whole number.");
		num2 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Give me a number between 1 and 12.");
		num3 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Give me a peice of clothing.");
		clothing = scan.nextLine();
		
		System.out.println("Give me a symbol.");
		symbol = scan.nextLine().charAt(0);
		
		System.out.println("Give me an adjective ending with -ing.");
		adj1 = scan.nextLine();
		
		System.out.println("Give me an adjective.");
		adj2 = scan.nextLine();
		
		System.out.println("Give me a positive number.");
		num4 = scan.nextInt();
		scan.nextLine();
	}
		
		//This will read out the story to you 
		public void output()
		{
			System.out.println("I will now tell you the story.");
			System.out.println(name+" went on vacation to "+place+".  His "+transportation+" ticket cost $"+num1+"."+
			"  He was only allowed to bring "+num2+" suitcases on the trip.  He left at "+num3+" A.M.  He wore his favorite "
			+clothing+" whith a "+symbol+" sign on it.  His vcation was very "+adj1+".  The weather was very "
			+adj2+".  Bob enjoyed his "+num4+" day vacation.");
			
		}
		
	
	

	public static void main(String[] args)
	{
		MadLimb joe = new MadLimb();
		
		joe.intro();
		joe.input();
		joe.output();
		
		
		
		
	}

}

