package Intro;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

//Joseph Basile
//Block H
//Date
//Description:This program will ask the user what they would like to buy and how much
//the item is.  It will then give it a percent off than solve for the final amount.
//Then it will ask the user how much they want to pay with and calculate how much
//money should be given back.    
//

public class CashRegister
{
	Random gen = new Random();
	DecimalFormat money = new DecimalFormat("$0.00");
	DecimalFormat per = new DecimalFormat("0.0%");
	Scanner scan = new Scanner(System.in);
	String item;
	double originalCost;
	double percentOff;
	double percentDec;
	double amountOff;
	double salesPrice;
	double tax;
	double finalPrice;
	double pay;
	int dollars;
	int quarters;
	int dimes;
	int nickels;
	int pennies;
	double change;
	int change2;
	String again = "Yes";
	
	//This will ask the user what the would like to buy and how much it is
	//and calculate what percent off the costumer will receive.
	public void input()
	{
		System.out.println("Hello costumer.  Welcome to my cash register " +
				"program.  What would you like to buy today? ");
		item = scan.nextLine();
		System.out.println("How much does the "+item+" cost?");
		originalCost = scan.nextInt();
		scan.nextLine();
	}
	
	//This will perform the calculations to find out the discounted percent,
	//discounted amount, sales price, tax, and how much the total price is with tax
	public void calculations()
	{
		percentOff = 5*gen.nextInt(15)+5;
		percentDec = percentOff/100.0;
		amountOff = originalCost*percentDec;
		salesPrice= originalCost-amountOff;
		tax = salesPrice*.07;
		finalPrice = salesPrice+tax;
		//the computer will now tell the user everything it just calculated
		System.out.println("You just bought a "+item);
		System.out.println("The original price was "+money.format(originalCost));
		System.out.println("You recieved "+per.format(percentDec)+" off");
		System.out.println("The amount discounted is "+money.format(amountOff));
		System.out.println("The sales price is "+money.format(salesPrice));
		System.out.println("The tax on the "+item+" is "+money.format(tax));
		System.out.println("The final price on the "+item+" is "+money.format(finalPrice));
	}
	
	//This will tell the user their total and ask how much they want to pay with then
	//calculate the change.
	public void payment()
	{
		System.out.println("Your total is "+money.format(finalPrice)+" how much" +
				" would you like to pay with?");
		pay = scan.nextDouble();
		change = pay-finalPrice;
		scan.nextLine();
	}
	
		//This will figure out how much change should be given back to the customer
		//in dollars, quarters, dimes, nickels, and pennies then tell them.
		public void changeGiven()
	{
		change2 = (int)(change*100);
		dollars = change2/100;
		quarters = change2%100/25;
		dimes = change2%100%25/10;
		nickels = change2%100%25%10/5;
		pennies = change2%100%25%10%5/1;
		System.out.println("You gave me "+money.format(pay)+" and you will recieve " +
				dollars+" dollars, "+(quarters)+" quarters, "+dimes+" dimes, "+
				nickels+" nickes, and "+pennies+" pennies.");
	}
	
	//this will run the whole program
	public void runProgram()
	{
		input();
		calculations();
		payment();
		changeGiven();
	}
	
	
	//This will run the program then ask the user if it wants to start the program
	//over and run it again if yes
		public void runAgain()
		{
			while(again.equalsIgnoreCase("yes"))
			{
				runProgram();
				System.out.println("Do you want to purchase another item?  Yes or no.");
				again= scan.nextLine();
			}
			System.out.println("Thank you for your purchase. Have a nice day!");
		}
		
	public static void main(String[] args)
	{
		CashRegister joe = new CashRegister();
		
		joe.runAgain();

	}

}

