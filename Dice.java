package Intro;

import java.util.Scanner;
import java.util.Random;

//Joseph Basile
//Block H
//Date
//Description: Roll a pair of dice for the player and computer then determine who 
// have the higher score and who won the game.  

public class Dice
{
	Scanner scan = new Scanner(System.in);
	Random gen = new Random();
	int num1, num2, num3, num4, total1,total2;
	String again = "Yes";

	
	//This will introduce the game and roll the dice for the player and computer
	public void rollDice()
	{
	System.out.println("Hello welcome to my dice game.  You will roll two " +
				"dice and the computer will role two dice.  Who ever has the " +
				"higher total wins.  ");
		num1 = gen.nextInt(6) +1;
		num2 = gen.nextInt(6) +1;
		num3 = gen.nextInt(6) +1;
		num4 = gen.nextInt(6) +1;
	}
	
	
	//This will tell the player what each dice rolled and give the 
	//total values for the dice combined.  It will tell the player who won.
	public void calculations()
	{
		total1 = num1 + num2;
		total2 = num3 + num4;
		System.out.println("You rolled a "+num1+" and a "+num2+" for a total of " +
				total1);
		System.out.println("The computer rolled a "+num3+" and a "+num4+" for a" +
				" total of "+total2);
		if(total1 > total2)
		{
			System.out.println("Congragulations you won the game!!!");
		}
		else
		{
			if(total1==total2)
			{
				System.out.println("You and the computer tied, there is no winner.");
			}
			else
			{
			System.out.println("Sorry but you lost.  Better luck next time!");
			}
		}
	}
	
	
	//This will run the program 
	public void runProgram()
	{
		rollDice();
		calculations();
	}
	
	
	//This will run the program then ask the user if it wants to play the
	//game again, and run it again if yes
	public void runAgain()
	{
		while(again.equalsIgnoreCase("yes"))
		{
			runProgram();
			System.out.println("Do you want to play agin?  Yes or no.");
			again= scan.nextLine();
		}
		System.out.println("Thanks for playing");
	}
	

	
	public static void main(String[] args)
	{
		Dice joe = new Dice();
		joe.runAgain();

	}

}

