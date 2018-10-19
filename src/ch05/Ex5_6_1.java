package ch05;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex5_6_1 extends Frame{
	public Ex5_6_1(){
		super("Ex5_6_1");
		setSize(350,350);
		setVisible(true);
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});		// 关闭窗口
	}
	public void processMouseEvent(MouseEvent e){
		if(e.getID() == MouseEvent.MOUSE_DRAGGED){
			System.out.println("-----鼠标拖拽事件-----");
			System.out.println("getSource():"+e.getSource());
			System.out.println("(X,Y):("+e.getX()+","+e.getY()+")");		
			System.out.println("点击鼠标：getClickCount():"+e.getClickCount());
		}
		else if(e.getID() == MouseEvent.MOUSE_PRESSED){
			System.out.println("-----鼠标点击窗口事件-----");
			System.out.println("getSource():"+e.getSource());			
			System.out.println("getWhen():"+e.getWhen());
			System.out.println("(X,Y):("+e.getX()+","+e.getY()+")");	
			System.out.println("点击鼠标：getClickCount():"+e.getClickCount());
		}
		else if(e.getID() == MouseEvent.MOUSE_ENTERED){
			System.out.println("-----鼠标进入窗口事件-----");			
			System.out.println("getWhen():"+e.getWhen());			
		}
		else if(e.getID() == MouseEvent.MOUSE_EXITED){
			System.out.println("-----鼠标退出窗口事件-----");						
			System.out.println("getWhen():"+e.getWhen());			
		}
		else if(e.getID() == MouseEvent.MOUSE_RELEASED){
			System.out.println("-----鼠标释放事件-----");	
			System.out.println("getWhen():"+e.getWhen());
			System.out.println("(X,Y):("+e.getX()+","+e.getY()+")");
		}		
	}

	public static void main(String[] args) {
		Ex5_6_1 workStart = new Ex5_6_1();	
	}

}
