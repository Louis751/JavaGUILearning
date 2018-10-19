package ch04;
/*
 * 解释单幅动画的应用*/

import java.awt.*;

public class Ex4_3_1 extends Frame implements Runnable{
	int x = 0,y = 100;
	int dx = 5,dy = 5;
	Image img;

	public static void main(String[] args) {
		Ex4_3_1 workStart = new Ex4_3_1();
	}
	
	public Ex4_3_1(){
		super("Ex4_3_1");
		setSize(350,350);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("src/ch04/老头.gif");
		
		setVisible(true);
		new Thread(this).start();
	}
	
	public void run(){
		while(true){
			x = x + dx;
			y = y + dy;
			repaint();
			
			if(x <= 5)	dx = 5;
			else if((x + 50) >= getWidth())	dx = -5;
			
			if(y <= 0)	dy = 5;
			else if((x + 50) >= getHeight())	dy = -5;
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g){
		g.drawImage(img, x, y, this);
	}

}
