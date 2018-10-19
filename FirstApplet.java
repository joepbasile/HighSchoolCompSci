package Intro;

import java.applet.Applet;
import java.awt.*;

//Joseph Basile
//Block H
//Date:5/1/17
//Description:This is my first applet
//

public class FirstApplet extends Applet
{
	Font abc = new Font("", Font.BOLD, 25);
	Color teal = new Color(35, 181,218);
	public void drawSomething(Graphics art)
	{
	
		int[] xValue = {100, 200, 500, 300};
		int[] yValue = {200, 500, 200, 500};
		art.setColor(teal);
		art.fillPolygon(xValue, yValue, 4);
		art.drawLine(100, 100, 400, 200);
	}
	
	
	
	
	//this is where applets starts
	public void paint(Graphics art)
	{
		setSize(600,600);
		art.setColor(Color.red);
		art.drawRect(40, 100, 200, 400);
		art.fillOval(40, 100, 200, 400);
		art.setColor(Color.green);
		art.fillArc(40, 100, 200, 400, 0, 180);
		art.setColor(Color.blue);
		art.setFont(abc);
		art.drawString("Tim is my BFF", 100, 200);
		
		
		drawSomething(art);
	}

}

