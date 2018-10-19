package Intro;
import java.util.Scanner;

//Joseph Basile
//Block H
//Date
//Description:Have some one give me check numbers then find the check digit that when all the numbers 
//are added together it is evenly divided by 7
//

public class CheckDigit2
{
Scanner scan = new Scanner(System.in);
int num1;
int num2;
int num3;
int num4;
int checkNum;
int checkTotal;
int remainder;
int checkDigit;

//This will welcome you to my program and ask for your whoke check number.
public void input()
{
	System.out.println("Welcome to American Express.  I will ask you for your check number and then give you your check digit.");
	System.out.println("What is the number of the check?");
	checkNum = scan.nextInt();
	scan.nextLine();
	
}

//This will separate the 4 digit number, do calculations and give you the check digit
public void output()
{
	//This will separate the number into 4 digits
	num1 = (checkNum/1000);
	num2 = (checkNum/100)%10;
	num3 = (checkNum/10)%10;
	num4 = (checkNum%10);	
	
	//This will use the 4 numbers to find the check digit
	checkTotal = (num1+num2+num3+num4);
	remainder =(checkTotal%7);
	checkDigit = 7-remainder;
	
	System.out.println("Your check digit is "+checkDigit+".  Have a nice day.");
}



	public static void main(String[] args)
	{
		CheckDigit2 joe = new CheckDigit2();
		joe.input();
		joe.output();
		

	}

}

