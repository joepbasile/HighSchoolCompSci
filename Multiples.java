package Intro;
import java.util.Scanner;

//Joseph Basile
//Block H
//Date
//Description:
//

public class Multiples
{
	Scanner scan = new Scanner(System.in);
	
	int number;
	int multiple;
	int increaseValue;
	
	public void input()
	{
		System.out.println("Hello welcome to my multiples program.");
		System.out.println("I will ask you to input a number and how many" +
				"multiples of that number you want.  Then I will print out the multiples");
		System.out.println("Please enter a number.");
		number = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter how many multiples you want.");
		multiple = scan.nextInt();
		scan.nextLine();
	}
	
	public void output()
	{
		for(increaseValue = 1; increaseValue < multiple+1; increaseValue++ )
		{
			
		}
	}

	public static void main(String[] args)
	{
		Multiples joe = new Multiples();

	}

}

