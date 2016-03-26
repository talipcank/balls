package toptop;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;


public class PlayGround  extends Canvas  implements Runnable {

	
	
	public boolean run=false;
	public int grassWidth=200;
	private int topsayisi = 200;
	ArrayList<Ball> top = new ArrayList<Ball>();

	Monster mon=new Monster();
	
	ScreenInfo ekran = new ScreenInfo();

	public PlayGround() {
		this.setBackground(Color.BLACK);	
	}
	
	public PlayGround(Color c) {
		this.setBackground(c);	
	}

	@Override
	public void run() {
		System.out.println("Game Loop Started...");	
		while(run) {
			update();
			try {
				Thread.sleep(10);
				//System.out.println("speed="+speedX);
				draw();
				
			}catch (Exception ex){
				System.out.println("Hata");
			}
		}
	}
	
	public void draw() {
		createBufferStrategy(2);
		BufferStrategy bf = this.getBufferStrategy();
		Graphics2D g = null;
		
		try {
			g = (Graphics2D) bf.getDrawGraphics();
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                RenderingHints.VALUE_ANTIALIAS_ON);
			
			//Ciziminizi bu satýrlardan itibaren gerçekleþtirebilirsiniz
			
	 
			Graphics2D g2 = (Graphics2D)g;
		    GeneralPath path = new GeneralPath();
		    g2.setColor(Color.GRAY);
		    g2.fillRect(mon.CevreposX, mon.CevreposY, 180, 321);
		    g2.setColor(Color.WHITE);
		    path.moveTo(100, 100);
		    g2.fillOval(mon.BottomballposX, mon.BottomballposY, 180, 180);			//bottom ball
		    g2.fillOval(mon.MiddleballposX, mon.MiddleballposY, 135, 135);			//middle ball
		    g2.setColor(Color.RED);
		    g2.fillOval(mon.LefteyeposX, mon.LefteyeposY, 18, 18);			//left eye
		    g2.fillOval(mon.RighteyeposX, mon.RighteyeposY, 18, 18);			//right eye
		    g2.fillArc(mon.MouthposX,mon.MouthposY, 45, 45, 0, -180);	//mouth
		    g2.setColor(Color.ORANGE);
		    
			
	
			for(int i =0;i<=topsayisi;i++){
			
			g.setColor(top.get(i).mycolor);
			g.fillOval(top.get(i).posX, top.get(i).posY, top.get(i).ballsize, top.get(i).ballsize);
			
			}
			g.dispose();
		} finally {
			// It is best to dispose() a Graphics object when done with it.
			g.dispose();
		}
		bf.show();
	 
	    Toolkit.getDefaultToolkit().sync();		
	}

	public void update() {
		
		for (int i = 0;i<=topsayisi;i++){
			top.get(i).update();
			}
	}
	public void addBall(){
		for (int i = 0;i<=topsayisi;i++){
			Ball Ball = new Ball();
			top.add(Ball);
			}
	}
	public synchronized void basla() {
		addBall();
		
		System.out.println("Game Started...");
		run=true;
		new Thread(this).start();
		
	}
	public synchronized void dur() {
		System.out.println("Game Finished...");
	}
}

