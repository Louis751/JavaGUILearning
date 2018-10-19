package ch01;
/*
 * 解释Font各实例方法的应用
 * */

import java.awt.*;

@SuppressWarnings("serial")
public class Ex1_4_2 extends Frame implements Runnable{
	Font messageFont;
	String message;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Ex1_4_2 workStart = new Ex1_4_2();
	}
	
	public Ex1_4_2(){
		super("Ex1_4_2");
		setSize(350,350);
		
		setVisible(true);
		new Thread(this).start();
	}
	
	public void run(){
		messageFont = new Font("ThisRoman",Font.PLAIN,20);
		message = "This is a test sting!";
		
		System.out.println("getName():" + messageFont.getName());
		System.out.println("setStyle():" + messageFont.getStyle());
		System.out.println("setSize():" + messageFont.getSize());
		System.out.println("isBold():" + messageFont.isBold());
		System.out.println("isItalic():" + messageFont.isItalic());
		System.out.println("isPlain():" + messageFont.isPlain());
		
		repaint();
		}
	public void paint(Graphics g){
		g.setFont(messageFont);
		g.drawString(message, 15, 55);
	}

}
