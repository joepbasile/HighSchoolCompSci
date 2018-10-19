package Intro;
import java.util.Scanner;
import java.util.Random;


//Joseph Basile
//Block H
//Date:4/27/17
//Description:This will have the user input R, P,or S then have the computer pick
//between the 3 options and tell who won each round.  It will then say who won best out of 3 games.
//

public class Rock
{
	Scanner scan = new Scanner(System.in);
	Random gen = new Random();
	String name;
	String list[] = new String [3];
	int robotPoints=0;
	int playerPoints=0;
	String playerChoice;
	String robotChoice;
	int playerLength;
	int robotLength;
	int num = gen.nextInt(list.length);
	String again = "Yes";
	
	//This will let the computer randomly pick from R,P, or S.
	public void rockOrPaperOrScissors()
	{
		list[0] = "Rock";
		list[1] = "Paper";
		list[2] = "Scissors";
	}
	
	//This is the intro to the program and will explain the game to the player
	public void intro()
	{
		System.out.println("Hello welcome to my rock paper scissor game." +
				"  You will pick one and the computer will pick between rock paper or scissors." +
				"Best to out of 3 games win.");
		System.out.println("Get ready.");
		
	}	
	
	//This will run the game, tell who won each round, then get kicked out 
	//of the method when one player wins 2 out of 3 games.
	public void playGame()
	{
		
		while(playerPoints<2 && robotPoints<2)
		{
			rockOrPaperOrScissors();
			num = gen.nextInt(list.length);
			robotChoice = list[num];
			robotLength = robotChoice.length();
			System.out.println("What would you like to pick?");
			playerChoice = scan.nextLine();
			playerLength = playerChoice.length();
			
			//this will run through all the possibilities for the player to win and say if he/she wins the round.
			//If the player did not win it will say the robot won the round.  If both players
			//picked the same option it will tell the player there was no winner for that round.
			if( (playerLength==5 && robotLength==4) || (playerLength==8 && robotLength==5) || (playerLength==4 && robotLength ==8) )
			{
				playerPoints= playerPoints + 1;
				System.out.println("Congratulations you won that round!");
			}
			else
			{
				if( (playerLength==4 && robotLength==5) || (playerLength==5 && robotLength==8) || (playerLength==8 && robotLength ==4))
				{
					robotPoints= robotPoints + 1;
					System.out.println("Sorry, the computer won that round.");
				}
				else
				{
					System.out.println("You both picked "+playerChoice+".  There is no winner for that round.");
				}
			}
			
		}
	}

	//This will tell the player if he/she won the game or if the computer won the game.  
	public void winner()
	{
		if(playerPoints==2)
		{
			System.out.println("Congradulations, you won the game!");
		}
		else
		{
			System.out.println("Sorry, the computer won the game.  Better luck next time.");
		}
	}
	
	
	
	//This will run the program then ask the user if it wants to play the game again
	//and run it again if yes
	public void runAgain()
	{
		while(again.equalsIgnoreCase("yes"))
		{
			playGame();
			winner();
			System.out.println("Do you want to play the game again?  Yes or no.");
			again = scan.nextLine();
			robotPoints=0;
			playerPoints=0;
		}
		System.out.println("Thanks you.");
	}
	public static void main(String[] args)
	{
		Rock joe = new Rock();
		joe.intro();
		joe.runAgain();

	}

}

