package ch01;
/*
 * 解释同时设置中文/英文的字体名称或两种字体模式*/

import java.awt.*;

@SuppressWarnings("serial")
public class Ex1_6_1 extends Frame implements Runnable{
	Font messageFont1;
	Font messageFont2;
	String message;	

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex1_6_1 workStart = new Ex1_6_1();
	}
	
	public Ex1_6_1(){
		super("Ex1_6_1");
		setSize(350,350);
		
		setVisible(true);
		new Thread(this).start();
	}	

	public void run(){
		messageFont1 = new Font("宋体",Font.PLAIN,30);
		messageFont2 = new Font("楷体",Font.PLAIN,30);
		message = "中文字符串";
		repaint();
	}
	public void paint(Graphics g){
		g.setFont(messageFont1);
		g.setColor(Color.BLUE);
		g.drawString(message,10,80);
		
		g.setFont(messageFont2);
		g.setColor(Color.GREEN);
		g.drawString(message,10,155);
	}
}
