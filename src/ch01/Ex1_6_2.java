package ch01;

import java.awt.*;

public class Ex1_6_2 extends Frame implements Runnable{
	Font messageFont1,messageFont2,messageFont3,messageFont4;
	String message;

	public static void main(String[] args) {
		Ex1_6_2 workStart = new Ex1_6_2();
	}
	
	public Ex1_6_2(){
		super("Ex1_6_2");
		setSize(500,500);
		setVisible(true);
		
		new Thread(this).start();
	}
	
	public void run(){
		messageFont1 = new Font("宋体" + "TinmesRoman",Font.PLAIN,30);
		messageFont2 = new Font("宋体" + "Monotype Corsuva",Font.PLAIN,30);
		messageFont3 = new Font("Monotype Corsiva",Font.PLAIN,30);
		messageFont4 = new Font("楷体" + "Monotype Corsiva",Font.ITALIC + Font.PLAIN,30);
		message = "中文字符串 EnglishString";
		
		repaint();
	}
	
	public void paint(Graphics g){
		g.setFont(messageFont1);
		g.setColor(Color.BLUE);
		g.drawString(message, 10, 50);
		
		g.setFont(messageFont2);
		g.setColor(Color.GRAY);
		g.drawString(message,10,100);
		
		g.setFont(messageFont3);
		g.setColor(Color.RED);
		g.drawString(message,10,150);
		
		g.setFont(messageFont4);
		g.setColor(Color.YELLOW);
		g.drawString(message, 10, 200);		
	}

}
