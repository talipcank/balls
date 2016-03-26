package toptop;

import java.awt.Color;

public  class Monster {
	
	ScreenInfo ekran = new ScreenInfo ();
	public static int BottomballposX,CevreposX,CevreposY, BottomballposY,MiddleballposX,MiddleballposY,LefteyeposX,LefteyeposY,RighteyeposX,RighteyeposY,MouthposX,MouthposY, speedX, speedY;
	public int ballsize;
	public Color mycolor;
	
	public Monster(){
		

		mycolor = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		speedX = 20;
		speedY = 20;
		CevreposX = ekran.getWidth()-800;
		CevreposY = ekran.getHeight()-350;
		
		BottomballposX = ekran.getWidth()-800;
		BottomballposY = ekran.getHeight()-210;
		MiddleballposX = ekran.getWidth()-778;
		MiddleballposY = ekran.getHeight()-347;
		LefteyeposX = ekran.getWidth()-745;
		LefteyeposY = ekran.getHeight()-317;
		RighteyeposX = ekran.getWidth()-700;
		RighteyeposY = ekran.getHeight()-317;
		MouthposX = ekran.getWidth()-735;
		MouthposY = ekran.getHeight()-300;
		
		
	}
	public void update() {
		if (BottomballposX>=ekran.getWidth() || BottomballposX<=0) {		
			speedX=-1*speedX;
			}
		BottomballposX=BottomballposX+speedX;
		
		if(BottomballposY>=ekran.getHeight() || BottomballposY<=0) {
			speedY=-1*speedY;	
		}
		BottomballposY=BottomballposY+speedY;
		
		if (MiddleballposX>=ekran.getWidth() || MiddleballposX<=0) {		
			speedX=-1*speedX;
			}
		MiddleballposX=MiddleballposX+speedX;
		
		if(MiddleballposY>=ekran.getHeight() || MiddleballposY<=0) {		
			speedY=-1*speedY;	
		}
		MiddleballposY=MiddleballposY+speedY;
		
		if (LefteyeposX>=ekran.getWidth() || LefteyeposX<=0) {		
			speedX=-1*speedX;
			}
		LefteyeposX=LefteyeposX+speedX;
		
		if(LefteyeposY>=ekran.getHeight() || LefteyeposY<=0) {		
			speedY=-1*speedY;	
		}
		LefteyeposY=LefteyeposY+speedY;
		
		if (RighteyeposX>=ekran.getWidth() || RighteyeposX<=0) {		
			speedX=-1*speedX;
			}
		RighteyeposX=RighteyeposX+speedX;
		
		if(RighteyeposY>=ekran.getHeight() || RighteyeposY<=0) {		
			speedY=-1*speedY;	
		}
		RighteyeposY=RighteyeposY+speedY;
		
		if (MouthposX>=ekran.getWidth() || MouthposX<=0) {		
			speedX=-1*speedX;
			}
		MouthposX=MouthposX+speedX;
		
		if(MouthposY>=ekran.getHeight() || MouthposY<=0) {		
			speedY=-1*speedY;	
		}
		MouthposY=MouthposY+speedY;
		
		if(CevreposX>=ekran.getWidth() || CevreposX<=0) {		
			speedX=-1*speedX;	
		}
		CevreposX=CevreposX+speedX;
		if(CevreposY>=ekran.getHeight() || CevreposY<=0) {		
			speedY=-1*speedY;	
		}
		CevreposY=CevreposY+speedY;
		

	}
}