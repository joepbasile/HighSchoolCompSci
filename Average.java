package Intro;
import java.util.Scanner;

//Joseph Basile
//Block H
//Date
//Description:
//

public class Average
{
	Scanner scan = new Scanner(System.in);  //allows input from the keyboard
	String name;
	String className;
	int grade1, grade2, grade3; 
	double average;
	int age;
	int retirement;
	double gpa;
	
	//this will input my info about my class
	public void input()
	{
		System.out.println("Welcome to my grades program.  What is yout name?");
		name = scan.nextLine();
		System.out.println("Hello " +name+".");
		
		System.out.println("What class do you want the average for?");
		className = scan.nextLine();
		
		System.out.println("What is your first grade in "+className+"?");
		grade1 = scan.nextInt();
		scan.nextLine(); //clears imput stream after nextInt or nextDouble
		
		System.out.println("What is your second grade in " +className+"?");
		grade2 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("What is you third grade in "+className+"?");
		grade3 = scan.nextInt();
		scan.nextLine();
	}
		
		//This will calculate the average of 3 grades
		public void calculations()
		{
			average = (grade1 + grade2 + grade3) / 3.0;
		}
		
		//This will tell me the average for a class
		public void output()
		{
			System.out.println("Hey"+name+", your average in "+className+" is "+average);
		}
		
		
		//This will ask me my age
		public void inputAge()
		{
			System.out.println("What is your age "+name+"?");
			age = scan.nextInt();
			scan.nextLine();
			System.out.println("When do you want to retire?");
			retirement = scan.nextInt();
			scan.nextLine();
			System.out.println("It will take you "+(retirement-age)+" years until your retierment.");
			age = scan.nextInt();
			scan.nextLine();
		}
		
	
	
	
		//This will take your gpa and say if you are on deans list
		public void gpa()
		{
			System.out.println("What is your name?");
			name = scan.nextLine();
			System.out.println("What is your gpa?");
			gpa = scan.nextDouble();
			if(gpa>3.5)
			{
				System.out.println("Good Job "+name+", you made the Dean's list.");
			}
			else
			{
				System.out.println("Too bad maybe next time loser.");
			}
			
			
		}
		
		
		

	public static void main(String[] args)
	{
		Average joe = new Average();
		
		
		joe.gpa();
	
				
	}
}

