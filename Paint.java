package Intro;

import java.util.Scanner;

//Joseph Basile
//Block H
//Date
//Description:Have the computer tell you how many gallons of paint are needed to paint any given room.
//

public class Paint
{
	Scanner scan = new Scanner(System.in);
	
	final int COVERAGE = 350;   //one gallon of paint covers 350sq.ft
	int length;
	int width;
	int height;
	double totalSqFt;
	double paintNeeded;
	
	//this will ask you for the height, width, and length of the room you are trying to paint
	public void input()
	{
		System.out.println("Welcome to my painting company.  If you give me the hieght, length and width of"
		+" the room I can tell you the square footage of the room and how many gallons of paint you would need.");
		
		System.out.println("What is the height of the room?");
		height = scan.nextInt();
		scan.nextLine();
		
		System.out.println("What is the length of the room?");
		length = scan.nextInt();
		scan.nextLine();
		
		System.out.println("What is the width of the room?");
		width = scan.nextInt();
		scan.nextLine();
	}
	
	//This will calculate the total square feet and how many gallons of paint are needed.
	public void calculations()
	{
		totalSqFt = ((length*height)*2)+((width*height)*2);
		paintNeeded = totalSqFt/COVERAGE;
	}
	
	//This will tell you the total square feet and how much paint is needed
	public void output()
	{
		System.out.println("The room is "+totalSqFt+" square feet and will need "+paintNeeded+
				" gallons of paint for the room.");
	}
	public static void main(String[] args)
	{
		Paint joe = new Paint();
		
		joe.input();
		joe.calculations();
		joe.output();
	
	}

}

