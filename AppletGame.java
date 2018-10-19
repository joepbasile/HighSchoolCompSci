package Intro;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
 
//Joseph Basile
//Block H
//Date
//Description:This will create a computer game where the player controls a ship and tries to shoot as many ships as possible and while 
//trying not to crash into any of them
//
 
public class AppletGame extends JoeApplet implements KeyListener, MouseMotionListener, MouseListener
{
	Font abcBold = new Font("", Font.ROMAN_BASELINE, 50);
	Font abc = new Font("", Font.ROMAN_BASELINE, 20);
	Color brown = new Color(205, 103, 22);
	Random gen = new Random();
	//variables for player controlled ship
	int shipX=400;
	int shipY=350;
	int shipSpeedX=5;
	int shipSpeedY=5;
	
	//variables for enemy ships
	int enemyShipX=600;
	int enemyShipY=600;
	int enemyShipSpeedX=5;
	int enemyShipSpeedY=5;
	
	int enemyShip2SpeedX=5;
	int enemyShip2SpeedY=5;
	int enemyShip2X;
	int enemyShip2Y;
	
	int enemyShip3SpeedX=5;
	int enemyShip3SpeedY=5;
	int enemyShip3X;
	int enemyShip3Y;
 
	int enemyShip4SpeedX=5;
	int enemyShip4SpeedY=5;
	int enemyShip4X;
	int enemyShip4Y;
	
	int enemyShip5SpeedX=5;
	int enemyShip5SpeedY=5;
	int enemyShip5X;
	int enemyShip5Y;
	
	boolean showEnemyShip = true;
	boolean showEnemyShip2 = false;
	boolean showEnemyShip3 = false;
	boolean showEnemyShip4 = false;
	boolean showEnemyShip5 = false;
	
	//variables for ball
	int ballSpeed = 15;
	int ballXUp= shipX+20;
	int ballYUp = shipY+20;
	int ballXRight= shipX+20;
	int ballYRight = shipY+20;
	int ballXDown= shipX+20;
	int ballYDown= shipY+20;
	int ballXLeft= shipX+20;
	int ballYLeft = shipY+20;
	boolean showBallUp = false;
	boolean showBallRight = false;
	boolean showBallDown = false;
	boolean showBallLeft = false;
	
	//variables for time,timer, and and
	int time = 0;
	int timer;
	int score = 0;
	
	//variables for start and end screen
	boolean showStartScreen = true;
	boolean showEndScreen = false;
	
	//variables for the walls to create clean collision and bouncing of enemy ships
	boolean firstHitWall1 = true;
	boolean firstHitWall2 = true;
	boolean firstHitWall3 = true;
	boolean firstHitWall4 = true;
	
	//variables for ship2 bouncing off the walls
	boolean firstHitWall1Ship2 = true;
	boolean firstHitWall2Ship2 = true;
	boolean firstHitWall3Ship2 = true;
	boolean firstHitWall4Ship2 = true;
	
	//variables for ship3 bouncing off the walls
	boolean firstHitWall1Ship3 = true;
	boolean firstHitWall2Ship3 = true;
	boolean firstHitWall3Ship3 = true;
	boolean firstHitWall4Ship3 = true;
	
	//variables for ship4 bouncing off the walls
	boolean firstHitWall1Ship4 = true;
	boolean firstHitWall2Ship4 = true;
	boolean firstHitWall3Ship4 = true;
	boolean firstHitWall4Ship4 = true;
	
	//variables for ship5 bouncing off the walls
	boolean firstHitWall1Ship5 = true;
	boolean firstHitWall2Ship5 = true;
	boolean firstHitWall3Ship5 = true;
	boolean firstHitWall4Ship5 = true;
	
	//variables to stop player from leaving the screen
	boolean firstHitPlayerWall1 = true;
	boolean firstHitPlayerWall2 = true;
	boolean firstHitPlayerWall3 = true;
	boolean firstHitPlayerWall4 = true;
 
