package Intro;
import java.util.Scanner;

//Joseph Basile
//Block
//Date
//Description:Have some one enter their 16 digit credit card number then tell if it is valid or not.
//

public class CreditCard
{
	Scanner scan = new Scanner(System.in);
	String creditCardNum;
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int num6;
	int num7;
	int num8;
	int num9;
	int num10;
	int num11;
	int num12;
	int num13;
	int num14;
	int num15;
	int num16;
	int totalEven;
	int num1A;
	int num1B;
	int num3A;
	int num3B;
	int num5A;
	int num5B;
	int num7A;
	int num7B;
	int num9A;
	int num9B;
	int num11A;
	int num11B;
	int num13A;
	int num13B;
	int num15A;
	int num15B;
	int totalOdd;
	int totalTotal;
	int checker;
	
	public void input()
	{
		System.out.println("Welcome to my credit card checker. I will look at your credit card numbers" +
				"and tell you if the card is valid or not.");
		System.out.println("Please enter your 16 digit credit card.");
		creditCardNum = scan.nextLine();
	}
	
	public void calculations()
	{
		char pos1 = creditCardNum.charAt(0);
		num1 = pos1-48;
		
		char pos2 = creditCardNum.charAt(0);
		num2 = pos2-48;
		
		char pos3 = creditCardNum.charAt(0);
		num3 = pos3-48;
		
		char pos4 = creditCardNum.charAt(0);
		num4 = pos4-48;
		
		char pos5 = creditCardNum.charAt(0);
		num5 = pos5-48;
		
		char pos6 = creditCardNum.charAt(0);
		num6 = pos6-48;
		
		
		char pos7 = creditCardNum.charAt(0);
		num7 = pos7-48;
		
		
		char pos8 = creditCardNum.charAt(0);
		num8 = pos8-48;
		
		char pos9 = creditCardNum.charAt(0);
		num9 = pos9-48;
		
		char pos10 = creditCardNum.charAt(0);
		num10 = pos10-48;
		
		char pos11 = creditCardNum.charAt(0);
		num11 = pos11-48;
		
		char pos12 = creditCardNum.charAt(0);
		num12 = pos12-48;
		
		char pos13 = creditCardNum.charAt(0);
		num13 = pos13-48;
		
		char pos14 = creditCardNum.charAt(0);
		num14 = pos14-48;
		
		char pos15 = creditCardNum.charAt(0);
		num15 = pos15-48;
		
		char pos16 = creditCardNum.charAt(0);
		num16 = pos16-48;
		
		totalEven = num2+num4+num6+num8+num10+num12+num14+num16;
		
		num1A=(num1*2)/10;
		num1B=(num1*2)%10;
		num3A=(num3*2)/10;
		num3B=(num3*2)%10;
		num5A=(num5*2)/10;
		num5B=(num5*2)%10;
		num7A=(num7*2)/10;
		num7A=(num7*2)%10;
		num9A=(num9*2)/10;
		num9B=(num9*2)%10;
		num11A=(num11*2)/10;
		num11B=(num11*2)%10;
		num13A=(num13*2)/10;
		num13B=(num13*2)%10;
		num15A=(num15*2)/10;
		num15B=(num1*2)%10;
	
		totalOdd = num1A+num1B+num3A+num3B+num5A+num5B+num7A+num7B+num9A+num9B+num11A+num11B+num13A+num13B+num15A+num15B;
		totalTotal= totalOdd + totalEven;
		checker = totalTotal%10;
	}
	
	public void output()
	{
		if(checker == 0)
		{
			System.out.println("Congradulations, your credit card is valid");
		}
		else
		{
			System.out.println("Sorry, the credit card is not valid.");

		}
	}
	
	
	public static void main(String[] args)
	{
		CreditCard joe = new CreditCard();
		
		
		joe.input();
		joe.calculations();
		joe.output();

	}

}

