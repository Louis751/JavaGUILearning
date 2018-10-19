package ch06;
/*
 * 自由移动图标  */

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class Ex6_5_1 extends Frame implements Runnable{
	
	int x = 50, y = 50, fx = 0, fy = 0, dx = 0, dy = 0, flag = 0;	// 变量初始化
	Image img;

	public static void main(String[] args) {
		Ex6_5_1 workStart = new Ex6_5_1();
	}
	
	public Ex6_5_1(){
		super("Ex6_5_1");
		setSize(1024,768);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("小鸡/小鸡.gif");
		
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
			if(((e.getX() >= x) && (e.getX() <= x+240)) && 
					((e.getY() >= y) && (e.getY() <= y+240))){
				flag = 1;
			}
		if(e.getID() == MouseEvent.MOUSE_RELEASED && flag == 1){
			fx = e.getX();
			fy = e.getY();
			
			dx = (fx-x)/10;
			dy = (fy-y)/10;
			flag = 0;
		}
	}

	@Override
	public void run() {
		while(true){
			
			x = x + dx;
			y = y + dy;
			
			if((dx > 0 && x+30 >= fx) || (dx < 0 && x+30 <= fx))
				dx = 0;
			if((dy > 0 && y+30 >= fy) || (dy < 0 && y+30 <= fy))
				dy = 0;
			System.out.println("("+x+","+y+","+dx+","+dy+","+fx+","+fy+")");
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
		g.drawImage(img, x, y, this);
	}

}
