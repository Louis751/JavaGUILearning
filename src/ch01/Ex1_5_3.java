package ch01;

import java.awt.*;

/*
 * ����Color���ȡ��ɫֵ��ʵ������������ʱ��������¶����ʵ���ſ���ʹ��
 * */
@SuppressWarnings("serial")
public class Ex1_5_3 extends Frame implements Runnable{
	Font messageFont;
	String message;
	Color color;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex1_5_3 workStart = new Ex1_5_3();
	}
	
	public Ex1_5_3(){
		super("Ex1_5_3");
		setSize(350,350);
		setVisible(true);
		
		new Thread(this).start();
	}
	
	public void run(){
		color = new Color(212,255,0);
		messageFont = new Font("TimesRoman",Font.PLAIN,20);
		message = "This is a string!";
		
		System.out.println("getRed():" + color.getRed());
		System.out.println("getGreen():" +  color.getGreen());
		System.out.println("getBlue():" + color.getBlue());;
		System.out.println("getRGB():" + color.getRGB());
		repaint();
	}
	
	public void paint(Graphics g){
		g.setFont(messageFont);
		g.setColor(color);
		g.drawString(message, 10, 55);
	}
}
