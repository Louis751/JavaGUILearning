package ch06;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class Ex6_2 extends Frame implements Runnable{
	int x = 50,y = 50,flag = 0;	// flag表示在点击范围内
	Image img; 
	
	public Ex6_2(){
		super("Ex6_2");
		setSize(1024,768);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("下一题.png");
		
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
			if(((e.getX() >= x) && (e.getX() <= (x + 400))) && 
					((e.getY() >= y) && (e.getY() <= (y + 400)))){
				flag = 1;
			}
		if((e.getID() == MouseEvent.MOUSE_RELEASED) && (flag == 1)){
			x = e.getX();
			y = e.getY();
			flag = 0;
		}
	}
	
	public static void main(String[] args) {
		Ex6_2 workStart = new Ex6_2();
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
		System.out.println("("+x+","+y+")");
		g.drawImage(img,x,y,this);
	}

}
