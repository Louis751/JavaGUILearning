package ch06;
/*
 * 图标合并，点击其中一个，再点击另一个  */

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class Ex6_6_1 extends Frame implements Runnable{
	
	int x1 = 50, y1 = 50, fx1 = 0, fy1 = 0, dx1 = 0, dy1 = 0, flag1 = 0;	// 变量初始化
	int x2 = 100, y2 = 500, fx2 = 0,fy2 = 0,  dx2 = 0, dy2 = 0, flag2 = 0;
	Image img1,img2;

	public static void main(String[] args) {
		Ex6_6_1 workStart = new Ex6_6_1();
	}
	
	public Ex6_6_1(){
		super("Ex6_5_1");
		setSize(1024,768);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img1 = tk.getImage("小鸡/提交.png");
		img2 = tk.getImage("小鸡/查看成绩.png");
		
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
			if(((e.getX() >= x1) && (e.getX() <= x1+293)) && 
					((e.getY() >= y1) && (e.getY() <= y1+116))){
				flag1 = 1;
			}
		if(e.getID() == MouseEvent.MOUSE_RELEASED && flag1 == 1){
			fx1 = e.getX();
			fy1 = e.getY();
			
			dx1 = (fx1-x1)/50;
			dy1 = (fy1-y1)/50;
			flag1 = 0;
		}
		if(((e.getX() >= x2) && (e.getX() <= x2+293)) && 
				((e.getY() >= y2) && (e.getY() <= y2+116))){
			flag2 = 1;
		}
	if(e.getID() == MouseEvent.MOUSE_RELEASED && flag2 == 1){
		fx2 = e.getX();
		fy2 = e.getY();
		
		dx2 = (fx2-x2)/50;
		dy2 = (fy2-y2)/50;
		flag2 = 0;
	}
	}

	@Override
	public void run() {
		while(true){			
			x1 = x1 + dx1;
			y1 = y1 + dy1;			
			
			if((dx1 > 0 && x1+30 >= fx1) || (dx1 < 0 && x1+30 <= fx1))
				dx1 = 0;
			if((dy1 > 0 && y1+30 >= fy1) || (dy1 < 0 && y1+30 <= fy1))
				dy1 = 0;
			
			x2 = x2 + dx2;
			y2 = y2 + dy2;
			
			if((dx2 > 0 && x2+30 >= fx2) || (dx2 < 0 && x2+30 <= fx2))
				dx2 = 0;
			if((dy2 > 0 && y2+30 >= fy2) || (dy2 < 0 && y2+30 <= fy2))
				dy2 = 0;
				
			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	public void paint(Graphics g){
		System.out.println("("+x1+","+y1+","+dx1+","+dy1+","+fx1);
		g.drawImage(img1, x1, y1, this);
		g.drawImage(img2, x2, y2, this);
	}

}
