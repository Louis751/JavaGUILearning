package ch03;
/*
 * 解释drawImage(img, dx1, dy1, this)的绘制功能*/

import java.awt.*;

public class Ex3_4_1 extends Frame implements Runnable{
	Image image;
	
	public static void main(String[] args) {
		Ex3_4_1 worStart = new Ex3_4_1();
	}
	
	public Ex3_4_1(){
		super("Ex3_4_1");
		setSize(350,350);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		image = tk.getImage("src/ch03/绿荫公路.jpg");
		
		setVisible(true);
		new Thread(this).start();
	}
	
	public void run(){
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawImage(image, 0, 0,this);
	}

}
