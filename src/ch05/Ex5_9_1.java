package ch05;

import java.awt.*;
import java.awt.event.WindowEvent;

public class Ex5_9_1 extends Frame{
	public Ex5_9_1(){
		super("Ex5_9_1");
		setSize(350,350);
		setVisible(true);
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
	}
	
	public void processWindowEvent(WindowEvent e){
		if(e.getID() == WindowEvent.WINDOW_ACTIVATED){
			System.out.println("-----“激活窗口”事件-----");
			System.out.println("getSource():"+e.getSource());
			System.out.println("getID():"+e.getID());
		}
		else if(e.getID() == WindowEvent.WINDOW_CLOSING){
			System.out.println("-----“关闭窗口”事件-----");
			System.out.println("getSource():"+e.getSource());
			System.out.println("getID():"+e.getID());
			System.exit(0);	// 关闭窗口 
		}
		
	}

	public static void main(String[] args) {
		Ex5_9_1 workStart = new Ex5_9_1();
	}

}
