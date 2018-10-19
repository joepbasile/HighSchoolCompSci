package Intro;

import java.util.Scanner;

//Joseph Basile
//Block H
//Date
//Description:Have the computer divide the identification number by 7 and give you the remainder as the check digit
//

public class CheckDigit
{
	Scanner scan = new Scanner(System.in);
	int check1;
	int checkDigit1;
	
	//This will ask you for the check number and welcome you to my program
	public void input()
	{
		System.out.println("Welcome to American Airlines.  If you give me your identification number " +
				"I will give you your check digit.");
		System.out.println("What is the check number?");
		check1 = scan.nextInt();
	}
	
	//This will divide the check number by 7 and give you the check digit
	public void output()
	{
		checkDigit1 = check1%7;
		System.out.println("The check digit is "+checkDigit1);
	}

	
	public static void main(String[] args)
	{
		CheckDigit joe = new CheckDigit();
		
		joe.input();
		joe.output();
		

	}

}


