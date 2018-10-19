package ch02;
/*
 * 绘制空心长方形和实心长方形*/

import java.awt.*;

public class Ex2_4_2 extends Frame implements Runnable{
	public static void main(String[] args) {
		Ex2_4_2 workStart = new Ex2_4_2();
	}
	
	public Ex2_4_2(){
		super("Ex2_4_2");
		setSize(350,350);
		setVisible(true);
		
		new Thread(this).start();
	}
	
	public void run(){
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawRect(90,50,150,100);
		g.fillRect(90, 200, 150, 100);
	}

}
