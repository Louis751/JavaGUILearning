package ch02;

import java.awt.*;

public class Ex2_9 extends Frame implements Runnable{
	public static void main(String[] args) {
		Ex2_9 worStart = new Ex2_9();
	}
	
	public Ex2_9(){
		super("Ex2_9");
		setSize(350,350);
		setVisible(true);
		
		new Thread(this).start();
	}
	
	public void run(){
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawOval(35, 65, 100, 60);
		
		g.drawOval(170, 65, 100, 60);
		g.drawRect(170, 65, 100, 60);
		
		g.fillOval(35, 200, 100, 60);
		g.copyArea(35, 200, 100, 60, 135, 0);
	}

}
