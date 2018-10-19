package ch05;
/*
 * ���͵���ѡ�п�ܵ�Focus�¼�*/

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex5_8_1 extends Frame{
	public Ex5_8_1(){
		super("Ex5_8_1");
		setSize(350,350);
		setVisible(true);		
		enableEvents(AWTEvent.FOCUS_EVENT_MASK);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});		// �رմ���
	}
	
	public void processFocusEvent(FocusEvent e){
		if(e.getID() == FocusEvent.FOCUS_GAINED){
			System.out.println("-----ѡ�����Ϊ����-----");
			System.out.println("getSource():"+e.getSource());
			System.out.println("getID():"+e.getID());
			System.out.println("�Ƿ�Ϊ��ʱ�ԵĽ����¼���"+e.isTemporary());
		}
		else if(e.getID() == FocusEvent.FOCUS_LOST){
			System.out.println("-----ȡ��ѡ�����Ϊ����-----");
			System.out.println("getSource():"+e.getSource());
			System.out.println("getID():"+e.getID());
			System.out.println("�Ƿ�Ϊ��ʱ�ԵĽ����¼���"+e.isTemporary());
		}
	}

	public static void main(String[] args) {
		Ex5_8_1 workStart = new Ex5_8_1();		
	}

}
