package ch05;
/*
 * ���ʹ����ƶ��¼���ʹ��*/

import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex5_4_1 extends Frame{
	public Ex5_4_1(){
		super("Ex5_4_1");
		setSize(350,350);
		setVisible(true);
		enableEvents(AWTEvent.COMPONENT_EVENT_MASK);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});		// �رմ���
	}
	
	/*
	 * COMPONENT_MOVED ��������ƶ��¼�
	 * COMPONENT_RESIZED �����С�ı��¼�
	 * */
	
	public void processComponentEvent(ComponentEvent e){
		if(e.getID() == ComponentEvent.COMPONENT_MOVED){
			System.out.println("geteSource():"+e.getSource());
			System.out.println("getID():"+e.getID());
		}
	}

	public static void main(String[] args) {
		Ex5_4_1 workStart = new Ex5_4_1();	
	}

}
