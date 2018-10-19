package ch06;
/*
 * �����ƶ�ͼ��  */

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class Ex6_5_2 extends Frame implements Runnable{
	
	int x = 50, y = 50, fx = 0, fy = 0, dx = 0, dy = 0, flag = 0;	// ������ʼ��
	int flagTypeImg = 0, flagNumImg = 0, num = 0;
	Image img0,img1,img2;

	public static void main(String[] args) {
		Ex6_5_2 workStart = new Ex6_5_2();
	}
	
	public Ex6_5_2(){
		super("Ex6_5_1");
		setSize(1024,768);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img0 = tk.getImage("С��/��ʼ����.png");
		img1 = tk.getImage("С��/�ύ.png");
		img2 = tk.getImage("С��/�鿴�ɼ�.png");
		
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
			if(((e.getX() >= x) && (e.getX() <= x+293)) && 
					((e.getY() >= y) && (e.getY() <= y+116))){
				flagTypeImg = 1;
			}
		if(e.getID() == MouseEvent.MOUSE_RELEASED && flagTypeImg == 1){
			fx = e.getX();
			fy = e.getY();
			
			dx = (fx-x)/10;
			dy = (fy-y)/10;
			flagTypeImg = 0;
		}
	}

	@Override
	public void run() {
		while(true){			
			x = x + dx;
			y = y + dy;
			
			flagNumImg = num % 3;
			
			if((dx > 0 && x+30 >= fx) || (dx < 0 && x+30 <= fx))
				dx = 0;
			if((dy > 0 && y+30 >= fy) || (dy < 0 && y+30 <= fy))
				dy = 0;
			System.out.println("("+flagNumImg+","+x+","+y+","+dx+","+dy+","+fx+","+fy+")");
			num++;
			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
	public void paint(Graphics g){
		if(flagNumImg == 0)
			g.drawImage(img0, x, y, this);
		if(flagNumImg == 1)
			g.drawImage(img1, x, y, this);
		if(flagNumImg == 2)
			g.drawImage(img2, x, y, this);
	}

}
