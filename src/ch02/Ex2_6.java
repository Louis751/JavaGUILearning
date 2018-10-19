package ch02;
/*
 * 解释如何绘制扇形*/

import java.awt.*;

public class Ex2_6 extends Frame implements Runnable{
	public static void main(String[] args) {
		Ex2_6 wordStart = new Ex2_6();
	}
	
	public Ex2_6(){
		super("Ex2_6");
		setSize(350,350);
		setVisible(true);
		
		new Thread(this).start();
	}
	
	public void run(){
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawArc(35, 65, 100, 60, 0, 90);
		g.drawArc(170, 65, 100, 60, 0, 90);
		g.drawRect(170, 65, 100, 60);
		g.fillArc(35, 200, 100, 60, 0, 90);
	}

}
