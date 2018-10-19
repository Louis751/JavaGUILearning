package ch05;
/*
 * 解释单击选中框架的Focus事件*/

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
		});		// 关闭窗口
	}
	
	public void processFocusEvent(FocusEvent e){
		if(e.getID() == FocusEvent.FOCUS_GAINED){
			System.out.println("-----选择组件为焦点-----");
			System.out.println("getSource():"+e.getSource());
			System.out.println("getID():"+e.getID());
			System.out.println("是否为暂时性的焦点事件："+e.isTemporary());
		}
		else if(e.getID() == FocusEvent.FOCUS_LOST){
			System.out.println("-----取消选择组件为焦点-----");
			System.out.println("getSource():"+e.getSource());
			System.out.println("getID():"+e.getID());
			System.out.println("是否为暂时性的焦点事件："+e.isTemporary());
		}
	}

	public static void main(String[] args) {
		Ex5_8_1 workStart = new Ex5_8_1();		
	}

}