	//variables for all the solid objects needed in game
	SolidObject mouseSO = new SolidObject();
	SolidObject wall1SO = new SolidObject();
	SolidObject wall2SO = new SolidObject();
	SolidObject wall3SO = new SolidObject();
	SolidObject wall4SO = new SolidObject();
	SolidObject startButtonSO = new SolidObject();
	SolidObject restartButtonSO = new SolidObject();
	SolidObject playerShipSO = new SolidObject();
	SolidObject enemyShipSO = new SolidObject();
	SolidObject enemyShip2SO = new SolidObject();
	SolidObject enemyShip3SO = new SolidObject();
	SolidObject enemyShip4SO = new SolidObject();
	SolidObject enemyShip5SO = new SolidObject();
	SolidObject cannonBallSO = new SolidObject();
 
//Initialize the listeners (please make this the first method)
	public void init()
	{
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
//draws start screen and explains what the game is, controls, and goal of the game
	public void drawStartScreen(Graphics art)
	{
		showEndScreen=false;
		setBackground(Color.cyan);
		art.setColor(Color.red);
		art.setFont(abcBold);
		art.drawString("Pirate's Life", 250, 100);
		art.setFont(abc);
		art.drawString("Welcome to Pirate's Life. ", 250, 150);
		art.drawString("You are a pirate ship trying to avoid the British Navy.", 250, 175);
		art.drawString("You can move left, right, up, and down with the arrow keys.", 250,200);
		art.drawString("You can shoot cannon balls with the AWSD keys", 250, 225);
		art.drawString("You can only shoot left, right, up, and down", 250, 250);
		art.drawString("Only one cannon ball can be shot at a time in any direction.", 250, 275);
		art.drawString("Your goal is to sink as many ships as possible.", 250, 300);
		art.drawString("Click here to start", 300, 400);
		art.setColor(Color.black);
		art.fillRect(300, 400, 200, 50);
		startButtonSO.makeSolidObject(300, 400, 200, 50);
	}
	
	//this will reset the variable once the player has lost
	public void restart(Graphics art)
	{
		score = 0;
		time = 0;
		timer = 0;
		shipX = 400;
		shipY = 350;
		enemyShipX = 600;
		enemyShipY = 600;
		showEnemyShip = false;
		showEnemyShip2 = false;
		showEnemyShip3 = false;
	}
	//this will make an end screen and ask the player if they want to play again and go back to home screen
	public void drawEndScreen(Graphics art)
	{
		if (showEndScreen)
		{
			showEnemyShip = true;
			showEnemyShip2 = true;
			showEnemyShip3 = true;
			setBackground(Color.black);
			art.setColor(Color.RED);
			art.setFont(abc);
			art.drawString("You Lost. Your score was "+score+" and your time was "+timer+" seconds.", 100, 200);
			art.drawString("Click here to go to the main menue.", 200, 300);
			art.setColor(Color.red);
			art.fillRect(250,300,200,50);
			restartButtonSO.makeSolidObject(200, 300, 200, 50);
		}
	}
	
	//this will create the condition for the game to be over to show the end screen
	public void gameOver(Graphics art)
	{
		if (playerShipSO.isCollidingWith(enemyShipSO)||playerShipSO.isCollidingWith(enemyShip2SO)||playerShipSO.isCollidingWith(enemyShip3SO)||playerShipSO.isCollidingWith(enemyShip4SO)||playerShipSO.isCollidingWith(enemyShip5SO))
		{
			
			showEndScreen = true;
		}
 
	}
	
	//this will create a timer
	public void drawTimer(Graphics art)
	{
		if(showEndScreen == false)
		{
			time++;
			timer = time/60;
			score = score;
			art.setColor(Color.red);
			art.drawString("Time = "+timer, 10, 20);
		}
		else
		{
			time = time;
		}
	}
	
	//draws score for the game
	public void drawScore(Graphics Art)
	{
		Art.setColor(Color.black);
		Art.drawString("Score = "+score, 10, 40);
	}
	
	//this will create 4 walls around the screen
	public void drawWalls(Graphics art)
	{
		art.setColor(Color.cyan);
		art.fillRect(0, 0, 800, 5);
		wall1SO.makeSolidObject(0, 0, 800, 5);
		art.fillRect(0, 0, 5, 650);
		wall2SO.makeSolidObject(0, 0, 5, 650);
		art.fillRect(0, 650, 800, 5);
		wall3SO.makeSolidObject(0, 650, 800, 5);
		art.fillRect(800, 0, 5, 650);
		wall4SO.makeSolidObject(800, 0, 5, 650);
	}
	
	//this will make the ship the player controls 
	public void drawPlayerShip(Graphics art)
	{
		art.setColor(brown);
		art.fillArc(shipX, shipY, 40, 40, 180, 180);
		art.fillRect(shipX+15, shipY+10, 10, 15);
		art.setColor(Color.red);
		art.fillRect(shipX+10, shipY-5, 15, 15);
		playerShipSO.makeSolidObject(shipX, shipY, 40, 40);
	}
	
	//This will make an enemy ship 
	public void drawEnemyShip(Graphics art)
	{
		if (showEnemyShip)
		{
			art.setColor(Color.black);
			art.fillArc(enemyShipX, enemyShipY, 40, 40, 180, 180);
			art.fillRect(enemyShipX+15, enemyShipY+10, 10, 15);
			art.fillRect(enemyShipX+10, enemyShipY-5, 15, 15);
			enemyShipSO.makeSolidObject(enemyShipX, enemyShipY, 40, 40);
		}
	}
	
	//this will draw a second ship 
	 public void drawEnemyShip2(Graphics art)
	 {
		 if(showEnemyShip2)
		 {
			 art.setColor(Color.black);
			 art.fillArc(enemyShip2X, enemyShip2Y, 40, 40, 180, 180);
			 art.fillRect(enemyShip2X+15, enemyShip2Y+10, 10, 15);
			 art.fillRect(enemyShip2X+10, enemyShip2Y-5, 15, 15);
			 enemyShip2SO.makeSolidObject(enemyShip2X, enemyShip2Y, 40, 40);
			
		 }
		 else
		 {
			 //sets it spawn point on screen
			 enemyShip2X = 50;
			 enemyShip2Y = 600;
		 }
	 }
	 
	//this will draw a third ship 
	 public void drawEnemyShip3(Graphics art)
	 {
		 if(showEnemyShip3)
		 {
			 art.setColor(Color.black);
			 art.fillArc(enemyShip3X, enemyShip3Y, 40, 40, 180, 180);
			 art.fillRect(enemyShip3X+15, enemyShip3Y+10, 10, 15);
			 art.fillRect(enemyShip3X+10, enemyShip3Y-5, 15, 15);
			 enemyShip3SO.makeSolidObject(enemyShip3X, enemyShip3Y, 40, 40);
			
		 }
		 else
		 {
			 //sets ship3's spawn point
			 enemyShip3X = 40;
			 enemyShip3Y = 40;
		 }
	 }
	 
		//this will draw a fourth ship 
	 public void drawEnemyShip4(Graphics art)
	 {
		 if(showEnemyShip4)
		 {
			 art.setColor(Color.black);
			 art.fillArc(enemyShip4X, enemyShip4Y, 40, 40, 180, 180);
			 art.fillRect(enemyShip4X+15, enemyShip4Y+10, 10, 15);
			 art.fillRect(enemyShip4X+10, enemyShip4Y-5, 15, 15);
			 enemyShip4SO.makeSolidObject(enemyShip4X, enemyShip4Y, 40, 40);
			
		 }
		 else
		 {
			 //sets ship4's spawn point
			 enemyShip4X = 760;
			 enemyShip4Y = 40;
		 }
	 }
	 
		//this will draw the fifth ship 
	 public void drawEnemyShip5(Graphics art)
	 {
		 if(showEnemyShip5)
		 {
			 art.setColor(Color.black);
			 art.fillArc(enemyShip5X, enemyShip5Y, 40, 40, 180, 180);
			 art.fillRect(enemyShip5X+15, enemyShip5Y+10, 10, 15);
			 art.fillRect(enemyShip5X+10, enemyShip5Y-5, 15, 15);
			 enemyShip5SO.makeSolidObject(enemyShip5X, enemyShip5Y, 40, 40);
			
		 }
		 else
		 {
			 //sets ship5's spawn point
			 enemyShip5X = 760;
			 enemyShip5Y = 600;
		 }
	 }
	 //this will cause the second ship to spawn once timer is above 5
	 public void spawnShip2(Graphics art)
	 {
		 if(timer>5)
		 {
			 showEnemyShip2 = true;
		 }
		 else
		 {
			 showEnemyShip2 = false;
		 }
	 }
	
	 
	 //this will cause the third ship to spawn once timer is above 10
	 public void spawnShip3(Graphics art)
	 {
		 if(timer>10)
		 {
			 showEnemyShip3 = true;
		 }
		 else
		 {
			 showEnemyShip3 = false;
		 }
	 }
	 
	 //this will cause the fourth ship to spawn once timer is above 15
	 public void spawnShip4(Graphics art)
	 {
		 if(timer>15)
		 {
			 showEnemyShip4 = true;
		 }
		 else
		 {
			 showEnemyShip4 = false;
		 }
	 }
	 
 
	 //this will cause the third ship to spawn once timer is above 20
	 public void spawnShip5(Graphics art)
	 {
		 if(timer>20)
		 {
			 showEnemyShip5 = true;
		 }
		 else
		 {
			 showEnemyShip5 = false;
		 }
	 }
	 
	 //This will have the ship move randomly about the screen
	public void moveEnemyShip(Graphics art)
	{
		enemyShipX = enemyShipX + enemyShipSpeedX;   //movement left and right
		enemyShipY = enemyShipY + enemyShipSpeedY;  //movement up and down
		
		if (enemyShipSO.isCollidingWith(wall1SO)) //this will change the Y value for ship1
		{
			if(firstHitWall1)  
			{
				enemyShipSpeedY = -enemyShipSpeedY;
				firstHitWall1 = false;
			}
		}
		else
		{
			firstHitWall1= true;
		}
		
		if(enemyShipSO.isCollidingWith(wall2SO)) //this will change the X value for ship1
		{
			if(firstHitWall2)
			{
				enemyShipSpeedX = -enemyShipSpeedX;
				firstHitWall2 = false;
			}
		}
		else
		{
			firstHitWall2= true;
		}
		
		if(enemyShipSO.isCollidingWith(wall3SO)) //this will change the Y value for ship1
		{
			if(firstHitWall3)
			{
				enemyShipSpeedY = -enemyShipSpeedY;
				firstHitWall3 = false;
			}
		}
		else
		{
			firstHitWall3= true;
		}
		
		if(enemyShipSO.isCollidingWith(wall4SO)) //this will change the X value for ship1
		{
			if(firstHitWall4)
			{
				enemyShipSpeedX= -enemyShipSpeedX;
				firstHitWall4 = false;	
			}
		}
		else
		{
			firstHitWall4= true;
		}
	}	
		
	//this will have the second enemy ship move randomly about the screen
	public void moveEnemyShip2(Graphics art)
	{
		enemyShip2X = enemyShip2X + enemyShip2SpeedX;   //movement left and right
		enemyShip2Y = enemyShip2Y + enemyShip2SpeedY;  //movement up and down	
		
		if (enemyShip2SO.isCollidingWith(wall1SO)) //this will change the Y value of ship2
		{
			if(firstHitWall1Ship2)
			{
				enemyShip2SpeedY = -enemyShip2SpeedY;
				firstHitWall1Ship2 = false;
			}
		}
		else
		{
			firstHitWall1Ship2= true;
		}
			
		if(enemyShip2SO.isCollidingWith(wall2SO)) //this will change the X value of ship2
		{
			if(firstHitWall2Ship2)
			{
				enemyShip2SpeedX = -enemyShip2SpeedX;
				firstHitWall2Ship2 = false;
			}
		}
		else
		{
			firstHitWall2Ship2= true;
		}
		
		if(enemyShip2SO.isCollidingWith(wall3SO)) //this will change the Y value of ship2
		{
			if(firstHitWall3Ship2)
			{
				enemyShip2SpeedY = -enemyShip2SpeedY;
				firstHitWall3Ship2 = false;
			}
		}
		else
		{
			firstHitWall3Ship2= true;
		}
				
		if(enemyShip2SO.isCollidingWith(wall4SO)) //this will change the x value of ship2
		{
			if(firstHitWall4Ship2)
			{
				enemyShip2SpeedX= -enemyShip2SpeedX;
				firstHitWall4Ship2 = false;	
			}
		}
		else
		{
			firstHitWall4Ship2= true;
		}
	}	
	
	//this will have the third enemy ship move randomly about the screen
	public void moveEnemyShip3(Graphics art)
	{
		enemyShip3X = enemyShip3X + enemyShip3SpeedX;   //movement left and right
		enemyShip3Y = enemyShip3Y + enemyShip3SpeedY;  //movement up and down
		
		if (enemyShip3SO.isCollidingWith(wall1SO))
		{
			if(firstHitWall1Ship3)
			{
				enemyShip3SpeedY = -enemyShip3SpeedY; //change the Y value for ship3
				firstHitWall1Ship3 = false;
			}
		}
		else
		{
			firstHitWall1Ship3= true;
		}
		
		if(enemyShip3SO.isCollidingWith(wall2SO))
		{
			if(firstHitWall2Ship3)
			{
				enemyShip3SpeedX = -enemyShip3SpeedX; //change the x value for ship 3
				firstHitWall2Ship3 = false;
			}
		}
		else
		{
			firstHitWall2Ship3= true;
		}
		
		if(enemyShip3SO.isCollidingWith(wall3SO))
		{
			if(firstHitWall3Ship3)
			{
				enemyShip3SpeedY = -enemyShip3SpeedY; //change the Y value for ship3
				firstHitWall3Ship3 = false;
			}
		}
		else
		{
			firstHitWall3Ship3= true;
		}
		
		if(enemyShip3SO.isCollidingWith(wall4SO))
		{
			if(firstHitWall4Ship3)
			{
				enemyShip3SpeedX= -enemyShip3SpeedX; //change the X value for ship3
				firstHitWall4Ship3 = false;	
			}
		}
		else
		{
			firstHitWall4Ship3= true;
		}
	}	
 
	//this will have the fourth enemy ship move randomly about the screen
	public void moveEnemyShip4(Graphics art)
	{
		enemyShip4X = enemyShip4X + enemyShip4SpeedX;   //movement left and right
		enemyShip4Y = enemyShip4Y + enemyShip4SpeedY;  //movement up and down
		
		if (enemyShip4SO.isCollidingWith(wall1SO))
		{
			if(firstHitWall1Ship4)
			{
				enemyShip4SpeedY = -enemyShip4SpeedY; //change the Y value for ship4
				firstHitWall1Ship4 = false;
			}
		}
		else
		{
			firstHitWall1Ship4 = true;
		}
		
		if(enemyShip4SO.isCollidingWith(wall2SO))
		{
			if(firstHitWall2Ship4)
			{
				enemyShip4SpeedX = -enemyShip4SpeedX; //change the X value for ship4
				firstHitWall2Ship4 = false;
			}
		}
		else
		{
			firstHitWall2Ship4= true;
		}
		
		if(enemyShip4SO.isCollidingWith(wall3SO))
		{
			if(firstHitWall3Ship4)
			{
				enemyShip4SpeedY = -enemyShip4SpeedY; //change the X value for ship4
				firstHitWall3Ship4 = false;
			}
		}
		else
		{
			firstHitWall3Ship4= true;
		}
		
		if(enemyShip4SO.isCollidingWith(wall4SO))
		{
			if(firstHitWall4Ship4)
			{
				enemyShip4SpeedX= -enemyShip4SpeedX; //change the X value for ship4
				firstHitWall4Ship4 = false;	
			}
		}
		else
		{
			firstHitWall4Ship4= true;
		}
	}	
	
	//this will have the fourth enemy ship move randomly about the screen
	public void moveEnemyShip5(Graphics art)
	{
		enemyShip5X = enemyShip5X + enemyShip5SpeedX;   //movement left and right
		enemyShip5Y = enemyShip5Y + enemyShip5SpeedY;  //movement up and down
		
		if (enemyShip5SO.isCollidingWith(wall1SO))
		{
			if(firstHitWall1Ship5)
			{
				enemyShip5SpeedY = -enemyShip5SpeedY; //change the Y value for ship5
				firstHitWall1Ship5 = false;
			}
		}
		else
		{
			firstHitWall1Ship5 = true;
		}
		
		if(enemyShip5SO.isCollidingWith(wall2SO))
		{
			if(firstHitWall2Ship5)
			{
				enemyShip5SpeedX = -enemyShip5SpeedX; //change the X value for ship5
				firstHitWall2Ship5 = false;
			}
		}
		else
		{
			firstHitWall2Ship5= true;
		}
		
		if(enemyShip5SO.isCollidingWith(wall3SO))
		{
			if(firstHitWall3Ship5)
			{
				enemyShip5SpeedY = -enemyShip5SpeedY; //change the Y value of ship5
				firstHitWall3Ship5 = false;
			}
		}
		else
		{
			firstHitWall3Ship5= true;
		}
		
		if(enemyShip5SO.isCollidingWith(wall4SO))
		{
			if(firstHitWall4Ship5)
			{
				enemyShip5SpeedX= -enemyShip5SpeedX; //change the X value of ship5
				firstHitWall4Ship5 = false;	
			}
		}
		else
		{
			firstHitWall4Ship5= true;
		}
	}	
	
	//this will create a cannon ball that moves up 
	public void makeConnonBallUp(Graphics art)
	{
		art.setColor(Color.DARK_GRAY);
		art.fillOval(ballXUp, ballYUp, 10, 10);
		cannonBallSO.makeSolidObject(ballXUp, ballYUp, 10, 10);
	}
	
	//this will create a ball that travels right
	public void makeConnonBallRight(Graphics art)
	{
		art.setColor(Color.DARK_GRAY);
		art.fillOval(ballXRight, ballYRight, 10, 10);
		cannonBallSO.makeSolidObject(ballXRight, ballYRight, 10, 10);
	}
	
	//this will create a ball that travels down
	public void makeConnonBallDown(Graphics art)
	{
		art.setColor(Color.DARK_GRAY);
		art.fillOval(ballXDown, ballYDown, 10, 10);
		cannonBallSO.makeSolidObject(ballXDown, ballYDown, 10, 10);
	}
	
	//this will create a ball that travels left
	public void makeConnonBallLeft(Graphics art)
	{
		art.setColor(Color.DARK_GRAY);
		art.fillOval(ballXLeft, ballYLeft, 10, 10);
		cannonBallSO.makeSolidObject(ballXLeft, ballYLeft, 10, 10);
	}
	
	//this will shoot a ball up down left and/or right
	public void shootBall(Graphics art)
	{
		if (showBallUp && ballYUp>0) //shoots the ball up
		{
			makeConnonBallUp(art);
			ballYUp=ballYUp - ballSpeed;
		}
		else
		{
			showBallUp = false; //makes the ball go back to its original position
			ballXUp = shipX+20;
			ballYUp = shipY+20;
		}
		
		if (showBallDown && ballYDown<700) //shoots ball down 
		{
			makeConnonBallDown(art);
			ballYDown=ballYDown + ballSpeed;
		}
		else
		{
			showBallDown = false; //makes the ball go back to its original position
			ballXDown = shipX+20;
			ballYDown = shipY+20;
		}
		
		if (showBallRight && ballXRight<810) //shoots up right
		{
			makeConnonBallRight(art);
			ballXRight=ballXRight + ballSpeed;
		}
		else
		{
			showBallRight = false; //makes the ball go back to its original position
			ballXRight = shipX+20;
			ballYRight = shipY+20;
		}
		
		if (showBallLeft && ballXLeft>0) //shoots ball left 
		{
			makeConnonBallLeft(art);
			ballXLeft=ballXLeft - ballSpeed;
		}
		else
		{
			showBallLeft = false; //makes the ball go back to its original position
			ballXLeft = shipX+20;
			ballYLeft = shipY+20;
		}
	}
	
	//this will make the ship invisible and move when you shoot it 
	public void cannonCollision(Graphics art)
	{
		if (cannonBallSO.isCollidingWith(enemyShipSO))
		{
			showEnemyShip = false;
			enemyShipX= gen.nextInt(760)+10; //makes the enemyShipX a random spot on the screen 
			enemyShipY = gen.nextInt(640)+10; //makes the enemyShipY a random spot on the screen
			score++;
			enemyShipSO.makeSolidObject(-100, -100, 40, 40);
		}
		else
		{
			
			showEnemyShip = true;
			
		}
	}
	
	//this will cause ship 2 to spawn at a random place after it is shot with a cannon ball
	public void cannonCollisionShip2(Graphics art)
	{
		if (cannonBallSO.isCollidingWith(enemyShip2SO))
		{
			showEnemyShip2 = false;
			score++;
			enemyShip2SO.makeSolidObject(-100, -100, 40, 40);
		}
		else
		{
			if(timer>5)
			{
			showEnemyShip2 = true;
			}
		}	
	}
 
		//this will cause ship 3 to spawn at a random place after it is shot with a cannon ball
	public void cannonCollisionShip3(Graphics art)
	{
		if (cannonBallSO.isCollidingWith(enemyShip3SO))
		{
			showEnemyShip3 = false;
			score++;
			enemyShip3SO.makeSolidObject(-100, -100, 40, 40);
		}
		else
		{
			if(timer>10)
			{
			showEnemyShip3 = true;
			}
		}	
	}
		
		//this will cause ship 4 to spawn at a random place after it is shot with a cannon ball
	public void cannonCollisionShip4(Graphics art)
	{
		if (cannonBallSO.isCollidingWith(enemyShip4SO))
		{
			showEnemyShip4 = false;
			score++;
			enemyShip4SO.makeSolidObject(-100, -100, 40, 40);
		}
		else
		{
			if(timer>15)
			{
			showEnemyShip4 = true;
			}
		}	
	}
		
		//this will cause ship 5 to spawn at a random place after it is shot with a cannon ball
	public void cannonCollisionShip5(Graphics art)
	{
		if (cannonBallSO.isCollidingWith(enemyShip5SO))
		{
			showEnemyShip5 = false;
			score++;
			enemyShip5SO.makeSolidObject(-100, -100, 40, 40);
		}
		else
		{
		if(timer>20)
		{
			showEnemyShip5 = true;
		}
		}	
	}
	
	//this will make the game harder
	public void increaseSpeed(Graphics art)
	{
		if(timer>30)
		{
			enemyShipSpeedX = enemyShipSpeedX +5;
			enemyShipSpeedY = enemyShipSpeedY +5;
			enemyShip2SpeedX = enemyShip2SpeedX +5;
			enemyShip2SpeedY = enemyShip2SpeedY +5;
			enemyShip3SpeedX = enemyShip3SpeedX +5;
			enemyShip3SpeedY = enemyShip3SpeedY +5;
			enemyShip4SpeedX = enemyShip4SpeedX +5;
			enemyShip4SpeedY = enemyShip4SpeedY +5;
			enemyShip5SpeedX = enemyShip5SpeedX +5;
			enemyShip5SpeedY = enemyShip5SpeedY +5;
		}
	}
 

	public void paint(Graphics art)
	{
		
		if (showStartScreen)
		{
			setSize(800,690);
			drawStartScreen(art);
			restart(art);
		}
		else
		{
			setSize(810,700);
			drawTimer(art);
			drawScore(art);
			drawPlayerShip(art);
			drawEnemyShip(art);
			drawEnemyShip2(art);
			drawEnemyShip3(art);
			drawEnemyShip4(art);
			drawEnemyShip5(art);
			moveEnemyShip(art);
			moveEnemyShip2(art);
			moveEnemyShip3(art);
			moveEnemyShip4(art);
			moveEnemyShip5(art);
			spawnShip2(art);
			spawnShip3(art);
			spawnShip4(art);
			spawnShip5(art);
			drawWalls(art);
			shootBall(art);
			cannonCollision(art);
			cannonCollisionShip2(art);
			cannonCollisionShip3(art);
			cannonCollisionShip4(art);
			cannonCollisionShip5(art);
			increaseSpeed(art);
			gameOver(art);
			drawEndScreen(art);
		}
		repaint();
	}
	
	
	
	
  //this will allow the player to use the mouse to start the game and to leave the game over screen
	public void mouseClicked(MouseEvent e)
	{
		mouseSO.makeSolidObject(e.getX(), e.getY(), 1, 1);
		if (mouseSO.isCollidingWith(startButtonSO))
		{
			showStartScreen = false;
		}
		
		if(mouseSO.isCollidingWith(restartButtonSO))
		{
			showStartScreen=  true;
		}
	}
 
	public void mouseEntered(MouseEvent arg0)
	{
	}
 
	public void mouseExited(MouseEvent arg0)
	{
	}
 
	public void mousePressed(MouseEvent arg0)
	{
	}
 
	public void mouseReleased(MouseEvent arg0)
	{
	}
 
	public void mouseDragged(MouseEvent arg0)
	{
	}
 
	public void mouseMoved(MouseEvent arg0)
	{
	}
 
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		//this will allow the player to press the UP key to shoot a ball 
		if(key == e.VK_UP)
		{
			if(shipY<700 && shipY>0)
			{
				shipY = shipY - shipSpeedY;
			}
		}
		
		//this will allow the player to press the DOWN key to shoot a ball 
		if (key == e.VK_DOWN)
		{
			if(shipY<610 && shipY>0)
			{
				shipY = shipY + shipSpeedY;
			}
		}
		
		//this will allow the player to press the LEFT key to shoot a ball 
		if (key == e.VK_LEFT)
		{
			if(shipX<800 && shipX>0)
			{
				shipX = shipX - shipSpeedX;
			}
		}
		
		//this will allow the player to press the RIGHT key to shoot a ball 
		if (key == e.VK_RIGHT)
		{
			if(shipX<750 && shipX>0)
			{
				shipX = shipX + shipSpeedX;
			}
		}
		
		//this will allow the player to press the W key to move
		if (key == e.VK_W)
		{
			if(showEndScreen==false)
			{
				showBallUp = true;
			}
		}
		
		//this will allow the player to press the S key to move
		if (key == e.VK_S)
		{
			if(showEndScreen==false)
			{
				showBallDown = true;
			}
		}
		
		//this will allow the player to press the D key to move
		if (key == e.VK_D)
		{
			if(showEndScreen == false)
			{
				showBallRight = true;
			}
		}
		
		//this will allow the player to press the A key to move
		if (key == e.VK_A)
		{
			if(showEndScreen == false)
			{
				showBallLeft = true;
			}
		}
		
	
	}
 
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		
	}
 
	public void keyTyped(KeyEvent arg0)
	{
	}
 
}
 
 
