package Intro;

import java.util.Random;

//Joseph Basile
//Block H
//Date
//Description:
//

public class RandomStuff
{

	Random gen = new Random(); 
	int num1, num2, num3;
	double num4, num5;
	
	public void doRandom()
	{
		//next int
		num1 = gen.nextInt();
		System.out.println("num1 is " +num1);
		
		//next double
		num4 = gen.nextDouble();
		System.out.println("num4 is "+num4);
		
		//nextInt(100)
		num2 = gen.nextInt(100);
		System.out.println("num2 is "+num2);
	}
	
	public void dice()
	{
		int count = 1;
		while( num3 < 6)
		{
		num3 = gen.nextInt(6) +1;
		System.out.println("rolled a "+num3+ " in "+count);
		count++;
		}
	}
	
	public static void main(String[] args)
	{
		RandomStuff joe = new RandomStuff();
		joe.dice();

		
	}

}

