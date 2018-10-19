package ch05;
/*
 * 解释窗口移动事件的使用*/

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
		});		// 关闭窗口
	}
	
	/*
	 * COMPONENT_MOVED 组件发生移动事件
	 * COMPONENT_RESIZED 组件大小改变事件
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
