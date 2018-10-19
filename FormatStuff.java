package Intro;

import java.text.DecimalFormat;
import java.util.Scanner;

//Joseph Basile
//Block H
//Date
//Description:Work with the math and DecimalFormat classes
//

public class FormatStuff
{
	Scanner scan = new Scanner(System.in);
	int num1, num2, num3, num9, num10;
	double num4, num5, num6, num7, num8;
	
	DecimalFormat dec3 = new DecimalFormat("0.000");
	DecimalFormat money = new DecimalFormat("$0.00");
	DecimalFormat percent = new DecimalFormat("0.0%");
	DecimalFormat feet = new DecimalFormat("0 feet");
	
	
	public void doSomething()
	{
		System.out.println("Please enter a number.");
		num1 = scan.nextInt();
		scan.nextLine();  //clear input stream
		System.out.println("Please enter a second number.");
		num2 = scan.nextInt();
		scan.nextLine();  //clear input stream
		num4 = Math.pow(num1, num2);
		System.out.println(num1 + " raised to "+num2+" is "+num4);
		num5 = Math.sqrt(num1);
		System.out.println("The square root of "+num1+" is "+num5);
		num6= Math.random()*100;
		System.out.println("The Random Number is " +num6);
		num7 = Math.ceil(num6);
		num8 = Math.floor(num6);
		System.out.println("Floor is "+num8+" and ceil is "+num7);
		num3 = Math.decrementExact(num1);
		System.out.println(num3);
		num9 = Math.floorMod(num1, num2);
		System.out.println(num9);
		num10 = Math.negateExact(num1);
	}

	
	
	public void doSomethingMore()
	{
		num4 = Math.random() * 100;
		System.out.println("The random number is "+num4);
		System.out.println("To three decimals is "+dec3.format(num4));
		System.out.println("The money form is "+money.format(num4));
		System.out.println("The percent form is "+percent.format(num4));
		System.out.println("The feet form is "+feet.format(num4));
	}

	
	public void runAgain()
	{
		String again = "yes";
		while(again.equalsIgnoreCase("yes"))
		{
			doSomething();
			System.out.println("Do you want to play agin?");
			again= scan.nextLine();
		}
		System.out.println("Thanks for playing");
	}
	
	
	
	
	public static void main(String[] args)
	{
		FormatStuff bob = new FormatStuff();
		
		bob.runAgain();
		

	}

}

