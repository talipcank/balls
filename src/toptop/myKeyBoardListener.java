package toptop;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class myKeyBoardListener  implements KeyListener{
		ScreenInfo ekran = new ScreenInfo();

	public myKeyBoardListener(){

		
	}
	

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Basýlan Tuþ:" + KeyEvent.getKeyText(arg0.getKeyCode()));
		if(arg0.getKeyCode()==KeyEvent.VK_ESCAPE){
			System.exit(0);
		}
		if (arg0.getKeyCode()==KeyEvent.VK_LEFT){
		
			Monster.BottomballposX=Monster.BottomballposX-Monster.speedX;
			Monster.MiddleballposX=Monster.MiddleballposX-Monster.speedX;
			Monster.LefteyeposX=Monster.LefteyeposX-Monster.speedX;
			Monster.RighteyeposX=Monster.RighteyeposX-Monster.speedX;
			Monster.MouthposX=Monster.MouthposX-Monster.speedX;
			Monster.CevreposX = Monster.CevreposX-Monster.speedX;
		}
		if (arg0.getKeyCode()==KeyEvent.VK_UP){
			Monster.BottomballposY=Monster.BottomballposY-Monster.speedY;
			Monster.MiddleballposY=Monster.MiddleballposY-Monster.speedY;
			Monster.LefteyeposY=Monster.LefteyeposY-Monster.speedY;
			Monster.RighteyeposY=Monster.RighteyeposY-Monster.speedY;
			Monster.MouthposY=Monster.MouthposY-Monster.speedY;
			Monster.CevreposY = Monster.CevreposY-Monster.speedY;
		}
		if (arg0.getKeyCode()==KeyEvent.VK_RIGHT){
			
			Monster.BottomballposX=Monster.BottomballposX+Monster.speedX;
			Monster.MiddleballposX=Monster.MiddleballposX+Monster.speedX;
			Monster.LefteyeposX=Monster.LefteyeposX+Monster.speedX;
			Monster.RighteyeposX=Monster.RighteyeposX+Monster.speedX;
			Monster.MouthposX=Monster.MouthposX+Monster.speedX;
			Monster.CevreposX = Monster.CevreposX+Monster.speedX;
		}
		if (arg0.getKeyCode()==KeyEvent.VK_DOWN){
			Monster.BottomballposY=Monster.BottomballposY+Monster.speedY;
			Monster.MiddleballposY=Monster.MiddleballposY+Monster.speedY;
			Monster.LefteyeposY=Monster.LefteyeposY+Monster.speedY;
			Monster.RighteyeposY=Monster.RighteyeposY+Monster.speedY;
			Monster.MouthposY=Monster.MouthposY+Monster.speedY;
			Monster.CevreposY = Monster.CevreposY+Monster.speedY;
		
		}
		}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
