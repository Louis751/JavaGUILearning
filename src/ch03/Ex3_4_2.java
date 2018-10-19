package ch03;
/*
 * ����drawImage(image, dx1, dy1, dx2, dy2, this)�Ļ��ƹ���
 * (dx1,dy1)��ʾ��ʼ�滭λ�ã�(dx2,dy2)��ʾ�滭�ĳ��Ϳ�*/

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
		image = tk.getImage("src/ch03/����·.jpg");
		
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
