package ch02;
/*
 * 解释如何绘制椭圆*/

import java.awt.*;

public class Ex2_5 extends Frame implements Runnable{
	public static void main(String[] args){
		Ex2_5 workStart = new Ex2_5();
	}
	
	public Ex2_5(){
		super("Ex2_5");
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
		g.drawRect(35, 200, 100, 60);
	}
}
