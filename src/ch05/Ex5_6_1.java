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
		});		// �رմ���
	}
	public void processMouseEvent(MouseEvent e){
		if(e.getID() == MouseEvent.MOUSE_DRAGGED){
			System.out.println("-----�����ק�¼�-----");
			System.out.println("getSource():"+e.getSource());
			System.out.println("(X,Y):("+e.getX()+","+e.getY()+")");		
			System.out.println("�����꣺getClickCount():"+e.getClickCount());
		}
		else if(e.getID() == MouseEvent.MOUSE_PRESSED){
			System.out.println("-----����������¼�-----");
			System.out.println("getSource():"+e.getSource());			
			System.out.println("getWhen():"+e.getWhen());
			System.out.println("(X,Y):("+e.getX()+","+e.getY()+")");	
			System.out.println("�����꣺getClickCount():"+e.getClickCount());
		}
		else if(e.getID() == MouseEvent.MOUSE_ENTERED){
			System.out.println("-----�����봰���¼�-----");			
			System.out.println("getWhen():"+e.getWhen());			
		}
		else if(e.getID() == MouseEvent.MOUSE_EXITED){
			System.out.println("-----����˳������¼�-----");						
			System.out.println("getWhen():"+e.getWhen());			
		}
		else if(e.getID() == MouseEvent.MOUSE_RELEASED){
			System.out.println("-----����ͷ��¼�-----");	
			System.out.println("getWhen():"+e.getWhen());
			System.out.println("(X,Y):("+e.getX()+","+e.getY()+")");
		}		
	}

	public static void main(String[] args) {
		Ex5_6_1 workStart = new Ex5_6_1();	
	}

}
