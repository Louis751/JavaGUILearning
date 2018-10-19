package ch02;
/*
 * 绘制直线与折线*/

import java.awt.*;

public class Ex2_3 extends Frame implements Runnable{
	public static void main(String[] args) {
		Ex2_3 workStart = new Ex2_3();
	}
	
	public Ex2_3(){
		super("Ex2_3");
		setSize(350,350);
		setVisible(true);
		
		new Thread(this).start();
	}
	
	public void run(){
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawLine(50,50,120,100);
		g.drawLine(10, 250, 50, 200);
		g.drawLine(50, 200, 120, 270);
		g.drawLine(120, 270, 200, 160);
	}

}
