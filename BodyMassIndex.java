package Intro;

import java.text.DecimalFormat; 
import java.util.Scanner;

//Joseph Basile
//Block H
//Date
//Description:This will have the user input the height in inches and weight in 
//pounds then calculate the BMI of the person and tell them what their BMI is.
//


public class BodyMassIndex
{
	double weight;
	double height;
	double heightSqr;
	double BMI;
	String again = "Yes";
	DecimalFormat dec1 = new DecimalFormat("0.0");
	Scanner scan = new Scanner(System.in); 
	
	
	//This will have the user input the weight and height for the program to
	//calculate the BMI of a person
	public void input()
	{
		System.out.println("Hello, welcome to my Body Mass Index calculator." +
				"I will as for you to input your weight in pounds and height in inches.");
		System.out.println("Please enter your height in inches.");
		height = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter your weight in pounds.");
		weight = scan.nextInt();
		scan.nextLine();
	}
	
	//This will calculate the persons BMI then tell them what it is and if they 
	//are under weight, normal, over weight, or obese.
	public void calculations()
	{
		heightSqr = Math.pow(height, 2);
		BMI = (weight*703)/heightSqr;
		
		//This part will go through all the body mass index possibilities and
		//determine what they are
		if (BMI<18.5)
		{
			System.out.println("Your BMI is "+dec1.format(BMI) + " and you are under weight.");
		}
		else
		{
			if (BMI<=24.9)
			{
				System.out.println("Your BMI is "+dec1.format(BMI)+" and you are normal.");
			}
			else
			{
				if(BMI<=29.9)
				{
					System.out.println("Your BMI is "+dec1.format(BMI)+" and you are over weight.");
				}
				else
				{
					System.out.println("Your BMI is "+dec1.format(BMI)+" and you are obese.");
				}
			}
		}
	}

	//This will run the program
	public void runProgram()
	{
		input();
		calculations();
	}
	
	//This will run the program then ask the user if it wants to start the program
	//over and run it again if yes
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
		BodyMassIndex joe = new BodyMassIndex();
		
		joe.runAgain();

	}

}


