package Intro;
import java.util.Scanner;
//Joseph Basile
//Block H
//Date
//Description:This will ask the user to input a word then the computer will keep 
//printing it out with one less letter each time
//

public class Word
{
	Scanner scan = new Scanner(System.in);
	String word;
	int wordLength;
  static String sport = "ball";
	public void input()
		{
			System.out.println("Hello welcome to my word program.  I will ask" +
					"you to input a word and i will keep on writing it out until only one letter remains.");
			System.out.println("Please enter a word.");
			word = scan.nextLine();
			
		}
	
	public void printWord()
	{
		for(wordLength = word.length()-1; wordLength>-1; wordLength=wordLength-1)
		{
			System.out.println(word);
			word=word.substring(0, wordLength);
		}
	}
	// Return the count of the number of times c is found in phrase
	public static void main(String[] args)
	{
		Word joe = new Word();
	
		System.out.println(1234%10 + (1234 + "").length()+ "goofy".length()+"");
		
		

	}

}

