package ch01;
/*
 * 解释Color类的构造函数参数颜色值的设置
 * */

import java.awt.*;

@SuppressWarnings("serial")
public class Ex1_5_1 extends Frame implements Runnable{
	Font messageFont;
	String message;
	Color color1,color2,color3;	

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex1_5_1 workStart = new Ex1_5_1();
	}
	
	public Ex1_5_1(){
		super("Ex1_5_1");
		setSize(350,350);
		setVisible(true);
		new Thread(this).start();
	}
	
	public void run(){
		color1 = new Color(212,255,0);
		color2 = new Color(0xd4ff00);
		color3 = new Color(0.83f,1.0f,0.0f);
		messageFont = new Font("TimesRoman",Font.PLAIN,20);
		message = "This is a test string!";
		repaint();
	}
	
	public void paint(Graphics g){
		g.setFont(messageFont);
		g.setColor(color1);
		g.drawString(message, 15, 55); 
		
		g.setFont(messageFont);
		g.setColor(color2);
		g.drawString(message, 15, 100);
		
		g.setFont(messageFont);
		g.setColor(color3);
		g.drawString(message, 15, 150);
	}

}
