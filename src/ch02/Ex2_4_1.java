package ch02;
/*
 * 绘制正方形*/

import java.awt.*;

public class Ex2_4_1 extends Frame implements Runnable{
	public static void main(String[] args) {
		Ex2_4_1 workStart = new Ex2_4_1();
	}
	
	public Ex2_4_1(){
		super("Ex2_4");
		setSize(350,350);
		setVisible(true);
		
		new Thread(this).start();
	}
	
	public void run(){
		repaint();
	}
	
	public void paint(Graphics g){
		/*int r = 50;
		int x0 = 200;
		int y0 = 200;
		int x = -50;
		int y = -50;
		for(;;x++){			
			if((x-x0) + (y - y0) <= r){
				y = 1/(x*x);
				g.drawLine(x0, y0, x, y);
			}
			if(x == 250)
				break;
				
		}*/
		g.drawLine(50, 50, 50, 150);		
		g.drawLine(50, 150, 150, 150);
		g.drawLine(150, 150, 150, 50);
		g.drawLine(150, 50, 50, 50);
		repaint();
	}

}
