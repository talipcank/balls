package toptop;

import java.awt.Color;

public class Ball {
	
	ScreenInfo ekran = new ScreenInfo ();
	public int posX, posY, speedX, speedY;
	public int ballsize;
	public Color mycolor;
	myKeyBoardListener keyb = new myKeyBoardListener();
	public Ball(){
		

		mycolor = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		speedX = 10;
		posX = (int)(Math.random()*ekran.getWidth())+1;
		posY = (int)(Math.random()*ekran.getHeight())+1;
		speedY = (int)(Math.random()*10)+1;
		ballsize = (int)(Math.random()*5)+1;
	}
	public void update() {
		
		if(posY>=ekran.getHeight() || posY<=0) {		
			speedY=-1*speedY;	
		}
		posY=posY+speedY;
		if (posX>=ekran.getWidth() || posX<=0) {		
			speedX=-1*speedX;	
		}
		posX=posX+speedX;
		
	}
}

