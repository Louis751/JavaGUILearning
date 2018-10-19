package ch03;
/*
 * 解释drawImage(image, dx1, dy1, dx2, dy2, this)的绘制功能
 * (dx1,dy1)表示初始绘画位置，(dx2,dy2)表示绘画的长和宽*/

import java.awt.*;

public class Ex3_4_2 extends Frame implements Runnable{
	Image image;
	
	public static void main(String[] args) {
		Ex3_4_2 worStart = new Ex3_4_2();
	}
	
	public Ex3_4_2(){
		super("Ex3_4_2");
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
		g.drawImage(image, 25, 25, 300, 300, this);
	}

}
