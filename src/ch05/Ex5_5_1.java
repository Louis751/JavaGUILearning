package ch05;
/*
 * ����KEY_PRESSED�����¼�ʱ����ζ�ȡ�����¼����캯������������*/

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex5_5_1 extends Frame{
	public Ex5_5_1(){
		super("Ex5_5_1");
		setSize(350,350);
		setVisible(true);
		enableEvents(AWTEvent.KEY_EVENT_MASK);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});		// �رմ���
	}
	
	public void processKeyEvent(KeyEvent e){
		if(e.getID() == KeyEvent.KEY_PRESSED){
			System.out.println("getSource():"+e.getSource());	// ��ȡ�����¼���source
			System.out.println("getID():"+e.getID());	// ��ȡ�¼���ʶ��ID
			System.out.println("getWhen():"+e.getWhen());	// ����ʱ��
			System.out.println("getKeyCode():"+e.getKeyCode());	// ��ȡ������ASCII��
		}
	}

	public static void main(String[] args) {
		Ex5_5_1 workStart = new Ex5_5_1();	
	}

}
