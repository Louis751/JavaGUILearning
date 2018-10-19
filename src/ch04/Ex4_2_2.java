package ch04;
/*
 * 解释图案回弹的应用*/

import java.awt.*;

public class Ex4_2_2 extends Frame implements Runnable{
	int x = 0,y = 160;
	int dx = 5,dy = 0;

	public static void main(String[] args) {
		Ex4_2_2 workStart = new Ex4_2_2();
	}
	
	public Ex4_2_2(){
		super("Ex4_2_2");
		setSize(350,350);
		setVisible(true);
		
		new Thread(this).start();
	}
	
	public void run(){
		while(true){
			x = x + dx;
			y = y + dy;
			repaint();
			
			if(x <= 0)	dx = 5;
			else if((x + 50) >= getWidth())	dx = -5;
			
			if(y <= 0)	dy = 5;
			else if((y + 50) >= getHeight())	dy = -5;
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g){
		// System.out.println("(" + x + "," + y +")");
		g.setColor(Color.red);
		g.fillOval(x, y, 50, 50);
	}

}
