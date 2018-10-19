package ch04;

import java.awt.*;

public class Ex4_3_2 extends Frame implements Runnable{
	int num = 0,flag;
	int x = 0,y = 100,dx = 5,dy = 5;
	Image img0,img1,img2;
	
	public static void main(String[] args) {
		Ex4_3_2 workStart = new Ex4_3_2();
	}
	
	public Ex4_3_2(){
		super("Ex4_3_2");
		setSize(1024,768);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img0 = tk.getImage("src/ch04/老头0.gif");
		img1 = tk.getImage("src/ch04/小狗.gif");
		img2 = tk.getImage("src/ch04/小鸡.gif");
		
		setVisible(true);
		new Thread(this).start();
	}
	
	public void run(){
		while(true){
			x = x + dx;
			y = y + dy;
			flag = num % 3;
			repaint();
			num++;
			
			if(x <= 0)	dx = 5;
			else if((x + 60) >= 350)	dx = -5;
			
			if(y <= 0)	dy = 5;
			else if((y + 50) >= getHeight())	dy = -5;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g){
		if(flag == 0)
			g.drawImage(img0, x + 20, y, this);
		else if(flag == 1)
			g.drawImage(img1, x, y, this);
		else if(flag ==2)
			g.drawImage(img2, x, y, this);
		}
}
