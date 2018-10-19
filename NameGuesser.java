package Intro;

import java.util.Random;
import java.util.Scanner;

//Joseph Basile
//Block H
//Date 1/30/17
//Description:Have the user guess 3 letters of a name of someone in the room then ask them
//to guess the name.
//

public class NameGuesser
{
	Scanner scan = new Scanner(System.in);
	String name;

	int count;
	String [] list= new String [8];
	Random gen = new Random();
	int num = gen.nextInt(list.length);
	String name2;
	int length;
	char lettOne;
	char lettTwo;
	char lettThree;
	int position1;
	int position2;
	int position3;
	

	//This will create a list of names so the computer can randomly pick one for the game.
	public void initiate()
	{
		list[0] = "DARYL";
		list[1] = "TIM";
		list[2] = "MIKE";
		list[3] = "TOM";
		list[4] = "JOHN";
		list[5] = "CHRIS";
		list[6] = "MIKE";
		list[7] = "RYAN";
	}
	
	//This method will ask the user for 3 letters and return where those letters are in the word or if 
	//they are not in the word.  Then it will ask for the whole name and tell you if you are right or wrong
	public void guessName()
	{
		num = gen.nextInt(list.length);
		name = list[num];
		char [] dashes = new char [name.length()];
		count = 0;
		while(count < name.length())
		{
			dashes[count] = '-';
			count ++;
		}
		System.out.println("Hello welcome to my name guess game.  I have a name and I want you to " +
		"guess it.");
		System.out.println("I will tell you how long the name is, you will guess 3 letters then you " +
				"will guess the name.  Get ready");
		length = name.length();
		System.out.println("The name is "+length+" letters long");
		System.out.println(dashes);
		System.out.println("Please enter a letter.");
		lettOne = scan.nextLine().toUpperCase().charAt(0);
		position1 = name.indexOf(lettOne);
		if (position1 == -1)
		{
			System.out.println("That letter is not in the name. Sorry try again.");
		}
		else
		{
			dashes[position1] = lettOne;
			System.out.println("The letter is in the "+(position1+1)+" position.");
			
		}
		System.out.println(dashes);
		//The computer will now get 2 more letters from the user and tell you if those letters are
		//in the name and what position they are in or if they are not in the name at all.
		System.out.println("Please enter another letter.");
		lettTwo = scan.nextLine().toUpperCase().charAt(0);
		position2 = name.indexOf(lettTwo);
		
		if (position2 == -1)
		{
			System.out.println("That letter is not in the name. Sorry try again.");
		}
		else
		{
			dashes[position2] = lettTwo;
			System.out.println("The letter is in the "+(position2+1)+" position.");
			
		}
		System.out.println(dashes);
		System.out.println("Please enter the final letter.");
		lettThree = scan.nextLine().toUpperCase().charAt(0);
		position3 = name.indexOf(lettThree);
		
		if (position3 == -1)
		{
			System.out.println("That letter is not in the name. Sorry try again.");
		}
		else
		{
			dashes[position3] = lettThree;
			System.out.println("The letter is in the "+(position3+1)+" position.");
			
		}
		System.out.println(dashes);
		//The computer will now ask the user for the name they think it is, then answer if it is right 
		//or wrong.
		System.out.println("Please enter what you think the name is.");
		name2 = scan.nextLine();
		if( name.equalsIgnoreCase(name2))
		{
			System.out.println("Congradulations, you got the name correct!");
		}
		else
		{
			System.out.println("Sorry you did not get it correct.  The name was " +
					name+".  Try again another time.");
		}
	}

	
	public static void main(String[] args)
	{
		NameGuesser joe = new NameGuesser();
		
		joe.initiate();
		joe.guessName();
		

	}

}

