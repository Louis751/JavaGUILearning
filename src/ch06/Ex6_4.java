package ch06;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class Ex6_4 extends Frame implements Runnable{
	
	int x1 = 50,y1 = 50,x2 = 150,y2 = 150,x3 = 250,y3 = 250;
	int flag = 0;
	Image img1,img2,img3;
	
	public static void main(String[] args) {
		Ex6_4 workStart = new Ex6_4();
	}
	
	public Ex6_4(){
		super("Ex6_4");
		setSize(1024,768);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img1 = tk.getImage("查看成绩.png");
		img2 = tk.getImage("开始答题.png");
		img3 = tk.getImage("下一题.png");
		
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
		
		setVisible(true);
		new Thread(this).start();
	}
	
	public void processWindowEvent(WindowEvent e){
		if(e.getID() == WindowEvent.WINDOW_CLOSING){
			System.exit(0);
		}
	}
	
	public void processMouseEvent(MouseEvent e){
		if(e.getID() == MouseEvent.MOUSE_PRESSED)
			if((e.getX() >= x1) && (e.getX() <= x1+200) &&
					(e.getY() >= y1) && (e.getY() <= y1+200)){
				flag = 1;
			}
			if((e.getX() >= x2) && (e.getX() <= x2+200) &&
					(e.getY() >= y2) && (e.getY() <= y2+200)){
				flag = 2;
			}
			if((e.getX() >= x3) && (e.getX() <= x3+200) &&
					(e.getY() >= y3) && (e.getY() <= y3+200)){
				flag = 3;
			}
		
		if(e.getID() == MouseEvent.MOUSE_RELEASED){
			if(flag == 1){
				x1 = e.getX();
				y1 = e.getY();
				flag = 0;
			}
			else if(flag == 2){
				x2 = e.getX();
				y2 = e.getY();
				flag = 0;
			}
			else if(flag == 3){
				x3 = e.getX();
				y3 = e.getY();
				flag = 0;
			}
		}		
	}

	@Override
	public void run() {
		while(true){
			repaint();
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g){
		g.drawImage(img1, x1, y1, this);
		g.drawImage(img2, x2, y2, this);
		g.drawImage(img3, x3, y3, this);
	}

}
