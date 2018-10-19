package Intro;
import java.applet.Applet;
import java.awt.*;

//Joseph Basile
//Block H
//Date
//Description:Create a business card with a  polygon, square, circle/oval, lines, and a string 
//

public class BuissnessCard extends Applet
{
	Font abc = new Font ("",Font.ITALIC, 25);
	Color joe = new Color(145, 20, 72);
	Color teal = new Color(35, 181,218);
	
	//This will draw the polygon for the card
	public void drawPoly(Graphics art)
	{
		int[] xValue={40, 240, 440, 400 };
		int[] yValue={300, 100, 300, 300};
		art.setColor(Color.MAGENTA);
		art.fillPolygon(xValue, yValue, 4);
	}
	
	//This will draw the business card and all the designs on it 
	public void drawCard(Graphics art)
	{
		art.setColor(joe);
		//this is the background of the card
		art.fillRect(40, 100, 400, 200);
		art.setColor(teal);
		//this is a circle on the card
		art.fillOval(40, 100, 400, 200);
		art.setColor(Color.GREEN);
		art.drawLine(40, 100, 440, 300);
		art.drawLine(40, 300, 440, 100);
		//this is a triangle on the card
		drawPoly(art);
		art.setColor(Color.BLACK);
		art.setFont(abc);
		//this is the name of the Business
		art.drawString("Bob's Bike", 180, 200);
		art.drawString("Emporium", 185, 240);
	}
	
	//This will draw the card
	public void paint(Graphics art)
	{
		setSize(600,600);
		drawCard(art);
		
	}

}

