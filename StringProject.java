package Intro;

import java.util.Scanner;

//Joseph Basile
//Block H
//Date 1/30/17
//Description:This is a mix of programs to complete the String class project.  It consists of 
// the methods leet, name, sentence, and pigLatin.
//

public class StringProject
{
	Scanner scan = new Scanner(System.in);
	
	
	//This method will take a sentence make it all upper case and replace some letters with numbers to
	//convert the language into leet.
	
	String sentence;
	String sentence2;
	
	public void leet()
	{
		System.out.println("Hello.  Welcome to my leet translator.  I will take your sentence " +
				"and convert it into the leet language.  Please input a sentence.");
		sentence=scan.nextLine();
		sentence2 = sentence.toUpperCase();
		sentence2 = sentence2.replace('A', '4');
		sentence2 = sentence2.replace('E', '3');
		sentence2 = sentence2.replace('B', '8');
		System.out.println("I have changed your sentence into leet, here it is '"+sentence2+"'.");
	}
	
	//This method will take the first 3 letters of a person's first name and the last 3 letters of 
	//their last name and make it into a password.
	
	String firstName;
	String lastName;
	String firstName2;
	String lastName2;
	int lengthLast;
	String first3Lett;
	String last3Lett;
	String password;
	
	public void name()
	{
		System.out.println("Hello, welcome to my name program.  I will ask you to input your fist name " +
				"then your last name and make a new password using the first three letters of your first" +
				" name and the last three letters of your last name.");
		System.out.println("Please enter your first name.");
		firstName = scan.nextLine();
		System.out.println("Please enter your last name.");
		lastName = scan.nextLine();
		
		//Now that the program has the info it needs, it will make a new password and put it 
		//in all capital letters.
		firstName2 = firstName.toUpperCase();
		lastName2 = lastName.toUpperCase();
		first3Lett = firstName2.substring(0,3);
		lengthLast = lastName2.length();
		last3Lett = lastName2.substring(lengthLast-3,lengthLast);
		password = first3Lett + last3Lett;
		
		//It has created a new password and will tell you what it is.
		System.out.println("Congradulations, your new password is "+password+".");
	}
	
	
		//This program will have the user type a sentence then the computer will tell them how long
		//the sentence is, return a character at any position less than the length, and give them the
		//first position of where any given character is.
		
		String sentence3;
		int sentenceLength;
		int position;
		char character;
		char character2;
		int position2;
		
		public void sentence()
		{
			System.out.println("Hello welcome to my sentence program.  I will ask you to input a " +
					"sentence then it will tell you the length of the sentence, give you a charecter at any " +
					"position, and ask for a letter then tell you the first possitio it appears at.");
			System.out.println("Please enter a sentence.");
			sentence3 = scan.nextLine();
			sentenceLength = sentence3.length();
			System.out.println("The length of you sentence is "+sentenceLength+" spots long.");
			
			//Now the computer will give you the char at any position less than the length
			
			System.out.println("Please enter a number that is less than "+sentenceLength);
			position = scan.nextInt();
			scan.nextLine();
			character = sentence3.charAt(position);
			System.out.println("The charecter at position "+position+" is a/an "+character+".");
			
			//The computer will now ask for a number then tell you what character is at that position
			
			System.out.println("Please enter a character that is in the sentence");
			character2 = scan.nextLine().charAt(0);
			position2 = sentence3.indexOf(character2);
			System.out.println("The first position of the charecter "+character2+" is at position " +
					""+position2+".");
			System.out.println("Thank you for completing my program, have a nice day.");
		}
		
		
		//This program will have the user put in a word then turn that word into the pig Latin version
		
		String word;
		String firstLett;
		String word2;
		int length;
		String pigWord;
		
		public void pigLatin()
		{
			System.out.println("Welcome to my pig Latin translater.  If you enter a word beginning" +
					" with a consonant I will turn it into pig Latin");
			System.out.println("Please enter a word beginning with a consonant.");
			word = scan.nextLine();
			word = word.toLowerCase();
			
			//The computer has the word and will now make it into pig Latin
			
			firstLett = word.substring(0, 1);
			length = word.length();
			word2 = word.substring(1,length);
			pigWord = word2 + firstLett + "ay";
			System.out.println("Your pig Latin word is "+pigWord+".");
		}
		
		
	public static void main(String[] args)
	{
		StringProject joe = new StringProject();
		joe.leet();
		joe.name();
		joe.sentence();
		joe.pigLatin();

	}

}

