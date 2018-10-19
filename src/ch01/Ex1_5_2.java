package ch01;
/*
 * 解释Color类的类变量
 * */

import java.awt.*;

@SuppressWarnings("serial")
public class Ex1_5_2 extends Frame implements Runnable{
	Font messageFont;
	String message;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex1_5_2 workStart = new Ex1_5_2();
	}
	
	public Ex1_5_2(){
		super("Ex1_5_2");
		setSize(350,350);
		
		setVisible(true);
		new Thread(this).start();
	}
	
	public void run(){
		messageFont = new Font("TimesRoman",Font.PLAIN,30);
		message = "This a test string!";
		repaint();
	}
	
	public void paint(Graphics g){
		g.setFont(messageFont);
		g.setColor(Color.BLUE);
		g.drawString(message, 10, 75);
	}

}
