package ch05;
/*
 * 解释KEY_PRESSED按键事件时，如何读取按键事件构造函数参数的内容*/

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
		});		// 关闭窗口
	}
	
	public void processKeyEvent(KeyEvent e){
		if(e.getID() == KeyEvent.KEY_PRESSED){
			System.out.println("getSource():"+e.getSource());	// 读取按键事件的source
			System.out.println("getID():"+e.getID());	// 读取事件标识码ID
			System.out.println("getWhen():"+e.getWhen());	// 按键时间
			System.out.println("getKeyCode():"+e.getKeyCode());	// 读取按键的ASCII码
		}
	}

	public static void main(String[] args) {
		Ex5_5_1 workStart = new Ex5_5_1();	
	}

}
